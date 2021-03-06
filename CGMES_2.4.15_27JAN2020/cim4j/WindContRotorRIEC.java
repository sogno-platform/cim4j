package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Simple_Float;
import cim4j.Seconds;


import cim4j.WindDynamicsLookupTable;
import cim4j.WindGenTurbineType2IEC;

/*
Rotor resistance control model.  Reference: IEC Standard 61400-27-1 Section 6.6.5.2.
*/
public class WindContRotorRIEC extends IdentifiedObject
{
	private BaseClass[] WindContRotorRIEC_class_attributes;
	private BaseClass[] WindContRotorRIEC_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum WindContRotorRIEC_primitive_builder implements PrimitiveBuilder {
		kirr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		komegafilt(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kpfilt(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kprr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		rmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		rmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tomegafilt(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tpfilt(){
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

	private enum WindContRotorRIEC_class_attributes_enum {
		kirr,
		komegafilt,
		kpfilt,
		kprr,
		rmax,
		rmin,
		tomegafilt,
		tpfilt,
		WindDynamicsLookupTable,
		WindGenTurbineType2IEC,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
	
	public WindContRotorRIEC() {
		WindContRotorRIEC_primitive_attributes = new BaseClass[WindContRotorRIEC_primitive_builder.values().length];
		WindContRotorRIEC_class_attributes = new BaseClass[WindContRotorRIEC_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(WindContRotorRIEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindContRotorRIEC_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(WindContRotorRIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindContRotorRIEC_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindContRotorRIEC_class_attributes_enum attrEnum = WindContRotorRIEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated WindContRotorRIEC, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindContRotorRIEC_primitive_builder attrEnum = WindContRotorRIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated WindContRotorRIEC, setting " + attrName  + " to: "  + value);
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
			for (WindContRotorRIEC_primitive_builder attrEnum: WindContRotorRIEC_primitive_builder.values()) {
				BaseClass bc = WindContRotorRIEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindContRotorRIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindContRotorRIEC_class_attributes_enum attrEnum: WindContRotorRIEC_class_attributes_enum.values()) {
				BaseClass bc = WindContRotorRIEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindContRotorRIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(WindContRotorRIEC) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "WindContRotorRIEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindContRotorRIEC();
        }
};
