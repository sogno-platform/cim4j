package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;


import cim4j.Curve;

/*
Multi-purpose data points for defining a curve.  The use of this generic class is discouraged if a more specific class  can be used to specify the x and y axis values along with their specific data types.
*/
public class CurveData extends BaseClass
{
	private BaseClass[] CurveData_class_attributes;
	private BaseClass[] CurveData_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum CurveData_primitive_builder implements PrimitiveBuilder {
		xvalue(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		y1value(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		y2value(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum CurveData_class_attributes_enum {
		Curve,
		xvalue,
		y1value,
		y2value,
			LAST_ENUM;
	}

		
		
		
		
	
	public CurveData() {
		CurveData_primitive_attributes = new BaseClass[CurveData_primitive_builder.values().length];
		CurveData_class_attributes = new BaseClass[CurveData_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(CurveData_class_attributes_enum attrEnum, BaseClass value) {
		try {
			CurveData_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(CurveData_primitive_builder attrEnum, BaseClass value) {
		try {
			CurveData_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			CurveData_class_attributes_enum attrEnum = CurveData_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated CurveData, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			CurveData_primitive_builder attrEnum = CurveData_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated CurveData, setting " + attrName  + " to: "  + value);
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
			for (CurveData_primitive_builder attrEnum: CurveData_primitive_builder.values()) {
				BaseClass bc = CurveData_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    CurveData." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (CurveData_class_attributes_enum attrEnum: CurveData_class_attributes_enum.values()) {
				BaseClass bc = CurveData_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    CurveData." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(CurveData) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "CurveData";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new CurveData();
        }
};
