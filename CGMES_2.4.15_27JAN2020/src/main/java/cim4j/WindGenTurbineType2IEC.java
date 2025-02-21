package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.WindTurbineType1or2IEC;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.WindContRotorRIEC;
import cim4j.WindPitchContEmulIEC;

/*
Wind turbine IEC Type 2.  Reference: IEC Standard 61400-27-1, section 6.5.3.
*/
public class WindGenTurbineType2IEC extends WindTurbineType1or2IEC
{
	private BaseClass[] WindGenTurbineType2IEC_class_attributes;
	private BaseClass[] WindGenTurbineType2IEC_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum WindGenTurbineType2IEC_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum WindGenTurbineType2IEC_class_attributes_enum {
		WindContRotorRIEC,
		WindPitchContEmulIEC,
			LAST_ENUM;
	}

		
		
	
	public WindGenTurbineType2IEC() {
		WindGenTurbineType2IEC_primitive_attributes = new BaseClass[WindGenTurbineType2IEC_primitive_builder.values().length];
		WindGenTurbineType2IEC_class_attributes = new BaseClass[WindGenTurbineType2IEC_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(WindGenTurbineType2IEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindGenTurbineType2IEC_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(WindGenTurbineType2IEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindGenTurbineType2IEC_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindGenTurbineType2IEC_class_attributes_enum attrEnum = WindGenTurbineType2IEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated WindGenTurbineType2IEC, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindGenTurbineType2IEC_primitive_builder attrEnum = WindGenTurbineType2IEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated WindGenTurbineType2IEC, setting " + attrName  + " to: "  + value);
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
			for (WindGenTurbineType2IEC_primitive_builder attrEnum: WindGenTurbineType2IEC_primitive_builder.values()) {
				BaseClass bc = WindGenTurbineType2IEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindGenTurbineType2IEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindGenTurbineType2IEC_class_attributes_enum attrEnum: WindGenTurbineType2IEC_class_attributes_enum.values()) {
				BaseClass bc = WindGenTurbineType2IEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindGenTurbineType2IEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(WindGenTurbineType2IEC) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "WindGenTurbineType2IEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindGenTurbineType2IEC();
        }
};
