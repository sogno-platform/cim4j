package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PowerSystemStabilizerDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;



/*
Model for Siemens "H infinity" power system stabilizer with generator electrical power input.
*/
public class PssSH extends PowerSystemStabilizerDynamics
{
	private BaseClass[] PssSH_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum PssSH_primitive_builder implements PrimitiveBuilder {
			k(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			k0(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			k1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			k2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			k3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			k4(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			td(){
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
			vsmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vsmin(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public PssSH() {
		PssSH_attributes = new BaseClass[PssSH_primitive_builder.values().length];
	}

	public void updateAttributeInArray(PssSH_primitive_builder attrEnum, BaseClass value) {
		try {
			PssSH_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//PssSH_ATTR_ENUM attrEnum = PssSH_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PssSH_primitive_builder attrEnum = PssSH_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (PssSH_primitive_builder attrEnum: PssSH_primitive_builder.values()) {
			BaseClass bc = PssSH_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "PssSH";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PssSH();
        }
};
