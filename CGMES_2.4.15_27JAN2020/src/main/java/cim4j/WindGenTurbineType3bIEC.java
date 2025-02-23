package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.WindGenTurbineType3IEC;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.Seconds;
import cim4j.Boolean;
import cim4j.PU;



/*
IEC Type 3B generator set model.  Reference: IEC Standard 61400-27-1 Section 6.6.3.3.
*/
public class WindGenTurbineType3bIEC extends WindGenTurbineType3IEC
{
	private BaseClass[] WindGenTurbineType3bIEC_class_attributes;
	private BaseClass[] WindGenTurbineType3bIEC_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum WindGenTurbineType3bIEC_primitive_builder implements PrimitiveBuilder {
		fducw(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		tg(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		two(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		mwtcwp(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		xs(){
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

	private enum WindGenTurbineType3bIEC_class_attributes_enum {
		fducw,
		tg,
		two,
		mwtcwp,
		xs,
			LAST_ENUM;
	}

		
		
		
		
		
	
	public WindGenTurbineType3bIEC() {
		WindGenTurbineType3bIEC_primitive_attributes = new BaseClass[WindGenTurbineType3bIEC_primitive_builder.values().length];
		WindGenTurbineType3bIEC_class_attributes = new BaseClass[WindGenTurbineType3bIEC_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(WindGenTurbineType3bIEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindGenTurbineType3bIEC_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(WindGenTurbineType3bIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindGenTurbineType3bIEC_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindGenTurbineType3bIEC_class_attributes_enum attrEnum = WindGenTurbineType3bIEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated WindGenTurbineType3bIEC, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindGenTurbineType3bIEC_primitive_builder attrEnum = WindGenTurbineType3bIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated WindGenTurbineType3bIEC, setting " + attrName  + " to: "  + value);
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
			for (WindGenTurbineType3bIEC_primitive_builder attrEnum: WindGenTurbineType3bIEC_primitive_builder.values()) {
				BaseClass bc = WindGenTurbineType3bIEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindGenTurbineType3bIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindGenTurbineType3bIEC_class_attributes_enum attrEnum: WindGenTurbineType3bIEC_class_attributes_enum.values()) {
				BaseClass bc = WindGenTurbineType3bIEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindGenTurbineType3bIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(WindGenTurbineType3bIEC) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "WindGenTurbineType3bIEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindGenTurbineType3bIEC();
        }
};
