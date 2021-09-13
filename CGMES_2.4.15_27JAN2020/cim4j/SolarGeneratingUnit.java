package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.GeneratingUnit;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;





/*
A solar thermal generating unit.
*/
public class SolarGeneratingUnit extends GeneratingUnit
{
	private BaseClass[] SolarGeneratingUnit_class_attributes;
	private BaseClass[] SolarGeneratingUnit_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum SolarGeneratingUnit_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum SolarGeneratingUnit_class_attributes_enum {
			LAST_ENUM;
	}

	
	public SolarGeneratingUnit() {
		SolarGeneratingUnit_primitive_attributes = new BaseClass[SolarGeneratingUnit_primitive_builder.values().length];
		SolarGeneratingUnit_class_attributes = new BaseClass[SolarGeneratingUnit_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(SolarGeneratingUnit_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SolarGeneratingUnit_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(SolarGeneratingUnit_primitive_builder attrEnum, BaseClass value) {
		try {
			SolarGeneratingUnit_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SolarGeneratingUnit_class_attributes_enum attrEnum = SolarGeneratingUnit_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated SolarGeneratingUnit, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SolarGeneratingUnit_primitive_builder attrEnum = SolarGeneratingUnit_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated SolarGeneratingUnit, setting " + attrName  + " to: "  + value);
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
			for (SolarGeneratingUnit_primitive_builder attrEnum: SolarGeneratingUnit_primitive_builder.values()) {
				BaseClass bc = SolarGeneratingUnit_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SolarGeneratingUnit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SolarGeneratingUnit_class_attributes_enum attrEnum: SolarGeneratingUnit_class_attributes_enum.values()) {
				BaseClass bc = SolarGeneratingUnit_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SolarGeneratingUnit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(SolarGeneratingUnit) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "SolarGeneratingUnit";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new SolarGeneratingUnit();
        }
};
