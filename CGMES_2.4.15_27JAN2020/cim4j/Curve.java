package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.CurveStyle;
import cim4j.UnitSymbol;


import cim4j.CurveData;

/*
A multi-purpose curve or functional relationship between an independent variable (X-axis) and dependent (Y-axis) variables.
*/
public class Curve extends IdentifiedObject
{
	private BaseClass[] Curve_class_attributes;
	private BaseClass[] Curve_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Curve_primitive_builder implements PrimitiveBuilder {
		curveStyle(){
			public BaseClass construct (java.lang.String value) {
				return new CurveStyle(value);
			}
		},
		xUnit(){
			public BaseClass construct (java.lang.String value) {
				return new UnitSymbol(value);
			}
		},
		y1Unit(){
			public BaseClass construct (java.lang.String value) {
				return new UnitSymbol(value);
			}
		},
		y2Unit(){
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

	private enum Curve_class_attributes_enum {
		curveStyle,
		xUnit,
		y1Unit,
		y2Unit,
		CurveDatas,
			LAST_ENUM;
	}

		
		
		
		
		
	
	public Curve() {
		Curve_primitive_attributes = new BaseClass[Curve_primitive_builder.values().length];
		Curve_class_attributes = new BaseClass[Curve_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Curve_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Curve_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Curve_primitive_builder attrEnum, BaseClass value) {
		try {
			Curve_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Curve_class_attributes_enum attrEnum = Curve_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Curve, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Curve_primitive_builder attrEnum = Curve_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Curve, setting " + attrName  + " to: "  + value);
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
			for (Curve_primitive_builder attrEnum: Curve_primitive_builder.values()) {
				BaseClass bc = Curve_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Curve." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Curve_class_attributes_enum attrEnum: Curve_class_attributes_enum.values()) {
				BaseClass bc = Curve_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Curve." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Curve) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Curve";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Curve();
        }
};
