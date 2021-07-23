package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.PU;
import cim4j.Seconds;


import cim4j.WindGenTurbineType2IEC;

/*
Pitch control emulator model.  Reference: IEC Standard 61400-27-1 Section 6.6.5.1.
*/
public class WindPitchContEmulIEC extends IdentifiedObject
{
	private BaseClass[] WindPitchContEmulIEC_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum WindPitchContEmulIEC_primitive_builder implements PrimitiveBuilder {
			kdroop(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			kipce(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			komegaaero(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kppce(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			omegaref(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			pimax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			pimin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			t1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tpe(){
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

		
		
		
		
		
		
		
		
		
		
		
	
	public WindPitchContEmulIEC() {
		WindPitchContEmulIEC_attributes = new BaseClass[WindPitchContEmulIEC_primitive_builder.values().length];
	}

	public void updateAttributeInArray(WindPitchContEmulIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindPitchContEmulIEC_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//WindPitchContEmulIEC_ATTR_ENUM attrEnum = WindPitchContEmulIEC_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindPitchContEmulIEC_primitive_builder attrEnum = WindPitchContEmulIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (WindPitchContEmulIEC_primitive_builder attrEnum: WindPitchContEmulIEC_primitive_builder.values()) {
			BaseClass bc = WindPitchContEmulIEC_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "WindPitchContEmulIEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindPitchContEmulIEC();
        }
};
