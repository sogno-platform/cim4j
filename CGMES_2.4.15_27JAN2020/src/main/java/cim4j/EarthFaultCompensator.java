package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ConductingEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Resistance;



/*
A conducting equipment used to represent a connection to ground which is typically used to compensate earth faults..   An earth fault compensator device modeled with a single terminal implies a second terminal solidly connected to ground.  If two terminals are modeled, the ground is not assumed and normal connection rules apply.
*/
public class EarthFaultCompensator extends ConductingEquipment
{
	private BaseClass[] EarthFaultCompensator_class_attributes;
	private BaseClass[] EarthFaultCompensator_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum EarthFaultCompensator_primitive_builder implements PrimitiveBuilder {
		r(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum EarthFaultCompensator_class_attributes_enum {
		r,
			LAST_ENUM;
	}

		
	
	public EarthFaultCompensator() {
		EarthFaultCompensator_primitive_attributes = new BaseClass[EarthFaultCompensator_primitive_builder.values().length];
		EarthFaultCompensator_class_attributes = new BaseClass[EarthFaultCompensator_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(EarthFaultCompensator_class_attributes_enum attrEnum, BaseClass value) {
		try {
			EarthFaultCompensator_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(EarthFaultCompensator_primitive_builder attrEnum, BaseClass value) {
		try {
			EarthFaultCompensator_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			EarthFaultCompensator_class_attributes_enum attrEnum = EarthFaultCompensator_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated EarthFaultCompensator, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			EarthFaultCompensator_primitive_builder attrEnum = EarthFaultCompensator_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated EarthFaultCompensator, setting " + attrName  + " to: "  + value);
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
			for (EarthFaultCompensator_primitive_builder attrEnum: EarthFaultCompensator_primitive_builder.values()) {
				BaseClass bc = EarthFaultCompensator_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EarthFaultCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (EarthFaultCompensator_class_attributes_enum attrEnum: EarthFaultCompensator_class_attributes_enum.values()) {
				BaseClass bc = EarthFaultCompensator_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EarthFaultCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(EarthFaultCompensator) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "EarthFaultCompensator";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new EarthFaultCompensator();
        }
};
