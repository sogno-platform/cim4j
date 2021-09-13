package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DynamicsFunctionBlock;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.ExcitationSystemDynamics;

/*
Overexcitation limiter function block whose behaviour is described by reference to a standard model
*/
public class OverexcitationLimiterDynamics extends DynamicsFunctionBlock
{
	private BaseClass[] OverexcitationLimiterDynamics_class_attributes;
	private BaseClass[] OverexcitationLimiterDynamics_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum OverexcitationLimiterDynamics_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum OverexcitationLimiterDynamics_class_attributes_enum {
		ExcitationSystemDynamics,
			LAST_ENUM;
	}

		
	
	public OverexcitationLimiterDynamics() {
		OverexcitationLimiterDynamics_primitive_attributes = new BaseClass[OverexcitationLimiterDynamics_primitive_builder.values().length];
		OverexcitationLimiterDynamics_class_attributes = new BaseClass[OverexcitationLimiterDynamics_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(OverexcitationLimiterDynamics_class_attributes_enum attrEnum, BaseClass value) {
		try {
			OverexcitationLimiterDynamics_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(OverexcitationLimiterDynamics_primitive_builder attrEnum, BaseClass value) {
		try {
			OverexcitationLimiterDynamics_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			OverexcitationLimiterDynamics_class_attributes_enum attrEnum = OverexcitationLimiterDynamics_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated OverexcitationLimiterDynamics, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			OverexcitationLimiterDynamics_primitive_builder attrEnum = OverexcitationLimiterDynamics_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated OverexcitationLimiterDynamics, setting " + attrName  + " to: "  + value);
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
			for (OverexcitationLimiterDynamics_primitive_builder attrEnum: OverexcitationLimiterDynamics_primitive_builder.values()) {
				BaseClass bc = OverexcitationLimiterDynamics_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    OverexcitationLimiterDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (OverexcitationLimiterDynamics_class_attributes_enum attrEnum: OverexcitationLimiterDynamics_class_attributes_enum.values()) {
				BaseClass bc = OverexcitationLimiterDynamics_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    OverexcitationLimiterDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(OverexcitationLimiterDynamics) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "OverexcitationLimiterDynamics";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new OverexcitationLimiterDynamics();
        }
};
