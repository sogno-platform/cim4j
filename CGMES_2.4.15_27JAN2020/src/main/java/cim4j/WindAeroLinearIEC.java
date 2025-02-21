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
	private BaseClass[] WindAeroLinearIEC_class_attributes;
	private BaseClass[] WindAeroLinearIEC_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

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

	private enum WindAeroLinearIEC_class_attributes_enum {
		dpomega,
		dptheta,
		omegazero,
		pavail,
		thetazero,
		WindGenTurbineType3IEC,
			LAST_ENUM;
	}

		
		
		
		
		
		
	
	public WindAeroLinearIEC() {
		WindAeroLinearIEC_primitive_attributes = new BaseClass[WindAeroLinearIEC_primitive_builder.values().length];
		WindAeroLinearIEC_class_attributes = new BaseClass[WindAeroLinearIEC_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(WindAeroLinearIEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindAeroLinearIEC_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(WindAeroLinearIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindAeroLinearIEC_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindAeroLinearIEC_class_attributes_enum attrEnum = WindAeroLinearIEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated WindAeroLinearIEC, setting " + attrName);
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
			System.out.println("Updated WindAeroLinearIEC, setting " + attrName  + " to: "  + value);
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
			for (WindAeroLinearIEC_primitive_builder attrEnum: WindAeroLinearIEC_primitive_builder.values()) {
				BaseClass bc = WindAeroLinearIEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindAeroLinearIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindAeroLinearIEC_class_attributes_enum attrEnum: WindAeroLinearIEC_class_attributes_enum.values()) {
				BaseClass bc = WindAeroLinearIEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindAeroLinearIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(WindAeroLinearIEC) RDFID: " + rdfid;
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
