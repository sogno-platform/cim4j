package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PhaseTapChanger;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PerCent;
import cim4j.Reactance;



/*
The non-linear phase tap changer describes the non-linear behavior of a phase tap changer. This is a base class for the symmetrical and asymmetrical phase tap changer models. The details of these models can be found in the IEC 61970-301 document.
*/
public class PhaseTapChangerNonLinear extends PhaseTapChanger
{
	private BaseClass[] PhaseTapChangerNonLinear_class_attributes;
	private BaseClass[] PhaseTapChangerNonLinear_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PhaseTapChangerNonLinear_primitive_builder implements PrimitiveBuilder {
		voltageStepIncrement(){
			public BaseClass construct (java.lang.String value) {
				return new PerCent(value);
			}
		},
		xMax(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
		xMin(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum PhaseTapChangerNonLinear_class_attributes_enum {
		voltageStepIncrement,
		xMax,
		xMin,
			LAST_ENUM;
	}

		
		
		
	
	public PhaseTapChangerNonLinear() {
		PhaseTapChangerNonLinear_primitive_attributes = new BaseClass[PhaseTapChangerNonLinear_primitive_builder.values().length];
		PhaseTapChangerNonLinear_class_attributes = new BaseClass[PhaseTapChangerNonLinear_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PhaseTapChangerNonLinear_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PhaseTapChangerNonLinear_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PhaseTapChangerNonLinear_primitive_builder attrEnum, BaseClass value) {
		try {
			PhaseTapChangerNonLinear_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PhaseTapChangerNonLinear_class_attributes_enum attrEnum = PhaseTapChangerNonLinear_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PhaseTapChangerNonLinear, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PhaseTapChangerNonLinear_primitive_builder attrEnum = PhaseTapChangerNonLinear_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PhaseTapChangerNonLinear, setting " + attrName  + " to: "  + value);
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
			for (PhaseTapChangerNonLinear_primitive_builder attrEnum: PhaseTapChangerNonLinear_primitive_builder.values()) {
				BaseClass bc = PhaseTapChangerNonLinear_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChangerNonLinear." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PhaseTapChangerNonLinear_class_attributes_enum attrEnum: PhaseTapChangerNonLinear_class_attributes_enum.values()) {
				BaseClass bc = PhaseTapChangerNonLinear_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChangerNonLinear." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PhaseTapChangerNonLinear) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PhaseTapChangerNonLinear";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PhaseTapChangerNonLinear();
        }
};
