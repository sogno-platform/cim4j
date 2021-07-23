package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PowerSystemStabilizerDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.InputSignalKind;
import cim4j.Seconds;
import cim4j.PU;



/*
The class represents IEEE Std 421.5-2005 type PSS3B power system stabilizer model. The PSS model PSS3B has dual inputs of electrical power and rotor angular frequency deviation. The signals are used to derive an equivalent mechanical power signal.  Reference: IEEE 3B 421.5-2005 Section 8.3.
*/
public class PssIEEE3B extends PowerSystemStabilizerDynamics
{
	private BaseClass[] PssIEEE3B_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum PssIEEE3B_primitive_builder implements PrimitiveBuilder {
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
			tw3(){
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
			a1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			a2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			a3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			a4(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			a5(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			a6(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			a7(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			a8(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public PssIEEE3B() {
		PssIEEE3B_attributes = new BaseClass[PssIEEE3B_primitive_builder.values().length];
	}

	public void updateAttributeInArray(PssIEEE3B_primitive_builder attrEnum, BaseClass value) {
		try {
			PssIEEE3B_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//PssIEEE3B_ATTR_ENUM attrEnum = PssIEEE3B_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PssIEEE3B_primitive_builder attrEnum = PssIEEE3B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (PssIEEE3B_primitive_builder attrEnum: PssIEEE3B_primitive_builder.values()) {
			BaseClass bc = PssIEEE3B_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "PssIEEE3B";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PssIEEE3B();
        }
};
