package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.SeasonDayTypeSchedule;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.Switch;

/*
A schedule of switch positions.  If RegularTimePoint.value1 is 0, the switch is open.  If 1, the switch is closed.
*/
public class SwitchSchedule extends SeasonDayTypeSchedule
{
	private BaseClass[] SwitchSchedule_class_attributes;
	private BaseClass[] SwitchSchedule_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum SwitchSchedule_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum SwitchSchedule_class_attributes_enum {
		Switch,
			LAST_ENUM;
	}

		
	
	public SwitchSchedule() {
		SwitchSchedule_primitive_attributes = new BaseClass[SwitchSchedule_primitive_builder.values().length];
		SwitchSchedule_class_attributes = new BaseClass[SwitchSchedule_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(SwitchSchedule_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SwitchSchedule_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(SwitchSchedule_primitive_builder attrEnum, BaseClass value) {
		try {
			SwitchSchedule_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SwitchSchedule_class_attributes_enum attrEnum = SwitchSchedule_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated SwitchSchedule, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SwitchSchedule_primitive_builder attrEnum = SwitchSchedule_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated SwitchSchedule, setting " + attrName  + " to: "  + value);
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
			for (SwitchSchedule_primitive_builder attrEnum: SwitchSchedule_primitive_builder.values()) {
				BaseClass bc = SwitchSchedule_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SwitchSchedule." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SwitchSchedule_class_attributes_enum attrEnum: SwitchSchedule_class_attributes_enum.values()) {
				BaseClass bc = SwitchSchedule_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SwitchSchedule." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(SwitchSchedule) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "SwitchSchedule";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new SwitchSchedule();
        }
};
