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
import cim4j.Boolean;



/*
The class represents IEEE Std 421.5-2005 type DC3A model. This model represents represent older systems, in particular those dc commutator exciters with non-continuously acting regulators that were commonly used before the development of the continuously acting varieties.  These systems respond at basically two different rates, depending upon the magnitude of voltage error. For small errors, adjustment is made periodically with a signal to a motor-operated rheostat. Larger errors cause resistors to be quickly shorted or inserted and a strong forcing signal applied to the exciter. Continuous motion of the motor-operated rheostat occurs for these larger error signals, even though it is bypassed by contactor action.   Reference: IEEE Standard 421.5-2005 Section 5.3.
*/
public class ExcIEEEDC3A extends ExcitationSystemDynamics
{
	private BaseClass[] ExcIEEEDC3A_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ExcIEEEDC3A_primitive_builder implements PrimitiveBuilder {
			trh(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			kv(){
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
			te(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ke(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			efd1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			seefd1(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			efd2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			seefd2(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			exclim(){
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

		
		
		
		
		
		
		
		
		
		
		
	
	public ExcIEEEDC3A() {
		ExcIEEEDC3A_attributes = new BaseClass[ExcIEEEDC3A_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ExcIEEEDC3A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEDC3A_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ExcIEEEDC3A_ATTR_ENUM attrEnum = ExcIEEEDC3A_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEDC3A_primitive_builder attrEnum = ExcIEEEDC3A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ExcIEEEDC3A_primitive_builder attrEnum: ExcIEEEDC3A_primitive_builder.values()) {
			BaseClass bc = ExcIEEEDC3A_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ExcIEEEDC3A";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcIEEEDC3A();
        }
};
