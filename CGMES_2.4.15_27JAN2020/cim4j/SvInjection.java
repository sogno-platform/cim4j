package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ActivePower;
import cim4j.ReactivePower;


import cim4j.TopologicalNode;

/*
The SvInjection is reporting the calculated bus injection minus the sum of the terminal flows. The terminal flow is positive out from the bus (load sign convention) and bus injection has positive flow into the bus. SvInjection may have the remainder after state estimation or slack after power flow calculation.
*/
public class SvInjection extends BaseClass
{
	private BaseClass[] SvInjection_class_attributes;
	private BaseClass[] SvInjection_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum SvInjection_primitive_builder implements PrimitiveBuilder {
		pInjection(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		qInjection(){
			public BaseClass construct (java.lang.String value) {
				return new ReactivePower(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum SvInjection_class_attributes_enum {
		pInjection,
		qInjection,
		TopologicalNode,
			LAST_ENUM;
	}

		
		
		
	
	public SvInjection() {
		SvInjection_primitive_attributes = new BaseClass[SvInjection_primitive_builder.values().length];
		SvInjection_class_attributes = new BaseClass[SvInjection_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(SvInjection_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SvInjection_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(SvInjection_primitive_builder attrEnum, BaseClass value) {
		try {
			SvInjection_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SvInjection_class_attributes_enum attrEnum = SvInjection_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated SvInjection, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SvInjection_primitive_builder attrEnum = SvInjection_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated SvInjection, setting " + attrName  + " to: "  + value);
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
			for (SvInjection_primitive_builder attrEnum: SvInjection_primitive_builder.values()) {
				BaseClass bc = SvInjection_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SvInjection." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SvInjection_class_attributes_enum attrEnum: SvInjection_class_attributes_enum.values()) {
				BaseClass bc = SvInjection_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SvInjection." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(SvInjection) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "SvInjection";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new SvInjection();
        }
};
