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
Modified IEEE ST2A static excitation system - another lead-lag block added to match  the model defined by WECC.
*/
public class ExcST2A extends ExcitationSystemDynamics
{
	private BaseClass[] ExcST2A_class_attributes;
	private BaseClass[] ExcST2A_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcST2A_primitive_builder implements PrimitiveBuilder {
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
		kc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		efdmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		uelin(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
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
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ExcST2A_class_attributes_enum {
		ka,
		ta,
		vrmax,
		vrmin,
		ke,
		te,
		kf,
		tf,
		kp,
		ki,
		kc,
		efdmax,
		uelin,
		tb,
		tc,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcST2A() {
		ExcST2A_primitive_attributes = new BaseClass[ExcST2A_primitive_builder.values().length];
		ExcST2A_class_attributes = new BaseClass[ExcST2A_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcST2A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcST2A_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcST2A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcST2A_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcST2A_class_attributes_enum attrEnum = ExcST2A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcST2A, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcST2A_primitive_builder attrEnum = ExcST2A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcST2A, setting " + attrName  + " to: "  + value);
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
			for (ExcST2A_primitive_builder attrEnum: ExcST2A_primitive_builder.values()) {
				BaseClass bc = ExcST2A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcST2A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcST2A_class_attributes_enum attrEnum: ExcST2A_class_attributes_enum.values()) {
				BaseClass bc = ExcST2A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcST2A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcST2A) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcST2A";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcST2A();
        }
};
