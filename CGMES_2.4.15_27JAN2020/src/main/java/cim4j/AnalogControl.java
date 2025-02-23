package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.Control;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;


import cim4j.AnalogValue;

/*
An analog control used for supervisory control.
*/
public class AnalogControl extends Control
{
	private BaseClass[] AnalogControl_class_attributes;
	private BaseClass[] AnalogControl_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum AnalogControl_primitive_builder implements PrimitiveBuilder {
		maxValue(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		minValue(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum AnalogControl_class_attributes_enum {
		maxValue,
		minValue,
		AnalogValue,
			LAST_ENUM;
	}

		
		
		
	
	public AnalogControl() {
		AnalogControl_primitive_attributes = new BaseClass[AnalogControl_primitive_builder.values().length];
		AnalogControl_class_attributes = new BaseClass[AnalogControl_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(AnalogControl_class_attributes_enum attrEnum, BaseClass value) {
		try {
			AnalogControl_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(AnalogControl_primitive_builder attrEnum, BaseClass value) {
		try {
			AnalogControl_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			AnalogControl_class_attributes_enum attrEnum = AnalogControl_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated AnalogControl, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			AnalogControl_primitive_builder attrEnum = AnalogControl_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated AnalogControl, setting " + attrName  + " to: "  + value);
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
			for (AnalogControl_primitive_builder attrEnum: AnalogControl_primitive_builder.values()) {
				BaseClass bc = AnalogControl_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    AnalogControl." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (AnalogControl_class_attributes_enum attrEnum: AnalogControl_class_attributes_enum.values()) {
				BaseClass bc = AnalogControl_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    AnalogControl." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(AnalogControl) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "AnalogControl";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new AnalogControl();
        }
};
