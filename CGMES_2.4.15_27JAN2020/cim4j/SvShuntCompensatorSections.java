package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;


import cim4j.ShuntCompensator;

/*
State variable for the number of sections in service for a shunt compensator.
*/
public class SvShuntCompensatorSections extends BaseClass
{
	private BaseClass[] SvShuntCompensatorSections_class_attributes;
	private BaseClass[] SvShuntCompensatorSections_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum SvShuntCompensatorSections_primitive_builder implements PrimitiveBuilder {
		sections(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum SvShuntCompensatorSections_class_attributes_enum {
		sections,
		ShuntCompensator,
			LAST_ENUM;
	}

		
		
	
	public SvShuntCompensatorSections() {
		SvShuntCompensatorSections_primitive_attributes = new BaseClass[SvShuntCompensatorSections_primitive_builder.values().length];
		SvShuntCompensatorSections_class_attributes = new BaseClass[SvShuntCompensatorSections_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(SvShuntCompensatorSections_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SvShuntCompensatorSections_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(SvShuntCompensatorSections_primitive_builder attrEnum, BaseClass value) {
		try {
			SvShuntCompensatorSections_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SvShuntCompensatorSections_class_attributes_enum attrEnum = SvShuntCompensatorSections_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated SvShuntCompensatorSections, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SvShuntCompensatorSections_primitive_builder attrEnum = SvShuntCompensatorSections_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated SvShuntCompensatorSections, setting " + attrName  + " to: "  + value);
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
			for (SvShuntCompensatorSections_primitive_builder attrEnum: SvShuntCompensatorSections_primitive_builder.values()) {
				BaseClass bc = SvShuntCompensatorSections_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SvShuntCompensatorSections." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SvShuntCompensatorSections_class_attributes_enum attrEnum: SvShuntCompensatorSections_class_attributes_enum.values()) {
				BaseClass bc = SvShuntCompensatorSections_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SvShuntCompensatorSections." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(SvShuntCompensatorSections) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "SvShuntCompensatorSections";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new SvShuntCompensatorSections();
        }
};
