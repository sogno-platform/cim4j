package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.RotatingMachineDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.SynchronousMachine;
import cim4j.TurbineGovernorDynamics;
import cim4j.ExcitationSystemDynamics;
import cim4j.MechanicalLoadDynamics;
import cim4j.GenICompensationForGenJ;

/*
Synchronous machine whose behaviour is described by reference to a standard model expressed in one of the following forms:
*/
public class SynchronousMachineDynamics extends RotatingMachineDynamics
{
	private BaseClass[] SynchronousMachineDynamics_class_attributes;
	private BaseClass[] SynchronousMachineDynamics_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum SynchronousMachineDynamics_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum SynchronousMachineDynamics_class_attributes_enum {
		SynchronousMachine,
		TurbineGovernorDynamics,
		ExcitationSystemDynamics,
		MechanicalLoadDynamics,
		GenICompensationForGenJ,
			LAST_ENUM;
	}

		
		
		
		
		
	
	public SynchronousMachineDynamics() {
		SynchronousMachineDynamics_primitive_attributes = new BaseClass[SynchronousMachineDynamics_primitive_builder.values().length];
		SynchronousMachineDynamics_class_attributes = new BaseClass[SynchronousMachineDynamics_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(SynchronousMachineDynamics_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SynchronousMachineDynamics_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(SynchronousMachineDynamics_primitive_builder attrEnum, BaseClass value) {
		try {
			SynchronousMachineDynamics_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SynchronousMachineDynamics_class_attributes_enum attrEnum = SynchronousMachineDynamics_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated SynchronousMachineDynamics, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SynchronousMachineDynamics_primitive_builder attrEnum = SynchronousMachineDynamics_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated SynchronousMachineDynamics, setting " + attrName  + " to: "  + value);
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
			for (SynchronousMachineDynamics_primitive_builder attrEnum: SynchronousMachineDynamics_primitive_builder.values()) {
				BaseClass bc = SynchronousMachineDynamics_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SynchronousMachineDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SynchronousMachineDynamics_class_attributes_enum attrEnum: SynchronousMachineDynamics_class_attributes_enum.values()) {
				BaseClass bc = SynchronousMachineDynamics_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SynchronousMachineDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(SynchronousMachineDynamics) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "SynchronousMachineDynamics";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new SynchronousMachineDynamics();
        }
};
