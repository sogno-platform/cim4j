package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.GeneratingUnit;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.HydroEnergyConversionKind;


import cim4j.HydroPowerPlant;

/*
A generating unit whose prime mover is a hydraulic turbine (e.g., Francis, Pelton, Kaplan).
*/
public class HydroGeneratingUnit extends GeneratingUnit
{
	private BaseClass[] HydroGeneratingUnit_class_attributes;
	private BaseClass[] HydroGeneratingUnit_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum HydroGeneratingUnit_primitive_builder implements PrimitiveBuilder {
		energyConversionCapability(){
			public BaseClass construct (java.lang.String value) {
				return new HydroEnergyConversionKind(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum HydroGeneratingUnit_class_attributes_enum {
		energyConversionCapability,
		HydroPowerPlant,
			LAST_ENUM;
	}

		
		
	
	public HydroGeneratingUnit() {
		HydroGeneratingUnit_primitive_attributes = new BaseClass[HydroGeneratingUnit_primitive_builder.values().length];
		HydroGeneratingUnit_class_attributes = new BaseClass[HydroGeneratingUnit_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(HydroGeneratingUnit_class_attributes_enum attrEnum, BaseClass value) {
		try {
			HydroGeneratingUnit_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(HydroGeneratingUnit_primitive_builder attrEnum, BaseClass value) {
		try {
			HydroGeneratingUnit_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			HydroGeneratingUnit_class_attributes_enum attrEnum = HydroGeneratingUnit_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated HydroGeneratingUnit, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			HydroGeneratingUnit_primitive_builder attrEnum = HydroGeneratingUnit_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated HydroGeneratingUnit, setting " + attrName  + " to: "  + value);
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
			for (HydroGeneratingUnit_primitive_builder attrEnum: HydroGeneratingUnit_primitive_builder.values()) {
				BaseClass bc = HydroGeneratingUnit_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    HydroGeneratingUnit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (HydroGeneratingUnit_class_attributes_enum attrEnum: HydroGeneratingUnit_class_attributes_enum.values()) {
				BaseClass bc = HydroGeneratingUnit_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    HydroGeneratingUnit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(HydroGeneratingUnit) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "HydroGeneratingUnit";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new HydroGeneratingUnit();
        }
};
