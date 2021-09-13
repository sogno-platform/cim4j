package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.Control;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Integer;


import cim4j.DiscreteValue;
import cim4j.ValueAliasSet;

/*
A Command is a discrete control used for supervisory control.
*/
public class Command extends Control
{
	private BaseClass[] Command_class_attributes;
	private BaseClass[] Command_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Command_primitive_builder implements PrimitiveBuilder {
		normalValue(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
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

	private enum Command_class_attributes_enum {
		normalValue,
		value,
		DiscreteValue,
		ValueAliasSet,
			LAST_ENUM;
	}

		
		
		
		
	
	public Command() {
		Command_primitive_attributes = new BaseClass[Command_primitive_builder.values().length];
		Command_class_attributes = new BaseClass[Command_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Command_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Command_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Command_primitive_builder attrEnum, BaseClass value) {
		try {
			Command_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Command_class_attributes_enum attrEnum = Command_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Command, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Command_primitive_builder attrEnum = Command_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Command, setting " + attrName  + " to: "  + value);
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
			for (Command_primitive_builder attrEnum: Command_primitive_builder.values()) {
				BaseClass bc = Command_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Command." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Command_class_attributes_enum attrEnum: Command_class_attributes_enum.values()) {
				BaseClass bc = Command_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Command." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Command) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Command";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Command();
        }
};
