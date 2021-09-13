package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DiagramObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;





/*
A diagram object for placing free-text or text derived from an associated domain object.
*/
public class TextDiagramObject extends DiagramObject
{
	private BaseClass[] TextDiagramObject_class_attributes;
	private BaseClass[] TextDiagramObject_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum TextDiagramObject_primitive_builder implements PrimitiveBuilder {
		text(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum TextDiagramObject_class_attributes_enum {
		text,
			LAST_ENUM;
	}

		
	
	public TextDiagramObject() {
		TextDiagramObject_primitive_attributes = new BaseClass[TextDiagramObject_primitive_builder.values().length];
		TextDiagramObject_class_attributes = new BaseClass[TextDiagramObject_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(TextDiagramObject_class_attributes_enum attrEnum, BaseClass value) {
		try {
			TextDiagramObject_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(TextDiagramObject_primitive_builder attrEnum, BaseClass value) {
		try {
			TextDiagramObject_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			TextDiagramObject_class_attributes_enum attrEnum = TextDiagramObject_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated TextDiagramObject, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			TextDiagramObject_primitive_builder attrEnum = TextDiagramObject_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated TextDiagramObject, setting " + attrName  + " to: "  + value);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString(boolean topClass) {
		java.lang.String result = "";
		java.lang.String indent = "";
		if (topClass) {
			for (TextDiagramObject_primitive_builder attrEnum: TextDiagramObject_primitive_builder.values()) {
				BaseClass bc = TextDiagramObject_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TextDiagramObject." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (TextDiagramObject_class_attributes_enum attrEnum: TextDiagramObject_class_attributes_enum.values()) {
				BaseClass bc = TextDiagramObject_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TextDiagramObject." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(TextDiagramObject) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "TextDiagramObject";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new TextDiagramObject();
        }
};
