package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;
import cim4j.PU;
import cim4j.Simple_Float;
import cim4j.Seconds;



/*
Modified IEEE AC8B alternator-supplied rectifier excitation system with speed input and input limiter.
*/
public class ExcAC8B extends ExcitationSystemDynamics
{
	private BaseClass[] ExcAC8B_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ExcAC8B_primitive_builder implements PrimitiveBuilder {
			inlim(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			ka(){
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
			kdr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ke(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kir(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kpr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ks(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			pidlim(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			seve1(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			seve2(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			ta(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tdr(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			te(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			telim(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			ve1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ve2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vemin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vfemax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vimax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vimin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vpidmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vpidmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vrmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vrmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vtmult(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcAC8B() {
		ExcAC8B_attributes = new BaseClass[ExcAC8B_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ExcAC8B_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcAC8B_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ExcAC8B_ATTR_ENUM attrEnum = ExcAC8B_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcAC8B_primitive_builder attrEnum = ExcAC8B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ExcAC8B_primitive_builder attrEnum: ExcAC8B_primitive_builder.values()) {
			BaseClass bc = ExcAC8B_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ExcAC8B";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcAC8B();
        }
};
