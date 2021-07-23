package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.WindTurbineType1or2IEC;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.WindAeroConstIEC;

/*
Wind turbine IEC Type 1.  Reference: IEC Standard 61400-27-1, section 6.5.2.
*/
public class WindGenTurbineType1IEC extends WindTurbineType1or2IEC
{
	private BaseClass[] WindGenTurbineType1IEC_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum WindGenTurbineType1IEC_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
	
	public WindGenTurbineType1IEC() {
		WindGenTurbineType1IEC_attributes = new BaseClass[WindGenTurbineType1IEC_primitive_builder.values().length];
	}

	public void updateAttributeInArray(WindGenTurbineType1IEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindGenTurbineType1IEC_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//WindGenTurbineType1IEC_ATTR_ENUM attrEnum = WindGenTurbineType1IEC_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindGenTurbineType1IEC_primitive_builder attrEnum = WindGenTurbineType1IEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (WindGenTurbineType1IEC_primitive_builder attrEnum: WindGenTurbineType1IEC_primitive_builder.values()) {
			BaseClass bc = WindGenTurbineType1IEC_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "WindGenTurbineType1IEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindGenTurbineType1IEC();
        }
};
