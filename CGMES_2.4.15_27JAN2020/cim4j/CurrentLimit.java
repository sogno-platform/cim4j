package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.OperationalLimit;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.CurrentFlow;



/*
Operational limit on current.
*/
public class CurrentLimit extends OperationalLimit
{
	private BaseClass[] CurrentLimit_class_attributes;
	private BaseClass[] CurrentLimit_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum CurrentLimit_primitive_builder implements PrimitiveBuilder {
		value(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum CurrentLimit_class_attributes_enum {
		value,
			LAST_ENUM;
	}

		
	
	public CurrentLimit() {
		CurrentLimit_primitive_attributes = new BaseClass[CurrentLimit_primitive_builder.values().length];
		CurrentLimit_class_attributes = new BaseClass[CurrentLimit_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(CurrentLimit_class_attributes_enum attrEnum, BaseClass value) {
		try {
			CurrentLimit_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(CurrentLimit_primitive_builder attrEnum, BaseClass value) {
		try {
			CurrentLimit_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			CurrentLimit_class_attributes_enum attrEnum = CurrentLimit_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated CurrentLimit, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			CurrentLimit_primitive_builder attrEnum = CurrentLimit_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated CurrentLimit, setting " + attrName  + " to: "  + value);
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
			for (CurrentLimit_primitive_builder attrEnum: CurrentLimit_primitive_builder.values()) {
				BaseClass bc = CurrentLimit_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    CurrentLimit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (CurrentLimit_class_attributes_enum attrEnum: CurrentLimit_class_attributes_enum.values()) {
				BaseClass bc = CurrentLimit_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    CurrentLimit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(CurrentLimit) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "CurrentLimit";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new CurrentLimit();
        }
};
