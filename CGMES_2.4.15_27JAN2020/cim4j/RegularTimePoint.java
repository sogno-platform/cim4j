package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Integer;
import cim4j.Simple_Float;


import cim4j.RegularIntervalSchedule;

/*
Time point for a schedule where the time between the consecutive points is constant.
*/
public class RegularTimePoint extends BaseClass
{
	private BaseClass[] RegularTimePoint_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum RegularTimePoint_primitive_builder implements PrimitiveBuilder {
			sequenceNumber(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
			value1(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			value2(){
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

		
		
		
		
	
	public RegularTimePoint() {
		RegularTimePoint_attributes = new BaseClass[RegularTimePoint_primitive_builder.values().length];
	}

	public void updateAttributeInArray(RegularTimePoint_primitive_builder attrEnum, BaseClass value) {
		try {
			RegularTimePoint_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//RegularTimePoint_ATTR_ENUM attrEnum = RegularTimePoint_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			RegularTimePoint_primitive_builder attrEnum = RegularTimePoint_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (RegularTimePoint_primitive_builder attrEnum: RegularTimePoint_primitive_builder.values()) {
			BaseClass bc = RegularTimePoint_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "RegularTimePoint";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new RegularTimePoint();
        }
};
