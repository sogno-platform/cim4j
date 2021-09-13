package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.WindGenType4IEC;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.WindContPType4bIEC;
import cim4j.WindMechIEC;

/*
Wind turbine IEC Type 4A.  Reference: IEC Standard 61400-27-1, section 6.5.5.3.
*/
public class WindTurbineType4bIEC extends WindGenType4IEC
{
	private BaseClass[] WindTurbineType4bIEC_class_attributes;
	private BaseClass[] WindTurbineType4bIEC_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum WindTurbineType4bIEC_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum WindTurbineType4bIEC_class_attributes_enum {
		WindContPType4bIEC,
		WindMechIEC,
			LAST_ENUM;
	}

		
		
	
	public WindTurbineType4bIEC() {
		WindTurbineType4bIEC_primitive_attributes = new BaseClass[WindTurbineType4bIEC_primitive_builder.values().length];
		WindTurbineType4bIEC_class_attributes = new BaseClass[WindTurbineType4bIEC_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(WindTurbineType4bIEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindTurbineType4bIEC_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(WindTurbineType4bIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindTurbineType4bIEC_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindTurbineType4bIEC_class_attributes_enum attrEnum = WindTurbineType4bIEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated WindTurbineType4bIEC, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindTurbineType4bIEC_primitive_builder attrEnum = WindTurbineType4bIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated WindTurbineType4bIEC, setting " + attrName  + " to: "  + value);
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
			for (WindTurbineType4bIEC_primitive_builder attrEnum: WindTurbineType4bIEC_primitive_builder.values()) {
				BaseClass bc = WindTurbineType4bIEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindTurbineType4bIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindTurbineType4bIEC_class_attributes_enum attrEnum: WindTurbineType4bIEC_class_attributes_enum.values()) {
				BaseClass bc = WindTurbineType4bIEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindTurbineType4bIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(WindTurbineType4bIEC) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "WindTurbineType4bIEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindTurbineType4bIEC();
        }
};
