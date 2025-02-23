package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PowerSystemStabilizerDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.InputSignalKind;
import cim4j.PU;
import cim4j.Seconds;
import cim4j.Integer;
import cim4j.Simple_Float;



/*
Modified IEEE PSS2B Model.  Extra lead/lag (or rate) block added at end (up to 4 lead/lags total).
*/
public class Pss2B extends PowerSystemStabilizerDynamics
{
	private BaseClass[] Pss2B_class_attributes;
	private BaseClass[] Pss2B_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Pss2B_primitive_builder implements PrimitiveBuilder {
		inputSignal1Type(){
			public BaseClass construct (java.lang.String value) {
				return new InputSignalKind(value);
			}
		},
		inputSignal2Type(){
			public BaseClass construct (java.lang.String value) {
				return new InputSignalKind(value);
			}
		},
		vsi1max(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vsi1min(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tw1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tw2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		vsi2max(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vsi2min(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tw3(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tw4(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
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
		t6(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t7(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t8(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t9(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t10(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t11(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		ks1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ks2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ks3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ks4(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		n(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
		m(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
		vstmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vstmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		a(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
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
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum Pss2B_class_attributes_enum {
		inputSignal1Type,
		inputSignal2Type,
		vsi1max,
		vsi1min,
		tw1,
		tw2,
		vsi2max,
		vsi2min,
		tw3,
		tw4,
		t1,
		t2,
		t3,
		t4,
		t6,
		t7,
		t8,
		t9,
		t10,
		t11,
		ks1,
		ks2,
		ks3,
		ks4,
		n,
		m,
		vstmax,
		vstmin,
		a,
		ta,
		tb,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public Pss2B() {
		Pss2B_primitive_attributes = new BaseClass[Pss2B_primitive_builder.values().length];
		Pss2B_class_attributes = new BaseClass[Pss2B_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Pss2B_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Pss2B_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Pss2B_primitive_builder attrEnum, BaseClass value) {
		try {
			Pss2B_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Pss2B_class_attributes_enum attrEnum = Pss2B_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Pss2B, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Pss2B_primitive_builder attrEnum = Pss2B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Pss2B, setting " + attrName  + " to: "  + value);
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
			for (Pss2B_primitive_builder attrEnum: Pss2B_primitive_builder.values()) {
				BaseClass bc = Pss2B_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Pss2B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Pss2B_class_attributes_enum attrEnum: Pss2B_class_attributes_enum.values()) {
				BaseClass bc = Pss2B_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Pss2B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Pss2B) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Pss2B";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Pss2B();
        }
};
