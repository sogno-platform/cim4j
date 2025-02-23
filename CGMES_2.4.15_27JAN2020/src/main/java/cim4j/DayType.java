package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.SeasonDayTypeSchedule;

/*
Group of similar days.   For example it could be used to represent weekdays, weekend, or holidays.
*/
public class DayType extends IdentifiedObject
{
	private BaseClass[] DayType_class_attributes;
	private BaseClass[] DayType_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum DayType_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum DayType_class_attributes_enum {
		SeasonDayTypeSchedules,
			LAST_ENUM;
	}

		
	
	public DayType() {
		DayType_primitive_attributes = new BaseClass[DayType_primitive_builder.values().length];
		DayType_class_attributes = new BaseClass[DayType_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DayType_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DayType_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DayType_primitive_builder attrEnum, BaseClass value) {
		try {
			DayType_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DayType_class_attributes_enum attrEnum = DayType_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DayType, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DayType_primitive_builder attrEnum = DayType_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated DayType, setting " + attrName  + " to: "  + value);
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
			for (DayType_primitive_builder attrEnum: DayType_primitive_builder.values()) {
				BaseClass bc = DayType_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DayType." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DayType_class_attributes_enum attrEnum: DayType_class_attributes_enum.values()) {
				BaseClass bc = DayType_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DayType." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DayType) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "DayType";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DayType();
        }
};
