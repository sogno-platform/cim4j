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



/*
The class represents IEEE Std 421.5-2005 type PSS2B power system stabilizer model. This stabilizer model is designed to represent a variety of dual-input stabilizers, which normally use combinations of power and speed or frequency to derive the stabilizing signal.  Reference: IEEE 2B 421.5-2005 Section 8.2.
*/
public class PssIEEE2B extends PowerSystemStabilizerDynamics
{
	private BaseClass[] PssIEEE2B_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum PssIEEE2B_primitive_builder implements PrimitiveBuilder {
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
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public PssIEEE2B() {
		PssIEEE2B_attributes = new BaseClass[PssIEEE2B_primitive_builder.values().length];
	}

	public void updateAttributeInArray(PssIEEE2B_primitive_builder attrEnum, BaseClass value) {
		try {
			PssIEEE2B_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//PssIEEE2B_ATTR_ENUM attrEnum = PssIEEE2B_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PssIEEE2B_primitive_builder attrEnum = PssIEEE2B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (PssIEEE2B_primitive_builder attrEnum: PssIEEE2B_primitive_builder.values()) {
			BaseClass bc = PssIEEE2B_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "PssIEEE2B";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PssIEEE2B();
        }
};
