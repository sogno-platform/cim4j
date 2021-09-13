package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.WindTurbineType3or4Dynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.WindContCurrLimIEC;
import cim4j.WindContQIEC;
import cim4j.WindProtectionIEC;

/*
Parent class supporting relationships to IEC wind turbines Type 3 and 4 and wind plant including their control models.
*/
public class WindTurbineType3or4IEC extends WindTurbineType3or4Dynamics
{
	private BaseClass[] WindTurbineType3or4IEC_class_attributes;
	private BaseClass[] WindTurbineType3or4IEC_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum WindTurbineType3or4IEC_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum WindTurbineType3or4IEC_class_attributes_enum {
		WindContCurrLimIEC,
		WIndContQIEC,
		WindProtectionIEC,
			LAST_ENUM;
	}

		
		
		
	
	public WindTurbineType3or4IEC() {
		WindTurbineType3or4IEC_primitive_attributes = new BaseClass[WindTurbineType3or4IEC_primitive_builder.values().length];
		WindTurbineType3or4IEC_class_attributes = new BaseClass[WindTurbineType3or4IEC_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(WindTurbineType3or4IEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindTurbineType3or4IEC_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(WindTurbineType3or4IEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindTurbineType3or4IEC_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindTurbineType3or4IEC_class_attributes_enum attrEnum = WindTurbineType3or4IEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated WindTurbineType3or4IEC, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindTurbineType3or4IEC_primitive_builder attrEnum = WindTurbineType3or4IEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated WindTurbineType3or4IEC, setting " + attrName  + " to: "  + value);
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
			for (WindTurbineType3or4IEC_primitive_builder attrEnum: WindTurbineType3or4IEC_primitive_builder.values()) {
				BaseClass bc = WindTurbineType3or4IEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindTurbineType3or4IEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindTurbineType3or4IEC_class_attributes_enum attrEnum: WindTurbineType3or4IEC_class_attributes_enum.values()) {
				BaseClass bc = WindTurbineType3or4IEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindTurbineType3or4IEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(WindTurbineType3or4IEC) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "WindTurbineType3or4IEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindTurbineType3or4IEC();
        }
};
