package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.RegulatingCondEq;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ActivePower;
import cim4j.ReactivePower;
import cim4j.Boolean;
import cim4j.CurrentFlow;
import cim4j.Simple_Float;
import cim4j.PU;
import cim4j.Integer;


import cim4j.ActivePowerPerFrequency;

/*
This class represents external network and it is used for IEC 60909 calculations.
*/
public class ExternalNetworkInjection extends RegulatingCondEq
{
	private BaseClass[] ExternalNetworkInjection_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ExternalNetworkInjection_primitive_builder implements PrimitiveBuilder {
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
			ikSecond(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			maxInitialSymShCCurrent(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
			maxR0ToX0Ratio(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			maxR1ToX1Ratio(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			maxZ0ToZ1Ratio(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			minInitialSymShCCurrent(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
			minR0ToX0Ratio(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			minR1ToX1Ratio(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			minZ0ToZ1Ratio(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			voltageFactor(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			referencePriority(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExternalNetworkInjection() {
		ExternalNetworkInjection_attributes = new BaseClass[ExternalNetworkInjection_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ExternalNetworkInjection_primitive_builder attrEnum, BaseClass value) {
		try {
			ExternalNetworkInjection_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ExternalNetworkInjection_ATTR_ENUM attrEnum = ExternalNetworkInjection_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExternalNetworkInjection_primitive_builder attrEnum = ExternalNetworkInjection_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ExternalNetworkInjection_primitive_builder attrEnum: ExternalNetworkInjection_primitive_builder.values()) {
			BaseClass bc = ExternalNetworkInjection_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ExternalNetworkInjection";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExternalNetworkInjection();
        }
};
