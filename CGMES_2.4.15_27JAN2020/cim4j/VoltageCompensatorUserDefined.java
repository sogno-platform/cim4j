package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.VoltageCompensatorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;


import cim4j.ProprietaryParameterDynamics;

/*
Voltage compensator function block whose dynamic behaviour is described by
*/
public class VoltageCompensatorUserDefined extends VoltageCompensatorDynamics
{
	private BaseClass[] VoltageCompensatorUserDefined_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum VoltageCompensatorUserDefined_primitive_builder implements PrimitiveBuilder {
			proprietary(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
	
	public VoltageCompensatorUserDefined() {
		VoltageCompensatorUserDefined_attributes = new BaseClass[VoltageCompensatorUserDefined_primitive_builder.values().length];
	}

	public void updateAttributeInArray(VoltageCompensatorUserDefined_primitive_builder attrEnum, BaseClass value) {
		try {
			VoltageCompensatorUserDefined_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//VoltageCompensatorUserDefined_ATTR_ENUM attrEnum = VoltageCompensatorUserDefined_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			VoltageCompensatorUserDefined_primitive_builder attrEnum = VoltageCompensatorUserDefined_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (VoltageCompensatorUserDefined_primitive_builder attrEnum: VoltageCompensatorUserDefined_primitive_builder.values()) {
			BaseClass bc = VoltageCompensatorUserDefined_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "VoltageCompensatorUserDefined";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new VoltageCompensatorUserDefined();
        }
};
