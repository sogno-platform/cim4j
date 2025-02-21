package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DynamicsFunctionBlock;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.SynchronousMachineDynamics;
import cim4j.AsynchronousMachineDynamics;

/*
Mechanical load function block whose behavior is described by reference to a standard model
*/
public class MechanicalLoadDynamics extends DynamicsFunctionBlock
{
	private BaseClass[] MechanicalLoadDynamics_class_attributes;
	private BaseClass[] MechanicalLoadDynamics_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum MechanicalLoadDynamics_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum MechanicalLoadDynamics_class_attributes_enum {
		SynchronousMachineDynamics,
		AsynchronousMachineDynamics,
			LAST_ENUM;
	}

		
		
	
	public MechanicalLoadDynamics() {
		MechanicalLoadDynamics_primitive_attributes = new BaseClass[MechanicalLoadDynamics_primitive_builder.values().length];
		MechanicalLoadDynamics_class_attributes = new BaseClass[MechanicalLoadDynamics_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(MechanicalLoadDynamics_class_attributes_enum attrEnum, BaseClass value) {
		try {
			MechanicalLoadDynamics_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(MechanicalLoadDynamics_primitive_builder attrEnum, BaseClass value) {
		try {
			MechanicalLoadDynamics_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			MechanicalLoadDynamics_class_attributes_enum attrEnum = MechanicalLoadDynamics_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated MechanicalLoadDynamics, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			MechanicalLoadDynamics_primitive_builder attrEnum = MechanicalLoadDynamics_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated MechanicalLoadDynamics, setting " + attrName  + " to: "  + value);
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
			for (MechanicalLoadDynamics_primitive_builder attrEnum: MechanicalLoadDynamics_primitive_builder.values()) {
				BaseClass bc = MechanicalLoadDynamics_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    MechanicalLoadDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (MechanicalLoadDynamics_class_attributes_enum attrEnum: MechanicalLoadDynamics_class_attributes_enum.values()) {
				BaseClass bc = MechanicalLoadDynamics_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    MechanicalLoadDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(MechanicalLoadDynamics) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "MechanicalLoadDynamics";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new MechanicalLoadDynamics();
        }
};
