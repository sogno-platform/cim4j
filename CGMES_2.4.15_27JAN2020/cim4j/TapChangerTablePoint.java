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
	private BaseClass[] TapChangerTablePoint_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
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

		
		
		
		
		
		
	
	public TapChangerTablePoint() {
		TapChangerTablePoint_attributes = new BaseClass[TapChangerTablePoint_primitive_builder.values().length];
	}

	public void updateAttributeInArray(TapChangerTablePoint_primitive_builder attrEnum, BaseClass value) {
		try {
			TapChangerTablePoint_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//TapChangerTablePoint_ATTR_ENUM attrEnum = TapChangerTablePoint_ATTR_BC_ENUM.valueOf(attrName);
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
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (TapChangerTablePoint_primitive_builder attrEnum: TapChangerTablePoint_primitive_builder.values()) {
			BaseClass bc = TapChangerTablePoint_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
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
