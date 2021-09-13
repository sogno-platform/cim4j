package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.EquivalentEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Susceptance;
import cim4j.Conductance;



/*
The class represents equivalent shunts.
*/
public class EquivalentShunt extends EquivalentEquipment
{
	private BaseClass[] EquivalentShunt_class_attributes;
	private BaseClass[] EquivalentShunt_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum EquivalentShunt_primitive_builder implements PrimitiveBuilder {
		b(){
			public BaseClass construct (java.lang.String value) {
				return new Susceptance(value);
			}
		},
		g(){
			public BaseClass construct (java.lang.String value) {
				return new Conductance(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum EquivalentShunt_class_attributes_enum {
		b,
		g,
			LAST_ENUM;
	}

		
		
	
	public EquivalentShunt() {
		EquivalentShunt_primitive_attributes = new BaseClass[EquivalentShunt_primitive_builder.values().length];
		EquivalentShunt_class_attributes = new BaseClass[EquivalentShunt_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(EquivalentShunt_class_attributes_enum attrEnum, BaseClass value) {
		try {
			EquivalentShunt_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(EquivalentShunt_primitive_builder attrEnum, BaseClass value) {
		try {
			EquivalentShunt_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			EquivalentShunt_class_attributes_enum attrEnum = EquivalentShunt_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated EquivalentShunt, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			EquivalentShunt_primitive_builder attrEnum = EquivalentShunt_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated EquivalentShunt, setting " + attrName  + " to: "  + value);
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
			for (EquivalentShunt_primitive_builder attrEnum: EquivalentShunt_primitive_builder.values()) {
				BaseClass bc = EquivalentShunt_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EquivalentShunt." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (EquivalentShunt_class_attributes_enum attrEnum: EquivalentShunt_class_attributes_enum.values()) {
				BaseClass bc = EquivalentShunt_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EquivalentShunt." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(EquivalentShunt) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "EquivalentShunt";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new EquivalentShunt();
        }
};
