package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Seconds;
import cim4j.PU;



/*
Modified IEEE Type ST1 Excitation System with semi-continuous and acting terminal voltage limiter.
*/
public class ExcOEX3T extends ExcitationSystemDynamics
{
	private BaseClass[] ExcOEX3T_class_attributes;
	private BaseClass[] ExcOEX3T_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcOEX3T_primitive_builder implements PrimitiveBuilder {
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
		ka(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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
		e1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		see1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		e2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		see2(){
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

	private enum ExcOEX3T_class_attributes_enum {
		t1,
		t2,
		t3,
		t4,
		ka,
		t5,
		t6,
		vrmax,
		vrmin,
		te,
		kf,
		tf,
		kc,
		kd,
		ke,
		e1,
		see1,
		e2,
		see2,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcOEX3T() {
		ExcOEX3T_primitive_attributes = new BaseClass[ExcOEX3T_primitive_builder.values().length];
		ExcOEX3T_class_attributes = new BaseClass[ExcOEX3T_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcOEX3T_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcOEX3T_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcOEX3T_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcOEX3T_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcOEX3T_class_attributes_enum attrEnum = ExcOEX3T_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcOEX3T, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcOEX3T_primitive_builder attrEnum = ExcOEX3T_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcOEX3T, setting " + attrName  + " to: "  + value);
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
			for (ExcOEX3T_primitive_builder attrEnum: ExcOEX3T_primitive_builder.values()) {
				BaseClass bc = ExcOEX3T_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcOEX3T." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcOEX3T_class_attributes_enum attrEnum: ExcOEX3T_class_attributes_enum.values()) {
				BaseClass bc = ExcOEX3T_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcOEX3T." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcOEX3T) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcOEX3T";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcOEX3T();
        }
};
