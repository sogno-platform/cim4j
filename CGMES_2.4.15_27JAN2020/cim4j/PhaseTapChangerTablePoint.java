package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TapChangerTablePoint;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.AngleDegrees;


import cim4j.PhaseTapChangerTable;

/*
Describes each tap step in the phase tap changer tabular curve.
*/
public class PhaseTapChangerTablePoint extends TapChangerTablePoint
{
	private BaseClass[] PhaseTapChangerTablePoint_class_attributes;
	private BaseClass[] PhaseTapChangerTablePoint_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PhaseTapChangerTablePoint_primitive_builder implements PrimitiveBuilder {
		angle(){
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

	private enum PhaseTapChangerTablePoint_class_attributes_enum {
		PhaseTapChangerTable,
		angle,
			LAST_ENUM;
	}

		
		
	
	public PhaseTapChangerTablePoint() {
		PhaseTapChangerTablePoint_primitive_attributes = new BaseClass[PhaseTapChangerTablePoint_primitive_builder.values().length];
		PhaseTapChangerTablePoint_class_attributes = new BaseClass[PhaseTapChangerTablePoint_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PhaseTapChangerTablePoint_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PhaseTapChangerTablePoint_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PhaseTapChangerTablePoint_primitive_builder attrEnum, BaseClass value) {
		try {
			PhaseTapChangerTablePoint_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PhaseTapChangerTablePoint_class_attributes_enum attrEnum = PhaseTapChangerTablePoint_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PhaseTapChangerTablePoint, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PhaseTapChangerTablePoint_primitive_builder attrEnum = PhaseTapChangerTablePoint_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PhaseTapChangerTablePoint, setting " + attrName  + " to: "  + value);
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
			for (PhaseTapChangerTablePoint_primitive_builder attrEnum: PhaseTapChangerTablePoint_primitive_builder.values()) {
				BaseClass bc = PhaseTapChangerTablePoint_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChangerTablePoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PhaseTapChangerTablePoint_class_attributes_enum attrEnum: PhaseTapChangerTablePoint_class_attributes_enum.values()) {
				BaseClass bc = PhaseTapChangerTablePoint_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChangerTablePoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PhaseTapChangerTablePoint) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PhaseTapChangerTablePoint";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PhaseTapChangerTablePoint();
        }
};
