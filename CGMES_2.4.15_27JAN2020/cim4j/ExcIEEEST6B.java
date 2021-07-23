package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.ExcST6BOELselectorKind;
import cim4j.Seconds;



/*
The class represents IEEE Std 421.5-2005 type ST6B model. This model consists of a PI voltage regulator with an inner loop field voltage regulator and pre-control. The field voltage regulator implements a proportional control. The pre-control and the delay in the feedback circuit increase the dynamic response.  Reference: IEEE Standard 421.5-2005 Section 7.6.
*/
public class ExcIEEEST6B extends ExcitationSystemDynamics
{
	private BaseClass[] ExcIEEEST6B_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ExcIEEEST6B_primitive_builder implements PrimitiveBuilder {
			ilr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kci(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcIEEEST6B() {
		ExcIEEEST6B_attributes = new BaseClass[ExcIEEEST6B_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ExcIEEEST6B_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEST6B_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ExcIEEEST6B_ATTR_ENUM attrEnum = ExcIEEEST6B_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEST6B_primitive_builder attrEnum = ExcIEEEST6B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ExcIEEEST6B_primitive_builder attrEnum: ExcIEEEST6B_primitive_builder.values()) {
			BaseClass bc = ExcIEEEST6B_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ExcIEEEST6B";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcIEEEST6B();
        }
};
