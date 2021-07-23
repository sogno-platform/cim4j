package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TurbineGovernorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;
import cim4j.Simple_Float;
import cim4j.Temperature;



/*
Generic turbogas with acceleration and temperature controller.
*/
public class GovGAST3 extends TurbineGovernorDynamics
{
	private BaseClass[] GovGAST3_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum GovGAST3_primitive_builder implements PrimitiveBuilder {
			bp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tg(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			rcmx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			rcmn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ky(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			ty(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tac(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			kac(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			tc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			bca(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			kca(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			dtc(){
			public BaseClass construct (java.lang.String value) {
				return new Temperature(value);
			}
		},
			ka(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tsi(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ksi(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			ttc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tfen(){
			public BaseClass construct (java.lang.String value) {
				return new Temperature(value);
			}
		},
			td(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tt(){
			public BaseClass construct (java.lang.String value) {
				return new Temperature(value);
			}
		},
			mxef(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			mnef(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovGAST3() {
		GovGAST3_attributes = new BaseClass[GovGAST3_primitive_builder.values().length];
	}

	public void updateAttributeInArray(GovGAST3_primitive_builder attrEnum, BaseClass value) {
		try {
			GovGAST3_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//GovGAST3_ATTR_ENUM attrEnum = GovGAST3_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovGAST3_primitive_builder attrEnum = GovGAST3_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (GovGAST3_primitive_builder attrEnum: GovGAST3_primitive_builder.values()) {
			BaseClass bc = GovGAST3_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "GovGAST3";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovGAST3();
        }
};
