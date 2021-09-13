package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.GeneratingUnit;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.WindGenUnitKind;



/*
A wind driven generating unit.  May be used to represent a single turbine or an aggregation.
*/
public class WindGeneratingUnit extends GeneratingUnit
{
	private BaseClass[] WindGeneratingUnit_class_attributes;
	private BaseClass[] WindGeneratingUnit_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum WindGeneratingUnit_primitive_builder implements PrimitiveBuilder {
		windGenUnitType(){
			public BaseClass construct (java.lang.String value) {
				return new WindGenUnitKind(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum WindGeneratingUnit_class_attributes_enum {
		windGenUnitType,
			LAST_ENUM;
	}

		
	
	public WindGeneratingUnit() {
		WindGeneratingUnit_primitive_attributes = new BaseClass[WindGeneratingUnit_primitive_builder.values().length];
		WindGeneratingUnit_class_attributes = new BaseClass[WindGeneratingUnit_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(WindGeneratingUnit_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindGeneratingUnit_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(WindGeneratingUnit_primitive_builder attrEnum, BaseClass value) {
		try {
			WindGeneratingUnit_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindGeneratingUnit_class_attributes_enum attrEnum = WindGeneratingUnit_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated WindGeneratingUnit, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindGeneratingUnit_primitive_builder attrEnum = WindGeneratingUnit_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated WindGeneratingUnit, setting " + attrName  + " to: "  + value);
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
			for (WindGeneratingUnit_primitive_builder attrEnum: WindGeneratingUnit_primitive_builder.values()) {
				BaseClass bc = WindGeneratingUnit_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindGeneratingUnit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindGeneratingUnit_class_attributes_enum attrEnum: WindGeneratingUnit_class_attributes_enum.values()) {
				BaseClass bc = WindGeneratingUnit_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindGeneratingUnit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(WindGeneratingUnit) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "WindGeneratingUnit";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindGeneratingUnit();
        }
};
