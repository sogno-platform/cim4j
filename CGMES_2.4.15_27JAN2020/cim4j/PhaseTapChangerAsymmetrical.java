package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PhaseTapChangerNonLinear;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.AngleDegrees;



/*
Describes the tap model for an asymmetrical phase shifting transformer in which the difference voltage vector adds to the primary side voltage. The angle between the primary side voltage and the difference voltage is named the winding connection angle. The phase shift depends on both the difference voltage magnitude and the winding connection angle.
*/
public class PhaseTapChangerAsymmetrical extends PhaseTapChangerNonLinear
{
	private BaseClass[] PhaseTapChangerAsymmetrical_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum PhaseTapChangerAsymmetrical_primitive_builder implements PrimitiveBuilder {
			windingConnectionAngle(){
			public BaseClass construct (java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
	
	public PhaseTapChangerAsymmetrical() {
		PhaseTapChangerAsymmetrical_attributes = new BaseClass[PhaseTapChangerAsymmetrical_primitive_builder.values().length];
	}

	public void updateAttributeInArray(PhaseTapChangerAsymmetrical_primitive_builder attrEnum, BaseClass value) {
		try {
			PhaseTapChangerAsymmetrical_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//PhaseTapChangerAsymmetrical_ATTR_ENUM attrEnum = PhaseTapChangerAsymmetrical_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PhaseTapChangerAsymmetrical_primitive_builder attrEnum = PhaseTapChangerAsymmetrical_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (PhaseTapChangerAsymmetrical_primitive_builder attrEnum: PhaseTapChangerAsymmetrical_primitive_builder.values()) {
			BaseClass bc = PhaseTapChangerAsymmetrical_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "PhaseTapChangerAsymmetrical";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PhaseTapChangerAsymmetrical();
        }
};
