package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ConductingEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Resistance;
import cim4j.Reactance;
import cim4j.Boolean;
import cim4j.CurrentFlow;
import cim4j.Voltage;



/*
A Series Compensator is a series capacitor or reactor or an AC transmission line without charging susceptance.  It is a two terminal device.
*/
public class SeriesCompensator extends ConductingEquipment
{
	private BaseClass[] SeriesCompensator_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum SeriesCompensator_primitive_builder implements PrimitiveBuilder {
			r(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
			x(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
			varistorPresent(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			varistorRatedCurrent(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
			varistorVoltageThreshold(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
			r0(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
			x0(){
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

		
		
		
		
		
		
		
	
	public SeriesCompensator() {
		SeriesCompensator_attributes = new BaseClass[SeriesCompensator_primitive_builder.values().length];
	}

	public void updateAttributeInArray(SeriesCompensator_primitive_builder attrEnum, BaseClass value) {
		try {
			SeriesCompensator_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//SeriesCompensator_ATTR_ENUM attrEnum = SeriesCompensator_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SeriesCompensator_primitive_builder attrEnum = SeriesCompensator_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (SeriesCompensator_primitive_builder attrEnum: SeriesCompensator_primitive_builder.values()) {
			BaseClass bc = SeriesCompensator_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "SeriesCompensator";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new SeriesCompensator();
        }
};
