package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DCConductingEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;





/*
Low resistance equipment used in the internal DC circuit to balance voltages. It has typically positive and negative pole terminals and a ground.
*/
public class DCChopper extends DCConductingEquipment
{
	private BaseClass[] DCChopper_class_attributes;
	private BaseClass[] DCChopper_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum DCChopper_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum DCChopper_class_attributes_enum {
			LAST_ENUM;
	}

	
	public DCChopper() {
		DCChopper_primitive_attributes = new BaseClass[DCChopper_primitive_builder.values().length];
		DCChopper_class_attributes = new BaseClass[DCChopper_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DCChopper_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DCChopper_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DCChopper_primitive_builder attrEnum, BaseClass value) {
		try {
			DCChopper_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DCChopper_class_attributes_enum attrEnum = DCChopper_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DCChopper, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DCChopper_primitive_builder attrEnum = DCChopper_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated DCChopper, setting " + attrName  + " to: "  + value);
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
			for (DCChopper_primitive_builder attrEnum: DCChopper_primitive_builder.values()) {
				BaseClass bc = DCChopper_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCChopper." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DCChopper_class_attributes_enum attrEnum: DCChopper_class_attributes_enum.values()) {
				BaseClass bc = DCChopper_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCChopper." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DCChopper) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "DCChopper";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DCChopper();
        }
};
