package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ShuntCompensator;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Susceptance;
import cim4j.Conductance;



/*
A linear shunt compensator has banks or sections with equal admittance values.
*/
public class LinearShuntCompensator extends ShuntCompensator
{
	private BaseClass[] LinearShuntCompensator_class_attributes;
	private BaseClass[] LinearShuntCompensator_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum LinearShuntCompensator_primitive_builder implements PrimitiveBuilder {
		bPerSection(){
			public BaseClass construct (java.lang.String value) {
				return new Susceptance(value);
			}
		},
		gPerSection(){
			public BaseClass construct (java.lang.String value) {
				return new Conductance(value);
			}
		},
		b0PerSection(){
			public BaseClass construct (java.lang.String value) {
				return new Susceptance(value);
			}
		},
		g0PerSection(){
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

	private enum LinearShuntCompensator_class_attributes_enum {
		bPerSection,
		gPerSection,
		b0PerSection,
		g0PerSection,
			LAST_ENUM;
	}

		
		
		
		
	
	public LinearShuntCompensator() {
		LinearShuntCompensator_primitive_attributes = new BaseClass[LinearShuntCompensator_primitive_builder.values().length];
		LinearShuntCompensator_class_attributes = new BaseClass[LinearShuntCompensator_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(LinearShuntCompensator_class_attributes_enum attrEnum, BaseClass value) {
		try {
			LinearShuntCompensator_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(LinearShuntCompensator_primitive_builder attrEnum, BaseClass value) {
		try {
			LinearShuntCompensator_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			LinearShuntCompensator_class_attributes_enum attrEnum = LinearShuntCompensator_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated LinearShuntCompensator, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			LinearShuntCompensator_primitive_builder attrEnum = LinearShuntCompensator_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated LinearShuntCompensator, setting " + attrName  + " to: "  + value);
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
			for (LinearShuntCompensator_primitive_builder attrEnum: LinearShuntCompensator_primitive_builder.values()) {
				BaseClass bc = LinearShuntCompensator_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LinearShuntCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (LinearShuntCompensator_class_attributes_enum attrEnum: LinearShuntCompensator_class_attributes_enum.values()) {
				BaseClass bc = LinearShuntCompensator_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LinearShuntCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(LinearShuntCompensator) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "LinearShuntCompensator";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new LinearShuntCompensator();
        }
};
