package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.RegulatingCondEq;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Reactance;
import cim4j.SVCControlMode;
import cim4j.Voltage;
import cim4j.ReactivePower;


import cim4j.VoltagePerReactivePower;

/*
A facility for providing variable and controllable shunt reactive power. The SVC typically consists of a stepdown transformer, filter, thyristor-controlled reactor, and thyristor-switched capacitor arms.  The SVC may operate in fixed MVar output mode or in voltage control mode. When in voltage control mode, the output of the SVC will be proportional to the deviation of voltage at the controlled bus from the voltage setpoint.  The SVC characteristic slope defines the proportion.  If the voltage at the controlled bus is equal to the voltage setpoint, the SVC MVar output is zero.
*/
public class StaticVarCompensator extends RegulatingCondEq
{
	private BaseClass[] StaticVarCompensator_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum StaticVarCompensator_primitive_builder implements PrimitiveBuilder {
			capacitiveRating(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
			inductiveRating(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
			sVCControlMode(){
			public BaseClass construct (java.lang.String value) {
				return new SVCControlMode(value);
			}
		},
			voltageSetPoint(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
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

		
		
		
		
		
		
	
	public StaticVarCompensator() {
		StaticVarCompensator_attributes = new BaseClass[StaticVarCompensator_primitive_builder.values().length];
	}

	public void updateAttributeInArray(StaticVarCompensator_primitive_builder attrEnum, BaseClass value) {
		try {
			StaticVarCompensator_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//StaticVarCompensator_ATTR_ENUM attrEnum = StaticVarCompensator_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			StaticVarCompensator_primitive_builder attrEnum = StaticVarCompensator_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (StaticVarCompensator_primitive_builder attrEnum: StaticVarCompensator_primitive_builder.values()) {
			BaseClass bc = StaticVarCompensator_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "StaticVarCompensator";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new StaticVarCompensator();
        }
};
