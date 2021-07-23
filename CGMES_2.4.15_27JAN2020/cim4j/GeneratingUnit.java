package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.Equipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.GeneratorControlSource;
import cim4j.PerCent;
import cim4j.ActivePower;
import cim4j.Simple_Float;
import cim4j.Money;


import cim4j.ControlAreaGeneratingUnit;
import cim4j.RotatingMachine;
import cim4j.GrossToNetActivePowerCurve;

/*
A single or set of synchronous machines for converting mechanical power into alternating-current power. For example, individual machines within a set may be defined for scheduling purposes while a single control signal is derived for the set. In this case there would be a GeneratingUnit for each member of the set and an additional GeneratingUnit corresponding to the set.
*/
public class GeneratingUnit extends Equipment
{
	private BaseClass[] GeneratingUnit_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum GeneratingUnit_primitive_builder implements PrimitiveBuilder {
			genControlSource(){
			public BaseClass construct (java.lang.String value) {
				return new GeneratorControlSource(value);
			}
		},
			governorSCD(){
			public BaseClass construct (java.lang.String value) {
				return new PerCent(value);
			}
		},
			initialP(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			longPF(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			maximumAllowableSpinningReserve(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			maxOperatingP(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			minOperatingP(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			nominalP(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			ratedGrossMaxP(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			ratedGrossMinP(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			ratedNetMaxP(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			shortPF(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			startupCost(){
			public BaseClass construct (java.lang.String value) {
				return new Money(value);
			}
		},
			variableCost(){
			public BaseClass construct (java.lang.String value) {
				return new Money(value);
			}
		},
			totalEfficiency(){
			public BaseClass construct (java.lang.String value) {
				return new PerCent(value);
			}
		},
			normalPF(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GeneratingUnit() {
		GeneratingUnit_attributes = new BaseClass[GeneratingUnit_primitive_builder.values().length];
	}

	public void updateAttributeInArray(GeneratingUnit_primitive_builder attrEnum, BaseClass value) {
		try {
			GeneratingUnit_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//GeneratingUnit_ATTR_ENUM attrEnum = GeneratingUnit_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GeneratingUnit_primitive_builder attrEnum = GeneratingUnit_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (GeneratingUnit_primitive_builder attrEnum: GeneratingUnit_primitive_builder.values()) {
			BaseClass bc = GeneratingUnit_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "GeneratingUnit";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GeneratingUnit();
        }
};
