package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PerCent;
import cim4j.Simple_Float;
import cim4j.Integer;



/*

*/
public class TapChangerTablePoint extends BaseClass
{
	private BaseClass[] TapChangerTablePoint_class_attributes;
	private BaseClass[] TapChangerTablePoint_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum TapChangerTablePoint_primitive_builder implements PrimitiveBuilder {
		b(){
			public BaseClass construct (java.lang.String value) {
				return new PerCent(value);
			}
		},
		g(){
			public BaseClass construct (java.lang.String value) {
				return new PerCent(value);
			}
		},
		r(){
			public BaseClass construct (java.lang.String value) {
				return new PerCent(value);
			}
		},
		ratio(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		step(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
		x(){
			public BaseClass construct (java.lang.String value) {
				return new PerCent(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum TapChangerTablePoint_class_attributes_enum {
		b,
		g,
		r,
		ratio,
		step,
		x,
			LAST_ENUM;
	}

		
		
		
		
		
		
	
	public TapChangerTablePoint() {
		TapChangerTablePoint_primitive_attributes = new BaseClass[TapChangerTablePoint_primitive_builder.values().length];
		TapChangerTablePoint_class_attributes = new BaseClass[TapChangerTablePoint_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(TapChangerTablePoint_class_attributes_enum attrEnum, BaseClass value) {
		try {
			TapChangerTablePoint_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(TapChangerTablePoint_primitive_builder attrEnum, BaseClass value) {
		try {
			TapChangerTablePoint_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			TapChangerTablePoint_class_attributes_enum attrEnum = TapChangerTablePoint_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated TapChangerTablePoint, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			TapChangerTablePoint_primitive_builder attrEnum = TapChangerTablePoint_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated TapChangerTablePoint, setting " + attrName  + " to: "  + value);
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
			for (TapChangerTablePoint_primitive_builder attrEnum: TapChangerTablePoint_primitive_builder.values()) {
				BaseClass bc = TapChangerTablePoint_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TapChangerTablePoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (TapChangerTablePoint_class_attributes_enum attrEnum: TapChangerTablePoint_class_attributes_enum.values()) {
				BaseClass bc = TapChangerTablePoint_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TapChangerTablePoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(TapChangerTablePoint) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "TapChangerTablePoint";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new TapChangerTablePoint();
        }
};
