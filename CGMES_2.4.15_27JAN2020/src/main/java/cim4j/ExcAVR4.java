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
import cim4j.Boolean;



/*
Italian excitation system. It represents static exciter and electric voltage regulator.
*/
public class ExcAVR4 extends ExcitationSystemDynamics
{
	private BaseClass[] ExcAVR4_class_attributes;
	private BaseClass[] ExcAVR4_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcAVR4_primitive_builder implements PrimitiveBuilder {
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
		ke(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		vfmx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vfmn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kif(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		tif(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t1if(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		imul(){
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

	private enum ExcAVR4_class_attributes_enum {
		ka,
		vrmn,
		vrmx,
		t1,
		t2,
		t3,
		t4,
		ke,
		vfmx,
		vfmn,
		kif,
		tif,
		t1if,
		imul,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcAVR4() {
		ExcAVR4_primitive_attributes = new BaseClass[ExcAVR4_primitive_builder.values().length];
		ExcAVR4_class_attributes = new BaseClass[ExcAVR4_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcAVR4_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcAVR4_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcAVR4_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcAVR4_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcAVR4_class_attributes_enum attrEnum = ExcAVR4_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcAVR4, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcAVR4_primitive_builder attrEnum = ExcAVR4_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcAVR4, setting " + attrName  + " to: "  + value);
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
			for (ExcAVR4_primitive_builder attrEnum: ExcAVR4_primitive_builder.values()) {
				BaseClass bc = ExcAVR4_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAVR4." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcAVR4_class_attributes_enum attrEnum: ExcAVR4_class_attributes_enum.values()) {
				BaseClass bc = ExcAVR4_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAVR4." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcAVR4) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcAVR4";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcAVR4();
        }
};
