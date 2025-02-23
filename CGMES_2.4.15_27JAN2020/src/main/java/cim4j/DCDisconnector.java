package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DCSwitch;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;





/*
A disconnector within a DC system.
*/
public class DCDisconnector extends DCSwitch
{
	private BaseClass[] DCDisconnector_class_attributes;
	private BaseClass[] DCDisconnector_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum DCDisconnector_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum DCDisconnector_class_attributes_enum {
			LAST_ENUM;
	}

	
	public DCDisconnector() {
		DCDisconnector_primitive_attributes = new BaseClass[DCDisconnector_primitive_builder.values().length];
		DCDisconnector_class_attributes = new BaseClass[DCDisconnector_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DCDisconnector_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DCDisconnector_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DCDisconnector_primitive_builder attrEnum, BaseClass value) {
		try {
			DCDisconnector_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DCDisconnector_class_attributes_enum attrEnum = DCDisconnector_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DCDisconnector, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DCDisconnector_primitive_builder attrEnum = DCDisconnector_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated DCDisconnector, setting " + attrName  + " to: "  + value);
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
			for (DCDisconnector_primitive_builder attrEnum: DCDisconnector_primitive_builder.values()) {
				BaseClass bc = DCDisconnector_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCDisconnector." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DCDisconnector_class_attributes_enum attrEnum: DCDisconnector_class_attributes_enum.values()) {
				BaseClass bc = DCDisconnector_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCDisconnector." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DCDisconnector) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "DCDisconnector";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DCDisconnector();
        }
};
