package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.Seconds;
import cim4j.Integer;
import cim4j.PU;



/*
Italian excitation system. It represents static field voltage or excitation current feedback excitation system.
*/
public class ExcANS extends ExcitationSystemDynamics
{
	private BaseClass[] ExcANS_class_attributes;
	private BaseClass[] ExcANS_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcANS_primitive_builder implements PrimitiveBuilder {
		k3(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		k2(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kce(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		t3(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		blint(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
		kvfif(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
		ifmn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ifmx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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
		krvecc(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
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

	private enum ExcANS_class_attributes_enum {
		k3,
		k2,
		kce,
		t3,
		t2,
		t1,
		blint,
		kvfif,
		ifmn,
		ifmx,
		vrmn,
		vrmx,
		krvecc,
		tb,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcANS() {
		ExcANS_primitive_attributes = new BaseClass[ExcANS_primitive_builder.values().length];
		ExcANS_class_attributes = new BaseClass[ExcANS_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcANS_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcANS_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcANS_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcANS_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcANS_class_attributes_enum attrEnum = ExcANS_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcANS, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcANS_primitive_builder attrEnum = ExcANS_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcANS, setting " + attrName  + " to: "  + value);
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
			for (ExcANS_primitive_builder attrEnum: ExcANS_primitive_builder.values()) {
				BaseClass bc = ExcANS_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcANS." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcANS_class_attributes_enum attrEnum: ExcANS_class_attributes_enum.values()) {
				BaseClass bc = ExcANS_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcANS." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcANS) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcANS";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcANS();
        }
};
