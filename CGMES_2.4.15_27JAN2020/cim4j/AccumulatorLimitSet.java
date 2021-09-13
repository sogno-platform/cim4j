package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.LimitSet;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.Accumulator;
import cim4j.AccumulatorLimit;

/*
An AccumulatorLimitSet specifies a set of Limits that are associated with an Accumulator measurement.
*/
public class AccumulatorLimitSet extends LimitSet
{
	private BaseClass[] AccumulatorLimitSet_class_attributes;
	private BaseClass[] AccumulatorLimitSet_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum AccumulatorLimitSet_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum AccumulatorLimitSet_class_attributes_enum {
		Measurements,
		Limits,
			LAST_ENUM;
	}

		
		
	
	public AccumulatorLimitSet() {
		AccumulatorLimitSet_primitive_attributes = new BaseClass[AccumulatorLimitSet_primitive_builder.values().length];
		AccumulatorLimitSet_class_attributes = new BaseClass[AccumulatorLimitSet_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(AccumulatorLimitSet_class_attributes_enum attrEnum, BaseClass value) {
		try {
			AccumulatorLimitSet_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(AccumulatorLimitSet_primitive_builder attrEnum, BaseClass value) {
		try {
			AccumulatorLimitSet_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			AccumulatorLimitSet_class_attributes_enum attrEnum = AccumulatorLimitSet_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated AccumulatorLimitSet, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			AccumulatorLimitSet_primitive_builder attrEnum = AccumulatorLimitSet_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated AccumulatorLimitSet, setting " + attrName  + " to: "  + value);
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
			for (AccumulatorLimitSet_primitive_builder attrEnum: AccumulatorLimitSet_primitive_builder.values()) {
				BaseClass bc = AccumulatorLimitSet_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    AccumulatorLimitSet." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (AccumulatorLimitSet_class_attributes_enum attrEnum: AccumulatorLimitSet_class_attributes_enum.values()) {
				BaseClass bc = AccumulatorLimitSet_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    AccumulatorLimitSet." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(AccumulatorLimitSet) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "AccumulatorLimitSet";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new AccumulatorLimitSet();
        }
};
