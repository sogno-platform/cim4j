package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.EnergyArea;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.LoadArea;
import cim4j.LoadGroup;

/*
The class is the second level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling.
*/
public class SubLoadArea extends EnergyArea
{
	private BaseClass[] SubLoadArea_class_attributes;
	private BaseClass[] SubLoadArea_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum SubLoadArea_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum SubLoadArea_class_attributes_enum {
		LoadArea,
		LoadGroups,
			LAST_ENUM;
	}

		
		
	
	public SubLoadArea() {
		SubLoadArea_primitive_attributes = new BaseClass[SubLoadArea_primitive_builder.values().length];
		SubLoadArea_class_attributes = new BaseClass[SubLoadArea_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(SubLoadArea_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SubLoadArea_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(SubLoadArea_primitive_builder attrEnum, BaseClass value) {
		try {
			SubLoadArea_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SubLoadArea_class_attributes_enum attrEnum = SubLoadArea_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated SubLoadArea, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SubLoadArea_primitive_builder attrEnum = SubLoadArea_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated SubLoadArea, setting " + attrName  + " to: "  + value);
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
			for (SubLoadArea_primitive_builder attrEnum: SubLoadArea_primitive_builder.values()) {
				BaseClass bc = SubLoadArea_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SubLoadArea." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SubLoadArea_class_attributes_enum attrEnum: SubLoadArea_class_attributes_enum.values()) {
				BaseClass bc = SubLoadArea_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SubLoadArea." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(SubLoadArea) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "SubLoadArea";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new SubLoadArea();
        }
};
