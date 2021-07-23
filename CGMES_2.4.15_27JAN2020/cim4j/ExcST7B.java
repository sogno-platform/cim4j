package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.ExcST7BOELselectorKind;
import cim4j.Seconds;
import cim4j.ExcST7BUELselectorKind;



/*
Modified IEEE ST7B static excitation system without stator current limiter (SCL) and current compensator (DROOP) inputs.
*/
public class ExcST7B extends ExcitationSystemDynamics
{
	private BaseClass[] ExcST7B_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ExcST7B_primitive_builder implements PrimitiveBuilder {
			kh(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kia(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kl(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kpa(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			oelin(){
			public BaseClass construct (java.lang.String value) {
				return new ExcST7BOELselectorKind(value);
			}
		},
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
			tf(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tg(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tia(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ts(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			uelin(){
			public BaseClass construct (java.lang.String value) {
				return new ExcST7BUELselectorKind(value);
			}
		},
			vmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vmin(){
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
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcST7B() {
		ExcST7B_attributes = new BaseClass[ExcST7B_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ExcST7B_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcST7B_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ExcST7B_ATTR_ENUM attrEnum = ExcST7B_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcST7B_primitive_builder attrEnum = ExcST7B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ExcST7B_primitive_builder attrEnum: ExcST7B_primitive_builder.values()) {
			BaseClass bc = ExcST7B_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ExcST7B";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcST7B();
        }
};
