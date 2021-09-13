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
	private BaseClass[] RemoteInputSignal_class_attributes;
	private BaseClass[] RemoteInputSignal_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

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

	private enum RemoteInputSignal_class_attributes_enum {
		Terminal,
		remoteSignalType,
		PFVArControllerType1Dynamics,
		UnderexcitationLimiterDynamics,
		WindTurbineType1or2Dynamics,
		VoltageCompensatorDynamics,
		PowerSystemStabilizerDynamics,
		DiscontinuousExcitationControlDynamics,
		WindTurbineType3or4Dynamics,
		WindPlantDynamics,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
	
	public RemoteInputSignal() {
		RemoteInputSignal_primitive_attributes = new BaseClass[RemoteInputSignal_primitive_builder.values().length];
		RemoteInputSignal_class_attributes = new BaseClass[RemoteInputSignal_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(RemoteInputSignal_class_attributes_enum attrEnum, BaseClass value) {
		try {
			RemoteInputSignal_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(RemoteInputSignal_primitive_builder attrEnum, BaseClass value) {
		try {
			RemoteInputSignal_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			RemoteInputSignal_class_attributes_enum attrEnum = RemoteInputSignal_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated RemoteInputSignal, setting " + attrName);
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
			System.out.println("Updated RemoteInputSignal, setting " + attrName  + " to: "  + value);
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
			for (RemoteInputSignal_primitive_builder attrEnum: RemoteInputSignal_primitive_builder.values()) {
				BaseClass bc = RemoteInputSignal_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RemoteInputSignal." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (RemoteInputSignal_class_attributes_enum attrEnum: RemoteInputSignal_class_attributes_enum.values()) {
				BaseClass bc = RemoteInputSignal_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RemoteInputSignal." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(RemoteInputSignal) RDFID: " + rdfid;
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
