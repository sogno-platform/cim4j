package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.Connector;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.CurrentFlow;



/*
A conductor, or group of conductors, with negligible impedance, that serve to connect other conducting equipment within a single substation.  Voltage measurements are typically obtained from VoltageTransformers that are connected to busbar sections. A bus bar section may have many physical terminals but for analysis is modelled with exactly one logical terminal.
*/
public class BusbarSection extends Connector
{
	private BaseClass[] BusbarSection_class_attributes;
	private BaseClass[] BusbarSection_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum BusbarSection_primitive_builder implements PrimitiveBuilder {
		ipMax(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum BusbarSection_class_attributes_enum {
		ipMax,
			LAST_ENUM;
	}

		
	
	public BusbarSection() {
		BusbarSection_primitive_attributes = new BaseClass[BusbarSection_primitive_builder.values().length];
		BusbarSection_class_attributes = new BaseClass[BusbarSection_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(BusbarSection_class_attributes_enum attrEnum, BaseClass value) {
		try {
			BusbarSection_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(BusbarSection_primitive_builder attrEnum, BaseClass value) {
		try {
			BusbarSection_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			BusbarSection_class_attributes_enum attrEnum = BusbarSection_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated BusbarSection, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			BusbarSection_primitive_builder attrEnum = BusbarSection_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated BusbarSection, setting " + attrName  + " to: "  + value);
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
			for (BusbarSection_primitive_builder attrEnum: BusbarSection_primitive_builder.values()) {
				BaseClass bc = BusbarSection_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    BusbarSection." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (BusbarSection_class_attributes_enum attrEnum: BusbarSection_class_attributes_enum.values()) {
				BaseClass bc = BusbarSection_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    BusbarSection." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(BusbarSection) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "BusbarSection";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new BusbarSection();
        }
};
