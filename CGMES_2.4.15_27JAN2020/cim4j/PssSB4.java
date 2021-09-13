package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PowerSystemStabilizerDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Seconds;
import cim4j.PU;



/*
Power sensitive stabilizer model.
*/
public class PssSB4 extends PowerSystemStabilizerDynamics
{
	private BaseClass[] PssSB4_class_attributes;
	private BaseClass[] PssSB4_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PssSB4_primitive_builder implements PrimitiveBuilder {
		tt(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		kx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tx2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		ta(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tx1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tb(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		td(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		te(){
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

	private enum PssSB4_class_attributes_enum {
		tt,
		kx,
		tx2,
		ta,
		tx1,
		tb,
		tc,
		td,
		te,
		vsmax,
		vsmin,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
	
	public PssSB4() {
		PssSB4_primitive_attributes = new BaseClass[PssSB4_primitive_builder.values().length];
		PssSB4_class_attributes = new BaseClass[PssSB4_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PssSB4_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PssSB4_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PssSB4_primitive_builder attrEnum, BaseClass value) {
		try {
			PssSB4_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PssSB4_class_attributes_enum attrEnum = PssSB4_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PssSB4, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PssSB4_primitive_builder attrEnum = PssSB4_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PssSB4, setting " + attrName  + " to: "  + value);
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
			for (PssSB4_primitive_builder attrEnum: PssSB4_primitive_builder.values()) {
				BaseClass bc = PssSB4_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssSB4." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PssSB4_class_attributes_enum attrEnum: PssSB4_class_attributes_enum.values()) {
				BaseClass bc = PssSB4_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssSB4." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PssSB4) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PssSB4";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PssSB4();
        }
};
