package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.DiagramObject;

/*
A reference to a style used by the originating system for a diagram object.  A diagram object style describes information such as line thickness, shape such as circle or rectangle etc, and color.
*/
public class DiagramObjectStyle extends IdentifiedObject
{
	private BaseClass[] DiagramObjectStyle_class_attributes;
	private BaseClass[] DiagramObjectStyle_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum DiagramObjectStyle_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum DiagramObjectStyle_class_attributes_enum {
		StyledObjects,
			LAST_ENUM;
	}

		
	
	public DiagramObjectStyle() {
		DiagramObjectStyle_primitive_attributes = new BaseClass[DiagramObjectStyle_primitive_builder.values().length];
		DiagramObjectStyle_class_attributes = new BaseClass[DiagramObjectStyle_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DiagramObjectStyle_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DiagramObjectStyle_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DiagramObjectStyle_primitive_builder attrEnum, BaseClass value) {
		try {
			DiagramObjectStyle_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DiagramObjectStyle_class_attributes_enum attrEnum = DiagramObjectStyle_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DiagramObjectStyle, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DiagramObjectStyle_primitive_builder attrEnum = DiagramObjectStyle_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated DiagramObjectStyle, setting " + attrName  + " to: "  + value);
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
			for (DiagramObjectStyle_primitive_builder attrEnum: DiagramObjectStyle_primitive_builder.values()) {
				BaseClass bc = DiagramObjectStyle_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiagramObjectStyle." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DiagramObjectStyle_class_attributes_enum attrEnum: DiagramObjectStyle_class_attributes_enum.values()) {
				BaseClass bc = DiagramObjectStyle_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiagramObjectStyle." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DiagramObjectStyle) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "DiagramObjectStyle";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DiagramObjectStyle();
        }
};
