package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.WindGenType4IEC;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.WindContPType4aIEC;

/*
Wind turbine IEC Type 4A.  Reference: IEC Standard 61400-27-1, section 6.5.5.2.
*/
public class WindTurbineType4aIEC extends WindGenType4IEC
{
	private BaseClass[] WindTurbineType4aIEC_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum WindTurbineType4aIEC_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
	
	public WindTurbineType4aIEC() {
		WindTurbineType4aIEC_attributes = new BaseClass[WindTurbineType4aIEC_primitive_builder.values().length];
	}

	public void updateAttributeInArray(WindTurbineType4aIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindTurbineType4aIEC_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//WindTurbineType4aIEC_ATTR_ENUM attrEnum = WindTurbineType4aIEC_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindTurbineType4aIEC_primitive_builder attrEnum = WindTurbineType4aIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (WindTurbineType4aIEC_primitive_builder attrEnum: WindTurbineType4aIEC_primitive_builder.values()) {
			BaseClass bc = WindTurbineType4aIEC_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "WindTurbineType4aIEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindTurbineType4aIEC();
        }
};
