package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.PU;
import cim4j.Seconds;



/*
Italian excitation system corresponding to IEEE (1968) Type 1 Model. It represents exciter dynamo and electromechanical regulator.
*/
public class ExcAVR1 extends ExcitationSystemDynamics
{
	private BaseClass[] ExcAVR1_class_attributes;
	private BaseClass[] ExcAVR1_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcAVR1_primitive_builder implements PrimitiveBuilder {
		ka(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		vrmn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vrmx(){
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
		te(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		e1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		se1(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		e2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		se2(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kf(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		tf(){
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

	private enum ExcAVR1_class_attributes_enum {
		ka,
		vrmn,
		vrmx,
		ta,
		tb,
		te,
		e1,
		se1,
		e2,
		se2,
		kf,
		tf,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcAVR1() {
		ExcAVR1_primitive_attributes = new BaseClass[ExcAVR1_primitive_builder.values().length];
		ExcAVR1_class_attributes = new BaseClass[ExcAVR1_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcAVR1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcAVR1_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcAVR1_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcAVR1_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcAVR1_class_attributes_enum attrEnum = ExcAVR1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcAVR1, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcAVR1_primitive_builder attrEnum = ExcAVR1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcAVR1, setting " + attrName  + " to: "  + value);
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
			for (ExcAVR1_primitive_builder attrEnum: ExcAVR1_primitive_builder.values()) {
				BaseClass bc = ExcAVR1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAVR1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcAVR1_class_attributes_enum attrEnum: ExcAVR1_class_attributes_enum.values()) {
				BaseClass bc = ExcAVR1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAVR1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcAVR1) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcAVR1";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcAVR1();
        }
};
