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
	private BaseClass[] PhaseTapChangerLinear_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
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

		
		
		
	
	public PhaseTapChangerLinear() {
		PhaseTapChangerLinear_attributes = new BaseClass[PhaseTapChangerLinear_primitive_builder.values().length];
	}

	public void updateAttributeInArray(PhaseTapChangerLinear_primitive_builder attrEnum, BaseClass value) {
		try {
			PhaseTapChangerLinear_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//PhaseTapChangerLinear_ATTR_ENUM attrEnum = PhaseTapChangerLinear_ATTR_BC_ENUM.valueOf(attrName);
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
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (PhaseTapChangerLinear_primitive_builder attrEnum: PhaseTapChangerLinear_primitive_builder.values()) {
			BaseClass bc = PhaseTapChangerLinear_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
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
