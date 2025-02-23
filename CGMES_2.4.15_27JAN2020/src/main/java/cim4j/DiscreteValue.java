package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.MeasurementValue;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Integer;


import cim4j.Command;
import cim4j.Discrete;

/*
DiscreteValue represents a discrete MeasurementValue.
*/
public class DiscreteValue extends MeasurementValue
{
	private BaseClass[] DiscreteValue_class_attributes;
	private BaseClass[] DiscreteValue_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum DiscreteValue_primitive_builder implements PrimitiveBuilder {
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

	private enum DiscreteValue_class_attributes_enum {
		Command,
		Discrete,
		value,
			LAST_ENUM;
	}

		
		
		
	
	public DiscreteValue() {
		DiscreteValue_primitive_attributes = new BaseClass[DiscreteValue_primitive_builder.values().length];
		DiscreteValue_class_attributes = new BaseClass[DiscreteValue_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DiscreteValue_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DiscreteValue_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DiscreteValue_primitive_builder attrEnum, BaseClass value) {
		try {
			DiscreteValue_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DiscreteValue_class_attributes_enum attrEnum = DiscreteValue_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DiscreteValue, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DiscreteValue_primitive_builder attrEnum = DiscreteValue_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated DiscreteValue, setting " + attrName  + " to: "  + value);
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
			for (DiscreteValue_primitive_builder attrEnum: DiscreteValue_primitive_builder.values()) {
				BaseClass bc = DiscreteValue_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiscreteValue." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DiscreteValue_class_attributes_enum attrEnum: DiscreteValue_class_attributes_enum.values()) {
				BaseClass bc = DiscreteValue_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiscreteValue." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DiscreteValue) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "DiscreteValue";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DiscreteValue();
        }
};
