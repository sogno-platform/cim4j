package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.OverexcitationLimiterDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;



/*
Different from LimIEEEOEL, LimOEL2 has a fixed pickup threshold and reduces the excitation set-point by mean of non-windup integral regulator. Irated is the rated machine excitation current (calculated from nameplate conditions: V, P, CosPhi).
*/
public class OverexcLim2 extends OverexcitationLimiterDynamics
{
	private BaseClass[] OverexcLim2_class_attributes;
	private BaseClass[] OverexcLim2_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum OverexcLim2_primitive_builder implements PrimitiveBuilder {
		koi(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		voimax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		voimin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ifdlim(){
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

	private enum OverexcLim2_class_attributes_enum {
		koi,
		voimax,
		voimin,
		ifdlim,
			LAST_ENUM;
	}

		
		
		
		
	
	public OverexcLim2() {
		OverexcLim2_primitive_attributes = new BaseClass[OverexcLim2_primitive_builder.values().length];
		OverexcLim2_class_attributes = new BaseClass[OverexcLim2_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(OverexcLim2_class_attributes_enum attrEnum, BaseClass value) {
		try {
			OverexcLim2_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(OverexcLim2_primitive_builder attrEnum, BaseClass value) {
		try {
			OverexcLim2_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			OverexcLim2_class_attributes_enum attrEnum = OverexcLim2_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated OverexcLim2, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			OverexcLim2_primitive_builder attrEnum = OverexcLim2_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated OverexcLim2, setting " + attrName  + " to: "  + value);
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
			for (OverexcLim2_primitive_builder attrEnum: OverexcLim2_primitive_builder.values()) {
				BaseClass bc = OverexcLim2_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    OverexcLim2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (OverexcLim2_class_attributes_enum attrEnum: OverexcLim2_class_attributes_enum.values()) {
				BaseClass bc = OverexcLim2_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    OverexcLim2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(OverexcLim2) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "OverexcLim2";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new OverexcLim2();
        }
};
