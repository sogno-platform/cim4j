package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DCEquipmentContainer;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.DCConverterOperatingModeKind;


import cim4j.Substation;

/*
Indivisible operative unit comprising all equipment between the point of common coupling on the AC side and the point of common coupling - DC side, essentially one or more converters, together with one or more converter transformers, converter control equipment, essential protective and switching devices and auxiliaries, if any, used for conversion.
*/
public class DCConverterUnit extends DCEquipmentContainer
{
	private BaseClass[] DCConverterUnit_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum DCConverterUnit_primitive_builder implements PrimitiveBuilder {
			operationMode(){
			public BaseClass construct (java.lang.String value) {
				return new DCConverterOperatingModeKind(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
	
	public DCConverterUnit() {
		DCConverterUnit_attributes = new BaseClass[DCConverterUnit_primitive_builder.values().length];
	}

	public void updateAttributeInArray(DCConverterUnit_primitive_builder attrEnum, BaseClass value) {
		try {
			DCConverterUnit_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//DCConverterUnit_ATTR_ENUM attrEnum = DCConverterUnit_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DCConverterUnit_primitive_builder attrEnum = DCConverterUnit_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (DCConverterUnit_primitive_builder attrEnum: DCConverterUnit_primitive_builder.values()) {
			BaseClass bc = DCConverterUnit_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "DCConverterUnit";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DCConverterUnit();
        }
};
