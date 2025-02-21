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
	private BaseClass[] PssSH_class_attributes;
	private BaseClass[] PssSH_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

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

	private enum PssSH_class_attributes_enum {
		k,
		k0,
		k1,
		k2,
		k3,
		k4,
		td,
		t1,
		t2,
		t3,
		t4,
		vsmax,
		vsmin,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public PssSH() {
		PssSH_primitive_attributes = new BaseClass[PssSH_primitive_builder.values().length];
		PssSH_class_attributes = new BaseClass[PssSH_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PssSH_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PssSH_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PssSH_primitive_builder attrEnum, BaseClass value) {
		try {
			PssSH_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PssSH_class_attributes_enum attrEnum = PssSH_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PssSH, setting " + attrName);
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
			System.out.println("Updated PssSH, setting " + attrName  + " to: "  + value);
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
			for (PssSH_primitive_builder attrEnum: PssSH_primitive_builder.values()) {
				BaseClass bc = PssSH_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssSH." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PssSH_class_attributes_enum attrEnum: PssSH_class_attributes_enum.values()) {
				BaseClass bc = PssSH_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssSH." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PssSH) RDFID: " + rdfid;
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
