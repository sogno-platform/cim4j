package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.RegulatingCondEq;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.ApparentPower;
import cim4j.Voltage;
import cim4j.ActivePower;
import cim4j.ReactivePower;


import cim4j.GeneratingUnit;
import cim4j.HydroPump;

/*
A rotating machine which may be used as a generator or motor.
*/
public class RotatingMachine extends RegulatingCondEq
{
	private BaseClass[] RotatingMachine_class_attributes;
	private BaseClass[] RotatingMachine_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum RotatingMachine_primitive_builder implements PrimitiveBuilder {
		ratedPowerFactor(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ratedS(){
			public BaseClass construct (java.lang.String value) {
				return new ApparentPower(value);
			}
		},
		ratedU(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
		p(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		q(){
			public BaseClass construct (java.lang.String value) {
				return new ReactivePower(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum RotatingMachine_class_attributes_enum {
		GeneratingUnit,
		HydroPump,
		ratedPowerFactor,
		ratedS,
		ratedU,
		p,
		q,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
	
	public RotatingMachine() {
		RotatingMachine_primitive_attributes = new BaseClass[RotatingMachine_primitive_builder.values().length];
		RotatingMachine_class_attributes = new BaseClass[RotatingMachine_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(RotatingMachine_class_attributes_enum attrEnum, BaseClass value) {
		try {
			RotatingMachine_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(RotatingMachine_primitive_builder attrEnum, BaseClass value) {
		try {
			RotatingMachine_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			RotatingMachine_class_attributes_enum attrEnum = RotatingMachine_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated RotatingMachine, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			RotatingMachine_primitive_builder attrEnum = RotatingMachine_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated RotatingMachine, setting " + attrName  + " to: "  + value);
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
			for (RotatingMachine_primitive_builder attrEnum: RotatingMachine_primitive_builder.values()) {
				BaseClass bc = RotatingMachine_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RotatingMachine." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (RotatingMachine_class_attributes_enum attrEnum: RotatingMachine_class_attributes_enum.values()) {
				BaseClass bc = RotatingMachine_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RotatingMachine." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(RotatingMachine) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "RotatingMachine";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new RotatingMachine();
        }
};
