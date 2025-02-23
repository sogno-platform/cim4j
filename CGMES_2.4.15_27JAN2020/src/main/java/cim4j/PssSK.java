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
PSS Slovakian type - three inputs.
*/
public class PssSK extends PowerSystemStabilizerDynamics
{
	private BaseClass[] PssSK_class_attributes;
	private BaseClass[] PssSK_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PssSK_primitive_builder implements PrimitiveBuilder {
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

	private enum PssSK_class_attributes_enum {
		k1,
		k2,
		k3,
		t1,
		t2,
		t3,
		t4,
		t5,
		t6,
		vsmax,
		vsmin,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
	
	public PssSK() {
		PssSK_primitive_attributes = new BaseClass[PssSK_primitive_builder.values().length];
		PssSK_class_attributes = new BaseClass[PssSK_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PssSK_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PssSK_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PssSK_primitive_builder attrEnum, BaseClass value) {
		try {
			PssSK_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PssSK_class_attributes_enum attrEnum = PssSK_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PssSK, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PssSK_primitive_builder attrEnum = PssSK_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PssSK, setting " + attrName  + " to: "  + value);
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
			for (PssSK_primitive_builder attrEnum: PssSK_primitive_builder.values()) {
				BaseClass bc = PssSK_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssSK." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PssSK_class_attributes_enum attrEnum: PssSK_class_attributes_enum.values()) {
				BaseClass bc = PssSK_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssSK." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PssSK) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PssSK";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PssSK();
        }
};
