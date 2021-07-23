package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.SeasonDayTypeSchedule;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.ConformLoadGroup;

/*
A curve of load  versus time (X-axis) showing the active power values (Y1-axis) and reactive power (Y2-axis) for each unit of the period covered. This curve represents a typical pattern of load over the time period for a given day type and season.
*/
public class ConformLoadSchedule extends SeasonDayTypeSchedule
{
	private BaseClass[] ConformLoadSchedule_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ConformLoadSchedule_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
	
	public ConformLoadSchedule() {
		ConformLoadSchedule_attributes = new BaseClass[ConformLoadSchedule_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ConformLoadSchedule_primitive_builder attrEnum, BaseClass value) {
		try {
			ConformLoadSchedule_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ConformLoadSchedule_ATTR_ENUM attrEnum = ConformLoadSchedule_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ConformLoadSchedule_primitive_builder attrEnum = ConformLoadSchedule_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ConformLoadSchedule_primitive_builder attrEnum: ConformLoadSchedule_primitive_builder.values()) {
			BaseClass bc = ConformLoadSchedule_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ConformLoadSchedule";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ConformLoadSchedule();
        }
};
