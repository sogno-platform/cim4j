package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Voltage;


import cim4j.ConductingEquipment;
import cim4j.VoltageLevel;
import cim4j.TransformerEnd;
import cim4j.TopologicalNode;

/*
Defines a system base voltage which is referenced.
*/
public class BaseVoltage extends IdentifiedObject
{
	private BaseClass[] BaseVoltage_class_attributes;
	private BaseClass[] BaseVoltage_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum BaseVoltage_primitive_builder implements PrimitiveBuilder {
		nominalVoltage(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum BaseVoltage_class_attributes_enum {
		nominalVoltage,
		ConductingEquipment,
		VoltageLevel,
		TransformerEnds,
		TopologicalNode,
			LAST_ENUM;
	}

		
		
		
		
		
	
	public BaseVoltage() {
		BaseVoltage_primitive_attributes = new BaseClass[BaseVoltage_primitive_builder.values().length];
		BaseVoltage_class_attributes = new BaseClass[BaseVoltage_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(BaseVoltage_class_attributes_enum attrEnum, BaseClass value) {
		try {
			BaseVoltage_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(BaseVoltage_primitive_builder attrEnum, BaseClass value) {
		try {
			BaseVoltage_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			BaseVoltage_class_attributes_enum attrEnum = BaseVoltage_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated BaseVoltage, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			BaseVoltage_primitive_builder attrEnum = BaseVoltage_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated BaseVoltage, setting " + attrName  + " to: "  + value);
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
			for (BaseVoltage_primitive_builder attrEnum: BaseVoltage_primitive_builder.values()) {
				BaseClass bc = BaseVoltage_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    BaseVoltage." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (BaseVoltage_class_attributes_enum attrEnum: BaseVoltage_class_attributes_enum.values()) {
				BaseClass bc = BaseVoltage_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    BaseVoltage." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(BaseVoltage) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "BaseVoltage";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new BaseVoltage();
        }
};
