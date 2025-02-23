package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.DCLineSegment;
import cim4j.CapacitancePerLength;
import cim4j.InductancePerLength;
import cim4j.ResistancePerLength;

/*

*/
public class PerLengthDCLineParameter extends BaseClass
{
	private BaseClass[] PerLengthDCLineParameter_class_attributes;
	private BaseClass[] PerLengthDCLineParameter_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PerLengthDCLineParameter_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum PerLengthDCLineParameter_class_attributes_enum {
		DCLineSegments,
		capacitance,
		inductance,
		resistance,
			LAST_ENUM;
	}

		
		
		
		
	
	public PerLengthDCLineParameter() {
		PerLengthDCLineParameter_primitive_attributes = new BaseClass[PerLengthDCLineParameter_primitive_builder.values().length];
		PerLengthDCLineParameter_class_attributes = new BaseClass[PerLengthDCLineParameter_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PerLengthDCLineParameter_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PerLengthDCLineParameter_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PerLengthDCLineParameter_primitive_builder attrEnum, BaseClass value) {
		try {
			PerLengthDCLineParameter_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PerLengthDCLineParameter_class_attributes_enum attrEnum = PerLengthDCLineParameter_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PerLengthDCLineParameter, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PerLengthDCLineParameter_primitive_builder attrEnum = PerLengthDCLineParameter_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PerLengthDCLineParameter, setting " + attrName  + " to: "  + value);
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
			for (PerLengthDCLineParameter_primitive_builder attrEnum: PerLengthDCLineParameter_primitive_builder.values()) {
				BaseClass bc = PerLengthDCLineParameter_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PerLengthDCLineParameter." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PerLengthDCLineParameter_class_attributes_enum attrEnum: PerLengthDCLineParameter_class_attributes_enum.values()) {
				BaseClass bc = PerLengthDCLineParameter_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PerLengthDCLineParameter." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PerLengthDCLineParameter) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PerLengthDCLineParameter";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PerLengthDCLineParameter();
        }
};
