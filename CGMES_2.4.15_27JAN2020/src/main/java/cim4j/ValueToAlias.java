package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Integer;


import cim4j.ValueAliasSet;

/*
Describes the translation of one particular value into a name, e.g. 1 as "Open".
*/
public class ValueToAlias extends IdentifiedObject
{
	private BaseClass[] ValueToAlias_class_attributes;
	private BaseClass[] ValueToAlias_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ValueToAlias_primitive_builder implements PrimitiveBuilder {
		value(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ValueToAlias_class_attributes_enum {
		ValueAliasSet,
		value,
			LAST_ENUM;
	}

		
		
	
	public ValueToAlias() {
		ValueToAlias_primitive_attributes = new BaseClass[ValueToAlias_primitive_builder.values().length];
		ValueToAlias_class_attributes = new BaseClass[ValueToAlias_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ValueToAlias_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ValueToAlias_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ValueToAlias_primitive_builder attrEnum, BaseClass value) {
		try {
			ValueToAlias_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ValueToAlias_class_attributes_enum attrEnum = ValueToAlias_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ValueToAlias, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ValueToAlias_primitive_builder attrEnum = ValueToAlias_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ValueToAlias, setting " + attrName  + " to: "  + value);
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
			for (ValueToAlias_primitive_builder attrEnum: ValueToAlias_primitive_builder.values()) {
				BaseClass bc = ValueToAlias_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ValueToAlias." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ValueToAlias_class_attributes_enum attrEnum: ValueToAlias_class_attributes_enum.values()) {
				BaseClass bc = ValueToAlias_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ValueToAlias." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ValueToAlias) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ValueToAlias";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ValueToAlias();
        }
};
