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
import cim4j.WindPlantIEC;

/*
Frequency and active power controller model.  Reference: IEC Standard 61400-27-1 Annex E.
*/
public class WindPlantFreqPcontrolIEC extends IdentifiedObject
{
	private BaseClass[] WindPlantFreqPcontrolIEC_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum WindPlantFreqPcontrolIEC_primitive_builder implements PrimitiveBuilder {
			dprefmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			dprefmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kiwpp(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			kpwpp(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			prefmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			prefmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tpft(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tpfv(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			twpffilt(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			twppfilt(){
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

		
		
		
		
		
		
		
		
		
		
		
		
	
	public WindPlantFreqPcontrolIEC() {
		WindPlantFreqPcontrolIEC_attributes = new BaseClass[WindPlantFreqPcontrolIEC_primitive_builder.values().length];
	}

	public void updateAttributeInArray(WindPlantFreqPcontrolIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindPlantFreqPcontrolIEC_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//WindPlantFreqPcontrolIEC_ATTR_ENUM attrEnum = WindPlantFreqPcontrolIEC_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindPlantFreqPcontrolIEC_primitive_builder attrEnum = WindPlantFreqPcontrolIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (WindPlantFreqPcontrolIEC_primitive_builder attrEnum: WindPlantFreqPcontrolIEC_primitive_builder.values()) {
			BaseClass bc = WindPlantFreqPcontrolIEC_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "WindPlantFreqPcontrolIEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindPlantFreqPcontrolIEC();
        }
};
