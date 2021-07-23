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
This is modified IEEE DC3A direct current commutator exciters with speed input, and death band.  DC old type 4.
*/
public class ExcDC3A extends ExcitationSystemDynamics
{
	private BaseClass[] ExcDC3A_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ExcDC3A_primitive_builder implements PrimitiveBuilder {
			trh(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ks(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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
			edfmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			efdmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			efdlim(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcDC3A() {
		ExcDC3A_attributes = new BaseClass[ExcDC3A_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ExcDC3A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcDC3A_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ExcDC3A_ATTR_ENUM attrEnum = ExcDC3A_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcDC3A_primitive_builder attrEnum = ExcDC3A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ExcDC3A_primitive_builder attrEnum: ExcDC3A_primitive_builder.values()) {
			BaseClass bc = ExcDC3A_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ExcDC3A";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcDC3A();
        }
};
