package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PowerSystemResource;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ControlAreaTypeKind;
import cim4j.ActivePower;


import cim4j.TieFlow;
import cim4j.ControlAreaGeneratingUnit;
import cim4j.EnergyArea;

/*
A control areais a grouping of generating units and/or loads and a cutset of tie lines (as terminals) which may be used for a variety of purposes including automatic generation control, powerflow solution area interchange control specification, and input to load forecasting.   Note that any number of overlapping control area specifications can be superimposed on the physical model.
*/
public class ControlArea extends PowerSystemResource
{
	private BaseClass[] ControlArea_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ControlArea_primitive_builder implements PrimitiveBuilder {
			type(){
			public BaseClass construct (java.lang.String value) {
				return new ControlAreaTypeKind(value);
			}
		},
			netInterchange(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			pTolerance(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
	
	public ControlArea() {
		ControlArea_attributes = new BaseClass[ControlArea_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ControlArea_primitive_builder attrEnum, BaseClass value) {
		try {
			ControlArea_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ControlArea_ATTR_ENUM attrEnum = ControlArea_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ControlArea_primitive_builder attrEnum = ControlArea_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ControlArea_primitive_builder attrEnum: ControlArea_primitive_builder.values()) {
			BaseClass bc = ControlArea_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ControlArea";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ControlArea();
        }
};
