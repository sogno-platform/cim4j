package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DCConductingEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;





/*
A busbar within a DC system.
*/
public class DCBusbar extends DCConductingEquipment
{
	private BaseClass[] DCBusbar_class_attributes;
	private BaseClass[] DCBusbar_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum DCBusbar_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum DCBusbar_class_attributes_enum {
			LAST_ENUM;
	}

	
	public DCBusbar() {
		DCBusbar_primitive_attributes = new BaseClass[DCBusbar_primitive_builder.values().length];
		DCBusbar_class_attributes = new BaseClass[DCBusbar_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DCBusbar_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DCBusbar_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DCBusbar_primitive_builder attrEnum, BaseClass value) {
		try {
			DCBusbar_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DCBusbar_class_attributes_enum attrEnum = DCBusbar_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DCBusbar, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DCBusbar_primitive_builder attrEnum = DCBusbar_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated DCBusbar, setting " + attrName  + " to: "  + value);
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
			for (DCBusbar_primitive_builder attrEnum: DCBusbar_primitive_builder.values()) {
				BaseClass bc = DCBusbar_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCBusbar." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DCBusbar_class_attributes_enum attrEnum: DCBusbar_class_attributes_enum.values()) {
				BaseClass bc = DCBusbar_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCBusbar." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DCBusbar) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "DCBusbar";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DCBusbar();
        }
};
