package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;
import cim4j.Simple_Float;


import cim4j.EnergyConsumer;

/*
Models the characteristic response of the load demand due to changes in system conditions such as voltage and frequency. This is not related to demand response.  If LoadResponseCharacteristic.exponentModel is True, the voltage exponents are specified and used as to calculate:  Active power component = Pnominal * (Voltage/cim:BaseVoltage.nominalVoltage) ** cim:LoadResponseCharacteristic.pVoltageExponent  Reactive power component = Qnominal * (Voltage/cim:BaseVoltage.nominalVoltage)** cim:LoadResponseCharacteristic.qVoltageExponent  Where  * means "multiply" and ** is "raised to power of".
*/
public class LoadResponseCharacteristic extends IdentifiedObject
{
	private BaseClass[] LoadResponseCharacteristic_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum LoadResponseCharacteristic_primitive_builder implements PrimitiveBuilder {
			exponentModel(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			pConstantCurrent(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			pConstantImpedance(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			pConstantPower(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			pFrequencyExponent(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			pVoltageExponent(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			qConstantCurrent(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			qConstantImpedance(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			qConstantPower(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			qFrequencyExponent(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			qVoltageExponent(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
		
		
	
	public LoadResponseCharacteristic() {
		LoadResponseCharacteristic_attributes = new BaseClass[LoadResponseCharacteristic_primitive_builder.values().length];
	}

	public void updateAttributeInArray(LoadResponseCharacteristic_primitive_builder attrEnum, BaseClass value) {
		try {
			LoadResponseCharacteristic_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//LoadResponseCharacteristic_ATTR_ENUM attrEnum = LoadResponseCharacteristic_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			LoadResponseCharacteristic_primitive_builder attrEnum = LoadResponseCharacteristic_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (LoadResponseCharacteristic_primitive_builder attrEnum: LoadResponseCharacteristic_primitive_builder.values()) {
			BaseClass bc = LoadResponseCharacteristic_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "LoadResponseCharacteristic";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new LoadResponseCharacteristic();
        }
};
