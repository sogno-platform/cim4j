package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.Measurement;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.AccumulatorLimitSet;
import cim4j.AccumulatorValue;

/*
Accumulator represents an accumulated (counted) Measurement, e.g. an energy value.
*/
public class Accumulator extends Measurement
{
	private BaseClass[] Accumulator_class_attributes;
	private BaseClass[] Accumulator_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Accumulator_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum Accumulator_class_attributes_enum {
		LimitSets,
		AccumulatorValues,
			LAST_ENUM;
	}

		
		
	
	public Accumulator() {
		Accumulator_primitive_attributes = new BaseClass[Accumulator_primitive_builder.values().length];
		Accumulator_class_attributes = new BaseClass[Accumulator_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Accumulator_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Accumulator_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Accumulator_primitive_builder attrEnum, BaseClass value) {
		try {
			Accumulator_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Accumulator_class_attributes_enum attrEnum = Accumulator_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Accumulator, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Accumulator_primitive_builder attrEnum = Accumulator_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Accumulator, setting " + attrName  + " to: "  + value);
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
			for (Accumulator_primitive_builder attrEnum: Accumulator_primitive_builder.values()) {
				BaseClass bc = Accumulator_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Accumulator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Accumulator_class_attributes_enum attrEnum: Accumulator_class_attributes_enum.values()) {
				BaseClass bc = Accumulator_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Accumulator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Accumulator) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Accumulator";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Accumulator();
        }
};
