package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.RemoteSignalKind;


import cim4j.Terminal;
import cim4j.PFVArControllerType1Dynamics;
import cim4j.UnderexcitationLimiterDynamics;
import cim4j.WindTurbineType1or2Dynamics;
import cim4j.VoltageCompensatorDynamics;
import cim4j.PowerSystemStabilizerDynamics;
import cim4j.DiscontinuousExcitationControlDynamics;
import cim4j.WindTurbineType3or4Dynamics;
import cim4j.WindPlantDynamics;

/*
Supports connection to a terminal associated with a remote bus from which an input signal of a specific type is coming.
*/
public class RemoteInputSignal extends IdentifiedObject
{
	private BaseClass[] RemoteInputSignal_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum RemoteInputSignal_primitive_builder implements PrimitiveBuilder {
			remoteSignalType(){
			public BaseClass construct (java.lang.String value) {
				return new RemoteSignalKind(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
	
	public RemoteInputSignal() {
		RemoteInputSignal_attributes = new BaseClass[RemoteInputSignal_primitive_builder.values().length];
	}

	public void updateAttributeInArray(RemoteInputSignal_primitive_builder attrEnum, BaseClass value) {
		try {
			RemoteInputSignal_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//RemoteInputSignal_ATTR_ENUM attrEnum = RemoteInputSignal_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			RemoteInputSignal_primitive_builder attrEnum = RemoteInputSignal_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (RemoteInputSignal_primitive_builder attrEnum: RemoteInputSignal_primitive_builder.values()) {
			BaseClass bc = RemoteInputSignal_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "RemoteInputSignal";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new RemoteInputSignal();
        }
};
