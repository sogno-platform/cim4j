package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;


import cim4j.WindTurbineType3or4IEC;
import cim4j.WindTurbineType1or2IEC;

/*
The grid protection model includes protection against over and under voltage, and against over and under frequency.  Reference: IEC Standard 614000-27-1 Section 6.6.6.
*/
public class WindProtectionIEC extends IdentifiedObject
{
	private BaseClass[] WindProtectionIEC_class_attributes;
	private BaseClass[] WindProtectionIEC_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum WindProtectionIEC_primitive_builder implements PrimitiveBuilder {
		fover(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		funder(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tfover(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tfunder(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tuover(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tuunder(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		uover(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		uunder(){
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

	private enum WindProtectionIEC_class_attributes_enum {
		fover,
		funder,
		tfover,
		tfunder,
		tuover,
		tuunder,
		uover,
		uunder,
		WindTurbineType3or4IEC,
		WindTurbineType1or2IEC,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
	
	public WindProtectionIEC() {
		WindProtectionIEC_primitive_attributes = new BaseClass[WindProtectionIEC_primitive_builder.values().length];
		WindProtectionIEC_class_attributes = new BaseClass[WindProtectionIEC_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(WindProtectionIEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindProtectionIEC_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(WindProtectionIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindProtectionIEC_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindProtectionIEC_class_attributes_enum attrEnum = WindProtectionIEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated WindProtectionIEC, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindProtectionIEC_primitive_builder attrEnum = WindProtectionIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated WindProtectionIEC, setting " + attrName  + " to: "  + value);
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
			for (WindProtectionIEC_primitive_builder attrEnum: WindProtectionIEC_primitive_builder.values()) {
				BaseClass bc = WindProtectionIEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindProtectionIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindProtectionIEC_class_attributes_enum attrEnum: WindProtectionIEC_class_attributes_enum.values()) {
				BaseClass bc = WindProtectionIEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindProtectionIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(WindProtectionIEC) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "WindProtectionIEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindProtectionIEC();
        }
};
