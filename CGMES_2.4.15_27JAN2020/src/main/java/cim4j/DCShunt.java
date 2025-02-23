package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DCConductingEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Capacitance;
import cim4j.Resistance;
import cim4j.Voltage;



/*
A shunt device within the DC system, typically used for filtering.  Needed for transient and short circuit studies.
*/
public class DCShunt extends DCConductingEquipment
{
	private BaseClass[] DCShunt_class_attributes;
	private BaseClass[] DCShunt_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum DCShunt_primitive_builder implements PrimitiveBuilder {
		capacitance(){
			public BaseClass construct (java.lang.String value) {
				return new Capacitance(value);
			}
		},
		resistance(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
		ratedUdc(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum DCShunt_class_attributes_enum {
		capacitance,
		resistance,
		ratedUdc,
			LAST_ENUM;
	}

		
		
		
	
	public DCShunt() {
		DCShunt_primitive_attributes = new BaseClass[DCShunt_primitive_builder.values().length];
		DCShunt_class_attributes = new BaseClass[DCShunt_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DCShunt_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DCShunt_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DCShunt_primitive_builder attrEnum, BaseClass value) {
		try {
			DCShunt_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DCShunt_class_attributes_enum attrEnum = DCShunt_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DCShunt, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DCShunt_primitive_builder attrEnum = DCShunt_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated DCShunt, setting " + attrName  + " to: "  + value);
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
			for (DCShunt_primitive_builder attrEnum: DCShunt_primitive_builder.values()) {
				BaseClass bc = DCShunt_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCShunt." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DCShunt_class_attributes_enum attrEnum: DCShunt_class_attributes_enum.values()) {
				BaseClass bc = DCShunt_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCShunt." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DCShunt) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "DCShunt";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DCShunt();
        }
};
