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
	private BaseClass[] ControlArea_class_attributes;
	private BaseClass[] ControlArea_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

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

	private enum ControlArea_class_attributes_enum {
		type,
		TieFlow,
		ControlAreaGeneratingUnit,
		EnergyArea,
		netInterchange,
		pTolerance,
			LAST_ENUM;
	}

		
		
		
		
		
		
	
	public ControlArea() {
		ControlArea_primitive_attributes = new BaseClass[ControlArea_primitive_builder.values().length];
		ControlArea_class_attributes = new BaseClass[ControlArea_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ControlArea_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ControlArea_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ControlArea_primitive_builder attrEnum, BaseClass value) {
		try {
			ControlArea_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ControlArea_class_attributes_enum attrEnum = ControlArea_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ControlArea, setting " + attrName);
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
			System.out.println("Updated ControlArea, setting " + attrName  + " to: "  + value);
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
			for (ControlArea_primitive_builder attrEnum: ControlArea_primitive_builder.values()) {
				BaseClass bc = ControlArea_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ControlArea." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ControlArea_class_attributes_enum attrEnum: ControlArea_class_attributes_enum.values()) {
				BaseClass bc = ControlArea_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ControlArea." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ControlArea) RDFID: " + rdfid;
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
