package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.EquipmentContainer;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Voltage;


import cim4j.BaseVoltage;
import cim4j.Substation;
import cim4j.Bay;

/*
A collection of equipment at one common system voltage forming a switchgear. The equipment typically consist of breakers, busbars, instrumentation, control, regulation and protection devices as well as assemblies of all these.
*/
public class VoltageLevel extends EquipmentContainer
{
	private BaseClass[] VoltageLevel_class_attributes;
	private BaseClass[] VoltageLevel_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum VoltageLevel_primitive_builder implements PrimitiveBuilder {
		highVoltageLimit(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
		lowVoltageLimit(){
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

	private enum VoltageLevel_class_attributes_enum {
		BaseVoltage,
		Substation,
		highVoltageLimit,
		lowVoltageLimit,
		Bays,
			LAST_ENUM;
	}

		
		
		
		
		
	
	public VoltageLevel() {
		VoltageLevel_primitive_attributes = new BaseClass[VoltageLevel_primitive_builder.values().length];
		VoltageLevel_class_attributes = new BaseClass[VoltageLevel_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(VoltageLevel_class_attributes_enum attrEnum, BaseClass value) {
		try {
			VoltageLevel_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(VoltageLevel_primitive_builder attrEnum, BaseClass value) {
		try {
			VoltageLevel_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			VoltageLevel_class_attributes_enum attrEnum = VoltageLevel_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated VoltageLevel, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			VoltageLevel_primitive_builder attrEnum = VoltageLevel_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated VoltageLevel, setting " + attrName  + " to: "  + value);
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
			for (VoltageLevel_primitive_builder attrEnum: VoltageLevel_primitive_builder.values()) {
				BaseClass bc = VoltageLevel_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    VoltageLevel." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (VoltageLevel_class_attributes_enum attrEnum: VoltageLevel_class_attributes_enum.values()) {
				BaseClass bc = VoltageLevel_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    VoltageLevel." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(VoltageLevel) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "VoltageLevel";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new VoltageLevel();
        }
};
