package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.Switch;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;





/*
A manually operated or motor operated mechanical switching device used for isolating a circuit or equipment from ground.
*/
public class GroundDisconnector extends Switch
{
	private BaseClass[] GroundDisconnector_class_attributes;
	private BaseClass[] GroundDisconnector_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GroundDisconnector_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum GroundDisconnector_class_attributes_enum {
			LAST_ENUM;
	}

	
	public GroundDisconnector() {
		GroundDisconnector_primitive_attributes = new BaseClass[GroundDisconnector_primitive_builder.values().length];
		GroundDisconnector_class_attributes = new BaseClass[GroundDisconnector_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GroundDisconnector_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GroundDisconnector_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GroundDisconnector_primitive_builder attrEnum, BaseClass value) {
		try {
			GroundDisconnector_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GroundDisconnector_class_attributes_enum attrEnum = GroundDisconnector_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GroundDisconnector, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GroundDisconnector_primitive_builder attrEnum = GroundDisconnector_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GroundDisconnector, setting " + attrName  + " to: "  + value);
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
			for (GroundDisconnector_primitive_builder attrEnum: GroundDisconnector_primitive_builder.values()) {
				BaseClass bc = GroundDisconnector_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GroundDisconnector." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GroundDisconnector_class_attributes_enum attrEnum: GroundDisconnector_class_attributes_enum.values()) {
				BaseClass bc = GroundDisconnector_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GroundDisconnector." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GroundDisconnector) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GroundDisconnector";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GroundDisconnector();
        }
};
