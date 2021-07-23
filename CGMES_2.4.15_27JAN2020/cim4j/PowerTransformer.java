package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ConductingEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.CurrentFlow;
import cim4j.Voltage;
import cim4j.AngleDegrees;
import cim4j.Boolean;


import cim4j.PowerTransformerEnd;

/*
An electrical device consisting of  two or more coupled windings, with or without a magnetic core, for introducing mutual coupling between electric circuits. Transformers can be used to control voltage and phase shift (active power flow). A power transformer may be composed of separate transformer tanks that need not be identical. A power transformer can be modeled with or without tanks and is intended for use in both balanced and unbalanced representations.   A power transformer typically has two terminals, but may have one (grounding), three or more terminals. The inherited association ConductingEquipment.BaseVoltage should not be used.  The association from TransformerEnd to BaseVoltage should be used instead.
*/
public class PowerTransformer extends ConductingEquipment
{
	private BaseClass[] PowerTransformer_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum PowerTransformer_primitive_builder implements PrimitiveBuilder {
			beforeShCircuitHighestOperatingCurrent(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
			beforeShCircuitHighestOperatingVoltage(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
			beforeShortCircuitAnglePf(){
			public BaseClass construct (java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
			highSideMinOperatingU(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
			isPartOfGeneratorUnit(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			operationalValuesConsidered(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
	
	public PowerTransformer() {
		PowerTransformer_attributes = new BaseClass[PowerTransformer_primitive_builder.values().length];
	}

	public void updateAttributeInArray(PowerTransformer_primitive_builder attrEnum, BaseClass value) {
		try {
			PowerTransformer_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//PowerTransformer_ATTR_ENUM attrEnum = PowerTransformer_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PowerTransformer_primitive_builder attrEnum = PowerTransformer_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (PowerTransformer_primitive_builder attrEnum: PowerTransformer_primitive_builder.values()) {
			BaseClass bc = PowerTransformer_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "PowerTransformer";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PowerTransformer();
        }
};
