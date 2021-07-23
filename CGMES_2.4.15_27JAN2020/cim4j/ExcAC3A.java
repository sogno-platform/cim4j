package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Seconds;
import cim4j.PU;
import cim4j.Simple_Float;



/*
Modified IEEE AC3A alternator-supplied rectifier excitation system with different field current limit.
*/
public class ExcAC3A extends ExcitationSystemDynamics
{
	private BaseClass[] ExcAC3A_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ExcAC3A_primitive_builder implements PrimitiveBuilder {
			tb(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ka(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ta(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vamax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vamin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			te(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			vemin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kf(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tf(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			kn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			efdn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kd(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ke(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			klv(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kf1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kf2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ks(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vfemax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ve1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			seve1(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			ve2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			seve2(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			vlv(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcAC3A() {
		ExcAC3A_attributes = new BaseClass[ExcAC3A_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ExcAC3A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcAC3A_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ExcAC3A_ATTR_ENUM attrEnum = ExcAC3A_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcAC3A_primitive_builder attrEnum = ExcAC3A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ExcAC3A_primitive_builder attrEnum: ExcAC3A_primitive_builder.values()) {
			BaseClass bc = ExcAC3A_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ExcAC3A";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcAC3A();
        }
};
