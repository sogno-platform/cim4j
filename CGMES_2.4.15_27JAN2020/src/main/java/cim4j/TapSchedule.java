package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.SeasonDayTypeSchedule;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.TapChanger;

/*
A pre-established pattern over time for a tap step.
*/
public class TapSchedule extends SeasonDayTypeSchedule
{
	private BaseClass[] TapSchedule_class_attributes;
	private BaseClass[] TapSchedule_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum TapSchedule_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum TapSchedule_class_attributes_enum {
		TapChanger,
			LAST_ENUM;
	}

		
	
	public TapSchedule() {
		TapSchedule_primitive_attributes = new BaseClass[TapSchedule_primitive_builder.values().length];
		TapSchedule_class_attributes = new BaseClass[TapSchedule_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(TapSchedule_class_attributes_enum attrEnum, BaseClass value) {
		try {
			TapSchedule_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(TapSchedule_primitive_builder attrEnum, BaseClass value) {
		try {
			TapSchedule_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			TapSchedule_class_attributes_enum attrEnum = TapSchedule_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated TapSchedule, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			TapSchedule_primitive_builder attrEnum = TapSchedule_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated TapSchedule, setting " + attrName  + " to: "  + value);
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
			for (TapSchedule_primitive_builder attrEnum: TapSchedule_primitive_builder.values()) {
				BaseClass bc = TapSchedule_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TapSchedule." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (TapSchedule_class_attributes_enum attrEnum: TapSchedule_class_attributes_enum.values()) {
				BaseClass bc = TapSchedule_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TapSchedule." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(TapSchedule) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "TapSchedule";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new TapSchedule();
        }
};
