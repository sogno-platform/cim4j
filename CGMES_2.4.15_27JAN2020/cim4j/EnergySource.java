package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ConductingEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Voltage;
import cim4j.Resistance;
import cim4j.AngleRadians;
import cim4j.Reactance;
import cim4j.ActivePower;
import cim4j.ReactivePower;


import cim4j.EnergySchedulingType;
import cim4j.WindTurbineType3or4Dynamics;

/*
A generic equivalent for an energy supplier on a transmission or distribution voltage level.
*/
public class EnergySource extends ConductingEquipment
{
	private BaseClass[] EnergySource_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum EnergySource_primitive_builder implements PrimitiveBuilder {
			nominalVoltage(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
			r(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
			r0(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
			rn(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
			voltageAngle(){
			public BaseClass construct (java.lang.String value) {
				return new AngleRadians(value);
			}
		},
			voltageMagnitude(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
			x(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
			x0(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
			xn(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
			activePower(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			reactivePower(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public EnergySource() {
		EnergySource_attributes = new BaseClass[EnergySource_primitive_builder.values().length];
	}

	public void updateAttributeInArray(EnergySource_primitive_builder attrEnum, BaseClass value) {
		try {
			EnergySource_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//EnergySource_ATTR_ENUM attrEnum = EnergySource_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			EnergySource_primitive_builder attrEnum = EnergySource_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (EnergySource_primitive_builder attrEnum: EnergySource_primitive_builder.values()) {
			BaseClass bc = EnergySource_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "EnergySource";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new EnergySource();
        }
};
