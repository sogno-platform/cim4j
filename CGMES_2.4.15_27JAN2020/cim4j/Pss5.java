package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PowerSystemStabilizerDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.Boolean;
import cim4j.Seconds;
import cim4j.PU;



/*
Italian PSS - Detailed PSS.
*/
public class Pss5 extends PowerSystemStabilizerDynamics
{
	private BaseClass[] Pss5_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum Pss5_primitive_builder implements PrimitiveBuilder {
			kpe(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			kf(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			isfreq(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			kpss(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			ctw2(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			tw1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tw2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tl1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tl2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tl3(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tl4(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			vsmn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vsmx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tpe(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			pmm(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			deadband(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vadat(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public Pss5() {
		Pss5_attributes = new BaseClass[Pss5_primitive_builder.values().length];
	}

	public void updateAttributeInArray(Pss5_primitive_builder attrEnum, BaseClass value) {
		try {
			Pss5_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//Pss5_ATTR_ENUM attrEnum = Pss5_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Pss5_primitive_builder attrEnum = Pss5_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (Pss5_primitive_builder attrEnum: Pss5_primitive_builder.values()) {
			BaseClass bc = Pss5_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "Pss5";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Pss5();
        }
};
