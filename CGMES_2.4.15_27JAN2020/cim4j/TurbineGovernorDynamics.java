package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DynamicsFunctionBlock;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.SynchronousMachineDynamics;
import cim4j.AsynchronousMachineDynamics;
import cim4j.TurbineLoadControllerDynamics;

/*
Turbine-governor function block whose behavior is described by reference to a standard model
*/
public class TurbineGovernorDynamics extends DynamicsFunctionBlock
{
	private BaseClass[] TurbineGovernorDynamics_class_attributes;
	private BaseClass[] TurbineGovernorDynamics_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum TurbineGovernorDynamics_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum TurbineGovernorDynamics_class_attributes_enum {
		SynchronousMachineDynamics,
		AsynchronousMachineDynamics,
		TurbineLoadControllerDynamics,
			LAST_ENUM;
	}

		
		
		
	
	public TurbineGovernorDynamics() {
		TurbineGovernorDynamics_primitive_attributes = new BaseClass[TurbineGovernorDynamics_primitive_builder.values().length];
		TurbineGovernorDynamics_class_attributes = new BaseClass[TurbineGovernorDynamics_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(TurbineGovernorDynamics_class_attributes_enum attrEnum, BaseClass value) {
		try {
			TurbineGovernorDynamics_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(TurbineGovernorDynamics_primitive_builder attrEnum, BaseClass value) {
		try {
			TurbineGovernorDynamics_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			TurbineGovernorDynamics_class_attributes_enum attrEnum = TurbineGovernorDynamics_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated TurbineGovernorDynamics, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			TurbineGovernorDynamics_primitive_builder attrEnum = TurbineGovernorDynamics_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated TurbineGovernorDynamics, setting " + attrName  + " to: "  + value);
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
			for (TurbineGovernorDynamics_primitive_builder attrEnum: TurbineGovernorDynamics_primitive_builder.values()) {
				BaseClass bc = TurbineGovernorDynamics_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TurbineGovernorDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (TurbineGovernorDynamics_class_attributes_enum attrEnum: TurbineGovernorDynamics_class_attributes_enum.values()) {
				BaseClass bc = TurbineGovernorDynamics_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TurbineGovernorDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(TurbineGovernorDynamics) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "TurbineGovernorDynamics";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new TurbineGovernorDynamics();
        }
};
