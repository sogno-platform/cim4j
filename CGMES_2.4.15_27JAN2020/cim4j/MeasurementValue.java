package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PerCent;


import cim4j.DateTime;
import cim4j.MeasurementValueQuality;
import cim4j.MeasurementValueSource;

/*
The current state for a measurement. A state value is an instance of a measurement from a specific source. Measurements can be associated with many state values, each representing a different source for the measurement.
*/
public class MeasurementValue extends IdentifiedObject
{
	private BaseClass[] MeasurementValue_class_attributes;
	private BaseClass[] MeasurementValue_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum MeasurementValue_primitive_builder implements PrimitiveBuilder {
		sensorAccuracy(){
			public BaseClass construct (java.lang.String value) {
				return new PerCent(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum MeasurementValue_class_attributes_enum {
		timeStamp,
		sensorAccuracy,
		MeasurementValueQuality,
		MeasurementValueSource,
			LAST_ENUM;
	}

		
		
		
		
	
	public MeasurementValue() {
		MeasurementValue_primitive_attributes = new BaseClass[MeasurementValue_primitive_builder.values().length];
		MeasurementValue_class_attributes = new BaseClass[MeasurementValue_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(MeasurementValue_class_attributes_enum attrEnum, BaseClass value) {
		try {
			MeasurementValue_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(MeasurementValue_primitive_builder attrEnum, BaseClass value) {
		try {
			MeasurementValue_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			MeasurementValue_class_attributes_enum attrEnum = MeasurementValue_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated MeasurementValue, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			MeasurementValue_primitive_builder attrEnum = MeasurementValue_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated MeasurementValue, setting " + attrName  + " to: "  + value);
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
			for (MeasurementValue_primitive_builder attrEnum: MeasurementValue_primitive_builder.values()) {
				BaseClass bc = MeasurementValue_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    MeasurementValue." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (MeasurementValue_class_attributes_enum attrEnum: MeasurementValue_class_attributes_enum.values()) {
				BaseClass bc = MeasurementValue_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    MeasurementValue." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(MeasurementValue) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "MeasurementValue";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new MeasurementValue();
        }
};
