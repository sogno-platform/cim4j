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
Czech Proportion/Integral Exciter.
*/
public class ExcCZ extends ExcitationSystemDynamics
{
	private BaseClass[] ExcCZ_class_attributes;
	private BaseClass[] ExcCZ_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcCZ_primitive_builder implements PrimitiveBuilder {
		kp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tc(){
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
		efdmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		efdmin(){
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

	private enum ExcCZ_class_attributes_enum {
		kp,
		tc,
		vrmax,
		vrmin,
		ka,
		ta,
		ke,
		te,
		efdmax,
		efdmin,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
	
	public ExcCZ() {
		ExcCZ_primitive_attributes = new BaseClass[ExcCZ_primitive_builder.values().length];
		ExcCZ_class_attributes = new BaseClass[ExcCZ_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcCZ_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcCZ_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcCZ_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcCZ_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcCZ_class_attributes_enum attrEnum = ExcCZ_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcCZ, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcCZ_primitive_builder attrEnum = ExcCZ_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcCZ, setting " + attrName  + " to: "  + value);
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
			for (ExcCZ_primitive_builder attrEnum: ExcCZ_primitive_builder.values()) {
				BaseClass bc = ExcCZ_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcCZ." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcCZ_class_attributes_enum attrEnum: ExcCZ_class_attributes_enum.values()) {
				BaseClass bc = ExcCZ_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcCZ." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcCZ) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcCZ";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcCZ();
        }
};
