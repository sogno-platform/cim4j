package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.LimitSet;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.Analog;
import cim4j.AnalogLimit;

/*
An AnalogLimitSet specifies a set of Limits that are associated with an Analog measurement.
*/
public class AnalogLimitSet extends LimitSet
{
	private BaseClass[] AnalogLimitSet_class_attributes;
	private BaseClass[] AnalogLimitSet_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum AnalogLimitSet_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum AnalogLimitSet_class_attributes_enum {
		Measurements,
		Limits,
			LAST_ENUM;
	}

		
		
	
	public AnalogLimitSet() {
		AnalogLimitSet_primitive_attributes = new BaseClass[AnalogLimitSet_primitive_builder.values().length];
		AnalogLimitSet_class_attributes = new BaseClass[AnalogLimitSet_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(AnalogLimitSet_class_attributes_enum attrEnum, BaseClass value) {
		try {
			AnalogLimitSet_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(AnalogLimitSet_primitive_builder attrEnum, BaseClass value) {
		try {
			AnalogLimitSet_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			AnalogLimitSet_class_attributes_enum attrEnum = AnalogLimitSet_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated AnalogLimitSet, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			AnalogLimitSet_primitive_builder attrEnum = AnalogLimitSet_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated AnalogLimitSet, setting " + attrName  + " to: "  + value);
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
			for (AnalogLimitSet_primitive_builder attrEnum: AnalogLimitSet_primitive_builder.values()) {
				BaseClass bc = AnalogLimitSet_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    AnalogLimitSet." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (AnalogLimitSet_class_attributes_enum attrEnum: AnalogLimitSet_class_attributes_enum.values()) {
				BaseClass bc = AnalogLimitSet_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    AnalogLimitSet." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(AnalogLimitSet) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "AnalogLimitSet";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new AnalogLimitSet();
        }
};
