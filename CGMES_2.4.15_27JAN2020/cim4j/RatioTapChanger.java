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
	private BaseClass[] RatioTapChanger_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
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

		
		
		
		
	
	public RatioTapChanger() {
		RatioTapChanger_attributes = new BaseClass[RatioTapChanger_primitive_builder.values().length];
	}

	public void updateAttributeInArray(RatioTapChanger_primitive_builder attrEnum, BaseClass value) {
		try {
			RatioTapChanger_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//RatioTapChanger_ATTR_ENUM attrEnum = RatioTapChanger_ATTR_BC_ENUM.valueOf(attrName);
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
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (RatioTapChanger_primitive_builder attrEnum: RatioTapChanger_primitive_builder.values()) {
			BaseClass bc = RatioTapChanger_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
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