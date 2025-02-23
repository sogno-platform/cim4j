package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.EquipmentContainer;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.DCConverterUnit;
import cim4j.SubGeographicalRegion;
import cim4j.VoltageLevel;

/*
A collection of equipment for purposes other than generation or utilization, through which electric energy in bulk is passed for the purposes of switching or modifying its characteristics.
*/
public class Substation extends EquipmentContainer
{
	private BaseClass[] Substation_class_attributes;
	private BaseClass[] Substation_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Substation_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum Substation_class_attributes_enum {
		DCConverterUnit,
		Region,
		VoltageLevels,
			LAST_ENUM;
	}

		
		
		
	
	public Substation() {
		Substation_primitive_attributes = new BaseClass[Substation_primitive_builder.values().length];
		Substation_class_attributes = new BaseClass[Substation_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Substation_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Substation_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Substation_primitive_builder attrEnum, BaseClass value) {
		try {
			Substation_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Substation_class_attributes_enum attrEnum = Substation_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Substation, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Substation_primitive_builder attrEnum = Substation_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Substation, setting " + attrName  + " to: "  + value);
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
			for (Substation_primitive_builder attrEnum: Substation_primitive_builder.values()) {
				BaseClass bc = Substation_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Substation." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Substation_class_attributes_enum attrEnum: Substation_class_attributes_enum.values()) {
				BaseClass bc = Substation_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Substation." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Substation) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Substation";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Substation();
        }
};
