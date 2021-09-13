package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PhaseTapChanger;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.PhaseTapChangerTable;

/*

*/
public class PhaseTapChangerTabular extends PhaseTapChanger
{
	private BaseClass[] PhaseTapChangerTabular_class_attributes;
	private BaseClass[] PhaseTapChangerTabular_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PhaseTapChangerTabular_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum PhaseTapChangerTabular_class_attributes_enum {
		PhaseTapChangerTable,
			LAST_ENUM;
	}

		
	
	public PhaseTapChangerTabular() {
		PhaseTapChangerTabular_primitive_attributes = new BaseClass[PhaseTapChangerTabular_primitive_builder.values().length];
		PhaseTapChangerTabular_class_attributes = new BaseClass[PhaseTapChangerTabular_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PhaseTapChangerTabular_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PhaseTapChangerTabular_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PhaseTapChangerTabular_primitive_builder attrEnum, BaseClass value) {
		try {
			PhaseTapChangerTabular_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PhaseTapChangerTabular_class_attributes_enum attrEnum = PhaseTapChangerTabular_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PhaseTapChangerTabular, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PhaseTapChangerTabular_primitive_builder attrEnum = PhaseTapChangerTabular_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PhaseTapChangerTabular, setting " + attrName  + " to: "  + value);
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
			for (PhaseTapChangerTabular_primitive_builder attrEnum: PhaseTapChangerTabular_primitive_builder.values()) {
				BaseClass bc = PhaseTapChangerTabular_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChangerTabular." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PhaseTapChangerTabular_class_attributes_enum attrEnum: PhaseTapChangerTabular_class_attributes_enum.values()) {
				BaseClass bc = PhaseTapChangerTabular_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChangerTabular." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PhaseTapChangerTabular) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PhaseTapChangerTabular";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PhaseTapChangerTabular();
        }
};
