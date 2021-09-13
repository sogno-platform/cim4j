package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Boolean;
import cim4j.Seconds;


import cim4j.WindTurbineType3or4IEC;
import cim4j.WindDynamicsLookupTable;

/*
Current limitation model.  The current limitation model combines the physical limits.  Reference: IEC Standard 61400-27-1 Section 6.6.5.7.
*/
public class WindContCurrLimIEC extends IdentifiedObject
{
	private BaseClass[] WindContCurrLimIEC_class_attributes;
	private BaseClass[] WindContCurrLimIEC_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum WindContCurrLimIEC_primitive_builder implements PrimitiveBuilder {
		imax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		imaxdip(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		mdfslim(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		mqpri(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
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

	private enum WindContCurrLimIEC_class_attributes_enum {
		imax,
		imaxdip,
		mdfslim,
		mqpri,
		tufilt,
		WindTurbineType3or4IEC,
		WindDynamicsLookupTable,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
	
	public WindContCurrLimIEC() {
		WindContCurrLimIEC_primitive_attributes = new BaseClass[WindContCurrLimIEC_primitive_builder.values().length];
		WindContCurrLimIEC_class_attributes = new BaseClass[WindContCurrLimIEC_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(WindContCurrLimIEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindContCurrLimIEC_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(WindContCurrLimIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindContCurrLimIEC_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindContCurrLimIEC_class_attributes_enum attrEnum = WindContCurrLimIEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated WindContCurrLimIEC, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindContCurrLimIEC_primitive_builder attrEnum = WindContCurrLimIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated WindContCurrLimIEC, setting " + attrName  + " to: "  + value);
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
			for (WindContCurrLimIEC_primitive_builder attrEnum: WindContCurrLimIEC_primitive_builder.values()) {
				BaseClass bc = WindContCurrLimIEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindContCurrLimIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindContCurrLimIEC_class_attributes_enum attrEnum: WindContCurrLimIEC_class_attributes_enum.values()) {
				BaseClass bc = WindContCurrLimIEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindContCurrLimIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(WindContCurrLimIEC) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "WindContCurrLimIEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindContCurrLimIEC();
        }
};
