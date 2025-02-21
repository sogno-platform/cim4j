package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ConnectivityNodeContainer;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.Equipment;

/*
A modeling construct to provide a root class for containing equipment.
*/
public class EquipmentContainer extends ConnectivityNodeContainer
{
	private BaseClass[] EquipmentContainer_class_attributes;
	private BaseClass[] EquipmentContainer_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum EquipmentContainer_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum EquipmentContainer_class_attributes_enum {
		Equipments,
			LAST_ENUM;
	}

		
	
	public EquipmentContainer() {
		EquipmentContainer_primitive_attributes = new BaseClass[EquipmentContainer_primitive_builder.values().length];
		EquipmentContainer_class_attributes = new BaseClass[EquipmentContainer_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(EquipmentContainer_class_attributes_enum attrEnum, BaseClass value) {
		try {
			EquipmentContainer_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(EquipmentContainer_primitive_builder attrEnum, BaseClass value) {
		try {
			EquipmentContainer_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			EquipmentContainer_class_attributes_enum attrEnum = EquipmentContainer_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated EquipmentContainer, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			EquipmentContainer_primitive_builder attrEnum = EquipmentContainer_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated EquipmentContainer, setting " + attrName  + " to: "  + value);
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
			for (EquipmentContainer_primitive_builder attrEnum: EquipmentContainer_primitive_builder.values()) {
				BaseClass bc = EquipmentContainer_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EquipmentContainer." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (EquipmentContainer_class_attributes_enum attrEnum: EquipmentContainer_class_attributes_enum.values()) {
				BaseClass bc = EquipmentContainer_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EquipmentContainer." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(EquipmentContainer) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "EquipmentContainer";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new EquipmentContainer();
        }
};
