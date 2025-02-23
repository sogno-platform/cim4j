package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.AnalogControl;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.ValueAliasSet;

/*
An analog control that increase or decrease a set point value with pulses.
*/
public class RaiseLowerCommand extends AnalogControl
{
	private BaseClass[] RaiseLowerCommand_class_attributes;
	private BaseClass[] RaiseLowerCommand_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum RaiseLowerCommand_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum RaiseLowerCommand_class_attributes_enum {
		ValueAliasSet,
			LAST_ENUM;
	}

		
	
	public RaiseLowerCommand() {
		RaiseLowerCommand_primitive_attributes = new BaseClass[RaiseLowerCommand_primitive_builder.values().length];
		RaiseLowerCommand_class_attributes = new BaseClass[RaiseLowerCommand_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(RaiseLowerCommand_class_attributes_enum attrEnum, BaseClass value) {
		try {
			RaiseLowerCommand_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(RaiseLowerCommand_primitive_builder attrEnum, BaseClass value) {
		try {
			RaiseLowerCommand_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			RaiseLowerCommand_class_attributes_enum attrEnum = RaiseLowerCommand_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated RaiseLowerCommand, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			RaiseLowerCommand_primitive_builder attrEnum = RaiseLowerCommand_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated RaiseLowerCommand, setting " + attrName  + " to: "  + value);
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
			for (RaiseLowerCommand_primitive_builder attrEnum: RaiseLowerCommand_primitive_builder.values()) {
				BaseClass bc = RaiseLowerCommand_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RaiseLowerCommand." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (RaiseLowerCommand_class_attributes_enum attrEnum: RaiseLowerCommand_class_attributes_enum.values()) {
				BaseClass bc = RaiseLowerCommand_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RaiseLowerCommand." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(RaiseLowerCommand) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "RaiseLowerCommand";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new RaiseLowerCommand();
        }
};
