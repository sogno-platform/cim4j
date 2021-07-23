package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PowerSystemStabilizerDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.InputSignalKind;
import cim4j.PU;
import cim4j.Seconds;
import cim4j.Integer;
import cim4j.Simple_Float;



/*
Modified IEEE PSS2B Model.  Extra lead/lag (or rate) block added at end (up to 4 lead/lags total).
*/
public class Pss2B extends PowerSystemStabilizerDynamics
{
	private BaseClass[] Pss2B_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum Pss2B_primitive_builder implements PrimitiveBuilder {
			inputSignal1Type(){
			public BaseClass construct (java.lang.String value) {
				return new InputSignalKind(value);
			}
		},
			inputSignal2Type(){
			public BaseClass construct (java.lang.String value) {
				return new InputSignalKind(value);
			}
		},
			vsi1max(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vsi1min(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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
			vsi2max(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vsi2min(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tw3(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tw4(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t3(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t4(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t6(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t7(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t8(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t9(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t10(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t11(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ks1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ks2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ks3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ks4(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			n(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
			m(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
			vstmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vstmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			a(){
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
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public Pss2B() {
		Pss2B_attributes = new BaseClass[Pss2B_primitive_builder.values().length];
	}

	public void updateAttributeInArray(Pss2B_primitive_builder attrEnum, BaseClass value) {
		try {
			Pss2B_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//Pss2B_ATTR_ENUM attrEnum = Pss2B_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Pss2B_primitive_builder attrEnum = Pss2B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (Pss2B_primitive_builder attrEnum: Pss2B_primitive_builder.values()) {
			BaseClass bc = Pss2B_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "Pss2B";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Pss2B();
        }
};
