package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.EquipmentContainer;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.VoltageLevel;

/*
A collection of power system resources (within a given substation) including conducting equipment, protection relays, measurements, and telemetry.  A bay typically represents a physical grouping related to modularization of equipment.
*/
public class Bay extends EquipmentContainer
{
	private BaseClass[] Bay_class_attributes;
	private BaseClass[] Bay_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Bay_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum Bay_class_attributes_enum {
		VoltageLevel,
			LAST_ENUM;
	}

		
	
	public Bay() {
		Bay_primitive_attributes = new BaseClass[Bay_primitive_builder.values().length];
		Bay_class_attributes = new BaseClass[Bay_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Bay_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Bay_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Bay_primitive_builder attrEnum, BaseClass value) {
		try {
			Bay_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Bay_class_attributes_enum attrEnum = Bay_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Bay, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Bay_primitive_builder attrEnum = Bay_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Bay, setting " + attrName  + " to: "  + value);
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
			for (Bay_primitive_builder attrEnum: Bay_primitive_builder.values()) {
				BaseClass bc = Bay_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Bay." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Bay_class_attributes_enum attrEnum: Bay_class_attributes_enum.values()) {
				BaseClass bc = Bay_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Bay." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Bay) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Bay";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Bay();
        }
};
