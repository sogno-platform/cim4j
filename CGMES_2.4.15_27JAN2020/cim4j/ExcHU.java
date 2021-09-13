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



/*
Hungarian Excitation System Model, with built-in voltage transducer.
*/
public class ExcHU extends ExcitationSystemDynamics
{
	private BaseClass[] ExcHU_class_attributes;
	private BaseClass[] ExcHU_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcHU_primitive_builder implements PrimitiveBuilder {
		tr(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		te(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		imin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		imax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ae(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		emin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		emax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ki(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ai(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ti(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		atr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ke(){
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

	private enum ExcHU_class_attributes_enum {
		tr,
		te,
		imin,
		imax,
		ae,
		emin,
		emax,
		ki,
		ai,
		ti,
		atr,
		ke,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcHU() {
		ExcHU_primitive_attributes = new BaseClass[ExcHU_primitive_builder.values().length];
		ExcHU_class_attributes = new BaseClass[ExcHU_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcHU_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcHU_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcHU_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcHU_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcHU_class_attributes_enum attrEnum = ExcHU_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcHU, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcHU_primitive_builder attrEnum = ExcHU_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcHU, setting " + attrName  + " to: "  + value);
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
			for (ExcHU_primitive_builder attrEnum: ExcHU_primitive_builder.values()) {
				BaseClass bc = ExcHU_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcHU." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcHU_class_attributes_enum attrEnum: ExcHU_class_attributes_enum.values()) {
				BaseClass bc = ExcHU_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcHU." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcHU) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcHU";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcHU();
        }
};
