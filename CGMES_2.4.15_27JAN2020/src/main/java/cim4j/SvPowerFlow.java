package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ActivePower;
import cim4j.ReactivePower;


import cim4j.Terminal;

/*
State variable for power flow. Load convention is used for flow direction. This means flow out from the TopologicalNode into the equipment is positive.
*/
public class SvPowerFlow extends BaseClass
{
	private BaseClass[] SvPowerFlow_class_attributes;
	private BaseClass[] SvPowerFlow_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum SvPowerFlow_primitive_builder implements PrimitiveBuilder {
		p(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		q(){
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

	private enum SvPowerFlow_class_attributes_enum {
		Terminal,
		p,
		q,
			LAST_ENUM;
	}

		
		
		
	
	public SvPowerFlow() {
		SvPowerFlow_primitive_attributes = new BaseClass[SvPowerFlow_primitive_builder.values().length];
		SvPowerFlow_class_attributes = new BaseClass[SvPowerFlow_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(SvPowerFlow_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SvPowerFlow_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(SvPowerFlow_primitive_builder attrEnum, BaseClass value) {
		try {
			SvPowerFlow_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SvPowerFlow_class_attributes_enum attrEnum = SvPowerFlow_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated SvPowerFlow, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SvPowerFlow_primitive_builder attrEnum = SvPowerFlow_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated SvPowerFlow, setting " + attrName  + " to: "  + value);
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
			for (SvPowerFlow_primitive_builder attrEnum: SvPowerFlow_primitive_builder.values()) {
				BaseClass bc = SvPowerFlow_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SvPowerFlow." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SvPowerFlow_class_attributes_enum attrEnum: SvPowerFlow_class_attributes_enum.values()) {
				BaseClass bc = SvPowerFlow_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SvPowerFlow." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(SvPowerFlow) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "SvPowerFlow";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new SvPowerFlow();
        }
};
