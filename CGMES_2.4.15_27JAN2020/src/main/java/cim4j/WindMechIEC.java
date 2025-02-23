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
	private BaseClass[] WindMechIEC_class_attributes;
	private BaseClass[] WindMechIEC_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

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

	private enum WindMechIEC_class_attributes_enum {
		WindGenTurbineType3IEC,
		cdrt,
		hgen,
		hwtr,
		kdrt,
		WindTurbineType4bIEC,
		WindTurbineType1or2IEC,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
	
	public WindMechIEC() {
		WindMechIEC_primitive_attributes = new BaseClass[WindMechIEC_primitive_builder.values().length];
		WindMechIEC_class_attributes = new BaseClass[WindMechIEC_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(WindMechIEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindMechIEC_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(WindMechIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindMechIEC_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindMechIEC_class_attributes_enum attrEnum = WindMechIEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated WindMechIEC, setting " + attrName);
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
			System.out.println("Updated WindMechIEC, setting " + attrName  + " to: "  + value);
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
			for (WindMechIEC_primitive_builder attrEnum: WindMechIEC_primitive_builder.values()) {
				BaseClass bc = WindMechIEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindMechIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindMechIEC_class_attributes_enum attrEnum: WindMechIEC_class_attributes_enum.values()) {
				BaseClass bc = WindMechIEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindMechIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(WindMechIEC) RDFID: " + rdfid;
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
