package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.MonthDay;
import cim4j.SeasonDayTypeSchedule;

/*
A specified time period of the year.
*/
public class Season extends IdentifiedObject
{
	private BaseClass[] Season_class_attributes;
	private BaseClass[] Season_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Season_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum Season_class_attributes_enum {
		endDate,
		startDate,
		SeasonDayTypeSchedules,
			LAST_ENUM;
	}

		
		
		
	
	public Season() {
		Season_primitive_attributes = new BaseClass[Season_primitive_builder.values().length];
		Season_class_attributes = new BaseClass[Season_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Season_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Season_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Season_primitive_builder attrEnum, BaseClass value) {
		try {
			Season_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Season_class_attributes_enum attrEnum = Season_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Season, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Season_primitive_builder attrEnum = Season_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Season, setting " + attrName  + " to: "  + value);
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
			for (Season_primitive_builder attrEnum: Season_primitive_builder.values()) {
				BaseClass bc = Season_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Season." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Season_class_attributes_enum attrEnum: Season_class_attributes_enum.values()) {
				BaseClass bc = Season_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Season." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Season) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Season";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Season();
        }
};
