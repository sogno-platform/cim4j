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



/*
Dual input Power System Stabilizer, based on IEEE type 2, with modified output limiter defined by WECC (Western Electricity Coordinating Council, USA).
*/
public class PssWECC extends PowerSystemStabilizerDynamics
{
	private BaseClass[] PssWECC_class_attributes;
	private BaseClass[] PssWECC_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PssWECC_primitive_builder implements PrimitiveBuilder {
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
		k1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		t1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		k2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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
		t5(){
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
		t10(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t9(){
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
		vcu(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vcl(){
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

	private enum PssWECC_class_attributes_enum {
		inputSignal1Type,
		inputSignal2Type,
		k1,
		t1,
		k2,
		t2,
		t3,
		t4,
		t5,
		t6,
		t7,
		t8,
		t10,
		t9,
		vsmax,
		vsmin,
		vcu,
		vcl,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public PssWECC() {
		PssWECC_primitive_attributes = new BaseClass[PssWECC_primitive_builder.values().length];
		PssWECC_class_attributes = new BaseClass[PssWECC_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PssWECC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PssWECC_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PssWECC_primitive_builder attrEnum, BaseClass value) {
		try {
			PssWECC_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PssWECC_class_attributes_enum attrEnum = PssWECC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PssWECC, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PssWECC_primitive_builder attrEnum = PssWECC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PssWECC, setting " + attrName  + " to: "  + value);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString(boolean topClass) {
		java.lang.String result = "";
		java.lang.String indent = "";
		if (topClass) {
			for (PssWECC_primitive_builder attrEnum: PssWECC_primitive_builder.values()) {
				BaseClass bc = PssWECC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssWECC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PssWECC_class_attributes_enum attrEnum: PssWECC_class_attributes_enum.values()) {
				BaseClass bc = PssWECC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssWECC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PssWECC) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PssWECC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PssWECC();
        }
};
