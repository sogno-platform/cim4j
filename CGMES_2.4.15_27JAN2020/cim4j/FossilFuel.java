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
	private BaseClass[] FossilFuel_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
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

		
		
	
	public FossilFuel() {
		FossilFuel_attributes = new BaseClass[FossilFuel_primitive_builder.values().length];
	}

	public void updateAttributeInArray(FossilFuel_primitive_builder attrEnum, BaseClass value) {
		try {
			FossilFuel_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//FossilFuel_ATTR_ENUM attrEnum = FossilFuel_ATTR_BC_ENUM.valueOf(attrName);
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
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (FossilFuel_primitive_builder attrEnum: FossilFuel_primitive_builder.values()) {
			BaseClass bc = FossilFuel_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
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
