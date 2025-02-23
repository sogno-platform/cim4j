package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ProtectedSwitch;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;





/*
A mechanical switching device capable of making, carrying, and breaking currents under normal operating conditions.
*/
public class LoadBreakSwitch extends ProtectedSwitch
{
	private BaseClass[] LoadBreakSwitch_class_attributes;
	private BaseClass[] LoadBreakSwitch_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum LoadBreakSwitch_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum LoadBreakSwitch_class_attributes_enum {
			LAST_ENUM;
	}

	
	public LoadBreakSwitch() {
		LoadBreakSwitch_primitive_attributes = new BaseClass[LoadBreakSwitch_primitive_builder.values().length];
		LoadBreakSwitch_class_attributes = new BaseClass[LoadBreakSwitch_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(LoadBreakSwitch_class_attributes_enum attrEnum, BaseClass value) {
		try {
			LoadBreakSwitch_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(LoadBreakSwitch_primitive_builder attrEnum, BaseClass value) {
		try {
			LoadBreakSwitch_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			LoadBreakSwitch_class_attributes_enum attrEnum = LoadBreakSwitch_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated LoadBreakSwitch, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			LoadBreakSwitch_primitive_builder attrEnum = LoadBreakSwitch_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated LoadBreakSwitch, setting " + attrName  + " to: "  + value);
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
			for (LoadBreakSwitch_primitive_builder attrEnum: LoadBreakSwitch_primitive_builder.values()) {
				BaseClass bc = LoadBreakSwitch_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LoadBreakSwitch." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (LoadBreakSwitch_class_attributes_enum attrEnum: LoadBreakSwitch_class_attributes_enum.values()) {
				BaseClass bc = LoadBreakSwitch_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LoadBreakSwitch." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(LoadBreakSwitch) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "LoadBreakSwitch";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new LoadBreakSwitch();
        }
};
