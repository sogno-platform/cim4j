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



/*
The class represents IEEE Std 421.5-2005 type AC7B model. The model represents excitation systems which consist of an ac alternator with either stationary or rotating rectifiers to produce the dc field requirements. It is an upgrade to earlier ac excitation systems, which replace only the controls but retain the ac alternator and diode rectifier bridge.  Reference: IEEE Standard 421.5-2005 Section 6.7.  In the IEEE Standard 421.5 - 2005, the [1 / sT] block is shown as [1 / (1 + sT)], which is incorrect.
*/
public class ExcIEEEAC7B extends ExcitationSystemDynamics
{
	private BaseClass[] ExcIEEEAC7B_class_attributes;
	private BaseClass[] ExcIEEEAC7B_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcIEEEAC7B_primitive_builder implements PrimitiveBuilder {
		kpr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kir(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kdr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tdr(){
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
		kpa(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kia(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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
		kp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kl(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		te(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		vfemax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vemin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ke(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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
		kf3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tf(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
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
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ExcIEEEAC7B_class_attributes_enum {
		kpr,
		kir,
		kdr,
		tdr,
		vrmax,
		vrmin,
		kpa,
		kia,
		vamax,
		vamin,
		kp,
		kl,
		te,
		vfemax,
		vemin,
		ke,
		kc,
		kd,
		kf1,
		kf2,
		kf3,
		tf,
		ve1,
		seve1,
		ve2,
		seve2,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcIEEEAC7B() {
		ExcIEEEAC7B_primitive_attributes = new BaseClass[ExcIEEEAC7B_primitive_builder.values().length];
		ExcIEEEAC7B_class_attributes = new BaseClass[ExcIEEEAC7B_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcIEEEAC7B_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcIEEEAC7B_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcIEEEAC7B_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEAC7B_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcIEEEAC7B_class_attributes_enum attrEnum = ExcIEEEAC7B_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcIEEEAC7B, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEAC7B_primitive_builder attrEnum = ExcIEEEAC7B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcIEEEAC7B, setting " + attrName  + " to: "  + value);
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
			for (ExcIEEEAC7B_primitive_builder attrEnum: ExcIEEEAC7B_primitive_builder.values()) {
				BaseClass bc = ExcIEEEAC7B_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEAC7B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcIEEEAC7B_class_attributes_enum attrEnum: ExcIEEEAC7B_class_attributes_enum.values()) {
				BaseClass bc = ExcIEEEAC7B_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEAC7B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcIEEEAC7B) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcIEEEAC7B";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcIEEEAC7B();
        }
};
