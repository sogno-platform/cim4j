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
	private BaseClass[] PhaseTapChangerNonLinear_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
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

		
		
		
	
	public PhaseTapChangerNonLinear() {
		PhaseTapChangerNonLinear_attributes = new BaseClass[PhaseTapChangerNonLinear_primitive_builder.values().length];
	}

	public void updateAttributeInArray(PhaseTapChangerNonLinear_primitive_builder attrEnum, BaseClass value) {
		try {
			PhaseTapChangerNonLinear_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//PhaseTapChangerNonLinear_ATTR_ENUM attrEnum = PhaseTapChangerNonLinear_ATTR_BC_ENUM.valueOf(attrName);
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
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (PhaseTapChangerNonLinear_primitive_builder attrEnum: PhaseTapChangerNonLinear_primitive_builder.values()) {
			BaseClass bc = PhaseTapChangerNonLinear_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
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
