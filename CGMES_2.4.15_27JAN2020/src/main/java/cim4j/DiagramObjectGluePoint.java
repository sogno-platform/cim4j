package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.DiagramObjectPoint;

/*
This is used for grouping diagram object points from different diagram objects that are considered to be glued together in a diagram even if they are not at the exact same coordinates.
*/
public class DiagramObjectGluePoint extends BaseClass
{
	private BaseClass[] DiagramObjectGluePoint_class_attributes;
	private BaseClass[] DiagramObjectGluePoint_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum DiagramObjectGluePoint_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum DiagramObjectGluePoint_class_attributes_enum {
		DiagramObjectPoints,
			LAST_ENUM;
	}

		
	
	public DiagramObjectGluePoint() {
		DiagramObjectGluePoint_primitive_attributes = new BaseClass[DiagramObjectGluePoint_primitive_builder.values().length];
		DiagramObjectGluePoint_class_attributes = new BaseClass[DiagramObjectGluePoint_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DiagramObjectGluePoint_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DiagramObjectGluePoint_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DiagramObjectGluePoint_primitive_builder attrEnum, BaseClass value) {
		try {
			DiagramObjectGluePoint_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DiagramObjectGluePoint_class_attributes_enum attrEnum = DiagramObjectGluePoint_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DiagramObjectGluePoint, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DiagramObjectGluePoint_primitive_builder attrEnum = DiagramObjectGluePoint_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated DiagramObjectGluePoint, setting " + attrName  + " to: "  + value);
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
			for (DiagramObjectGluePoint_primitive_builder attrEnum: DiagramObjectGluePoint_primitive_builder.values()) {
				BaseClass bc = DiagramObjectGluePoint_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiagramObjectGluePoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DiagramObjectGluePoint_class_attributes_enum attrEnum: DiagramObjectGluePoint_class_attributes_enum.values()) {
				BaseClass bc = DiagramObjectGluePoint_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiagramObjectGluePoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DiagramObjectGluePoint) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "DiagramObjectGluePoint";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DiagramObjectGluePoint();
        }
};
