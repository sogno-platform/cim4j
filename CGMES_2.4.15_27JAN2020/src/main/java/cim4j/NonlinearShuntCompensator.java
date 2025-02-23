package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ShuntCompensator;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.NonlinearShuntCompensatorPoint;

/*
A non linear shunt compensator has bank or section admittance values that differs.
*/
public class NonlinearShuntCompensator extends ShuntCompensator
{
	private BaseClass[] NonlinearShuntCompensator_class_attributes;
	private BaseClass[] NonlinearShuntCompensator_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum NonlinearShuntCompensator_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum NonlinearShuntCompensator_class_attributes_enum {
		NonlinearShuntCompensatorPoints,
			LAST_ENUM;
	}

		
	
	public NonlinearShuntCompensator() {
		NonlinearShuntCompensator_primitive_attributes = new BaseClass[NonlinearShuntCompensator_primitive_builder.values().length];
		NonlinearShuntCompensator_class_attributes = new BaseClass[NonlinearShuntCompensator_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(NonlinearShuntCompensator_class_attributes_enum attrEnum, BaseClass value) {
		try {
			NonlinearShuntCompensator_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(NonlinearShuntCompensator_primitive_builder attrEnum, BaseClass value) {
		try {
			NonlinearShuntCompensator_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			NonlinearShuntCompensator_class_attributes_enum attrEnum = NonlinearShuntCompensator_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated NonlinearShuntCompensator, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			NonlinearShuntCompensator_primitive_builder attrEnum = NonlinearShuntCompensator_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated NonlinearShuntCompensator, setting " + attrName  + " to: "  + value);
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
			for (NonlinearShuntCompensator_primitive_builder attrEnum: NonlinearShuntCompensator_primitive_builder.values()) {
				BaseClass bc = NonlinearShuntCompensator_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    NonlinearShuntCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (NonlinearShuntCompensator_class_attributes_enum attrEnum: NonlinearShuntCompensator_class_attributes_enum.values()) {
				BaseClass bc = NonlinearShuntCompensator_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    NonlinearShuntCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(NonlinearShuntCompensator) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "NonlinearShuntCompensator";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new NonlinearShuntCompensator();
        }
};
