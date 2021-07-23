package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DCConductingEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Capacitance;
import cim4j.Inductance;
import cim4j.Resistance;
import cim4j.Length;


import cim4j.PerLengthDCLineParameter;

/*
A wire or combination of wires not insulated from one another, with consistent electrical characteristics, used to carry direct current between points in the DC region of the power system.
*/
public class DCLineSegment extends DCConductingEquipment
{
	private BaseClass[] DCLineSegment_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum DCLineSegment_primitive_builder implements PrimitiveBuilder {
			capacitance(){
			public BaseClass construct (java.lang.String value) {
				return new Capacitance(value);
			}
		},
			inductance(){
			public BaseClass construct (java.lang.String value) {
				return new Inductance(value);
			}
		},
			resistance(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
			length(){
			public BaseClass construct (java.lang.String value) {
				return new Length(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
	
	public DCLineSegment() {
		DCLineSegment_attributes = new BaseClass[DCLineSegment_primitive_builder.values().length];
	}

	public void updateAttributeInArray(DCLineSegment_primitive_builder attrEnum, BaseClass value) {
		try {
			DCLineSegment_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//DCLineSegment_ATTR_ENUM attrEnum = DCLineSegment_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DCLineSegment_primitive_builder attrEnum = DCLineSegment_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (DCLineSegment_primitive_builder attrEnum: DCLineSegment_primitive_builder.values()) {
			BaseClass bc = DCLineSegment_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "DCLineSegment";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DCLineSegment();
        }
};
