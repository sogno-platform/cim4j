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
import cim4j.Boolean;



/*
Simple excitation system model representing generic characteristics of many excitation systems; intended for use where negative field current may be a problem.
*/
public class ExcSCRX extends ExcitationSystemDynamics
{
	private BaseClass[] ExcSCRX_class_attributes;
	private BaseClass[] ExcSCRX_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcSCRX_primitive_builder implements PrimitiveBuilder {
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
		cswitch(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		rcrfd(){
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

	private enum ExcSCRX_class_attributes_enum {
		tatb,
		tb,
		k,
		te,
		emin,
		emax,
		cswitch,
		rcrfd,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
	
	public ExcSCRX() {
		ExcSCRX_primitive_attributes = new BaseClass[ExcSCRX_primitive_builder.values().length];
		ExcSCRX_class_attributes = new BaseClass[ExcSCRX_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcSCRX_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcSCRX_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcSCRX_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcSCRX_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcSCRX_class_attributes_enum attrEnum = ExcSCRX_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcSCRX, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcSCRX_primitive_builder attrEnum = ExcSCRX_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcSCRX, setting " + attrName  + " to: "  + value);
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
			for (ExcSCRX_primitive_builder attrEnum: ExcSCRX_primitive_builder.values()) {
				BaseClass bc = ExcSCRX_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcSCRX." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcSCRX_class_attributes_enum attrEnum: ExcSCRX_class_attributes_enum.values()) {
				BaseClass bc = ExcSCRX_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcSCRX." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcSCRX) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcSCRX";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcSCRX();
        }
};
