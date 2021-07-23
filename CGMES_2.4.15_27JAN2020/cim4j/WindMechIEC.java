package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;


import cim4j.WindGenTurbineType3IEC;
import cim4j.WindTurbineType4bIEC;
import cim4j.WindTurbineType1or2IEC;

/*
Two mass model.  Reference: IEC Standard 61400-27-1 Section 6.6.2.1.
*/
public class WindMechIEC extends IdentifiedObject
{
	private BaseClass[] WindMechIEC_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum WindMechIEC_primitive_builder implements PrimitiveBuilder {
			cdrt(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			hgen(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			hwtr(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			kdrt(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
	
	public WindMechIEC() {
		WindMechIEC_attributes = new BaseClass[WindMechIEC_primitive_builder.values().length];
	}

	public void updateAttributeInArray(WindMechIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindMechIEC_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//WindMechIEC_ATTR_ENUM attrEnum = WindMechIEC_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindMechIEC_primitive_builder attrEnum = WindMechIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (WindMechIEC_primitive_builder attrEnum: WindMechIEC_primitive_builder.values()) {
			BaseClass bc = WindMechIEC_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "WindMechIEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindMechIEC();
        }
};
