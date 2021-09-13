package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.EnergyArea;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.SubLoadArea;

/*
The class is the root or first level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling.
*/
public class LoadArea extends EnergyArea
{
	private BaseClass[] LoadArea_class_attributes;
	private BaseClass[] LoadArea_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum LoadArea_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum LoadArea_class_attributes_enum {
		SubLoadAreas,
			LAST_ENUM;
	}

		
	
	public LoadArea() {
		LoadArea_primitive_attributes = new BaseClass[LoadArea_primitive_builder.values().length];
		LoadArea_class_attributes = new BaseClass[LoadArea_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(LoadArea_class_attributes_enum attrEnum, BaseClass value) {
		try {
			LoadArea_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(LoadArea_primitive_builder attrEnum, BaseClass value) {
		try {
			LoadArea_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			LoadArea_class_attributes_enum attrEnum = LoadArea_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated LoadArea, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			LoadArea_primitive_builder attrEnum = LoadArea_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated LoadArea, setting " + attrName  + " to: "  + value);
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
			for (LoadArea_primitive_builder attrEnum: LoadArea_primitive_builder.values()) {
				BaseClass bc = LoadArea_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LoadArea." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (LoadArea_class_attributes_enum attrEnum: LoadArea_class_attributes_enum.values()) {
				BaseClass bc = LoadArea_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LoadArea." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(LoadArea) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "LoadArea";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new LoadArea();
        }
};
