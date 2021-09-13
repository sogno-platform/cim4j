package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.FuelType;


import cim4j.ThermalGeneratingUnit;

/*
The fossil fuel consumed by the non-nuclear thermal generating unit.   For example, coal, oil, gas, etc.   This a the specific fuels that the generating unit can consume.
*/
public class FossilFuel extends IdentifiedObject
{
	private BaseClass[] FossilFuel_class_attributes;
	private BaseClass[] FossilFuel_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum FossilFuel_primitive_builder implements PrimitiveBuilder {
		fossilFuelType(){
			public BaseClass construct (java.lang.String value) {
				return new FuelType(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum FossilFuel_class_attributes_enum {
		fossilFuelType,
		ThermalGeneratingUnit,
			LAST_ENUM;
	}

		
		
	
	public FossilFuel() {
		FossilFuel_primitive_attributes = new BaseClass[FossilFuel_primitive_builder.values().length];
		FossilFuel_class_attributes = new BaseClass[FossilFuel_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(FossilFuel_class_attributes_enum attrEnum, BaseClass value) {
		try {
			FossilFuel_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(FossilFuel_primitive_builder attrEnum, BaseClass value) {
		try {
			FossilFuel_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			FossilFuel_class_attributes_enum attrEnum = FossilFuel_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated FossilFuel, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			FossilFuel_primitive_builder attrEnum = FossilFuel_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated FossilFuel, setting " + attrName  + " to: "  + value);
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
			for (FossilFuel_primitive_builder attrEnum: FossilFuel_primitive_builder.values()) {
				BaseClass bc = FossilFuel_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    FossilFuel." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (FossilFuel_class_attributes_enum attrEnum: FossilFuel_class_attributes_enum.values()) {
				BaseClass bc = FossilFuel_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    FossilFuel." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(FossilFuel) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "FossilFuel";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new FossilFuel();
        }
};
