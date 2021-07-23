package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TransformerEnd;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Susceptance;
import cim4j.WindingConnection;
import cim4j.ApparentPower;
import cim4j.Conductance;
import cim4j.Voltage;
import cim4j.Resistance;
import cim4j.Reactance;
import cim4j.Integer;


import cim4j.PowerTransformer;

/*
A PowerTransformerEnd is associated with each Terminal of a PowerTransformer. The impedance values r, r0, x, and x0 of a PowerTransformerEnd represents a star equivalent as follows 1) for a two Terminal PowerTransformer the high voltage PowerTransformerEnd has non zero values on r, r0, x, and x0 while the low voltage PowerTransformerEnd has zero values for r, r0, x, and x0. 2) for a three Terminal PowerTransformer the three PowerTransformerEnds represents a star equivalent with each leg in the star represented by r, r0, x, and x0 values. 3) for a PowerTransformer with more than three Terminals the PowerTransformerEnd impedance values cannot be used. Instead use the TransformerMeshImpedance or split the transformer into multiple PowerTransformers.
*/
public class PowerTransformerEnd extends TransformerEnd
{
	private BaseClass[] PowerTransformerEnd_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum PowerTransformerEnd_primitive_builder implements PrimitiveBuilder {
			b(){
			public BaseClass construct (java.lang.String value) {
				return new Susceptance(value);
			}
		},
			connectionKind(){
			public BaseClass construct (java.lang.String value) {
				return new WindingConnection(value);
			}
		},
			ratedS(){
			public BaseClass construct (java.lang.String value) {
				return new ApparentPower(value);
			}
		},
			g(){
			public BaseClass construct (java.lang.String value) {
				return new Conductance(value);
			}
		},
			ratedU(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
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
			b0(){
			public BaseClass construct (java.lang.String value) {
				return new Susceptance(value);
			}
		},
			phaseAngleClock(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
			g0(){
			public BaseClass construct (java.lang.String value) {
				return new Conductance(value);
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

		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public PowerTransformerEnd() {
		PowerTransformerEnd_attributes = new BaseClass[PowerTransformerEnd_primitive_builder.values().length];
	}

	public void updateAttributeInArray(PowerTransformerEnd_primitive_builder attrEnum, BaseClass value) {
		try {
			PowerTransformerEnd_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//PowerTransformerEnd_ATTR_ENUM attrEnum = PowerTransformerEnd_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PowerTransformerEnd_primitive_builder attrEnum = PowerTransformerEnd_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (PowerTransformerEnd_primitive_builder attrEnum: PowerTransformerEnd_primitive_builder.values()) {
			BaseClass bc = PowerTransformerEnd_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "PowerTransformerEnd";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PowerTransformerEnd();
        }
};
