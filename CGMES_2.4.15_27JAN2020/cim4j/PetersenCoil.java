package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.EarthFaultCompensator;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PetersenCoilModeKind;
import cim4j.Voltage;
import cim4j.CurrentFlow;
import cim4j.Reactance;



/*
A tunable impedance device normally used to offset line charging during single line faults in an ungrounded section of network.
*/
public class PetersenCoil extends EarthFaultCompensator
{
	private BaseClass[] PetersenCoil_class_attributes;
	private BaseClass[] PetersenCoil_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PetersenCoil_primitive_builder implements PrimitiveBuilder {
		mode(){
			public BaseClass construct (java.lang.String value) {
				return new PetersenCoilModeKind(value);
			}
		},
		nominalU(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
		offsetCurrent(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
		positionCurrent(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
		xGroundMax(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
		xGroundMin(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
		xGroundNominal(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum PetersenCoil_class_attributes_enum {
		mode,
		nominalU,
		offsetCurrent,
		positionCurrent,
		xGroundMax,
		xGroundMin,
		xGroundNominal,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
	
	public PetersenCoil() {
		PetersenCoil_primitive_attributes = new BaseClass[PetersenCoil_primitive_builder.values().length];
		PetersenCoil_class_attributes = new BaseClass[PetersenCoil_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PetersenCoil_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PetersenCoil_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PetersenCoil_primitive_builder attrEnum, BaseClass value) {
		try {
			PetersenCoil_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PetersenCoil_class_attributes_enum attrEnum = PetersenCoil_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PetersenCoil, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PetersenCoil_primitive_builder attrEnum = PetersenCoil_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PetersenCoil, setting " + attrName  + " to: "  + value);
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
			for (PetersenCoil_primitive_builder attrEnum: PetersenCoil_primitive_builder.values()) {
				BaseClass bc = PetersenCoil_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PetersenCoil." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PetersenCoil_class_attributes_enum attrEnum: PetersenCoil_class_attributes_enum.values()) {
				BaseClass bc = PetersenCoil_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PetersenCoil." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PetersenCoil) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PetersenCoil";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PetersenCoil();
        }
};
