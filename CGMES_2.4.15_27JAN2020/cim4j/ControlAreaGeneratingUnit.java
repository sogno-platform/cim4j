package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.GeneratingUnit;
import cim4j.ControlArea;

/*
A control area generating unit. This class is needed so that alternate control area definitions may include the same generating unit.   Note only one instance within a control area should reference a specific generating unit.
*/
public class ControlAreaGeneratingUnit extends IdentifiedObject
{
	private BaseClass[] ControlAreaGeneratingUnit_class_attributes;
	private BaseClass[] ControlAreaGeneratingUnit_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ControlAreaGeneratingUnit_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ControlAreaGeneratingUnit_class_attributes_enum {
		GeneratingUnit,
		ControlArea,
			LAST_ENUM;
	}

		
		
	
	public ControlAreaGeneratingUnit() {
		ControlAreaGeneratingUnit_primitive_attributes = new BaseClass[ControlAreaGeneratingUnit_primitive_builder.values().length];
		ControlAreaGeneratingUnit_class_attributes = new BaseClass[ControlAreaGeneratingUnit_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ControlAreaGeneratingUnit_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ControlAreaGeneratingUnit_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ControlAreaGeneratingUnit_primitive_builder attrEnum, BaseClass value) {
		try {
			ControlAreaGeneratingUnit_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ControlAreaGeneratingUnit_class_attributes_enum attrEnum = ControlAreaGeneratingUnit_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ControlAreaGeneratingUnit, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ControlAreaGeneratingUnit_primitive_builder attrEnum = ControlAreaGeneratingUnit_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ControlAreaGeneratingUnit, setting " + attrName  + " to: "  + value);
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
			for (ControlAreaGeneratingUnit_primitive_builder attrEnum: ControlAreaGeneratingUnit_primitive_builder.values()) {
				BaseClass bc = ControlAreaGeneratingUnit_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ControlAreaGeneratingUnit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ControlAreaGeneratingUnit_class_attributes_enum attrEnum: ControlAreaGeneratingUnit_class_attributes_enum.values()) {
				BaseClass bc = ControlAreaGeneratingUnit_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ControlAreaGeneratingUnit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ControlAreaGeneratingUnit) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ControlAreaGeneratingUnit";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ControlAreaGeneratingUnit();
        }
};
