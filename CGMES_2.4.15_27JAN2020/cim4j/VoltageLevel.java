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
	private BaseClass[] VoltageLevel_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
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

		
		
		
		
		
	
	public VoltageLevel() {
		VoltageLevel_attributes = new BaseClass[VoltageLevel_primitive_builder.values().length];
	}

	public void updateAttributeInArray(VoltageLevel_primitive_builder attrEnum, BaseClass value) {
		try {
			VoltageLevel_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//VoltageLevel_ATTR_ENUM attrEnum = VoltageLevel_ATTR_BC_ENUM.valueOf(attrName);
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
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (VoltageLevel_primitive_builder attrEnum: VoltageLevel_primitive_builder.values()) {
			BaseClass bc = VoltageLevel_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
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
