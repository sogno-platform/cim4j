package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DynamicsFunctionBlock;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.RemoteInputSignal;
import cim4j.WindTurbineType3or4Dynamics;

/*
Parent class supporting relationships to wind turbines Type 3 and 4 and wind plant IEC and user defined wind plants including their control models.
*/
public class WindPlantDynamics extends DynamicsFunctionBlock
{
	private BaseClass[] WindPlantDynamics_class_attributes;
	private BaseClass[] WindPlantDynamics_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum WindPlantDynamics_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum WindPlantDynamics_class_attributes_enum {
		RemoteInputSignal,
		WindTurbineType3or4Dynamics,
			LAST_ENUM;
	}

		
		
	
	public WindPlantDynamics() {
		WindPlantDynamics_primitive_attributes = new BaseClass[WindPlantDynamics_primitive_builder.values().length];
		WindPlantDynamics_class_attributes = new BaseClass[WindPlantDynamics_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(WindPlantDynamics_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindPlantDynamics_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(WindPlantDynamics_primitive_builder attrEnum, BaseClass value) {
		try {
			WindPlantDynamics_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindPlantDynamics_class_attributes_enum attrEnum = WindPlantDynamics_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated WindPlantDynamics, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindPlantDynamics_primitive_builder attrEnum = WindPlantDynamics_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated WindPlantDynamics, setting " + attrName  + " to: "  + value);
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
			for (WindPlantDynamics_primitive_builder attrEnum: WindPlantDynamics_primitive_builder.values()) {
				BaseClass bc = WindPlantDynamics_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindPlantDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindPlantDynamics_class_attributes_enum attrEnum: WindPlantDynamics_class_attributes_enum.values()) {
				BaseClass bc = WindPlantDynamics_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindPlantDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(WindPlantDynamics) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "WindPlantDynamics";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindPlantDynamics();
        }
};
