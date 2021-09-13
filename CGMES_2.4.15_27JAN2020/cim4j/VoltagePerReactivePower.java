package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.UnitSymbol;
import cim4j.UnitMultiplier;


import cim4j.Float;

/*
Voltage variation with reactive power.
*/
public class VoltagePerReactivePower extends BaseClass
{
	private BaseClass[] VoltagePerReactivePower_class_attributes;
	private BaseClass[] VoltagePerReactivePower_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum VoltagePerReactivePower_primitive_builder implements PrimitiveBuilder {
		unit(){
			public BaseClass construct (java.lang.String value) {
				return new UnitSymbol(value);
			}
		},
		denominatorMultiplier(){
			public BaseClass construct (java.lang.String value) {
				return new UnitMultiplier(value);
			}
		},
		multiplier(){
			public BaseClass construct (java.lang.String value) {
				return new UnitMultiplier(value);
			}
		},
		denominatorUnit(){
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

	private enum VoltagePerReactivePower_class_attributes_enum {
		value,
		unit,
		denominatorMultiplier,
		multiplier,
		denominatorUnit,
			LAST_ENUM;
	}

		
		
		
		
		
	
	public VoltagePerReactivePower() {
		VoltagePerReactivePower_primitive_attributes = new BaseClass[VoltagePerReactivePower_primitive_builder.values().length];
		VoltagePerReactivePower_class_attributes = new BaseClass[VoltagePerReactivePower_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(VoltagePerReactivePower_class_attributes_enum attrEnum, BaseClass value) {
		try {
			VoltagePerReactivePower_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(VoltagePerReactivePower_primitive_builder attrEnum, BaseClass value) {
		try {
			VoltagePerReactivePower_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			VoltagePerReactivePower_class_attributes_enum attrEnum = VoltagePerReactivePower_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated VoltagePerReactivePower, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			VoltagePerReactivePower_primitive_builder attrEnum = VoltagePerReactivePower_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated VoltagePerReactivePower, setting " + attrName  + " to: "  + value);
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
			for (VoltagePerReactivePower_primitive_builder attrEnum: VoltagePerReactivePower_primitive_builder.values()) {
				BaseClass bc = VoltagePerReactivePower_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    VoltagePerReactivePower." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (VoltagePerReactivePower_class_attributes_enum attrEnum: VoltagePerReactivePower_class_attributes_enum.values()) {
				BaseClass bc = VoltagePerReactivePower_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    VoltagePerReactivePower." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(VoltagePerReactivePower) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "VoltagePerReactivePower";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new VoltagePerReactivePower();
        }
};
