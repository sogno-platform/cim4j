package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;


import cim4j.ConductingEquipment;

/*
State variable for status.
*/
public class SvStatus extends BaseClass
{
	private BaseClass[] SvStatus_class_attributes;
	private BaseClass[] SvStatus_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum SvStatus_primitive_builder implements PrimitiveBuilder {
		inService(){
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

	private enum SvStatus_class_attributes_enum {
		ConductingEquipment,
		inService,
			LAST_ENUM;
	}

		
		
	
	public SvStatus() {
		SvStatus_primitive_attributes = new BaseClass[SvStatus_primitive_builder.values().length];
		SvStatus_class_attributes = new BaseClass[SvStatus_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(SvStatus_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SvStatus_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(SvStatus_primitive_builder attrEnum, BaseClass value) {
		try {
			SvStatus_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SvStatus_class_attributes_enum attrEnum = SvStatus_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated SvStatus, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SvStatus_primitive_builder attrEnum = SvStatus_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated SvStatus, setting " + attrName  + " to: "  + value);
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
			for (SvStatus_primitive_builder attrEnum: SvStatus_primitive_builder.values()) {
				BaseClass bc = SvStatus_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SvStatus." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SvStatus_class_attributes_enum attrEnum: SvStatus_class_attributes_enum.values()) {
				BaseClass bc = SvStatus_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SvStatus." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(SvStatus) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "SvStatus";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new SvStatus();
        }
};
