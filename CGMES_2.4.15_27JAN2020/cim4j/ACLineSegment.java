package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.Conductor;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Susceptance;
import cim4j.Conductance;
import cim4j.Resistance;
import cim4j.Reactance;
import cim4j.Temperature;



/*
A wire or combination of wires, with consistent electrical characteristics, building a single electrical system, used to carry alternating current between points in the power system. For symmetrical, transposed 3ph lines, it is sufficient to use  attributes of the line segment, which describe impedances and admittances for the entire length of the segment.  Additionally impedances can be computed by using length and associated per length impedances. The BaseVoltage at the two ends of ACLineSegments in a Line shall have the same BaseVoltage.nominalVoltage. However, boundary lines  may have slightly different BaseVoltage.nominalVoltages and  variation is allowed. Larger voltage difference in general requires use of an equivalent branch.
*/
public class ACLineSegment extends Conductor
{
	private BaseClass[] ACLineSegment_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ACLineSegment_primitive_builder implements PrimitiveBuilder {
			bch(){
			public BaseClass construct (java.lang.String value) {
				return new Susceptance(value);
			}
		},
			gch(){
			public BaseClass construct (java.lang.String value) {
				return new Conductance(value);
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
			b0ch(){
			public BaseClass construct (java.lang.String value) {
				return new Susceptance(value);
			}
		},
			g0ch(){
			public BaseClass construct (java.lang.String value) {
				return new Conductance(value);
			}
		},
			r0(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
			shortCircuitEndTemperature(){
			public BaseClass construct (java.lang.String value) {
				return new Temperature(value);
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

		
		
		
		
		
		
		
		
		
	
	public ACLineSegment() {
		ACLineSegment_attributes = new BaseClass[ACLineSegment_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ACLineSegment_primitive_builder attrEnum, BaseClass value) {
		try {
			ACLineSegment_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ACLineSegment_ATTR_ENUM attrEnum = ACLineSegment_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ACLineSegment_primitive_builder attrEnum = ACLineSegment_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ACLineSegment_primitive_builder attrEnum: ACLineSegment_primitive_builder.values()) {
			BaseClass bc = ACLineSegment_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ACLineSegment";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ACLineSegment();
        }
};
