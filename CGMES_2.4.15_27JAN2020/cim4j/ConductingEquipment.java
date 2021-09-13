package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.Equipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.BaseVoltage;
import cim4j.Terminal;
import cim4j.SvStatus;

/*
The parts of the AC power system that are designed to carry current or that are conductively connected through terminals.
*/
public class ConductingEquipment extends Equipment
{
	private BaseClass[] ConductingEquipment_class_attributes;
	private BaseClass[] ConductingEquipment_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ConductingEquipment_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ConductingEquipment_class_attributes_enum {
		BaseVoltage,
		Terminals,
		SvStatus,
			LAST_ENUM;
	}

		
		
		
	
	public ConductingEquipment() {
		ConductingEquipment_primitive_attributes = new BaseClass[ConductingEquipment_primitive_builder.values().length];
		ConductingEquipment_class_attributes = new BaseClass[ConductingEquipment_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ConductingEquipment_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ConductingEquipment_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ConductingEquipment_primitive_builder attrEnum, BaseClass value) {
		try {
			ConductingEquipment_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ConductingEquipment_class_attributes_enum attrEnum = ConductingEquipment_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ConductingEquipment, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ConductingEquipment_primitive_builder attrEnum = ConductingEquipment_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ConductingEquipment, setting " + attrName  + " to: "  + value);
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
			for (ConductingEquipment_primitive_builder attrEnum: ConductingEquipment_primitive_builder.values()) {
				BaseClass bc = ConductingEquipment_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ConductingEquipment." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ConductingEquipment_class_attributes_enum attrEnum: ConductingEquipment_class_attributes_enum.values()) {
				BaseClass bc = ConductingEquipment_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ConductingEquipment." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ConductingEquipment) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ConductingEquipment";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ConductingEquipment();
        }
};
