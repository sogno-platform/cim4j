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
	private BaseClass[] WindContPitchAngleIEC_class_attributes;
	private BaseClass[] WindContPitchAngleIEC_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

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

	private enum WindContPitchAngleIEC_class_attributes_enum {
		dthetamax,
		dthetamin,
		kic,
		kiomega,
		kpc,
		kpomega,
		kpx,
		thetamax,
		thetamin,
		ttheta,
		WindGenTurbineType3IEC,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
	
	public WindContPitchAngleIEC() {
		WindContPitchAngleIEC_primitive_attributes = new BaseClass[WindContPitchAngleIEC_primitive_builder.values().length];
		WindContPitchAngleIEC_class_attributes = new BaseClass[WindContPitchAngleIEC_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(WindContPitchAngleIEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindContPitchAngleIEC_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(WindContPitchAngleIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindContPitchAngleIEC_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindContPitchAngleIEC_class_attributes_enum attrEnum = WindContPitchAngleIEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated WindContPitchAngleIEC, setting " + attrName);
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
			System.out.println("Updated WindContPitchAngleIEC, setting " + attrName  + " to: "  + value);
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
			for (WindContPitchAngleIEC_primitive_builder attrEnum: WindContPitchAngleIEC_primitive_builder.values()) {
				BaseClass bc = WindContPitchAngleIEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindContPitchAngleIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindContPitchAngleIEC_class_attributes_enum attrEnum: WindContPitchAngleIEC_class_attributes_enum.values()) {
				BaseClass bc = WindContPitchAngleIEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindContPitchAngleIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(WindContPitchAngleIEC) RDFID: " + rdfid;
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
