package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DynamicsFunctionBlock;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.RemoteInputSignal;
import cim4j.ExcitationSystemDynamics;

/*
Voltage compensator function block whose behaviour is described by reference to a standard model
*/
public class VoltageCompensatorDynamics extends DynamicsFunctionBlock
{
	private BaseClass[] VoltageCompensatorDynamics_class_attributes;
	private BaseClass[] VoltageCompensatorDynamics_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum VoltageCompensatorDynamics_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum VoltageCompensatorDynamics_class_attributes_enum {
		RemoteInputSignal,
		ExcitationSystemDynamics,
			LAST_ENUM;
	}

		
		
	
	public VoltageCompensatorDynamics() {
		VoltageCompensatorDynamics_primitive_attributes = new BaseClass[VoltageCompensatorDynamics_primitive_builder.values().length];
		VoltageCompensatorDynamics_class_attributes = new BaseClass[VoltageCompensatorDynamics_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(VoltageCompensatorDynamics_class_attributes_enum attrEnum, BaseClass value) {
		try {
			VoltageCompensatorDynamics_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(VoltageCompensatorDynamics_primitive_builder attrEnum, BaseClass value) {
		try {
			VoltageCompensatorDynamics_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			VoltageCompensatorDynamics_class_attributes_enum attrEnum = VoltageCompensatorDynamics_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated VoltageCompensatorDynamics, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			VoltageCompensatorDynamics_primitive_builder attrEnum = VoltageCompensatorDynamics_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated VoltageCompensatorDynamics, setting " + attrName  + " to: "  + value);
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
			for (VoltageCompensatorDynamics_primitive_builder attrEnum: VoltageCompensatorDynamics_primitive_builder.values()) {
				BaseClass bc = VoltageCompensatorDynamics_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    VoltageCompensatorDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (VoltageCompensatorDynamics_class_attributes_enum attrEnum: VoltageCompensatorDynamics_class_attributes_enum.values()) {
				BaseClass bc = VoltageCompensatorDynamics_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    VoltageCompensatorDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(VoltageCompensatorDynamics) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "VoltageCompensatorDynamics";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new VoltageCompensatorDynamics();
        }
};
