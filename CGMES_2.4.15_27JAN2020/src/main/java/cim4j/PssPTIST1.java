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
PTI Microprocessor-Based Stabilizer type 1.
*/
public class PssPTIST1 extends PowerSystemStabilizerDynamics
{
	private BaseClass[] PssPTIST1_class_attributes;
	private BaseClass[] PssPTIST1_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PssPTIST1_primitive_builder implements PrimitiveBuilder {
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
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum PssPTIST1_class_attributes_enum {
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
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
	
	public PssPTIST1() {
		PssPTIST1_primitive_attributes = new BaseClass[PssPTIST1_primitive_builder.values().length];
		PssPTIST1_class_attributes = new BaseClass[PssPTIST1_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PssPTIST1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PssPTIST1_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PssPTIST1_primitive_builder attrEnum, BaseClass value) {
		try {
			PssPTIST1_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PssPTIST1_class_attributes_enum attrEnum = PssPTIST1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PssPTIST1, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PssPTIST1_primitive_builder attrEnum = PssPTIST1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PssPTIST1, setting " + attrName  + " to: "  + value);
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
			for (PssPTIST1_primitive_builder attrEnum: PssPTIST1_primitive_builder.values()) {
				BaseClass bc = PssPTIST1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssPTIST1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PssPTIST1_class_attributes_enum attrEnum: PssPTIST1_class_attributes_enum.values()) {
				BaseClass bc = PssPTIST1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssPTIST1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PssPTIST1) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PssPTIST1";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PssPTIST1();
        }
};
