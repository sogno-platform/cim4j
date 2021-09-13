package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Integer;
import cim4j.Simple_Float;


import cim4j.DiagramObject;
import cim4j.DiagramObjectGluePoint;

/*
A point in a given space defined by 3 coordinates and associated to a diagram object.  The coordinates may be positive or negative as the origin does not have to be in the corner of a diagram.
*/
public class DiagramObjectPoint extends BaseClass
{
	private BaseClass[] DiagramObjectPoint_class_attributes;
	private BaseClass[] DiagramObjectPoint_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum DiagramObjectPoint_primitive_builder implements PrimitiveBuilder {
		sequenceNumber(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
		xPosition(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		yPosition(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		zPosition(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum DiagramObjectPoint_class_attributes_enum {
		DiagramObject,
		DiagramObjectGluePoint,
		sequenceNumber,
		xPosition,
		yPosition,
		zPosition,
			LAST_ENUM;
	}

		
		
		
		
		
		
	
	public DiagramObjectPoint() {
		DiagramObjectPoint_primitive_attributes = new BaseClass[DiagramObjectPoint_primitive_builder.values().length];
		DiagramObjectPoint_class_attributes = new BaseClass[DiagramObjectPoint_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DiagramObjectPoint_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DiagramObjectPoint_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DiagramObjectPoint_primitive_builder attrEnum, BaseClass value) {
		try {
			DiagramObjectPoint_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DiagramObjectPoint_class_attributes_enum attrEnum = DiagramObjectPoint_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DiagramObjectPoint, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DiagramObjectPoint_primitive_builder attrEnum = DiagramObjectPoint_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated DiagramObjectPoint, setting " + attrName  + " to: "  + value);
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
			for (DiagramObjectPoint_primitive_builder attrEnum: DiagramObjectPoint_primitive_builder.values()) {
				BaseClass bc = DiagramObjectPoint_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiagramObjectPoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DiagramObjectPoint_class_attributes_enum attrEnum: DiagramObjectPoint_class_attributes_enum.values()) {
				BaseClass bc = DiagramObjectPoint_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiagramObjectPoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DiagramObjectPoint) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "DiagramObjectPoint";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DiagramObjectPoint();
        }
};
