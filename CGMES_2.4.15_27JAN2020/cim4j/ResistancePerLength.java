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
Resistance (real part of impedance) per unit of length.
*/
public class ResistancePerLength extends BaseClass
{
	private BaseClass[] ResistancePerLength_class_attributes;
	private BaseClass[] ResistancePerLength_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ResistancePerLength_primitive_builder implements PrimitiveBuilder {
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

	private enum ResistancePerLength_class_attributes_enum {
		value,
		unit,
		multiplier,
		denominatorUnit,
		denominatorMultiplier,
			LAST_ENUM;
	}

		
		
		
		
		
	
	public ResistancePerLength() {
		ResistancePerLength_primitive_attributes = new BaseClass[ResistancePerLength_primitive_builder.values().length];
		ResistancePerLength_class_attributes = new BaseClass[ResistancePerLength_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ResistancePerLength_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ResistancePerLength_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ResistancePerLength_primitive_builder attrEnum, BaseClass value) {
		try {
			ResistancePerLength_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ResistancePerLength_class_attributes_enum attrEnum = ResistancePerLength_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ResistancePerLength, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ResistancePerLength_primitive_builder attrEnum = ResistancePerLength_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ResistancePerLength, setting " + attrName  + " to: "  + value);
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
			for (ResistancePerLength_primitive_builder attrEnum: ResistancePerLength_primitive_builder.values()) {
				BaseClass bc = ResistancePerLength_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ResistancePerLength." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ResistancePerLength_class_attributes_enum attrEnum: ResistancePerLength_class_attributes_enum.values()) {
				BaseClass bc = ResistancePerLength_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ResistancePerLength." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ResistancePerLength) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ResistancePerLength";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ResistancePerLength();
        }
};
