package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Integer;


import cim4j.Location;

/*
Set of spatial coordinates that determine a point, defined in the coordinate system specified in 'Location.CoordinateSystem'. Use a single position point instance to desribe a point-oriented location. Use a sequence of position points to describe a line-oriented object (physical location of non-point oriented objects like cables or lines), or area of an object (like a substation or a geographical zone - in this case, have first and last position point with the same values).
*/
public class PositionPoint extends BaseClass
{
	private BaseClass[] PositionPoint_class_attributes;
	private BaseClass[] PositionPoint_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PositionPoint_primitive_builder implements PrimitiveBuilder {
		sequenceNumber(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
		xPosition(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		yPosition(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		zPosition(){
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

	private enum PositionPoint_class_attributes_enum {
		Location,
		sequenceNumber,
		xPosition,
		yPosition,
		zPosition,
			LAST_ENUM;
	}

		
		
		
		
		
	
	public PositionPoint() {
		PositionPoint_primitive_attributes = new BaseClass[PositionPoint_primitive_builder.values().length];
		PositionPoint_class_attributes = new BaseClass[PositionPoint_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PositionPoint_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PositionPoint_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PositionPoint_primitive_builder attrEnum, BaseClass value) {
		try {
			PositionPoint_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PositionPoint_class_attributes_enum attrEnum = PositionPoint_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PositionPoint, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PositionPoint_primitive_builder attrEnum = PositionPoint_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PositionPoint, setting " + attrName  + " to: "  + value);
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
			for (PositionPoint_primitive_builder attrEnum: PositionPoint_primitive_builder.values()) {
				BaseClass bc = PositionPoint_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PositionPoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PositionPoint_class_attributes_enum attrEnum: PositionPoint_class_attributes_enum.values()) {
				BaseClass bc = PositionPoint_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PositionPoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PositionPoint) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PositionPoint";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PositionPoint();
        }
};
