package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;
import cim4j.Simple_Float;
import cim4j.Boolean;



/*
Modified IEEE DC1A direct current commutator exciter with speed input and without underexcitation limiters (UEL) inputs.
*/
public class ExcDC1A extends ExcitationSystemDynamics
{
	private BaseClass[] ExcDC1A_class_attributes;
	private BaseClass[] ExcDC1A_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcDC1A_primitive_builder implements PrimitiveBuilder {
		ka(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ks(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ta(){
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
		ke(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		te(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		kf(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tf(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		efd1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		seefd1(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		efd2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		seefd2(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		exclim(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		efdmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		edfmax(){
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

	private enum ExcDC1A_class_attributes_enum {
		ka,
		ks,
		ta,
		tb,
		tc,
		vrmax,
		vrmin,
		ke,
		te,
		kf,
		tf,
		efd1,
		seefd1,
		efd2,
		seefd2,
		exclim,
		efdmin,
		edfmax,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcDC1A() {
		ExcDC1A_primitive_attributes = new BaseClass[ExcDC1A_primitive_builder.values().length];
		ExcDC1A_class_attributes = new BaseClass[ExcDC1A_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcDC1A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcDC1A_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcDC1A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcDC1A_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcDC1A_class_attributes_enum attrEnum = ExcDC1A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcDC1A, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcDC1A_primitive_builder attrEnum = ExcDC1A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcDC1A, setting " + attrName  + " to: "  + value);
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
			for (ExcDC1A_primitive_builder attrEnum: ExcDC1A_primitive_builder.values()) {
				BaseClass bc = ExcDC1A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcDC1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcDC1A_class_attributes_enum attrEnum: ExcDC1A_class_attributes_enum.values()) {
				BaseClass bc = ExcDC1A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcDC1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcDC1A) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcDC1A";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcDC1A();
        }
};
