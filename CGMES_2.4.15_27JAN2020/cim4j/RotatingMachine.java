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
	private BaseClass[] RotatingMachine_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
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

		
		
		
		
		
		
		
	
	public RotatingMachine() {
		RotatingMachine_attributes = new BaseClass[RotatingMachine_primitive_builder.values().length];
	}

	public void updateAttributeInArray(RotatingMachine_primitive_builder attrEnum, BaseClass value) {
		try {
			RotatingMachine_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//RotatingMachine_ATTR_ENUM attrEnum = RotatingMachine_ATTR_BC_ENUM.valueOf(attrName);
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
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (RotatingMachine_primitive_builder attrEnum: RotatingMachine_primitive_builder.values()) {
			BaseClass bc = RotatingMachine_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
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
