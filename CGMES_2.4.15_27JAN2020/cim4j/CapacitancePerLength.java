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
Capacitance per unit of length.
*/
public class CapacitancePerLength extends BaseClass
{
	private BaseClass[] CapacitancePerLength_class_attributes;
	private BaseClass[] CapacitancePerLength_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum CapacitancePerLength_primitive_builder implements PrimitiveBuilder {
		unit(){
			public BaseClass construct (java.lang.String value) {
				return new UnitSymbol(value);
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
		denominatorMultiplier(){
			public BaseClass construct (java.lang.String value) {
				return new UnitMultiplier(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum CapacitancePerLength_class_attributes_enum {
		value,
		unit,
		multiplier,
		denominatorUnit,
		denominatorMultiplier,
			LAST_ENUM;
	}

		
		
		
		
		
	
	public CapacitancePerLength() {
		CapacitancePerLength_primitive_attributes = new BaseClass[CapacitancePerLength_primitive_builder.values().length];
		CapacitancePerLength_class_attributes = new BaseClass[CapacitancePerLength_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(CapacitancePerLength_class_attributes_enum attrEnum, BaseClass value) {
		try {
			CapacitancePerLength_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(CapacitancePerLength_primitive_builder attrEnum, BaseClass value) {
		try {
			CapacitancePerLength_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			CapacitancePerLength_class_attributes_enum attrEnum = CapacitancePerLength_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated CapacitancePerLength, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			CapacitancePerLength_primitive_builder attrEnum = CapacitancePerLength_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated CapacitancePerLength, setting " + attrName  + " to: "  + value);
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
			for (CapacitancePerLength_primitive_builder attrEnum: CapacitancePerLength_primitive_builder.values()) {
				BaseClass bc = CapacitancePerLength_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    CapacitancePerLength." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (CapacitancePerLength_class_attributes_enum attrEnum: CapacitancePerLength_class_attributes_enum.values()) {
				BaseClass bc = CapacitancePerLength_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    CapacitancePerLength." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(CapacitancePerLength) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "CapacitancePerLength";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new CapacitancePerLength();
        }
};
