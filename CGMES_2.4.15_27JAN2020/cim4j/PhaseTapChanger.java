package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TapChanger;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.TransformerEnd;

/*
A transformer phase shifting tap model that controls the phase angle difference across the power transformer and potentially the active power flow through the power transformer.  This phase tap model may also impact the voltage magnitude.
*/
public class PhaseTapChanger extends TapChanger
{
	private BaseClass[] PhaseTapChanger_class_attributes;
	private BaseClass[] PhaseTapChanger_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PhaseTapChanger_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum PhaseTapChanger_class_attributes_enum {
		TransformerEnd,
			LAST_ENUM;
	}

		
	
	public PhaseTapChanger() {
		PhaseTapChanger_primitive_attributes = new BaseClass[PhaseTapChanger_primitive_builder.values().length];
		PhaseTapChanger_class_attributes = new BaseClass[PhaseTapChanger_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PhaseTapChanger_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PhaseTapChanger_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PhaseTapChanger_primitive_builder attrEnum, BaseClass value) {
		try {
			PhaseTapChanger_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PhaseTapChanger_class_attributes_enum attrEnum = PhaseTapChanger_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PhaseTapChanger, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PhaseTapChanger_primitive_builder attrEnum = PhaseTapChanger_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PhaseTapChanger, setting " + attrName  + " to: "  + value);
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
			for (PhaseTapChanger_primitive_builder attrEnum: PhaseTapChanger_primitive_builder.values()) {
				BaseClass bc = PhaseTapChanger_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChanger." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PhaseTapChanger_class_attributes_enum attrEnum: PhaseTapChanger_class_attributes_enum.values()) {
				BaseClass bc = PhaseTapChanger_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChanger." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PhaseTapChanger) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PhaseTapChanger";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PhaseTapChanger();
        }
};
