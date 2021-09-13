package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ConductingEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;


import cim4j.RegulatingControl;

/*
A type of conducting equipment that can regulate a quantity (i.e. voltage or flow) at a specific point in the network.
*/
public class RegulatingCondEq extends ConductingEquipment
{
	private BaseClass[] RegulatingCondEq_class_attributes;
	private BaseClass[] RegulatingCondEq_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum RegulatingCondEq_primitive_builder implements PrimitiveBuilder {
		controlEnabled(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum RegulatingCondEq_class_attributes_enum {
		RegulatingControl,
		controlEnabled,
			LAST_ENUM;
	}

		
		
	
	public RegulatingCondEq() {
		RegulatingCondEq_primitive_attributes = new BaseClass[RegulatingCondEq_primitive_builder.values().length];
		RegulatingCondEq_class_attributes = new BaseClass[RegulatingCondEq_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(RegulatingCondEq_class_attributes_enum attrEnum, BaseClass value) {
		try {
			RegulatingCondEq_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(RegulatingCondEq_primitive_builder attrEnum, BaseClass value) {
		try {
			RegulatingCondEq_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			RegulatingCondEq_class_attributes_enum attrEnum = RegulatingCondEq_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated RegulatingCondEq, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			RegulatingCondEq_primitive_builder attrEnum = RegulatingCondEq_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated RegulatingCondEq, setting " + attrName  + " to: "  + value);
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
			for (RegulatingCondEq_primitive_builder attrEnum: RegulatingCondEq_primitive_builder.values()) {
				BaseClass bc = RegulatingCondEq_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RegulatingCondEq." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (RegulatingCondEq_class_attributes_enum attrEnum: RegulatingCondEq_class_attributes_enum.values()) {
				BaseClass bc = RegulatingCondEq_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RegulatingCondEq." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(RegulatingCondEq) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "RegulatingCondEq";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new RegulatingCondEq();
        }
};
