package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.OperationalLimit;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ActivePower;



/*
Limit on active power flow.
*/
public class ActivePowerLimit extends OperationalLimit
{
	private BaseClass[] ActivePowerLimit_class_attributes;
	private BaseClass[] ActivePowerLimit_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ActivePowerLimit_primitive_builder implements PrimitiveBuilder {
		value(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ActivePowerLimit_class_attributes_enum {
		value,
			LAST_ENUM;
	}

		
	
	public ActivePowerLimit() {
		ActivePowerLimit_primitive_attributes = new BaseClass[ActivePowerLimit_primitive_builder.values().length];
		ActivePowerLimit_class_attributes = new BaseClass[ActivePowerLimit_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ActivePowerLimit_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ActivePowerLimit_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ActivePowerLimit_primitive_builder attrEnum, BaseClass value) {
		try {
			ActivePowerLimit_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ActivePowerLimit_class_attributes_enum attrEnum = ActivePowerLimit_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ActivePowerLimit, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ActivePowerLimit_primitive_builder attrEnum = ActivePowerLimit_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ActivePowerLimit, setting " + attrName  + " to: "  + value);
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
			for (ActivePowerLimit_primitive_builder attrEnum: ActivePowerLimit_primitive_builder.values()) {
				BaseClass bc = ActivePowerLimit_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ActivePowerLimit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ActivePowerLimit_class_attributes_enum attrEnum: ActivePowerLimit_class_attributes_enum.values()) {
				BaseClass bc = ActivePowerLimit_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ActivePowerLimit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ActivePowerLimit) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ActivePowerLimit";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ActivePowerLimit();
        }
};
