package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.AnalogControl;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;



/*
An analog control that issue a set point value.
*/
public class SetPoint extends AnalogControl
{
	private BaseClass[] SetPoint_class_attributes;
	private BaseClass[] SetPoint_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum SetPoint_primitive_builder implements PrimitiveBuilder {
		normalValue(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		value(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum SetPoint_class_attributes_enum {
		normalValue,
		value,
			LAST_ENUM;
	}

		
		
	
	public SetPoint() {
		SetPoint_primitive_attributes = new BaseClass[SetPoint_primitive_builder.values().length];
		SetPoint_class_attributes = new BaseClass[SetPoint_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(SetPoint_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SetPoint_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(SetPoint_primitive_builder attrEnum, BaseClass value) {
		try {
			SetPoint_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SetPoint_class_attributes_enum attrEnum = SetPoint_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated SetPoint, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SetPoint_primitive_builder attrEnum = SetPoint_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated SetPoint, setting " + attrName  + " to: "  + value);
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
			for (SetPoint_primitive_builder attrEnum: SetPoint_primitive_builder.values()) {
				BaseClass bc = SetPoint_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SetPoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SetPoint_class_attributes_enum attrEnum: SetPoint_class_attributes_enum.values()) {
				BaseClass bc = SetPoint_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SetPoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(SetPoint) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "SetPoint";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new SetPoint();
        }
};
