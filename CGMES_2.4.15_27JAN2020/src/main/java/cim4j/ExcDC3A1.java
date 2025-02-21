package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;
import cim4j.Boolean;



/*
This is modified old IEEE type 3 excitation system.
*/
public class ExcDC3A1 extends ExcitationSystemDynamics
{
	private BaseClass[] ExcDC3A1_class_attributes;
	private BaseClass[] ExcDC3A1_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcDC3A1_primitive_builder implements PrimitiveBuilder {
		ka(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ta(){
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
		kp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ki(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vbmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		exclim(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		ke(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vb1max(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vblim(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ExcDC3A1_class_attributes_enum {
		ka,
		ta,
		vrmax,
		vrmin,
		te,
		kf,
		tf,
		kp,
		ki,
		vbmax,
		exclim,
		ke,
		vb1max,
		vblim,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcDC3A1() {
		ExcDC3A1_primitive_attributes = new BaseClass[ExcDC3A1_primitive_builder.values().length];
		ExcDC3A1_class_attributes = new BaseClass[ExcDC3A1_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcDC3A1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcDC3A1_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcDC3A1_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcDC3A1_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcDC3A1_class_attributes_enum attrEnum = ExcDC3A1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcDC3A1, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcDC3A1_primitive_builder attrEnum = ExcDC3A1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcDC3A1, setting " + attrName  + " to: "  + value);
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
			for (ExcDC3A1_primitive_builder attrEnum: ExcDC3A1_primitive_builder.values()) {
				BaseClass bc = ExcDC3A1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcDC3A1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcDC3A1_class_attributes_enum attrEnum: ExcDC3A1_class_attributes_enum.values()) {
				BaseClass bc = ExcDC3A1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcDC3A1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcDC3A1) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcDC3A1";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcDC3A1();
        }
};
