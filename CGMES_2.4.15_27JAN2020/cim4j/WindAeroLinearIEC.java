package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.AngleDegrees;


import cim4j.WindGenTurbineType3IEC;

/*
The linearised aerodynamic model.    Reference: IEC Standard 614000-27-1 Section 6.6.1.2.
*/
public class WindAeroLinearIEC extends IdentifiedObject
{
	private BaseClass[] WindAeroLinearIEC_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum WindAeroLinearIEC_primitive_builder implements PrimitiveBuilder {
			dpomega(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			dptheta(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			omegazero(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			pavail(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			thetazero(){
			public BaseClass construct (java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
	
	public WindAeroLinearIEC() {
		WindAeroLinearIEC_attributes = new BaseClass[WindAeroLinearIEC_primitive_builder.values().length];
	}

	public void updateAttributeInArray(WindAeroLinearIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindAeroLinearIEC_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//WindAeroLinearIEC_ATTR_ENUM attrEnum = WindAeroLinearIEC_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindAeroLinearIEC_primitive_builder attrEnum = WindAeroLinearIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (WindAeroLinearIEC_primitive_builder attrEnum: WindAeroLinearIEC_primitive_builder.values()) {
			BaseClass bc = WindAeroLinearIEC_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "WindAeroLinearIEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindAeroLinearIEC();
        }
};
