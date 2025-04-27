package cim4j.utils;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import cim4j.BaseClass;
import cim4j.CimClassMap;
import cim4j.Logging;

/**
 * Read RDF files into a map of rdfid to CIM object.
 */
public final class RdfReader {

    private static final Logging LOG = Logging.getLogger(RdfReader.class);

    private static Map<String, BaseClass> model = new LinkedHashMap<>();
    private static Map<String, List<SetAttribute>> setAttributeMap = new LinkedHashMap<>();

    /**
     * Read the CIM data from a list of RDF files.
     *
     * @param pathList List of files to read
     * @return CIM data as map of rdfid to CIM object
     */
    public static Map<String, BaseClass> read(List<String> pathList) {
        model.clear();
        setAttributeMap.clear();
        for (String path : pathList) {
            try (var stream = new FileInputStream(path)) {
                RdfParser.parse(stream, RdfReader::createCimObject);
            } catch (Exception ex) {
                String txt = "Error while reading rdf file: " + path;
                LOG.error(txt, ex);
                throw new RuntimeException(txt, ex);
            }
        }
        setRemainingAttributes();
        return model;
    }

    /**
     * Read the CIM data from a list of strings with XML content.
     *
     * @param xmlList Input strings to read
     * @return CIM data as map of rdfid to CIM object
     */
    public static Map<String, BaseClass> readFromStrings(List<String> xmlList) {
        model.clear();
        setAttributeMap.clear();
        for (String xml : xmlList) {
            try (var stream = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8))) {
                RdfParser.parse(stream, RdfReader::createCimObject);
            } catch (Exception ex) {
                String txt = "Error while reading xml data";
                LOG.error(txt, ex);
                throw new RuntimeException(txt, ex);
            }
        }
        setRemainingAttributes();
        return model;
    }

    private static void createCimObject(RdfParser.Element element) {
        var className = element.name.getLocalPart();
        if (element.id != null) {
            if (CimClassMap.isCimClass(className)) {
                BaseClass object = model.get(element.id);
                if (object == null) {
                    object = createNewObject(className, element.id);
                    model.put(element.id, object);
                }

                // Set attributes of new object
                for (RdfParser.Attribute attribute : element.attributes) {
                    setAttribute(object, attribute);
                }
            } else {
                LOG.warn(String.format("Unknown CIM class: %s (rdf:ID: %s)", className, element.id));
            }
        } else {
            LOG.warn(String.format("Possible CIM class: %s (rdf:ID missing)", className));
        }
    }

    private static BaseClass createNewObject(String className, String rdfid) {
        BaseClass object = CimClassMap.createCimObject(className);
        object.setRdfid(rdfid);
        LOG.debug(String.format("Created object of type: %s with rdf:ID: %s", className, rdfid));
        return object;
    }

    private static void setAttribute(BaseClass object, RdfParser.Attribute attribute) {
        var attributeName = attribute.name.getLocalPart();
        if (attributeName.contains(".")) {
            attributeName = attributeName.substring(attributeName.lastIndexOf('.') + 1);
        }
        if (attribute.resource != null) {
            if (model.containsKey(attribute.resource)) {
                BaseClass attributeObject = model.get(attribute.resource);
                object.setAttribute(attributeName, attributeObject);
            } else {
                // Set attribute later in setRemainingAttributes
                var setAttribute = new SetAttribute(attributeName, object);
                setAttributeMap.computeIfAbsent(attribute.resource, k -> new ArrayList<>()).add(setAttribute);
            }
        } else {
            object.setAttribute(attributeName, attribute.value);
        }
    }

    private static void setRemainingAttributes() {
        for (var resource : setAttributeMap.keySet()) {
            var setAttributeList = setAttributeMap.get(resource);
            BaseClass attributeObject = model.get(resource);
            if (attributeObject == null) {
                attributeObject = createNewObject("IdentifiedObject", resource);
                model.put(resource, attributeObject);
            }
            for (var setAttribute : setAttributeList) {
                setAttribute.object.setAttribute(setAttribute.name, attributeObject);
            }
        }
    }

    public static class SetAttribute {
        public SetAttribute(String n, BaseClass o) {
            name = n;
            object = o;
        }

        public String name;
        public BaseClass object;
    }
}
