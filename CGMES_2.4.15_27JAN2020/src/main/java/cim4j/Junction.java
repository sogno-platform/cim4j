package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.Connector;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;





/*
A point where one or more conducting equipments are connected with zero resistance.
*/
public class Junction extends Connector
{
	private BaseClass[] Junction_class_attributes;
	private BaseClass[] Junction_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Junction_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum Junction_class_attributes_enum {
			LAST_ENUM;
	}

	
	public Junction() {
		Junction_primitive_attributes = new BaseClass[Junction_primitive_builder.values().length];
		Junction_class_attributes = new BaseClass[Junction_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Junction_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Junction_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Junction_primitive_builder attrEnum, BaseClass value) {
		try {
			Junction_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Junction_class_attributes_enum attrEnum = Junction_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Junction, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Junction_primitive_builder attrEnum = Junction_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Junction, setting " + attrName  + " to: "  + value);
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
			for (Junction_primitive_builder attrEnum: Junction_primitive_builder.values()) {
				BaseClass bc = Junction_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Junction." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Junction_class_attributes_enum attrEnum: Junction_class_attributes_enum.values()) {
				BaseClass bc = Junction_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Junction." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Junction) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Junction";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Junction();
        }
};
