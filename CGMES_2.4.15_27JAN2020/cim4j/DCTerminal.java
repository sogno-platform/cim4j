package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DCBaseTerminal;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.DCConductingEquipment;

/*
An electrical connection point to generic DC conducting equipment.
*/
public class DCTerminal extends DCBaseTerminal
{
	private BaseClass[] DCTerminal_class_attributes;
	private BaseClass[] DCTerminal_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum DCTerminal_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum DCTerminal_class_attributes_enum {
		DCConductingEquipment,
			LAST_ENUM;
	}

		
	
	public DCTerminal() {
		DCTerminal_primitive_attributes = new BaseClass[DCTerminal_primitive_builder.values().length];
		DCTerminal_class_attributes = new BaseClass[DCTerminal_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DCTerminal_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DCTerminal_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DCTerminal_primitive_builder attrEnum, BaseClass value) {
		try {
			DCTerminal_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DCTerminal_class_attributes_enum attrEnum = DCTerminal_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DCTerminal, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DCTerminal_primitive_builder attrEnum = DCTerminal_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated DCTerminal, setting " + attrName  + " to: "  + value);
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
			for (DCTerminal_primitive_builder attrEnum: DCTerminal_primitive_builder.values()) {
				BaseClass bc = DCTerminal_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCTerminal." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DCTerminal_class_attributes_enum attrEnum: DCTerminal_class_attributes_enum.values()) {
				BaseClass bc = DCTerminal_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCTerminal." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DCTerminal) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "DCTerminal";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DCTerminal();
        }
};
