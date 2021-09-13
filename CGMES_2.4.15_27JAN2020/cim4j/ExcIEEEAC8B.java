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
The class represents IEEE Std 421.5-2005 type AC8B model. This model represents a PID voltage regulator with either a brushless exciter or dc exciter. The AVR in this model consists of PID control, with separate constants for the proportional (), integral (), and derivative () gains. The representation of the brushless exciter (, , , , ) is similar to the model Type AC2A. The Type AC8B model can be used to represent static voltage regulators applied to brushless excitation systems. Digitally based voltage regulators feeding dc rotating main exciters can be represented with the AC Type AC8B model with the parameters  and  set to 0.  For thyristor power stages fed from the generator terminals, the limits  and  should be a function of terminal voltage:  * and  * .     Reference: IEEE Standard 421.5-2005 Section 6.8.
*/
public class ExcIEEEAC8B extends ExcitationSystemDynamics
{
	private BaseClass[] ExcIEEEAC8B_class_attributes;
	private BaseClass[] ExcIEEEAC8B_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcIEEEAC8B_primitive_builder implements PrimitiveBuilder {
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

	private enum ExcIEEEAC8B_class_attributes_enum {
		kpr,
		kir,
		kdr,
		tdr,
		vrmax,
		vrmin,
		ka,
		ta,
		te,
		vfemax,
		vemin,
		ke,
		kc,
		kd,
		ve1,
		seve1,
		ve2,
		seve2,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcIEEEAC8B() {
		ExcIEEEAC8B_primitive_attributes = new BaseClass[ExcIEEEAC8B_primitive_builder.values().length];
		ExcIEEEAC8B_class_attributes = new BaseClass[ExcIEEEAC8B_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcIEEEAC8B_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcIEEEAC8B_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcIEEEAC8B_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEAC8B_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcIEEEAC8B_class_attributes_enum attrEnum = ExcIEEEAC8B_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcIEEEAC8B, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEAC8B_primitive_builder attrEnum = ExcIEEEAC8B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcIEEEAC8B, setting " + attrName  + " to: "  + value);
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
			for (ExcIEEEAC8B_primitive_builder attrEnum: ExcIEEEAC8B_primitive_builder.values()) {
				BaseClass bc = ExcIEEEAC8B_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEAC8B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcIEEEAC8B_class_attributes_enum attrEnum: ExcIEEEAC8B_class_attributes_enum.values()) {
				BaseClass bc = ExcIEEEAC8B_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEAC8B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcIEEEAC8B) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcIEEEAC8B";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcIEEEAC8B();
        }
};
