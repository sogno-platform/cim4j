package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.WindTurbineType3or4IEC;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;



/*
IEC Type 4 generator set model.  Reference: IEC Standard 61400-27-1 Section 6.6.3.4.
*/
public class WindGenType4IEC extends WindTurbineType3or4IEC
{
	private BaseClass[] WindGenType4IEC_class_attributes;
	private BaseClass[] WindGenType4IEC_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum WindGenType4IEC_primitive_builder implements PrimitiveBuilder {
		dipmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		diqmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		diqmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tg(){
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

	private enum WindGenType4IEC_class_attributes_enum {
		dipmax,
		diqmin,
		diqmax,
		tg,
			LAST_ENUM;
	}

		
		
		
		
	
	public WindGenType4IEC() {
		WindGenType4IEC_primitive_attributes = new BaseClass[WindGenType4IEC_primitive_builder.values().length];
		WindGenType4IEC_class_attributes = new BaseClass[WindGenType4IEC_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(WindGenType4IEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindGenType4IEC_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(WindGenType4IEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindGenType4IEC_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindGenType4IEC_class_attributes_enum attrEnum = WindGenType4IEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated WindGenType4IEC, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindGenType4IEC_primitive_builder attrEnum = WindGenType4IEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated WindGenType4IEC, setting " + attrName  + " to: "  + value);
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
			for (WindGenType4IEC_primitive_builder attrEnum: WindGenType4IEC_primitive_builder.values()) {
				BaseClass bc = WindGenType4IEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindGenType4IEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindGenType4IEC_class_attributes_enum attrEnum: WindGenType4IEC_class_attributes_enum.values()) {
				BaseClass bc = WindGenType4IEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindGenType4IEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(WindGenType4IEC) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "WindGenType4IEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindGenType4IEC();
        }
};
