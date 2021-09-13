package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ConductingEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Length;



/*
Combination of conducting material with consistent electrical characteristics, building a single electrical system, used to carry current between points in the power system.
*/
public class Conductor extends ConductingEquipment
{
	private BaseClass[] Conductor_class_attributes;
	private BaseClass[] Conductor_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Conductor_primitive_builder implements PrimitiveBuilder {
		length(){
			public BaseClass construct (java.lang.String value) {
				return new Length(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum Conductor_class_attributes_enum {
		length,
			LAST_ENUM;
	}

		
	
	public Conductor() {
		Conductor_primitive_attributes = new BaseClass[Conductor_primitive_builder.values().length];
		Conductor_class_attributes = new BaseClass[Conductor_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Conductor_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Conductor_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Conductor_primitive_builder attrEnum, BaseClass value) {
		try {
			Conductor_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Conductor_class_attributes_enum attrEnum = Conductor_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Conductor, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Conductor_primitive_builder attrEnum = Conductor_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Conductor, setting " + attrName  + " to: "  + value);
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
			for (Conductor_primitive_builder attrEnum: Conductor_primitive_builder.values()) {
				BaseClass bc = Conductor_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Conductor." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Conductor_class_attributes_enum attrEnum: Conductor_class_attributes_enum.values()) {
				BaseClass bc = Conductor_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Conductor." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Conductor) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Conductor";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Conductor();
        }
};
