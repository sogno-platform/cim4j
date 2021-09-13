package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.Measurement;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.StringMeasurementValue;

/*
StringMeasurement represents a measurement with values of type string.
*/
public class StringMeasurement extends Measurement
{
	private BaseClass[] StringMeasurement_class_attributes;
	private BaseClass[] StringMeasurement_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum StringMeasurement_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum StringMeasurement_class_attributes_enum {
		StringMeasurementValues,
			LAST_ENUM;
	}

		
	
	public StringMeasurement() {
		StringMeasurement_primitive_attributes = new BaseClass[StringMeasurement_primitive_builder.values().length];
		StringMeasurement_class_attributes = new BaseClass[StringMeasurement_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(StringMeasurement_class_attributes_enum attrEnum, BaseClass value) {
		try {
			StringMeasurement_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(StringMeasurement_primitive_builder attrEnum, BaseClass value) {
		try {
			StringMeasurement_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			StringMeasurement_class_attributes_enum attrEnum = StringMeasurement_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated StringMeasurement, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			StringMeasurement_primitive_builder attrEnum = StringMeasurement_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated StringMeasurement, setting " + attrName  + " to: "  + value);
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
			for (StringMeasurement_primitive_builder attrEnum: StringMeasurement_primitive_builder.values()) {
				BaseClass bc = StringMeasurement_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    StringMeasurement." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (StringMeasurement_class_attributes_enum attrEnum: StringMeasurement_class_attributes_enum.values()) {
				BaseClass bc = StringMeasurement_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    StringMeasurement." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(StringMeasurement) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "StringMeasurement";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new StringMeasurement();
        }
};
