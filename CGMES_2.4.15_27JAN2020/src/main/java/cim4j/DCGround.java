package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DCConductingEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Inductance;
import cim4j.Resistance;



/*
A ground within a DC system.
*/
public class DCGround extends DCConductingEquipment
{
	private BaseClass[] DCGround_class_attributes;
	private BaseClass[] DCGround_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum DCGround_primitive_builder implements PrimitiveBuilder {
		inductance(){
			public BaseClass construct (java.lang.String value) {
				return new Inductance(value);
			}
		},
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

	private enum DCGround_class_attributes_enum {
		inductance,
		r,
			LAST_ENUM;
	}

		
		
	
	public DCGround() {
		DCGround_primitive_attributes = new BaseClass[DCGround_primitive_builder.values().length];
		DCGround_class_attributes = new BaseClass[DCGround_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DCGround_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DCGround_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DCGround_primitive_builder attrEnum, BaseClass value) {
		try {
			DCGround_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DCGround_class_attributes_enum attrEnum = DCGround_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DCGround, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DCGround_primitive_builder attrEnum = DCGround_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated DCGround, setting " + attrName  + " to: "  + value);
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
			for (DCGround_primitive_builder attrEnum: DCGround_primitive_builder.values()) {
				BaseClass bc = DCGround_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCGround." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DCGround_class_attributes_enum attrEnum: DCGround_class_attributes_enum.values()) {
				BaseClass bc = DCGround_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCGround." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DCGround) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "DCGround";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DCGround();
        }
};
