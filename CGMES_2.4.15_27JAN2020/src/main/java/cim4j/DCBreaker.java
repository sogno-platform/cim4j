package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DCSwitch;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;





/*
A breaker within a DC system.
*/
public class DCBreaker extends DCSwitch
{
	private BaseClass[] DCBreaker_class_attributes;
	private BaseClass[] DCBreaker_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum DCBreaker_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum DCBreaker_class_attributes_enum {
			LAST_ENUM;
	}

	
	public DCBreaker() {
		DCBreaker_primitive_attributes = new BaseClass[DCBreaker_primitive_builder.values().length];
		DCBreaker_class_attributes = new BaseClass[DCBreaker_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DCBreaker_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DCBreaker_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DCBreaker_primitive_builder attrEnum, BaseClass value) {
		try {
			DCBreaker_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DCBreaker_class_attributes_enum attrEnum = DCBreaker_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DCBreaker, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DCBreaker_primitive_builder attrEnum = DCBreaker_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated DCBreaker, setting " + attrName  + " to: "  + value);
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
			for (DCBreaker_primitive_builder attrEnum: DCBreaker_primitive_builder.values()) {
				BaseClass bc = DCBreaker_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCBreaker." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DCBreaker_class_attributes_enum attrEnum: DCBreaker_class_attributes_enum.values()) {
				BaseClass bc = DCBreaker_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCBreaker." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DCBreaker) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "DCBreaker";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DCBreaker();
        }
};
