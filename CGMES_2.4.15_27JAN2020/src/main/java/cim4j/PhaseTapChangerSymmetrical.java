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
	private BaseClass[] PhaseTapChangerSymmetrical_class_attributes;
	private BaseClass[] PhaseTapChangerSymmetrical_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PhaseTapChangerSymmetrical_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum PhaseTapChangerSymmetrical_class_attributes_enum {
			LAST_ENUM;
	}

	
	public PhaseTapChangerSymmetrical() {
		PhaseTapChangerSymmetrical_primitive_attributes = new BaseClass[PhaseTapChangerSymmetrical_primitive_builder.values().length];
		PhaseTapChangerSymmetrical_class_attributes = new BaseClass[PhaseTapChangerSymmetrical_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PhaseTapChangerSymmetrical_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PhaseTapChangerSymmetrical_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PhaseTapChangerSymmetrical_primitive_builder attrEnum, BaseClass value) {
		try {
			PhaseTapChangerSymmetrical_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PhaseTapChangerSymmetrical_class_attributes_enum attrEnum = PhaseTapChangerSymmetrical_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PhaseTapChangerSymmetrical, setting " + attrName);
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
			System.out.println("Updated PhaseTapChangerSymmetrical, setting " + attrName  + " to: "  + value);
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
			for (PhaseTapChangerSymmetrical_primitive_builder attrEnum: PhaseTapChangerSymmetrical_primitive_builder.values()) {
				BaseClass bc = PhaseTapChangerSymmetrical_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChangerSymmetrical." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PhaseTapChangerSymmetrical_class_attributes_enum attrEnum: PhaseTapChangerSymmetrical_class_attributes_enum.values()) {
				BaseClass bc = PhaseTapChangerSymmetrical_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChangerSymmetrical." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PhaseTapChangerSymmetrical) RDFID: " + rdfid;
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
