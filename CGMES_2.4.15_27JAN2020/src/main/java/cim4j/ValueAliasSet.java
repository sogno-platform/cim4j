package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.Command;
import cim4j.Discrete;
import cim4j.RaiseLowerCommand;
import cim4j.ValueToAlias;

/*
Describes the translation of a set of values into a name and is intendend to facilitate cusom translations. Each ValueAliasSet has a name, description etc. A specific Measurement may represent a discrete state like Open, Closed, Intermediate etc. This requires a translation from the MeasurementValue.value number to a string, e.g. 0->"Invalid", 1->"Open", 2->"Closed", 3->"Intermediate". Each ValueToAlias member in ValueAliasSet.Value describe a mapping for one particular value to a name.
*/
public class ValueAliasSet extends IdentifiedObject
{
	private BaseClass[] ValueAliasSet_class_attributes;
	private BaseClass[] ValueAliasSet_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ValueAliasSet_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ValueAliasSet_class_attributes_enum {
		Commands,
		Discretes,
		RaiseLowerCommands,
		Values,
			LAST_ENUM;
	}

		
		
		
		
	
	public ValueAliasSet() {
		ValueAliasSet_primitive_attributes = new BaseClass[ValueAliasSet_primitive_builder.values().length];
		ValueAliasSet_class_attributes = new BaseClass[ValueAliasSet_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ValueAliasSet_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ValueAliasSet_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ValueAliasSet_primitive_builder attrEnum, BaseClass value) {
		try {
			ValueAliasSet_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ValueAliasSet_class_attributes_enum attrEnum = ValueAliasSet_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ValueAliasSet, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ValueAliasSet_primitive_builder attrEnum = ValueAliasSet_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ValueAliasSet, setting " + attrName  + " to: "  + value);
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
			for (ValueAliasSet_primitive_builder attrEnum: ValueAliasSet_primitive_builder.values()) {
				BaseClass bc = ValueAliasSet_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ValueAliasSet." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ValueAliasSet_class_attributes_enum attrEnum: ValueAliasSet_class_attributes_enum.values()) {
				BaseClass bc = ValueAliasSet_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ValueAliasSet." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ValueAliasSet) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ValueAliasSet";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ValueAliasSet();
        }
};
