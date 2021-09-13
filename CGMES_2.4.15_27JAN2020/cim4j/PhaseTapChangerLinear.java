package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PhaseTapChanger;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.AngleDegrees;
import cim4j.Reactance;



/*
Describes a tap changer with a linear relation between the tap step and the phase angle difference across the transformer. This is a mathematical model that is an approximation of a real phase tap changer. The phase angle is computed as stepPhaseShitfIncrement times the tap position. The secondary side voltage magnitude is the same as at the primary side.
*/
public class PhaseTapChangerLinear extends PhaseTapChanger
{
	private BaseClass[] PhaseTapChangerLinear_class_attributes;
	private BaseClass[] PhaseTapChangerLinear_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PhaseTapChangerLinear_primitive_builder implements PrimitiveBuilder {
		stepPhaseShiftIncrement(){
			public BaseClass construct (java.lang.String value) {
				return new AngleDegrees(value);
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

	private enum PhaseTapChangerLinear_class_attributes_enum {
		stepPhaseShiftIncrement,
		xMax,
		xMin,
			LAST_ENUM;
	}

		
		
		
	
	public PhaseTapChangerLinear() {
		PhaseTapChangerLinear_primitive_attributes = new BaseClass[PhaseTapChangerLinear_primitive_builder.values().length];
		PhaseTapChangerLinear_class_attributes = new BaseClass[PhaseTapChangerLinear_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PhaseTapChangerLinear_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PhaseTapChangerLinear_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PhaseTapChangerLinear_primitive_builder attrEnum, BaseClass value) {
		try {
			PhaseTapChangerLinear_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PhaseTapChangerLinear_class_attributes_enum attrEnum = PhaseTapChangerLinear_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PhaseTapChangerLinear, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PhaseTapChangerLinear_primitive_builder attrEnum = PhaseTapChangerLinear_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PhaseTapChangerLinear, setting " + attrName  + " to: "  + value);
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
			for (PhaseTapChangerLinear_primitive_builder attrEnum: PhaseTapChangerLinear_primitive_builder.values()) {
				BaseClass bc = PhaseTapChangerLinear_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChangerLinear." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PhaseTapChangerLinear_class_attributes_enum attrEnum: PhaseTapChangerLinear_class_attributes_enum.values()) {
				BaseClass bc = PhaseTapChangerLinear_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChangerLinear." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PhaseTapChangerLinear) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PhaseTapChangerLinear";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PhaseTapChangerLinear();
        }
};
