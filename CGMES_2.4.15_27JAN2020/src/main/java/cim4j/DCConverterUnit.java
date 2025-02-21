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
	private BaseClass[] DCConverterUnit_class_attributes;
	private BaseClass[] DCConverterUnit_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

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

	private enum DCConverterUnit_class_attributes_enum {
		operationMode,
		Substation,
			LAST_ENUM;
	}

		
		
	
	public DCConverterUnit() {
		DCConverterUnit_primitive_attributes = new BaseClass[DCConverterUnit_primitive_builder.values().length];
		DCConverterUnit_class_attributes = new BaseClass[DCConverterUnit_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DCConverterUnit_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DCConverterUnit_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DCConverterUnit_primitive_builder attrEnum, BaseClass value) {
		try {
			DCConverterUnit_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DCConverterUnit_class_attributes_enum attrEnum = DCConverterUnit_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DCConverterUnit, setting " + attrName);
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
			System.out.println("Updated DCConverterUnit, setting " + attrName  + " to: "  + value);
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
			for (DCConverterUnit_primitive_builder attrEnum: DCConverterUnit_primitive_builder.values()) {
				BaseClass bc = DCConverterUnit_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCConverterUnit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DCConverterUnit_class_attributes_enum attrEnum: DCConverterUnit_class_attributes_enum.values()) {
				BaseClass bc = DCConverterUnit_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCConverterUnit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DCConverterUnit) RDFID: " + rdfid;
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
