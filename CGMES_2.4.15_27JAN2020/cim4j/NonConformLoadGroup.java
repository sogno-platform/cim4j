package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.LoadGroup;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.NonConformLoad;
import cim4j.NonConformLoadSchedule;

/*
Loads that do not follow a daily and seasonal load variation pattern.
*/
public class NonConformLoadGroup extends LoadGroup
{
	private BaseClass[] NonConformLoadGroup_class_attributes;
	private BaseClass[] NonConformLoadGroup_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum NonConformLoadGroup_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum NonConformLoadGroup_class_attributes_enum {
		EnergyConsumers,
		NonConformLoadSchedules,
			LAST_ENUM;
	}

		
		
	
	public NonConformLoadGroup() {
		NonConformLoadGroup_primitive_attributes = new BaseClass[NonConformLoadGroup_primitive_builder.values().length];
		NonConformLoadGroup_class_attributes = new BaseClass[NonConformLoadGroup_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(NonConformLoadGroup_class_attributes_enum attrEnum, BaseClass value) {
		try {
			NonConformLoadGroup_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(NonConformLoadGroup_primitive_builder attrEnum, BaseClass value) {
		try {
			NonConformLoadGroup_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			NonConformLoadGroup_class_attributes_enum attrEnum = NonConformLoadGroup_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated NonConformLoadGroup, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			NonConformLoadGroup_primitive_builder attrEnum = NonConformLoadGroup_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated NonConformLoadGroup, setting " + attrName  + " to: "  + value);
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
			for (NonConformLoadGroup_primitive_builder attrEnum: NonConformLoadGroup_primitive_builder.values()) {
				BaseClass bc = NonConformLoadGroup_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    NonConformLoadGroup." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (NonConformLoadGroup_class_attributes_enum attrEnum: NonConformLoadGroup_class_attributes_enum.values()) {
				BaseClass bc = NonConformLoadGroup_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    NonConformLoadGroup." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(NonConformLoadGroup) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "NonConformLoadGroup";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new NonConformLoadGroup();
        }
};
