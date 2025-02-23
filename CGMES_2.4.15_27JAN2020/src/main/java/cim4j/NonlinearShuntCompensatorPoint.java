package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Susceptance;
import cim4j.Conductance;
import cim4j.Integer;


import cim4j.NonlinearShuntCompensator;

/*
A non linear shunt compensator bank or section admittance value.
*/
public class NonlinearShuntCompensatorPoint extends BaseClass
{
	private BaseClass[] NonlinearShuntCompensatorPoint_class_attributes;
	private BaseClass[] NonlinearShuntCompensatorPoint_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum NonlinearShuntCompensatorPoint_primitive_builder implements PrimitiveBuilder {
		b(){
			public BaseClass construct (java.lang.String value) {
				return new Susceptance(value);
			}
		},
		g(){
			public BaseClass construct (java.lang.String value) {
				return new Conductance(value);
			}
		},
		sectionNumber(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
		b0(){
			public BaseClass construct (java.lang.String value) {
				return new Susceptance(value);
			}
		},
		g0(){
			public BaseClass construct (java.lang.String value) {
				return new Conductance(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum NonlinearShuntCompensatorPoint_class_attributes_enum {
		NonlinearShuntCompensator,
		b,
		g,
		sectionNumber,
		b0,
		g0,
			LAST_ENUM;
	}

		
		
		
		
		
		
	
	public NonlinearShuntCompensatorPoint() {
		NonlinearShuntCompensatorPoint_primitive_attributes = new BaseClass[NonlinearShuntCompensatorPoint_primitive_builder.values().length];
		NonlinearShuntCompensatorPoint_class_attributes = new BaseClass[NonlinearShuntCompensatorPoint_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(NonlinearShuntCompensatorPoint_class_attributes_enum attrEnum, BaseClass value) {
		try {
			NonlinearShuntCompensatorPoint_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(NonlinearShuntCompensatorPoint_primitive_builder attrEnum, BaseClass value) {
		try {
			NonlinearShuntCompensatorPoint_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			NonlinearShuntCompensatorPoint_class_attributes_enum attrEnum = NonlinearShuntCompensatorPoint_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated NonlinearShuntCompensatorPoint, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			NonlinearShuntCompensatorPoint_primitive_builder attrEnum = NonlinearShuntCompensatorPoint_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated NonlinearShuntCompensatorPoint, setting " + attrName  + " to: "  + value);
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
			for (NonlinearShuntCompensatorPoint_primitive_builder attrEnum: NonlinearShuntCompensatorPoint_primitive_builder.values()) {
				BaseClass bc = NonlinearShuntCompensatorPoint_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    NonlinearShuntCompensatorPoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (NonlinearShuntCompensatorPoint_class_attributes_enum attrEnum: NonlinearShuntCompensatorPoint_class_attributes_enum.values()) {
				BaseClass bc = NonlinearShuntCompensatorPoint_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    NonlinearShuntCompensatorPoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(NonlinearShuntCompensatorPoint) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "NonlinearShuntCompensatorPoint";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new NonlinearShuntCompensatorPoint();
        }
};
