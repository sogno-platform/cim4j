package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.EquivalentEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ActivePower;
import cim4j.ReactivePower;
import cim4j.Boolean;
import cim4j.Resistance;
import cim4j.Reactance;
import cim4j.Voltage;


import cim4j.ReactiveCapabilityCurve;

/*
This class represents equivalent injections (generation or load).  Voltage regulation is allowed only at the point of connection.
*/
public class EquivalentInjection extends EquivalentEquipment
{
	private BaseClass[] EquivalentInjection_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum EquivalentInjection_primitive_builder implements PrimitiveBuilder {
			maxP(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			maxQ(){
			public BaseClass construct (java.lang.String value) {
				return new ReactivePower(value);
			}
		},
			minP(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			minQ(){
			public BaseClass construct (java.lang.String value) {
				return new ReactivePower(value);
			}
		},
			regulationCapability(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
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
			r2(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
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
			x2(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
			regulationStatus(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			regulationTarget(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public EquivalentInjection() {
		EquivalentInjection_attributes = new BaseClass[EquivalentInjection_primitive_builder.values().length];
	}

	public void updateAttributeInArray(EquivalentInjection_primitive_builder attrEnum, BaseClass value) {
		try {
			EquivalentInjection_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//EquivalentInjection_ATTR_ENUM attrEnum = EquivalentInjection_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			EquivalentInjection_primitive_builder attrEnum = EquivalentInjection_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (EquivalentInjection_primitive_builder attrEnum: EquivalentInjection_primitive_builder.values()) {
			BaseClass bc = EquivalentInjection_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "EquivalentInjection";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new EquivalentInjection();
        }
};
