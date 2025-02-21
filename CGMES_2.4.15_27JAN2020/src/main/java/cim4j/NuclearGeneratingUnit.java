package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.GeneratingUnit;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;





/*
A nuclear generating unit.
*/
public class NuclearGeneratingUnit extends GeneratingUnit
{
	private BaseClass[] NuclearGeneratingUnit_class_attributes;
	private BaseClass[] NuclearGeneratingUnit_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum NuclearGeneratingUnit_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum NuclearGeneratingUnit_class_attributes_enum {
			LAST_ENUM;
	}

	
	public NuclearGeneratingUnit() {
		NuclearGeneratingUnit_primitive_attributes = new BaseClass[NuclearGeneratingUnit_primitive_builder.values().length];
		NuclearGeneratingUnit_class_attributes = new BaseClass[NuclearGeneratingUnit_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(NuclearGeneratingUnit_class_attributes_enum attrEnum, BaseClass value) {
		try {
			NuclearGeneratingUnit_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(NuclearGeneratingUnit_primitive_builder attrEnum, BaseClass value) {
		try {
			NuclearGeneratingUnit_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			NuclearGeneratingUnit_class_attributes_enum attrEnum = NuclearGeneratingUnit_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated NuclearGeneratingUnit, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			NuclearGeneratingUnit_primitive_builder attrEnum = NuclearGeneratingUnit_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated NuclearGeneratingUnit, setting " + attrName  + " to: "  + value);
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
			for (NuclearGeneratingUnit_primitive_builder attrEnum: NuclearGeneratingUnit_primitive_builder.values()) {
				BaseClass bc = NuclearGeneratingUnit_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    NuclearGeneratingUnit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (NuclearGeneratingUnit_class_attributes_enum attrEnum: NuclearGeneratingUnit_class_attributes_enum.values()) {
				BaseClass bc = NuclearGeneratingUnit_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    NuclearGeneratingUnit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(NuclearGeneratingUnit) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "NuclearGeneratingUnit";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new NuclearGeneratingUnit();
        }
};
