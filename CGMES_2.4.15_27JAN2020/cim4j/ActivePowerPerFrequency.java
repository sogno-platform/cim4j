package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.UnitMultiplier;
import cim4j.UnitSymbol;


import cim4j.Float;

/*
Active power variation with frequency.
*/
public class ActivePowerPerFrequency extends BaseClass
{
	private BaseClass[] ActivePowerPerFrequency_class_attributes;
	private BaseClass[] ActivePowerPerFrequency_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ActivePowerPerFrequency_primitive_builder implements PrimitiveBuilder {
		denominatorMultiplier(){
			public BaseClass construct (java.lang.String value) {
				return new UnitMultiplier(value);
			}
		},
		denominatorUnit(){
			public BaseClass construct (java.lang.String value) {
				return new UnitSymbol(value);
			}
		},
		multiplier(){
			public BaseClass construct (java.lang.String value) {
				return new UnitMultiplier(value);
			}
		},
		unit(){
			public BaseClass construct (java.lang.String value) {
				return new UnitSymbol(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ActivePowerPerFrequency_class_attributes_enum {
		denominatorMultiplier,
		denominatorUnit,
		multiplier,
		unit,
		value,
			LAST_ENUM;
	}

		
		
		
		
		
	
	public ActivePowerPerFrequency() {
		ActivePowerPerFrequency_primitive_attributes = new BaseClass[ActivePowerPerFrequency_primitive_builder.values().length];
		ActivePowerPerFrequency_class_attributes = new BaseClass[ActivePowerPerFrequency_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ActivePowerPerFrequency_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ActivePowerPerFrequency_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ActivePowerPerFrequency_primitive_builder attrEnum, BaseClass value) {
		try {
			ActivePowerPerFrequency_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ActivePowerPerFrequency_class_attributes_enum attrEnum = ActivePowerPerFrequency_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ActivePowerPerFrequency, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ActivePowerPerFrequency_primitive_builder attrEnum = ActivePowerPerFrequency_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ActivePowerPerFrequency, setting " + attrName  + " to: "  + value);
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
			for (ActivePowerPerFrequency_primitive_builder attrEnum: ActivePowerPerFrequency_primitive_builder.values()) {
				BaseClass bc = ActivePowerPerFrequency_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ActivePowerPerFrequency." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ActivePowerPerFrequency_class_attributes_enum attrEnum: ActivePowerPerFrequency_class_attributes_enum.values()) {
				BaseClass bc = ActivePowerPerFrequency_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ActivePowerPerFrequency." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ActivePowerPerFrequency) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ActivePowerPerFrequency";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ActivePowerPerFrequency();
        }
};
