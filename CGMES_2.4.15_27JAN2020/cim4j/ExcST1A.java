package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;



/*
Modification of an old IEEE ST1A static excitation system without overexcitation limiter (OEL) and underexcitation limiter (UEL).
*/
public class ExcST1A extends ExcitationSystemDynamics
{
	private BaseClass[] ExcST1A_class_attributes;
	private BaseClass[] ExcST1A_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcST1A_primitive_builder implements PrimitiveBuilder {
		vimax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vimin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tb(){
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
		kc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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
		tc1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tb1(){
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
		ilr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		klr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		xe(){
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

	private enum ExcST1A_class_attributes_enum {
		vimax,
		vimin,
		tc,
		tb,
		ka,
		ta,
		vrmax,
		vrmin,
		kc,
		kf,
		tf,
		tc1,
		tb1,
		vamax,
		vamin,
		ilr,
		klr,
		xe,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcST1A() {
		ExcST1A_primitive_attributes = new BaseClass[ExcST1A_primitive_builder.values().length];
		ExcST1A_class_attributes = new BaseClass[ExcST1A_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcST1A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcST1A_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcST1A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcST1A_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcST1A_class_attributes_enum attrEnum = ExcST1A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcST1A, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcST1A_primitive_builder attrEnum = ExcST1A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcST1A, setting " + attrName  + " to: "  + value);
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
			for (ExcST1A_primitive_builder attrEnum: ExcST1A_primitive_builder.values()) {
				BaseClass bc = ExcST1A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcST1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcST1A_class_attributes_enum attrEnum: ExcST1A_class_attributes_enum.values()) {
				BaseClass bc = ExcST1A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcST1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcST1A) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcST1A";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcST1A();
        }
};
