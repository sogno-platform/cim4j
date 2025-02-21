package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.Equipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.HydroPowerPlant;
import cim4j.RotatingMachine;

/*
A synchronous motor-driven pump, typically associated with a pumped storage plant.
*/
public class HydroPump extends Equipment
{
	private BaseClass[] HydroPump_class_attributes;
	private BaseClass[] HydroPump_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum HydroPump_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum HydroPump_class_attributes_enum {
		HydroPowerPlant,
		RotatingMachine,
			LAST_ENUM;
	}

		
		
	
	public HydroPump() {
		HydroPump_primitive_attributes = new BaseClass[HydroPump_primitive_builder.values().length];
		HydroPump_class_attributes = new BaseClass[HydroPump_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(HydroPump_class_attributes_enum attrEnum, BaseClass value) {
		try {
			HydroPump_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(HydroPump_primitive_builder attrEnum, BaseClass value) {
		try {
			HydroPump_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			HydroPump_class_attributes_enum attrEnum = HydroPump_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated HydroPump, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			HydroPump_primitive_builder attrEnum = HydroPump_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated HydroPump, setting " + attrName  + " to: "  + value);
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
			for (HydroPump_primitive_builder attrEnum: HydroPump_primitive_builder.values()) {
				BaseClass bc = HydroPump_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    HydroPump." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (HydroPump_class_attributes_enum attrEnum: HydroPump_class_attributes_enum.values()) {
				BaseClass bc = HydroPump_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    HydroPump." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(HydroPump) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "HydroPump";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new HydroPump();
        }
};
