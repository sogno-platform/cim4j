package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.SeasonDayTypeSchedule;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.NonConformLoadGroup;

/*
An active power (Y1-axis) and reactive power (Y2-axis) schedule (curves) versus time (X-axis) for non-conforming loads, e.g., large industrial load or power station service (where modeled).
*/
public class NonConformLoadSchedule extends SeasonDayTypeSchedule
{
	private BaseClass[] NonConformLoadSchedule_class_attributes;
	private BaseClass[] NonConformLoadSchedule_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum NonConformLoadSchedule_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum NonConformLoadSchedule_class_attributes_enum {
		NonConformLoadGroup,
			LAST_ENUM;
	}

		
	
	public NonConformLoadSchedule() {
		NonConformLoadSchedule_primitive_attributes = new BaseClass[NonConformLoadSchedule_primitive_builder.values().length];
		NonConformLoadSchedule_class_attributes = new BaseClass[NonConformLoadSchedule_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(NonConformLoadSchedule_class_attributes_enum attrEnum, BaseClass value) {
		try {
			NonConformLoadSchedule_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(NonConformLoadSchedule_primitive_builder attrEnum, BaseClass value) {
		try {
			NonConformLoadSchedule_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			NonConformLoadSchedule_class_attributes_enum attrEnum = NonConformLoadSchedule_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated NonConformLoadSchedule, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			NonConformLoadSchedule_primitive_builder attrEnum = NonConformLoadSchedule_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated NonConformLoadSchedule, setting " + attrName  + " to: "  + value);
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
			for (NonConformLoadSchedule_primitive_builder attrEnum: NonConformLoadSchedule_primitive_builder.values()) {
				BaseClass bc = NonConformLoadSchedule_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    NonConformLoadSchedule." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (NonConformLoadSchedule_class_attributes_enum attrEnum: NonConformLoadSchedule_class_attributes_enum.values()) {
				BaseClass bc = NonConformLoadSchedule_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    NonConformLoadSchedule." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(NonConformLoadSchedule) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "NonConformLoadSchedule";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new NonConformLoadSchedule();
        }
};
