package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ConductingEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ApparentPower;
import cim4j.ActivePower;
import cim4j.Voltage;
import cim4j.Integer;
import cim4j.Resistance;
import cim4j.ReactivePower;
import cim4j.CurrentFlow;


import cim4j.ActivePowerPerCurrentFlow;
import cim4j.ACDCConverterDCTerminal;
import cim4j.Terminal;

/*
A unit with valves for three phases, together with unit control equipment, essential protective and switching devices, DC storage capacitors, phase reactors and auxiliaries, if any, used for conversion.
*/
public class ACDCConverter extends ConductingEquipment
{
	private BaseClass[] ACDCConverter_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ACDCConverter_primitive_builder implements PrimitiveBuilder {
			baseS(){
			public BaseClass construct (java.lang.String value) {
				return new ApparentPower(value);
			}
		},
			idleLoss(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			maxUdc(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
			minUdc(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
			numberOfValves(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
			ratedUdc(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
			resistiveLoss(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
			valveU0(){
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
			targetPpcc(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			targetUdc(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
			idc(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
			poleLossP(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			uc(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
			udc(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ACDCConverter() {
		ACDCConverter_attributes = new BaseClass[ACDCConverter_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ACDCConverter_primitive_builder attrEnum, BaseClass value) {
		try {
			ACDCConverter_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ACDCConverter_ATTR_ENUM attrEnum = ACDCConverter_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ACDCConverter_primitive_builder attrEnum = ACDCConverter_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ACDCConverter_primitive_builder attrEnum: ACDCConverter_primitive_builder.values()) {
			BaseClass bc = ACDCConverter_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ACDCConverter";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ACDCConverter();
        }
};
