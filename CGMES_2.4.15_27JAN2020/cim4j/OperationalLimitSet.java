package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.ACDCTerminal;
import cim4j.Equipment;
import cim4j.OperationalLimit;

/*
A set of limits associated with equipment.  Sets of limits might apply to a specific temperature, or season for example. A set of limits may contain different severities of limit levels that would apply to the same equipment. The set may contain limits of different types such as apparent power and current limits or high and low voltage limits  that are logically applied together as a set.
*/
public class OperationalLimitSet extends IdentifiedObject
{
	private BaseClass[] OperationalLimitSet_class_attributes;
	private BaseClass[] OperationalLimitSet_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum OperationalLimitSet_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum OperationalLimitSet_class_attributes_enum {
		Terminal,
		Equipment,
		OperationalLimitValue,
			LAST_ENUM;
	}

		
		
		
	
	public OperationalLimitSet() {
		OperationalLimitSet_primitive_attributes = new BaseClass[OperationalLimitSet_primitive_builder.values().length];
		OperationalLimitSet_class_attributes = new BaseClass[OperationalLimitSet_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(OperationalLimitSet_class_attributes_enum attrEnum, BaseClass value) {
		try {
			OperationalLimitSet_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(OperationalLimitSet_primitive_builder attrEnum, BaseClass value) {
		try {
			OperationalLimitSet_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			OperationalLimitSet_class_attributes_enum attrEnum = OperationalLimitSet_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated OperationalLimitSet, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			OperationalLimitSet_primitive_builder attrEnum = OperationalLimitSet_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated OperationalLimitSet, setting " + attrName  + " to: "  + value);
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
			for (OperationalLimitSet_primitive_builder attrEnum: OperationalLimitSet_primitive_builder.values()) {
				BaseClass bc = OperationalLimitSet_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    OperationalLimitSet." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (OperationalLimitSet_class_attributes_enum attrEnum: OperationalLimitSet_class_attributes_enum.values()) {
				BaseClass bc = OperationalLimitSet_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    OperationalLimitSet." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(OperationalLimitSet) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "OperationalLimitSet";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new OperationalLimitSet();
        }
};
