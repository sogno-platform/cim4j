package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Simple_Float;
import cim4j.Seconds;
import cim4j.Boolean;



/*
The class represents IEEE Std 421.5-2005 type DC2A model. This model represents represent field-controlled dc commutator exciters with continuously acting voltage regulators having supplies obtained from the generator or auxiliary bus.  It differs from the Type DC1A model only in the voltage regulator output limits, which are now proportional to terminal voltage . It is representative of solid-state replacements for various forms of older mechanical and rotating amplifier regulating equipment connected to dc commutator exciters.  Reference: IEEE Standard 421.5-2005 Section 5.2.
*/
public class ExcIEEEDC2A extends ExcitationSystemDynamics
{
	private BaseClass[] ExcIEEEDC2A_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ExcIEEEDC2A_primitive_builder implements PrimitiveBuilder {
			efd1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			efd2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			exclim(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ka(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ke(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kf(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			seefd1(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			seefd2(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			ta(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
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
			te(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tf(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			uelin(){
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
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcIEEEDC2A() {
		ExcIEEEDC2A_attributes = new BaseClass[ExcIEEEDC2A_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ExcIEEEDC2A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEDC2A_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ExcIEEEDC2A_ATTR_ENUM attrEnum = ExcIEEEDC2A_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEDC2A_primitive_builder attrEnum = ExcIEEEDC2A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ExcIEEEDC2A_primitive_builder attrEnum: ExcIEEEDC2A_primitive_builder.values()) {
			BaseClass bc = ExcIEEEDC2A_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ExcIEEEDC2A";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcIEEEDC2A();
        }
};
