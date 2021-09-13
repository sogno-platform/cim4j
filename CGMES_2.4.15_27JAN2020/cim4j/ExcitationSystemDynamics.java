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
	private BaseClass[] ExcitationSystemDynamics_class_attributes;
	private BaseClass[] ExcitationSystemDynamics_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcitationSystemDynamics_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ExcitationSystemDynamics_class_attributes_enum {
		SynchronousMachineDynamics,
		PowerSystemStabilizerDynamics,
		PFVArControllerType1Dynamics,
		VoltageCompensatorDynamics,
		DiscontinuousExcitationControlDynamics,
		UnderexcitationLimiterDynamics,
		PFVArControllerType2Dynamics,
		OverexcitationLimiterDynamics,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
	
	public ExcitationSystemDynamics() {
		ExcitationSystemDynamics_primitive_attributes = new BaseClass[ExcitationSystemDynamics_primitive_builder.values().length];
		ExcitationSystemDynamics_class_attributes = new BaseClass[ExcitationSystemDynamics_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcitationSystemDynamics_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcitationSystemDynamics_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcitationSystemDynamics_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcitationSystemDynamics_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcitationSystemDynamics_class_attributes_enum attrEnum = ExcitationSystemDynamics_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcitationSystemDynamics, setting " + attrName);
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
			System.out.println("Updated ExcitationSystemDynamics, setting " + attrName  + " to: "  + value);
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
			for (ExcitationSystemDynamics_primitive_builder attrEnum: ExcitationSystemDynamics_primitive_builder.values()) {
				BaseClass bc = ExcitationSystemDynamics_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcitationSystemDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcitationSystemDynamics_class_attributes_enum attrEnum: ExcitationSystemDynamics_class_attributes_enum.values()) {
				BaseClass bc = ExcitationSystemDynamics_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcitationSystemDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcitationSystemDynamics) RDFID: " + rdfid;
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
