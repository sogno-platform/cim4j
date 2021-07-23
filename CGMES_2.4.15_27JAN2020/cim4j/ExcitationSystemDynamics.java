package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DynamicsFunctionBlock;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.SynchronousMachineDynamics;
import cim4j.PowerSystemStabilizerDynamics;
import cim4j.PFVArControllerType1Dynamics;
import cim4j.VoltageCompensatorDynamics;
import cim4j.DiscontinuousExcitationControlDynamics;
import cim4j.UnderexcitationLimiterDynamics;
import cim4j.PFVArControllerType2Dynamics;
import cim4j.OverexcitationLimiterDynamics;

/*
Excitation system function block whose behavior is described by reference to a standard model
*/
public class ExcitationSystemDynamics extends DynamicsFunctionBlock
{
	private BaseClass[] ExcitationSystemDynamics_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ExcitationSystemDynamics_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
	
	public ExcitationSystemDynamics() {
		ExcitationSystemDynamics_attributes = new BaseClass[ExcitationSystemDynamics_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ExcitationSystemDynamics_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcitationSystemDynamics_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ExcitationSystemDynamics_ATTR_ENUM attrEnum = ExcitationSystemDynamics_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcitationSystemDynamics_primitive_builder attrEnum = ExcitationSystemDynamics_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ExcitationSystemDynamics_primitive_builder attrEnum: ExcitationSystemDynamics_primitive_builder.values()) {
			BaseClass bc = ExcitationSystemDynamics_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ExcitationSystemDynamics";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcitationSystemDynamics();
        }
};
