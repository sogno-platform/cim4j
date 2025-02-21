package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ConductingEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.EquivalentNetwork;

/*
The class represents equivalent objects that are the result of a network reduction. The class is the base for equivalent objects of different types.
*/
public class EquivalentEquipment extends ConductingEquipment
{
	private BaseClass[] EquivalentEquipment_class_attributes;
	private BaseClass[] EquivalentEquipment_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum EquivalentEquipment_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum EquivalentEquipment_class_attributes_enum {
		EquivalentNetwork,
			LAST_ENUM;
	}

		
	
	public EquivalentEquipment() {
		EquivalentEquipment_primitive_attributes = new BaseClass[EquivalentEquipment_primitive_builder.values().length];
		EquivalentEquipment_class_attributes = new BaseClass[EquivalentEquipment_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(EquivalentEquipment_class_attributes_enum attrEnum, BaseClass value) {
		try {
			EquivalentEquipment_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(EquivalentEquipment_primitive_builder attrEnum, BaseClass value) {
		try {
			EquivalentEquipment_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			EquivalentEquipment_class_attributes_enum attrEnum = EquivalentEquipment_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated EquivalentEquipment, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			EquivalentEquipment_primitive_builder attrEnum = EquivalentEquipment_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated EquivalentEquipment, setting " + attrName  + " to: "  + value);
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
			for (EquivalentEquipment_primitive_builder attrEnum: EquivalentEquipment_primitive_builder.values()) {
				BaseClass bc = EquivalentEquipment_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EquivalentEquipment." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (EquivalentEquipment_class_attributes_enum attrEnum: EquivalentEquipment_class_attributes_enum.values()) {
				BaseClass bc = EquivalentEquipment_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EquivalentEquipment." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(EquivalentEquipment) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "EquivalentEquipment";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new EquivalentEquipment();
        }
};
