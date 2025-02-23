package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.OperationalLimitSet;
import cim4j.OperationalLimitType;

/*
A value associated with a specific kind of limit.  The sub class value attribute shall be positive.  The sub class value attribute is inversely proportional to OperationalLimitType.acceptableDuration (acceptableDuration for short). A pair of value_x and acceptableDuration_x are related to each other as follows: if value_1 > value_2 > value_3 >... then acceptableDuration_1 < acceptableDuration_2 < acceptableDuration_3 < ... A value_x with direction="high" shall be greater than a value_y with direction="low".
*/
public class OperationalLimit extends IdentifiedObject
{
	private BaseClass[] OperationalLimit_class_attributes;
	private BaseClass[] OperationalLimit_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum OperationalLimit_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum OperationalLimit_class_attributes_enum {
		OperationalLimitSet,
		OperationalLimitType,
			LAST_ENUM;
	}

		
		
	
	public OperationalLimit() {
		OperationalLimit_primitive_attributes = new BaseClass[OperationalLimit_primitive_builder.values().length];
		OperationalLimit_class_attributes = new BaseClass[OperationalLimit_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(OperationalLimit_class_attributes_enum attrEnum, BaseClass value) {
		try {
			OperationalLimit_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(OperationalLimit_primitive_builder attrEnum, BaseClass value) {
		try {
			OperationalLimit_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			OperationalLimit_class_attributes_enum attrEnum = OperationalLimit_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated OperationalLimit, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			OperationalLimit_primitive_builder attrEnum = OperationalLimit_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated OperationalLimit, setting " + attrName  + " to: "  + value);
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
			for (OperationalLimit_primitive_builder attrEnum: OperationalLimit_primitive_builder.values()) {
				BaseClass bc = OperationalLimit_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    OperationalLimit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (OperationalLimit_class_attributes_enum attrEnum: OperationalLimit_class_attributes_enum.values()) {
				BaseClass bc = OperationalLimit_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    OperationalLimit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(OperationalLimit) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "OperationalLimit";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new OperationalLimit();
        }
};
