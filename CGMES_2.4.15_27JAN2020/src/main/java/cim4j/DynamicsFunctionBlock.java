package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;



/*
Abstract parent class for all Dynamics function blocks.
*/
public class DynamicsFunctionBlock extends IdentifiedObject
{
	private BaseClass[] DynamicsFunctionBlock_class_attributes;
	private BaseClass[] DynamicsFunctionBlock_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum DynamicsFunctionBlock_primitive_builder implements PrimitiveBuilder {
		enabled(){
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

	private enum DynamicsFunctionBlock_class_attributes_enum {
		enabled,
			LAST_ENUM;
	}

		
	
	public DynamicsFunctionBlock() {
		DynamicsFunctionBlock_primitive_attributes = new BaseClass[DynamicsFunctionBlock_primitive_builder.values().length];
		DynamicsFunctionBlock_class_attributes = new BaseClass[DynamicsFunctionBlock_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DynamicsFunctionBlock_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DynamicsFunctionBlock_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DynamicsFunctionBlock_primitive_builder attrEnum, BaseClass value) {
		try {
			DynamicsFunctionBlock_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DynamicsFunctionBlock_class_attributes_enum attrEnum = DynamicsFunctionBlock_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DynamicsFunctionBlock, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DynamicsFunctionBlock_primitive_builder attrEnum = DynamicsFunctionBlock_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated DynamicsFunctionBlock, setting " + attrName  + " to: "  + value);
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
			for (DynamicsFunctionBlock_primitive_builder attrEnum: DynamicsFunctionBlock_primitive_builder.values()) {
				BaseClass bc = DynamicsFunctionBlock_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DynamicsFunctionBlock." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DynamicsFunctionBlock_class_attributes_enum attrEnum: DynamicsFunctionBlock_class_attributes_enum.values()) {
				BaseClass bc = DynamicsFunctionBlock_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DynamicsFunctionBlock." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DynamicsFunctionBlock) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "DynamicsFunctionBlock";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DynamicsFunctionBlock();
        }
};
