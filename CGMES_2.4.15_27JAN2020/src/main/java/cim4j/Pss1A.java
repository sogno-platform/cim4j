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
import cim4j.Boolean;



/*
Single input power system stabilizer. It is a modified version in order to allow representation of various vendors' implementations on PSS type 1A.
*/
public class Pss1A extends PowerSystemStabilizerDynamics
{
	private BaseClass[] Pss1A_class_attributes;
	private BaseClass[] Pss1A_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Pss1A_primitive_builder implements PrimitiveBuilder {
		inputSignalType(){
			public BaseClass construct (java.lang.String value) {
				return new InputSignalKind(value);
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
		ks(){
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
		kd(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		tdelay(){
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

	private enum Pss1A_class_attributes_enum {
		inputSignalType,
		a1,
		a2,
		t1,
		t2,
		t3,
		t4,
		t5,
		t6,
		ks,
		vrmax,
		vrmin,
		vcu,
		vcl,
		a3,
		a4,
		a5,
		a6,
		a7,
		a8,
		kd,
		tdelay,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public Pss1A() {
		Pss1A_primitive_attributes = new BaseClass[Pss1A_primitive_builder.values().length];
		Pss1A_class_attributes = new BaseClass[Pss1A_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Pss1A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Pss1A_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Pss1A_primitive_builder attrEnum, BaseClass value) {
		try {
			Pss1A_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Pss1A_class_attributes_enum attrEnum = Pss1A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Pss1A, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Pss1A_primitive_builder attrEnum = Pss1A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Pss1A, setting " + attrName  + " to: "  + value);
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
			for (Pss1A_primitive_builder attrEnum: Pss1A_primitive_builder.values()) {
				BaseClass bc = Pss1A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Pss1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Pss1A_class_attributes_enum attrEnum: Pss1A_class_attributes_enum.values()) {
				BaseClass bc = Pss1A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Pss1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Pss1A) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Pss1A";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Pss1A();
        }
};
