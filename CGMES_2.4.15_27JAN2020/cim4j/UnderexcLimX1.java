package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.UnderexcitationLimiterDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;



/*

*/
public class UnderexcLimX1 extends UnderexcitationLimiterDynamics
{
	private BaseClass[] UnderexcLimX1_class_attributes;
	private BaseClass[] UnderexcLimX1_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum UnderexcLimX1_primitive_builder implements PrimitiveBuilder {
		kf2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tf2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		km(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tm(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		melmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		k(){
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

	private enum UnderexcLimX1_class_attributes_enum {
		kf2,
		tf2,
		km,
		tm,
		melmax,
		k,
			LAST_ENUM;
	}

		
		
		
		
		
		
	
	public UnderexcLimX1() {
		UnderexcLimX1_primitive_attributes = new BaseClass[UnderexcLimX1_primitive_builder.values().length];
		UnderexcLimX1_class_attributes = new BaseClass[UnderexcLimX1_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(UnderexcLimX1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			UnderexcLimX1_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(UnderexcLimX1_primitive_builder attrEnum, BaseClass value) {
		try {
			UnderexcLimX1_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			UnderexcLimX1_class_attributes_enum attrEnum = UnderexcLimX1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated UnderexcLimX1, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			UnderexcLimX1_primitive_builder attrEnum = UnderexcLimX1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated UnderexcLimX1, setting " + attrName  + " to: "  + value);
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
			for (UnderexcLimX1_primitive_builder attrEnum: UnderexcLimX1_primitive_builder.values()) {
				BaseClass bc = UnderexcLimX1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    UnderexcLimX1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (UnderexcLimX1_class_attributes_enum attrEnum: UnderexcLimX1_class_attributes_enum.values()) {
				BaseClass bc = UnderexcLimX1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    UnderexcLimX1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(UnderexcLimX1) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "UnderexcLimX1";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new UnderexcLimX1();
        }
};
