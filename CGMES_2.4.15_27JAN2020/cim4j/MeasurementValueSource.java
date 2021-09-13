package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.MeasurementValue;

/*
MeasurementValueSource describes the alternative sources updating a MeasurementValue. User conventions for how to use the MeasurementValueSource attributes are described in the introduction to IEC 61970-301.
*/
public class MeasurementValueSource extends IdentifiedObject
{
	private BaseClass[] MeasurementValueSource_class_attributes;
	private BaseClass[] MeasurementValueSource_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum MeasurementValueSource_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum MeasurementValueSource_class_attributes_enum {
		MeasurementValues,
			LAST_ENUM;
	}

		
	
	public MeasurementValueSource() {
		MeasurementValueSource_primitive_attributes = new BaseClass[MeasurementValueSource_primitive_builder.values().length];
		MeasurementValueSource_class_attributes = new BaseClass[MeasurementValueSource_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(MeasurementValueSource_class_attributes_enum attrEnum, BaseClass value) {
		try {
			MeasurementValueSource_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(MeasurementValueSource_primitive_builder attrEnum, BaseClass value) {
		try {
			MeasurementValueSource_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			MeasurementValueSource_class_attributes_enum attrEnum = MeasurementValueSource_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated MeasurementValueSource, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			MeasurementValueSource_primitive_builder attrEnum = MeasurementValueSource_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated MeasurementValueSource, setting " + attrName  + " to: "  + value);
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
			for (MeasurementValueSource_primitive_builder attrEnum: MeasurementValueSource_primitive_builder.values()) {
				BaseClass bc = MeasurementValueSource_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    MeasurementValueSource." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (MeasurementValueSource_class_attributes_enum attrEnum: MeasurementValueSource_class_attributes_enum.values()) {
				BaseClass bc = MeasurementValueSource_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    MeasurementValueSource." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(MeasurementValueSource) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "MeasurementValueSource";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new MeasurementValueSource();
        }
};
