package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.Quality61850;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.MeasurementValue;

/*
Measurement quality flags. Bits 0-10 are defined for substation automation in draft IEC 61850 part 7-3. Bits 11-15 are reserved for future expansion by that document. Bits 16-31 are reserved for EMS applications.
*/
public class MeasurementValueQuality extends Quality61850
{
	private BaseClass[] MeasurementValueQuality_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum MeasurementValueQuality_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
	
	public MeasurementValueQuality() {
		MeasurementValueQuality_attributes = new BaseClass[MeasurementValueQuality_primitive_builder.values().length];
	}

	public void updateAttributeInArray(MeasurementValueQuality_primitive_builder attrEnum, BaseClass value) {
		try {
			MeasurementValueQuality_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//MeasurementValueQuality_ATTR_ENUM attrEnum = MeasurementValueQuality_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			MeasurementValueQuality_primitive_builder attrEnum = MeasurementValueQuality_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (MeasurementValueQuality_primitive_builder attrEnum: MeasurementValueQuality_primitive_builder.values()) {
			BaseClass bc = MeasurementValueQuality_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "MeasurementValueQuality";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new MeasurementValueQuality();
        }
};
