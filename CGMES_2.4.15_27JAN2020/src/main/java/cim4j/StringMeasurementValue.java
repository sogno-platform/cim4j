package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.MeasurementValue;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.StringMeasurement;

/*
StringMeasurementValue represents a measurement value of type string.
*/
public class StringMeasurementValue extends MeasurementValue
{
	private BaseClass[] StringMeasurementValue_class_attributes;
	private BaseClass[] StringMeasurementValue_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum StringMeasurementValue_primitive_builder implements PrimitiveBuilder {
		value(){
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

	private enum StringMeasurementValue_class_attributes_enum {
		StringMeasurement,
		value,
			LAST_ENUM;
	}

		
		
	
	public StringMeasurementValue() {
		StringMeasurementValue_primitive_attributes = new BaseClass[StringMeasurementValue_primitive_builder.values().length];
		StringMeasurementValue_class_attributes = new BaseClass[StringMeasurementValue_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(StringMeasurementValue_class_attributes_enum attrEnum, BaseClass value) {
		try {
			StringMeasurementValue_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(StringMeasurementValue_primitive_builder attrEnum, BaseClass value) {
		try {
			StringMeasurementValue_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			StringMeasurementValue_class_attributes_enum attrEnum = StringMeasurementValue_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated StringMeasurementValue, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			StringMeasurementValue_primitive_builder attrEnum = StringMeasurementValue_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated StringMeasurementValue, setting " + attrName  + " to: "  + value);
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
			for (StringMeasurementValue_primitive_builder attrEnum: StringMeasurementValue_primitive_builder.values()) {
				BaseClass bc = StringMeasurementValue_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    StringMeasurementValue." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (StringMeasurementValue_class_attributes_enum attrEnum: StringMeasurementValue_class_attributes_enum.values()) {
				BaseClass bc = StringMeasurementValue_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    StringMeasurementValue." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(StringMeasurementValue) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "StringMeasurementValue";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new StringMeasurementValue();
        }
};
