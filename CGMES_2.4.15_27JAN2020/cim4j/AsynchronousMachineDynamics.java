package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.RotatingMachineDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.AsynchronousMachine;
import cim4j.MechanicalLoadDynamics;
import cim4j.WindTurbineType1or2Dynamics;
import cim4j.TurbineGovernorDynamics;

/*
Asynchronous machine whose behaviour is described by reference to a standard model expressed in either time constant reactance form or equivalent circuit form
*/
public class AsynchronousMachineDynamics extends RotatingMachineDynamics
{
	private BaseClass[] AsynchronousMachineDynamics_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum AsynchronousMachineDynamics_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
	
	public AsynchronousMachineDynamics() {
		AsynchronousMachineDynamics_attributes = new BaseClass[AsynchronousMachineDynamics_primitive_builder.values().length];
	}

	public void updateAttributeInArray(AsynchronousMachineDynamics_primitive_builder attrEnum, BaseClass value) {
		try {
			AsynchronousMachineDynamics_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//AsynchronousMachineDynamics_ATTR_ENUM attrEnum = AsynchronousMachineDynamics_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			AsynchronousMachineDynamics_primitive_builder attrEnum = AsynchronousMachineDynamics_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (AsynchronousMachineDynamics_primitive_builder attrEnum: AsynchronousMachineDynamics_primitive_builder.values()) {
			BaseClass bc = AsynchronousMachineDynamics_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "AsynchronousMachineDynamics";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new AsynchronousMachineDynamics();
        }
};
