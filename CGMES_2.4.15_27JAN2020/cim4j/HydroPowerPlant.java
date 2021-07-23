package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PowerSystemResource;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.HydroPlantStorageKind;


import cim4j.HydroGeneratingUnit;
import cim4j.HydroPump;

/*
A hydro power station which can generate or pump. When generating, the generator turbines receive water from an upper reservoir. When pumping, the pumps receive their water from a lower reservoir.
*/
public class HydroPowerPlant extends PowerSystemResource
{
	private BaseClass[] HydroPowerPlant_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum HydroPowerPlant_primitive_builder implements PrimitiveBuilder {
			hydroPlantStorageType(){
			public BaseClass construct (java.lang.String value) {
				return new HydroPlantStorageKind(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
	
	public HydroPowerPlant() {
		HydroPowerPlant_attributes = new BaseClass[HydroPowerPlant_primitive_builder.values().length];
	}

	public void updateAttributeInArray(HydroPowerPlant_primitive_builder attrEnum, BaseClass value) {
		try {
			HydroPowerPlant_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//HydroPowerPlant_ATTR_ENUM attrEnum = HydroPowerPlant_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			HydroPowerPlant_primitive_builder attrEnum = HydroPowerPlant_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (HydroPowerPlant_primitive_builder attrEnum: HydroPowerPlant_primitive_builder.values()) {
			BaseClass bc = HydroPowerPlant_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "HydroPowerPlant";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new HydroPowerPlant();
        }
};
