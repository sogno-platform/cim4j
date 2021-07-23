package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DCConductingEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Inductance;
import cim4j.Resistance;
import cim4j.Voltage;



/*
A series device within the DC system, typically a reactor used for filtering or smoothing.  Needed for transient and short circuit studies.
*/
public class DCSeriesDevice extends DCConductingEquipment
{
	private BaseClass[] DCSeriesDevice_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum DCSeriesDevice_primitive_builder implements PrimitiveBuilder {
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
			ratedUdc(){
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

		
		
		
	
	public DCSeriesDevice() {
		DCSeriesDevice_attributes = new BaseClass[DCSeriesDevice_primitive_builder.values().length];
	}

	public void updateAttributeInArray(DCSeriesDevice_primitive_builder attrEnum, BaseClass value) {
		try {
			DCSeriesDevice_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//DCSeriesDevice_ATTR_ENUM attrEnum = DCSeriesDevice_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DCSeriesDevice_primitive_builder attrEnum = DCSeriesDevice_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (DCSeriesDevice_primitive_builder attrEnum: DCSeriesDevice_primitive_builder.values()) {
			BaseClass bc = DCSeriesDevice_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "DCSeriesDevice";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DCSeriesDevice();
        }
};
