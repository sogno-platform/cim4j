package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PhaseTapChangerNonLinear;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;





/*
Describes a symmetrical phase shifting transformer tap model in which the secondary side voltage magnitude is the same as at the primary side. The difference voltage magnitude is the base in an equal-sided triangle where the sides corresponds to the primary and secondary voltages. The phase angle difference corresponds to the top angle and can be expressed as twice the arctangent of half the total difference voltage.
*/
public class PhaseTapChangerSymmetrical extends PhaseTapChangerNonLinear
{
	private BaseClass[] PhaseTapChangerSymmetrical_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum PhaseTapChangerSymmetrical_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	
	public PhaseTapChangerSymmetrical() {
		PhaseTapChangerSymmetrical_attributes = new BaseClass[PhaseTapChangerSymmetrical_primitive_builder.values().length];
	}

	public void updateAttributeInArray(PhaseTapChangerSymmetrical_primitive_builder attrEnum, BaseClass value) {
		try {
			PhaseTapChangerSymmetrical_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//PhaseTapChangerSymmetrical_ATTR_ENUM attrEnum = PhaseTapChangerSymmetrical_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PhaseTapChangerSymmetrical_primitive_builder attrEnum = PhaseTapChangerSymmetrical_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (PhaseTapChangerSymmetrical_primitive_builder attrEnum: PhaseTapChangerSymmetrical_primitive_builder.values()) {
			BaseClass bc = PhaseTapChangerSymmetrical_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "PhaseTapChangerSymmetrical";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PhaseTapChangerSymmetrical();
        }
};
