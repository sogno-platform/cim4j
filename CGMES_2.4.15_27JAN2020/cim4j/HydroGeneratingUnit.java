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
	private BaseClass[] HydroGeneratingUnit_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
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

		
		
	
	public HydroGeneratingUnit() {
		HydroGeneratingUnit_attributes = new BaseClass[HydroGeneratingUnit_primitive_builder.values().length];
	}

	public void updateAttributeInArray(HydroGeneratingUnit_primitive_builder attrEnum, BaseClass value) {
		try {
			HydroGeneratingUnit_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//HydroGeneratingUnit_ATTR_ENUM attrEnum = HydroGeneratingUnit_ATTR_BC_ENUM.valueOf(attrName);
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
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (HydroGeneratingUnit_primitive_builder attrEnum: HydroGeneratingUnit_primitive_builder.values()) {
			BaseClass bc = HydroGeneratingUnit_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
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
