package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PowerSystemStabilizerDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;
import cim4j.Boolean;
import cim4j.Simple_Float;



/*
PTI Microprocessor-Based Stabilizer type 3.
*/
public class PssPTIST3 extends PowerSystemStabilizerDynamics
{
	private BaseClass[] PssPTIST3_class_attributes;
	private BaseClass[] PssPTIST3_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PssPTIST3_primitive_builder implements PrimitiveBuilder {
		m(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tf(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tp(){
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
		k(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		dtf(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		dtc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		dtp(){
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
		a0(){
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
		b0(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		b1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		b2(){
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
		b3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		b4(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		b5(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		athres(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		dl(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		al(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		lthres(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		pmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		isw(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		nav(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ncl(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ncr(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum PssPTIST3_class_attributes_enum {
		m,
		tf,
		tp,
		t1,
		t2,
		t3,
		t4,
		k,
		dtf,
		dtc,
		dtp,
		t5,
		t6,
		a0,
		a1,
		a2,
		b0,
		b1,
		b2,
		a3,
		a4,
		a5,
		b3,
		b4,
		b5,
		athres,
		dl,
		al,
		lthres,
		pmin,
		isw,
		nav,
		ncl,
		ncr,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public PssPTIST3() {
		PssPTIST3_primitive_attributes = new BaseClass[PssPTIST3_primitive_builder.values().length];
		PssPTIST3_class_attributes = new BaseClass[PssPTIST3_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PssPTIST3_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PssPTIST3_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PssPTIST3_primitive_builder attrEnum, BaseClass value) {
		try {
			PssPTIST3_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PssPTIST3_class_attributes_enum attrEnum = PssPTIST3_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PssPTIST3, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PssPTIST3_primitive_builder attrEnum = PssPTIST3_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PssPTIST3, setting " + attrName  + " to: "  + value);
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
			for (PssPTIST3_primitive_builder attrEnum: PssPTIST3_primitive_builder.values()) {
				BaseClass bc = PssPTIST3_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssPTIST3." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PssPTIST3_class_attributes_enum attrEnum: PssPTIST3_class_attributes_enum.values()) {
				BaseClass bc = PssPTIST3_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssPTIST3." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PssPTIST3) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PssPTIST3";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PssPTIST3();
        }
};
