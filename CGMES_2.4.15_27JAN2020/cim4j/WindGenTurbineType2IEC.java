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
	private BaseClass[] WindGenTurbineType2IEC_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum WindGenTurbineType2IEC_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
	
	public WindGenTurbineType2IEC() {
		WindGenTurbineType2IEC_attributes = new BaseClass[WindGenTurbineType2IEC_primitive_builder.values().length];
	}

	public void updateAttributeInArray(WindGenTurbineType2IEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindGenTurbineType2IEC_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//WindGenTurbineType2IEC_ATTR_ENUM attrEnum = WindGenTurbineType2IEC_ATTR_BC_ENUM.valueOf(attrName);
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
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (WindGenTurbineType2IEC_primitive_builder attrEnum: WindGenTurbineType2IEC_primitive_builder.values()) {
			BaseClass bc = WindGenTurbineType2IEC_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
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
