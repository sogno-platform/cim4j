package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.WindTurbineType1or2Dynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.WindMechIEC;
import cim4j.WindProtectionIEC;

/*
Generator model for wind turbine of IEC Type 1 or Type 2 is a standard asynchronous generator model.  Reference: IEC Standard 614000-27-1 Section 6.6.3.1.
*/
public class WindTurbineType1or2IEC extends WindTurbineType1or2Dynamics
{
	private BaseClass[] WindTurbineType1or2IEC_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum WindTurbineType1or2IEC_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
	
	public WindTurbineType1or2IEC() {
		WindTurbineType1or2IEC_attributes = new BaseClass[WindTurbineType1or2IEC_primitive_builder.values().length];
	}

	public void updateAttributeInArray(WindTurbineType1or2IEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindTurbineType1or2IEC_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//WindTurbineType1or2IEC_ATTR_ENUM attrEnum = WindTurbineType1or2IEC_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindTurbineType1or2IEC_primitive_builder attrEnum = WindTurbineType1or2IEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (WindTurbineType1or2IEC_primitive_builder attrEnum: WindTurbineType1or2IEC_primitive_builder.values()) {
			BaseClass bc = WindTurbineType1or2IEC_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "WindTurbineType1or2IEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindTurbineType1or2IEC();
        }
};
