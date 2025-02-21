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
	private BaseClass[] PhaseTapChangerAsymmetrical_class_attributes;
	private BaseClass[] PhaseTapChangerAsymmetrical_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

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

	private enum PhaseTapChangerAsymmetrical_class_attributes_enum {
		windingConnectionAngle,
			LAST_ENUM;
	}

		
	
	public PhaseTapChangerAsymmetrical() {
		PhaseTapChangerAsymmetrical_primitive_attributes = new BaseClass[PhaseTapChangerAsymmetrical_primitive_builder.values().length];
		PhaseTapChangerAsymmetrical_class_attributes = new BaseClass[PhaseTapChangerAsymmetrical_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PhaseTapChangerAsymmetrical_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PhaseTapChangerAsymmetrical_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PhaseTapChangerAsymmetrical_primitive_builder attrEnum, BaseClass value) {
		try {
			PhaseTapChangerAsymmetrical_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PhaseTapChangerAsymmetrical_class_attributes_enum attrEnum = PhaseTapChangerAsymmetrical_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PhaseTapChangerAsymmetrical, setting " + attrName);
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
			System.out.println("Updated PhaseTapChangerAsymmetrical, setting " + attrName  + " to: "  + value);
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
			for (PhaseTapChangerAsymmetrical_primitive_builder attrEnum: PhaseTapChangerAsymmetrical_primitive_builder.values()) {
				BaseClass bc = PhaseTapChangerAsymmetrical_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChangerAsymmetrical." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PhaseTapChangerAsymmetrical_class_attributes_enum attrEnum: PhaseTapChangerAsymmetrical_class_attributes_enum.values()) {
				BaseClass bc = PhaseTapChangerAsymmetrical_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChangerAsymmetrical." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PhaseTapChangerAsymmetrical) RDFID: " + rdfid;
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
