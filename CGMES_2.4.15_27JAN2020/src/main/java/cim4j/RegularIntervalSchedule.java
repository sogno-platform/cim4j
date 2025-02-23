package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BasicIntervalSchedule;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Seconds;


import cim4j.DateTime;
import cim4j.RegularTimePoint;

/*
The schedule has time points where the time between them is constant.
*/
public class RegularIntervalSchedule extends BasicIntervalSchedule
{
	private BaseClass[] RegularIntervalSchedule_class_attributes;
	private BaseClass[] RegularIntervalSchedule_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum RegularIntervalSchedule_primitive_builder implements PrimitiveBuilder {
		timeStep(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum RegularIntervalSchedule_class_attributes_enum {
		timeStep,
		endTime,
		TimePoints,
			LAST_ENUM;
	}

		
		
		
	
	public RegularIntervalSchedule() {
		RegularIntervalSchedule_primitive_attributes = new BaseClass[RegularIntervalSchedule_primitive_builder.values().length];
		RegularIntervalSchedule_class_attributes = new BaseClass[RegularIntervalSchedule_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(RegularIntervalSchedule_class_attributes_enum attrEnum, BaseClass value) {
		try {
			RegularIntervalSchedule_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(RegularIntervalSchedule_primitive_builder attrEnum, BaseClass value) {
		try {
			RegularIntervalSchedule_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			RegularIntervalSchedule_class_attributes_enum attrEnum = RegularIntervalSchedule_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated RegularIntervalSchedule, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			RegularIntervalSchedule_primitive_builder attrEnum = RegularIntervalSchedule_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated RegularIntervalSchedule, setting " + attrName  + " to: "  + value);
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
			for (RegularIntervalSchedule_primitive_builder attrEnum: RegularIntervalSchedule_primitive_builder.values()) {
				BaseClass bc = RegularIntervalSchedule_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RegularIntervalSchedule." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (RegularIntervalSchedule_class_attributes_enum attrEnum: RegularIntervalSchedule_class_attributes_enum.values()) {
				BaseClass bc = RegularIntervalSchedule_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RegularIntervalSchedule." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(RegularIntervalSchedule) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "RegularIntervalSchedule";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new RegularIntervalSchedule();
        }
};
