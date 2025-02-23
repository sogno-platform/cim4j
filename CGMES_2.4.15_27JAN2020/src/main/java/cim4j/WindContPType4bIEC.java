package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;


import cim4j.WindTurbineType4bIEC;

/*
P control model Type 4B.  Reference: IEC Standard 61400-27-1 Section 6.6.5.5.
*/
public class WindContPType4bIEC extends IdentifiedObject
{
	private BaseClass[] WindContPType4bIEC_class_attributes;
	private BaseClass[] WindContPType4bIEC_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum WindContPType4bIEC_primitive_builder implements PrimitiveBuilder {
		dpmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tpaero(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tpord(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tufilt(){
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

	private enum WindContPType4bIEC_class_attributes_enum {
		dpmax,
		tpaero,
		tpord,
		tufilt,
		WindTurbineType4bIEC,
			LAST_ENUM;
	}

		
		
		
		
		
	
	public WindContPType4bIEC() {
		WindContPType4bIEC_primitive_attributes = new BaseClass[WindContPType4bIEC_primitive_builder.values().length];
		WindContPType4bIEC_class_attributes = new BaseClass[WindContPType4bIEC_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(WindContPType4bIEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindContPType4bIEC_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(WindContPType4bIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindContPType4bIEC_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindContPType4bIEC_class_attributes_enum attrEnum = WindContPType4bIEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated WindContPType4bIEC, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindContPType4bIEC_primitive_builder attrEnum = WindContPType4bIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated WindContPType4bIEC, setting " + attrName  + " to: "  + value);
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
			for (WindContPType4bIEC_primitive_builder attrEnum: WindContPType4bIEC_primitive_builder.values()) {
				BaseClass bc = WindContPType4bIEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindContPType4bIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindContPType4bIEC_class_attributes_enum attrEnum: WindContPType4bIEC_class_attributes_enum.values()) {
				BaseClass bc = WindContPType4bIEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindContPType4bIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(WindContPType4bIEC) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "WindContPType4bIEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindContPType4bIEC();
        }
};
