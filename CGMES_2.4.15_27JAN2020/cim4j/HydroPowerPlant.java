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
	private BaseClass[] HydroPowerPlant_class_attributes;
	private BaseClass[] HydroPowerPlant_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

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

	private enum HydroPowerPlant_class_attributes_enum {
		HydroGeneratingUnits,
		hydroPlantStorageType,
		HydroPumps,
			LAST_ENUM;
	}

		
		
		
	
	public HydroPowerPlant() {
		HydroPowerPlant_primitive_attributes = new BaseClass[HydroPowerPlant_primitive_builder.values().length];
		HydroPowerPlant_class_attributes = new BaseClass[HydroPowerPlant_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(HydroPowerPlant_class_attributes_enum attrEnum, BaseClass value) {
		try {
			HydroPowerPlant_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(HydroPowerPlant_primitive_builder attrEnum, BaseClass value) {
		try {
			HydroPowerPlant_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			HydroPowerPlant_class_attributes_enum attrEnum = HydroPowerPlant_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated HydroPowerPlant, setting " + attrName);
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
			System.out.println("Updated HydroPowerPlant, setting " + attrName  + " to: "  + value);
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
			for (HydroPowerPlant_primitive_builder attrEnum: HydroPowerPlant_primitive_builder.values()) {
				BaseClass bc = HydroPowerPlant_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    HydroPowerPlant." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (HydroPowerPlant_class_attributes_enum attrEnum: HydroPowerPlant_class_attributes_enum.values()) {
				BaseClass bc = HydroPowerPlant_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    HydroPowerPlant." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(HydroPowerPlant) RDFID: " + rdfid;
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
