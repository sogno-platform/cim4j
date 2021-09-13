package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.SeasonDayTypeSchedule;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.RegulatingControl;

/*
A pre-established pattern over time for a controlled variable, e.g., busbar voltage.
*/
public class RegulationSchedule extends SeasonDayTypeSchedule
{
	private BaseClass[] RegulationSchedule_class_attributes;
	private BaseClass[] RegulationSchedule_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum RegulationSchedule_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum RegulationSchedule_class_attributes_enum {
		RegulatingControl,
			LAST_ENUM;
	}

		
	
	public RegulationSchedule() {
		RegulationSchedule_primitive_attributes = new BaseClass[RegulationSchedule_primitive_builder.values().length];
		RegulationSchedule_class_attributes = new BaseClass[RegulationSchedule_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(RegulationSchedule_class_attributes_enum attrEnum, BaseClass value) {
		try {
			RegulationSchedule_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(RegulationSchedule_primitive_builder attrEnum, BaseClass value) {
		try {
			RegulationSchedule_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			RegulationSchedule_class_attributes_enum attrEnum = RegulationSchedule_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated RegulationSchedule, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			RegulationSchedule_primitive_builder attrEnum = RegulationSchedule_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated RegulationSchedule, setting " + attrName  + " to: "  + value);
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
			for (RegulationSchedule_primitive_builder attrEnum: RegulationSchedule_primitive_builder.values()) {
				BaseClass bc = RegulationSchedule_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RegulationSchedule." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (RegulationSchedule_class_attributes_enum attrEnum: RegulationSchedule_class_attributes_enum.values()) {
				BaseClass bc = RegulationSchedule_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RegulationSchedule." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(RegulationSchedule) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "RegulationSchedule";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new RegulationSchedule();
        }
};
