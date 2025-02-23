package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.Seconds;
import cim4j.PU;



/*
Simplified Excitation System Model.
*/
public class ExcSEXS extends ExcitationSystemDynamics
{
	private BaseClass[] ExcSEXS_class_attributes;
	private BaseClass[] ExcSEXS_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcSEXS_primitive_builder implements PrimitiveBuilder {
		tatb(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		tb(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		k(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		te(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
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
		kc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		efdmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		efdmax(){
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

	private enum ExcSEXS_class_attributes_enum {
		tatb,
		tb,
		k,
		te,
		emin,
		emax,
		kc,
		tc,
		efdmin,
		efdmax,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
	
	public ExcSEXS() {
		ExcSEXS_primitive_attributes = new BaseClass[ExcSEXS_primitive_builder.values().length];
		ExcSEXS_class_attributes = new BaseClass[ExcSEXS_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcSEXS_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcSEXS_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcSEXS_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcSEXS_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcSEXS_class_attributes_enum attrEnum = ExcSEXS_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcSEXS, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcSEXS_primitive_builder attrEnum = ExcSEXS_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcSEXS, setting " + attrName  + " to: "  + value);
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
			for (ExcSEXS_primitive_builder attrEnum: ExcSEXS_primitive_builder.values()) {
				BaseClass bc = ExcSEXS_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcSEXS." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcSEXS_class_attributes_enum attrEnum: ExcSEXS_class_attributes_enum.values()) {
				BaseClass bc = ExcSEXS_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcSEXS." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcSEXS) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcSEXS";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcSEXS();
        }
};
