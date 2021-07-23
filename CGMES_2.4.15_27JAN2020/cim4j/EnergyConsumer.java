package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ConductingEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ActivePower;
import cim4j.PerCent;
import cim4j.ReactivePower;


import cim4j.LoadResponseCharacteristic;
import cim4j.LoadDynamics;

/*
Generic user of energy - a  point of consumption on the power system model.
*/
public class EnergyConsumer extends ConductingEquipment
{
	private BaseClass[] EnergyConsumer_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum EnergyConsumer_primitive_builder implements PrimitiveBuilder {
			pfixed(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			pfixedPct(){
			public BaseClass construct (java.lang.String value) {
				return new PerCent(value);
			}
		},
			qfixed(){
			public BaseClass construct (java.lang.String value) {
				return new ReactivePower(value);
			}
		},
			qfixedPct(){
			public BaseClass construct (java.lang.String value) {
				return new PerCent(value);
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

		
		
		
		
		
		
		
		
	
	public EnergyConsumer() {
		EnergyConsumer_attributes = new BaseClass[EnergyConsumer_primitive_builder.values().length];
	}

	public void updateAttributeInArray(EnergyConsumer_primitive_builder attrEnum, BaseClass value) {
		try {
			EnergyConsumer_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//EnergyConsumer_ATTR_ENUM attrEnum = EnergyConsumer_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			EnergyConsumer_primitive_builder attrEnum = EnergyConsumer_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (EnergyConsumer_primitive_builder attrEnum: EnergyConsumer_primitive_builder.values()) {
			BaseClass bc = EnergyConsumer_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "EnergyConsumer";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new EnergyConsumer();
        }
};
