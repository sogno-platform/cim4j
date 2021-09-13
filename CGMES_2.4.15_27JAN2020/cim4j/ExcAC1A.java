package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Seconds;
import cim4j.PU;
import cim4j.Simple_Float;
import cim4j.Boolean;



/*
Modified IEEE AC1A alternator-supplied rectifier excitation system with different rate feedback source.
*/
public class ExcAC1A extends ExcitationSystemDynamics
{
	private BaseClass[] ExcAC1A_class_attributes;
	private BaseClass[] ExcAC1A_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcAC1A_primitive_builder implements PrimitiveBuilder {
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
		vamax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vamin(){
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
		kf1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kf2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ks(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tf(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		kc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kd(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ke(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ve1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		seve1(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ve2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		seve2(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
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
		hvlvgates(){
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

	private enum ExcAC1A_class_attributes_enum {
		tb,
		tc,
		ka,
		ta,
		vamax,
		vamin,
		te,
		kf,
		kf1,
		kf2,
		ks,
		tf,
		kc,
		kd,
		ke,
		ve1,
		seve1,
		ve2,
		seve2,
		vrmax,
		vrmin,
		hvlvgates,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcAC1A() {
		ExcAC1A_primitive_attributes = new BaseClass[ExcAC1A_primitive_builder.values().length];
		ExcAC1A_class_attributes = new BaseClass[ExcAC1A_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcAC1A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcAC1A_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcAC1A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcAC1A_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcAC1A_class_attributes_enum attrEnum = ExcAC1A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcAC1A, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcAC1A_primitive_builder attrEnum = ExcAC1A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcAC1A, setting " + attrName  + " to: "  + value);
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
			for (ExcAC1A_primitive_builder attrEnum: ExcAC1A_primitive_builder.values()) {
				BaseClass bc = ExcAC1A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAC1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcAC1A_class_attributes_enum attrEnum: ExcAC1A_class_attributes_enum.values()) {
				BaseClass bc = ExcAC1A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAC1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcAC1A) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcAC1A";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcAC1A();
        }
};
