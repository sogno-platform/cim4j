package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DynamicsFunctionBlock;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.RemoteInputSignal;
import cim4j.ExcitationSystemDynamics;
import cim4j.VoltageAdjusterDynamics;

/*
Power Factor or VAr controller Type I function block whose behaviour is described by reference to a standard model
*/
public class PFVArControllerType1Dynamics extends DynamicsFunctionBlock
{
	private BaseClass[] PFVArControllerType1Dynamics_class_attributes;
	private BaseClass[] PFVArControllerType1Dynamics_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PFVArControllerType1Dynamics_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum PFVArControllerType1Dynamics_class_attributes_enum {
		RemoteInputSignal,
		ExcitationSystemDynamics,
		VoltageAdjusterDynamics,
			LAST_ENUM;
	}

		
		
		
	
	public PFVArControllerType1Dynamics() {
		PFVArControllerType1Dynamics_primitive_attributes = new BaseClass[PFVArControllerType1Dynamics_primitive_builder.values().length];
		PFVArControllerType1Dynamics_class_attributes = new BaseClass[PFVArControllerType1Dynamics_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PFVArControllerType1Dynamics_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PFVArControllerType1Dynamics_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PFVArControllerType1Dynamics_primitive_builder attrEnum, BaseClass value) {
		try {
			PFVArControllerType1Dynamics_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PFVArControllerType1Dynamics_class_attributes_enum attrEnum = PFVArControllerType1Dynamics_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PFVArControllerType1Dynamics, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PFVArControllerType1Dynamics_primitive_builder attrEnum = PFVArControllerType1Dynamics_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PFVArControllerType1Dynamics, setting " + attrName  + " to: "  + value);
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
			for (PFVArControllerType1Dynamics_primitive_builder attrEnum: PFVArControllerType1Dynamics_primitive_builder.values()) {
				BaseClass bc = PFVArControllerType1Dynamics_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PFVArControllerType1Dynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PFVArControllerType1Dynamics_class_attributes_enum attrEnum: PFVArControllerType1Dynamics_class_attributes_enum.values()) {
				BaseClass bc = PFVArControllerType1Dynamics_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PFVArControllerType1Dynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PFVArControllerType1Dynamics) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PFVArControllerType1Dynamics";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PFVArControllerType1Dynamics();
        }
};
