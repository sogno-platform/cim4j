package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.EnergyConsumer;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.NonConformLoadGroup;

/*
NonConformLoad represent loads that do not follow a daily load change pattern and changes are not correlated with the daily load change pattern.
*/
public class NonConformLoad extends EnergyConsumer
{
	private BaseClass[] NonConformLoad_class_attributes;
	private BaseClass[] NonConformLoad_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum NonConformLoad_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum NonConformLoad_class_attributes_enum {
		LoadGroup,
			LAST_ENUM;
	}

		
	
	public NonConformLoad() {
		NonConformLoad_primitive_attributes = new BaseClass[NonConformLoad_primitive_builder.values().length];
		NonConformLoad_class_attributes = new BaseClass[NonConformLoad_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(NonConformLoad_class_attributes_enum attrEnum, BaseClass value) {
		try {
			NonConformLoad_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(NonConformLoad_primitive_builder attrEnum, BaseClass value) {
		try {
			NonConformLoad_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			NonConformLoad_class_attributes_enum attrEnum = NonConformLoad_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated NonConformLoad, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			NonConformLoad_primitive_builder attrEnum = NonConformLoad_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated NonConformLoad, setting " + attrName  + " to: "  + value);
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
			for (NonConformLoad_primitive_builder attrEnum: NonConformLoad_primitive_builder.values()) {
				BaseClass bc = NonConformLoad_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    NonConformLoad." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (NonConformLoad_class_attributes_enum attrEnum: NonConformLoad_class_attributes_enum.values()) {
				BaseClass bc = NonConformLoad_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    NonConformLoad." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(NonConformLoad) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "NonConformLoad";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new NonConformLoad();
        }
};
