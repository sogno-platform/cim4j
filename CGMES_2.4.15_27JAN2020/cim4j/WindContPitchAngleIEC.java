package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.PU;
import cim4j.AngleDegrees;
import cim4j.Seconds;


import cim4j.WindGenTurbineType3IEC;

/*
Pitch angle control model.  Reference: IEC Standard 61400-27-1 Section 6.6.5.8.
*/
public class WindContPitchAngleIEC extends IdentifiedObject
{
	private BaseClass[] WindContPitchAngleIEC_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum WindContPitchAngleIEC_primitive_builder implements PrimitiveBuilder {
			dthetamax(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			dthetamin(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			kic(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kiomega(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kpc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kpomega(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kpx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			thetamax(){
			public BaseClass construct (java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
			thetamin(){
			public BaseClass construct (java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
			ttheta(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
		
	
	public WindContPitchAngleIEC() {
		WindContPitchAngleIEC_attributes = new BaseClass[WindContPitchAngleIEC_primitive_builder.values().length];
	}

	public void updateAttributeInArray(WindContPitchAngleIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindContPitchAngleIEC_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//WindContPitchAngleIEC_ATTR_ENUM attrEnum = WindContPitchAngleIEC_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindContPitchAngleIEC_primitive_builder attrEnum = WindContPitchAngleIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (WindContPitchAngleIEC_primitive_builder attrEnum: WindContPitchAngleIEC_primitive_builder.values()) {
			BaseClass bc = WindContPitchAngleIEC_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "WindContPitchAngleIEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindContPitchAngleIEC();
        }
};
