package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Boolean;
import cim4j.ExcST6BOELselectorKind;
import cim4j.Seconds;



/*
Modified IEEE ST6B static excitation system with PID controller and optional inner feedbacks loop.
*/
public class ExcST6B extends ExcitationSystemDynamics
{
	private BaseClass[] ExcST6B_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ExcST6B_primitive_builder implements PrimitiveBuilder {
			ilr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			k1(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			kcl(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kff(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kg(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kia(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			klr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			km(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kpa(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kvd(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			oelin(){
			public BaseClass construct (java.lang.String value) {
				return new ExcST6BOELselectorKind(value);
			}
		},
			tg(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ts(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tvd(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
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
			vilim(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
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
			vmult(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
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
			xc(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcST6B() {
		ExcST6B_attributes = new BaseClass[ExcST6B_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ExcST6B_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcST6B_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ExcST6B_ATTR_ENUM attrEnum = ExcST6B_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcST6B_primitive_builder attrEnum = ExcST6B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ExcST6B_primitive_builder attrEnum: ExcST6B_primitive_builder.values()) {
			BaseClass bc = ExcST6B_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ExcST6B";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcST6B();
        }
};
