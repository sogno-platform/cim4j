package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.ControlArea;

/*
Describes an area having energy production or consumption.  Specializations are intended to support the load allocation function as typically required in energy management systems or planning studies to allocate hypothesized load levels to individual load points for power flow analysis.  Often the energy area can be linked to both measured and forecast load levels.
*/
public class EnergyArea extends IdentifiedObject
{
	private BaseClass[] EnergyArea_class_attributes;
	private BaseClass[] EnergyArea_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum EnergyArea_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum EnergyArea_class_attributes_enum {
		ControlArea,
			LAST_ENUM;
	}

		
	
	public EnergyArea() {
		EnergyArea_primitive_attributes = new BaseClass[EnergyArea_primitive_builder.values().length];
		EnergyArea_class_attributes = new BaseClass[EnergyArea_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(EnergyArea_class_attributes_enum attrEnum, BaseClass value) {
		try {
			EnergyArea_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(EnergyArea_primitive_builder attrEnum, BaseClass value) {
		try {
			EnergyArea_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			EnergyArea_class_attributes_enum attrEnum = EnergyArea_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated EnergyArea, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			EnergyArea_primitive_builder attrEnum = EnergyArea_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated EnergyArea, setting " + attrName  + " to: "  + value);
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
			for (EnergyArea_primitive_builder attrEnum: EnergyArea_primitive_builder.values()) {
				BaseClass bc = EnergyArea_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EnergyArea." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (EnergyArea_class_attributes_enum attrEnum: EnergyArea_class_attributes_enum.values()) {
				BaseClass bc = EnergyArea_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EnergyArea." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(EnergyArea) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "EnergyArea";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new EnergyArea();
        }
};
