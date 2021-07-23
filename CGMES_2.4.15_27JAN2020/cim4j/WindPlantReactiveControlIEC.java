package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.PU;
import cim4j.Boolean;
import cim4j.Seconds;


import cim4j.WindPlantIEC;

/*
Simplified plant voltage and reactive power control model for use with type 3 and type 4 wind turbine models.  Reference: IEC Standard 61400-27-1 Annex E.
*/
public class WindPlantReactiveControlIEC extends IdentifiedObject
{
	private BaseClass[] WindPlantReactiveControlIEC_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum WindPlantReactiveControlIEC_primitive_builder implements PrimitiveBuilder {
			kiwpx(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			kpwpx(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			kwpqu(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			mwppf(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			mwpu(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			twppfilt(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			twpqfilt(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			twpufilt(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			txft(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			txfv(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			uwpqdip(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			xrefmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			xrefmin(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public WindPlantReactiveControlIEC() {
		WindPlantReactiveControlIEC_attributes = new BaseClass[WindPlantReactiveControlIEC_primitive_builder.values().length];
	}

	public void updateAttributeInArray(WindPlantReactiveControlIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindPlantReactiveControlIEC_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//WindPlantReactiveControlIEC_ATTR_ENUM attrEnum = WindPlantReactiveControlIEC_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindPlantReactiveControlIEC_primitive_builder attrEnum = WindPlantReactiveControlIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (WindPlantReactiveControlIEC_primitive_builder attrEnum: WindPlantReactiveControlIEC_primitive_builder.values()) {
			BaseClass bc = WindPlantReactiveControlIEC_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "WindPlantReactiveControlIEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindPlantReactiveControlIEC();
        }
};
