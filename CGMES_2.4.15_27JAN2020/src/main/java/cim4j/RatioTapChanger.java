package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TapChanger;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.TransformerControlMode;
import cim4j.PerCent;


import cim4j.RatioTapChangerTable;
import cim4j.TransformerEnd;

/*
A tap changer that changes the voltage ratio impacting the voltage magnitude but not the phase angle across the transformer.
*/
public class RatioTapChanger extends TapChanger
{
	private BaseClass[] RatioTapChanger_class_attributes;
	private BaseClass[] RatioTapChanger_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum RatioTapChanger_primitive_builder implements PrimitiveBuilder {
		tculControlMode(){
			public BaseClass construct (java.lang.String value) {
				return new TransformerControlMode(value);
			}
		},
		stepVoltageIncrement(){
			public BaseClass construct (java.lang.String value) {
				return new PerCent(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum RatioTapChanger_class_attributes_enum {
		tculControlMode,
		stepVoltageIncrement,
		RatioTapChangerTable,
		TransformerEnd,
			LAST_ENUM;
	}

		
		
		
		
	
	public RatioTapChanger() {
		RatioTapChanger_primitive_attributes = new BaseClass[RatioTapChanger_primitive_builder.values().length];
		RatioTapChanger_class_attributes = new BaseClass[RatioTapChanger_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(RatioTapChanger_class_attributes_enum attrEnum, BaseClass value) {
		try {
			RatioTapChanger_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(RatioTapChanger_primitive_builder attrEnum, BaseClass value) {
		try {
			RatioTapChanger_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			RatioTapChanger_class_attributes_enum attrEnum = RatioTapChanger_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated RatioTapChanger, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			RatioTapChanger_primitive_builder attrEnum = RatioTapChanger_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated RatioTapChanger, setting " + attrName  + " to: "  + value);
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
			for (RatioTapChanger_primitive_builder attrEnum: RatioTapChanger_primitive_builder.values()) {
				BaseClass bc = RatioTapChanger_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RatioTapChanger." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (RatioTapChanger_class_attributes_enum attrEnum: RatioTapChanger_class_attributes_enum.values()) {
				BaseClass bc = RatioTapChanger_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RatioTapChanger." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(RatioTapChanger) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "RatioTapChanger";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new RatioTapChanger();
        }
};
