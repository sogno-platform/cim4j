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
PTI Microprocessor-Based Stabilizer type 1.
*/
public class Pss2ST extends PowerSystemStabilizerDynamics
{
	private BaseClass[] Pss2ST_class_attributes;
	private BaseClass[] Pss2ST_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Pss2ST_primitive_builder implements PrimitiveBuilder {
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
		k2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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
		lsmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		lsmin(){
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

	private enum Pss2ST_class_attributes_enum {
		inputSignal1Type,
		inputSignal2Type,
		k1,
		k2,
		t1,
		t2,
		t3,
		t4,
		t5,
		t6,
		t7,
		t8,
		t9,
		t10,
		lsmax,
		lsmin,
		vcu,
		vcl,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public Pss2ST() {
		Pss2ST_primitive_attributes = new BaseClass[Pss2ST_primitive_builder.values().length];
		Pss2ST_class_attributes = new BaseClass[Pss2ST_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Pss2ST_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Pss2ST_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Pss2ST_primitive_builder attrEnum, BaseClass value) {
		try {
			Pss2ST_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Pss2ST_class_attributes_enum attrEnum = Pss2ST_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Pss2ST, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Pss2ST_primitive_builder attrEnum = Pss2ST_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Pss2ST, setting " + attrName  + " to: "  + value);
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
			for (Pss2ST_primitive_builder attrEnum: Pss2ST_primitive_builder.values()) {
				BaseClass bc = Pss2ST_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Pss2ST." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Pss2ST_class_attributes_enum attrEnum: Pss2ST_class_attributes_enum.values()) {
				BaseClass bc = Pss2ST_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Pss2ST." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Pss2ST) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Pss2ST";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Pss2ST();
        }
};
