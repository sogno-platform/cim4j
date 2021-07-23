import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Enumeration;
import java.io.PrintStream;
import java.lang.String;
import java.lang.Integer;
import java.io.File;

import cim4j.*;

public class XMLTest extends DefaultHandler {

	Hashtable<String, Integer> tags;
	Map<String, cim4j.BaseClass> model;
	Stack<String> subjectStack;
	Stack<BaseClass> objectStack;

	static public void main(String[] args) throws Exception {
		String filename = null;

		for (int i = 0; i < args.length; i++) {
			filename = args[i];
			if (i != args.length - 1) {
				usage();
			}
		}

		if (filename == null) {
			usage();
		}

		SAXParserFactory spf = SAXParserFactory.newInstance();
		spf.setNamespaceAware(true);
		SAXParser saxParser = spf.newSAXParser();
		XMLReader xmlReader = saxParser.getXMLReader();
		xmlReader.setContentHandler(new XMLTest());
		xmlReader.setErrorHandler(new MyErrorHandler(System.err));
		xmlReader.parse(convertToFileURL(filename));
	}

	public void startDocument() throws SAXException {
		tags = new Hashtable<>();
		model = new HashMap<String, cim4j.BaseClass>();
		subjectStack = new Stack<String>();
		objectStack = new Stack<BaseClass>();
	}

	public void characters(char ch[], int start, int length) throws SAXException {
		String content = String.valueOf(ch, start, length);
		if (content.length() == 0 || content.isBlank()) {
			return;
		}

		if (!subjectStack.empty()) {
			String subject = subjectStack.peek();
			if (!objectStack.empty()) {
				BaseClass object = objectStack.peek();
				object.setAttribute(subject, content);
			}
		}
	}

	public void startElement(String namespaceURI,
			String localName,
			String qName,
			Attributes atts)
			throws SAXException {

		String rdfid = "";
	
		if (!qName.startsWith("cim")) {
			return;
		}
	
		int lastDot = localName.lastIndexOf('.');
		String attributeName;
		if (lastDot > 0) {
			attributeName = localName.substring(lastDot + 1);
		}
		else {
			attributeName = localName;
		}
	
		subjectStack.push(attributeName);
	
		for (int i = 0; i < atts.getLength(); i++) {
			if (atts.getQName(i) == "rdf:ID") {
				rdfid = atts.getValue(i);
	
				// If we have a class, make a new object and record it in the map
				if (CIMClassMap.isCIMClass(localName)) {
					cim4j.BaseClass bc = CIMClassMap.classMap.get(localName);
					if (model.containsKey(rdfid)) {
						BaseClass object = model.get(rdfid);
						objectStack.push(object);
					}
					else {
						BaseClass object = bc.construct();
						model.put(rdfid, object);
						objectStack.push(object);
					}
				}
			}
		}
	}

	public void endElement(String namespaceURI,
			String localName,
			String qName,
			Attributes atts)
			throws SAXException {
		if (!subjectStack.empty()) {
			subjectStack.pop();
		}
		if (CIMClassMap.isCIMClass(localName)) {
			if (objectStack.size() == 0) {
				System.out.println("WARNING: Nearly tried to pop empty object stack for tag: " + qName);
			}
			else {
				objectStack.pop();
			}
		}
	}

	public void endDocument() throws SAXException {
		Iterator<Map.Entry<String, BaseClass>> it = model.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, BaseClass> pair = it.next();
			String key = pair.getKey();
			BaseClass value = pair.getValue();
			String type = value.debugString();
			System.out.println("Model contains a " + type + " with rdf:ID " + key + " and attributes:" + System.lineSeparator() + value.toString());
		}
	}

	private static String convertToFileURL(String filename) {
		String path = new File(filename).getAbsolutePath();
		if (File.separatorChar != '/') {
			path = path.replace(File.separatorChar, '/');
		}

		if (!path.startsWith("/")) {
			path = "/" + path;
		}
		return "file:" + path;
	}

	private static void usage() {
		System.err.println("Usage: XMLTest <file.xml>");
		System.err.println("	   -usage or -help = this message");
		System.exit(1);
	}

	private static class MyErrorHandler implements ErrorHandler {

		private PrintStream out;

		MyErrorHandler(PrintStream out) {
			this.out = out;
		}

		private String getParseExceptionInfo(SAXParseException spe) {
			String systemId = spe.getSystemId();

			if (systemId == null) {
				systemId = "null";
			}

			String info = "URI=" + systemId + " Line="
					+ spe.getLineNumber() + ": " + spe.getMessage();

			return info;
		}

		public void warning(SAXParseException spe) throws SAXException {
			out.println("Warning: " + getParseExceptionInfo(spe));
		}

		public void error(SAXParseException spe) throws SAXException {
			String message = "Error: " + getParseExceptionInfo(spe);
			throw new SAXException(message);
		}

		public void fatalError(SAXParseException spe) throws SAXException {
			String message = "Fatal Error: " + getParseExceptionInfo(spe);
			throw new SAXException(message);
		}
	}
}
