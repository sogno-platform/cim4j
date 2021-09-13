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
	private BaseClass[] DCSeriesDevice_class_attributes;
	private BaseClass[] DCSeriesDevice_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

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

	private enum DCSeriesDevice_class_attributes_enum {
		inductance,
		resistance,
		ratedUdc,
			LAST_ENUM;
	}

		
		
		
	
	public DCSeriesDevice() {
		DCSeriesDevice_primitive_attributes = new BaseClass[DCSeriesDevice_primitive_builder.values().length];
		DCSeriesDevice_class_attributes = new BaseClass[DCSeriesDevice_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DCSeriesDevice_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DCSeriesDevice_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DCSeriesDevice_primitive_builder attrEnum, BaseClass value) {
		try {
			DCSeriesDevice_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DCSeriesDevice_class_attributes_enum attrEnum = DCSeriesDevice_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DCSeriesDevice, setting " + attrName);
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
			System.out.println("Updated DCSeriesDevice, setting " + attrName  + " to: "  + value);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString(boolean topClass) {
		java.lang.String result = "";
		java.lang.String indent = "";
		if (topClass) {
			for (DCSeriesDevice_primitive_builder attrEnum: DCSeriesDevice_primitive_builder.values()) {
				BaseClass bc = DCSeriesDevice_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCSeriesDevice." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DCSeriesDevice_class_attributes_enum attrEnum: DCSeriesDevice_class_attributes_enum.values()) {
				BaseClass bc = DCSeriesDevice_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCSeriesDevice." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DCSeriesDevice) RDFID: " + rdfid;
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
