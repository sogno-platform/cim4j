package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.WindGenTurbineType3IEC;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.PU;
import cim4j.Seconds;



/*
IEC Type 3A generator set model.  Reference: IEC Standard 61400-27-1 Section 6.6.3.2.
*/
public class WindGenTurbineType3aIEC extends WindGenTurbineType3IEC
{
	private BaseClass[] WindGenTurbineType3aIEC_class_attributes;
	private BaseClass[] WindGenTurbineType3aIEC_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum WindGenTurbineType3aIEC_primitive_builder implements PrimitiveBuilder {
		kpc(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		xs(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tic(){
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

	private enum WindGenTurbineType3aIEC_class_attributes_enum {
		kpc,
		xs,
		tic,
			LAST_ENUM;
	}

		
		
		
	
	public WindGenTurbineType3aIEC() {
		WindGenTurbineType3aIEC_primitive_attributes = new BaseClass[WindGenTurbineType3aIEC_primitive_builder.values().length];
		WindGenTurbineType3aIEC_class_attributes = new BaseClass[WindGenTurbineType3aIEC_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(WindGenTurbineType3aIEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindGenTurbineType3aIEC_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(WindGenTurbineType3aIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindGenTurbineType3aIEC_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindGenTurbineType3aIEC_class_attributes_enum attrEnum = WindGenTurbineType3aIEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated WindGenTurbineType3aIEC, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindGenTurbineType3aIEC_primitive_builder attrEnum = WindGenTurbineType3aIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated WindGenTurbineType3aIEC, setting " + attrName  + " to: "  + value);
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
			for (WindGenTurbineType3aIEC_primitive_builder attrEnum: WindGenTurbineType3aIEC_primitive_builder.values()) {
				BaseClass bc = WindGenTurbineType3aIEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindGenTurbineType3aIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindGenTurbineType3aIEC_class_attributes_enum attrEnum: WindGenTurbineType3aIEC_class_attributes_enum.values()) {
				BaseClass bc = WindGenTurbineType3aIEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindGenTurbineType3aIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(WindGenTurbineType3aIEC) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "WindGenTurbineType3aIEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindGenTurbineType3aIEC();
        }
};
