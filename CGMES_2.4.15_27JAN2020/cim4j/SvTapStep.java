package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;


import cim4j.TapChanger;

/*
State variable for transformer tap step.     This class is to be used for taps of LTC (load tap changing) transformers, not fixed tap transformers.
*/
public class SvTapStep extends BaseClass
{
	private BaseClass[] SvTapStep_class_attributes;
	private BaseClass[] SvTapStep_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum SvTapStep_primitive_builder implements PrimitiveBuilder {
		position(){
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

	private enum SvTapStep_class_attributes_enum {
		position,
		TapChanger,
			LAST_ENUM;
	}

		
		
	
	public SvTapStep() {
		SvTapStep_primitive_attributes = new BaseClass[SvTapStep_primitive_builder.values().length];
		SvTapStep_class_attributes = new BaseClass[SvTapStep_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(SvTapStep_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SvTapStep_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(SvTapStep_primitive_builder attrEnum, BaseClass value) {
		try {
			SvTapStep_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SvTapStep_class_attributes_enum attrEnum = SvTapStep_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated SvTapStep, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SvTapStep_primitive_builder attrEnum = SvTapStep_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated SvTapStep, setting " + attrName  + " to: "  + value);
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
			for (SvTapStep_primitive_builder attrEnum: SvTapStep_primitive_builder.values()) {
				BaseClass bc = SvTapStep_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SvTapStep." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SvTapStep_class_attributes_enum attrEnum: SvTapStep_class_attributes_enum.values()) {
				BaseClass bc = SvTapStep_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SvTapStep." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(SvTapStep) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "SvTapStep";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new SvTapStep();
        }
};
