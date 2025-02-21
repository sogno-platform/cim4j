package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;





/*
Decimal is the base-10 notational system for representing real numbers.
*/
public class Decimal extends BaseClass
{
	private BaseClass[] Decimal_class_attributes;
	private BaseClass[] Decimal_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Decimal_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum Decimal_class_attributes_enum {
			LAST_ENUM;
	}

	
	public Decimal() {
		Decimal_primitive_attributes = new BaseClass[Decimal_primitive_builder.values().length];
		Decimal_class_attributes = new BaseClass[Decimal_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Decimal_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Decimal_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Decimal_primitive_builder attrEnum, BaseClass value) {
		try {
			Decimal_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Decimal_class_attributes_enum attrEnum = Decimal_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Decimal, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Decimal_primitive_builder attrEnum = Decimal_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Decimal, setting " + attrName  + " to: "  + value);
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
			for (Decimal_primitive_builder attrEnum: Decimal_primitive_builder.values()) {
				BaseClass bc = Decimal_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Decimal." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Decimal_class_attributes_enum attrEnum: Decimal_class_attributes_enum.values()) {
				BaseClass bc = Decimal_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Decimal." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Decimal) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Decimal";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Decimal();
        }
};
