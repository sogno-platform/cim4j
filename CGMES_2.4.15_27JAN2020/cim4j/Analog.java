package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.Measurement;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;


import cim4j.AnalogValue;
import cim4j.AnalogLimitSet;

/*
Analog represents an analog Measurement.
*/
public class Analog extends Measurement
{
	private BaseClass[] Analog_class_attributes;
	private BaseClass[] Analog_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Analog_primitive_builder implements PrimitiveBuilder {
		positiveFlowIn(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum Analog_class_attributes_enum {
		positiveFlowIn,
		AnalogValues,
		LimitSets,
			LAST_ENUM;
	}

		
		
		
	
	public Analog() {
		Analog_primitive_attributes = new BaseClass[Analog_primitive_builder.values().length];
		Analog_class_attributes = new BaseClass[Analog_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Analog_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Analog_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Analog_primitive_builder attrEnum, BaseClass value) {
		try {
			Analog_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Analog_class_attributes_enum attrEnum = Analog_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Analog, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Analog_primitive_builder attrEnum = Analog_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Analog, setting " + attrName  + " to: "  + value);
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
			for (Analog_primitive_builder attrEnum: Analog_primitive_builder.values()) {
				BaseClass bc = Analog_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Analog." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Analog_class_attributes_enum attrEnum: Analog_class_attributes_enum.values()) {
				BaseClass bc = Analog_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Analog." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Analog) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Analog";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Analog();
        }
};
