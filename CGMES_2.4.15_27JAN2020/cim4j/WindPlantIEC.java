package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.WindPlantDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.WindPlantFreqPcontrolIEC;
import cim4j.WindPlantReactiveControlIEC;

/*
Simplified IEC type plant level model.   Reference: IEC 61400-27-1, AnnexE.
*/
public class WindPlantIEC extends WindPlantDynamics
{
	private BaseClass[] WindPlantIEC_class_attributes;
	private BaseClass[] WindPlantIEC_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum WindPlantIEC_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum WindPlantIEC_class_attributes_enum {
		WindPlantFreqPcontrolIEC,
		WindPlantReactiveControlIEC,
			LAST_ENUM;
	}

		
		
	
	public WindPlantIEC() {
		WindPlantIEC_primitive_attributes = new BaseClass[WindPlantIEC_primitive_builder.values().length];
		WindPlantIEC_class_attributes = new BaseClass[WindPlantIEC_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(WindPlantIEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindPlantIEC_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(WindPlantIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindPlantIEC_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindPlantIEC_class_attributes_enum attrEnum = WindPlantIEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated WindPlantIEC, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindPlantIEC_primitive_builder attrEnum = WindPlantIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated WindPlantIEC, setting " + attrName  + " to: "  + value);
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
			for (WindPlantIEC_primitive_builder attrEnum: WindPlantIEC_primitive_builder.values()) {
				BaseClass bc = WindPlantIEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindPlantIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindPlantIEC_class_attributes_enum attrEnum: WindPlantIEC_class_attributes_enum.values()) {
				BaseClass bc = WindPlantIEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindPlantIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(WindPlantIEC) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "WindPlantIEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindPlantIEC();
        }
};
