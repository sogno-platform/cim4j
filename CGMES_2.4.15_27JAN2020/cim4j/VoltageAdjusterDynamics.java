package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DynamicsFunctionBlock;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.PFVArControllerType1Dynamics;

/*
Voltage adjuster function block whose behaviour is described by reference to a standard model
*/
public class VoltageAdjusterDynamics extends DynamicsFunctionBlock
{
	private BaseClass[] VoltageAdjusterDynamics_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum VoltageAdjusterDynamics_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
	
	public VoltageAdjusterDynamics() {
		VoltageAdjusterDynamics_attributes = new BaseClass[VoltageAdjusterDynamics_primitive_builder.values().length];
	}

	public void updateAttributeInArray(VoltageAdjusterDynamics_primitive_builder attrEnum, BaseClass value) {
		try {
			VoltageAdjusterDynamics_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//VoltageAdjusterDynamics_ATTR_ENUM attrEnum = VoltageAdjusterDynamics_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			VoltageAdjusterDynamics_primitive_builder attrEnum = VoltageAdjusterDynamics_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (VoltageAdjusterDynamics_primitive_builder attrEnum: VoltageAdjusterDynamics_primitive_builder.values()) {
			BaseClass bc = VoltageAdjusterDynamics_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "VoltageAdjusterDynamics";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new VoltageAdjusterDynamics();
        }
};
