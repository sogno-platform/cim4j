package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.RegularIntervalSchedule;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.DayType;
import cim4j.Season;

/*
A time schedule covering a 24 hour period, with curve data for a specific type of season and day.
*/
public class SeasonDayTypeSchedule extends RegularIntervalSchedule
{
	private BaseClass[] SeasonDayTypeSchedule_class_attributes;
	private BaseClass[] SeasonDayTypeSchedule_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum SeasonDayTypeSchedule_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum SeasonDayTypeSchedule_class_attributes_enum {
		DayType,
		Season,
			LAST_ENUM;
	}

		
		
	
	public SeasonDayTypeSchedule() {
		SeasonDayTypeSchedule_primitive_attributes = new BaseClass[SeasonDayTypeSchedule_primitive_builder.values().length];
		SeasonDayTypeSchedule_class_attributes = new BaseClass[SeasonDayTypeSchedule_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(SeasonDayTypeSchedule_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SeasonDayTypeSchedule_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(SeasonDayTypeSchedule_primitive_builder attrEnum, BaseClass value) {
		try {
			SeasonDayTypeSchedule_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SeasonDayTypeSchedule_class_attributes_enum attrEnum = SeasonDayTypeSchedule_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated SeasonDayTypeSchedule, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SeasonDayTypeSchedule_primitive_builder attrEnum = SeasonDayTypeSchedule_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated SeasonDayTypeSchedule, setting " + attrName  + " to: "  + value);
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
			for (SeasonDayTypeSchedule_primitive_builder attrEnum: SeasonDayTypeSchedule_primitive_builder.values()) {
				BaseClass bc = SeasonDayTypeSchedule_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SeasonDayTypeSchedule." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SeasonDayTypeSchedule_class_attributes_enum attrEnum: SeasonDayTypeSchedule_class_attributes_enum.values()) {
				BaseClass bc = SeasonDayTypeSchedule_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SeasonDayTypeSchedule." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(SeasonDayTypeSchedule) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "SeasonDayTypeSchedule";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new SeasonDayTypeSchedule();
        }
};
