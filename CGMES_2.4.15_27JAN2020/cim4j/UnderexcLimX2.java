package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.UnderexcitationLimiterDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;



/*

*/
public class UnderexcLimX2 extends UnderexcitationLimiterDynamics
{
	private BaseClass[] UnderexcLimX2_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum UnderexcLimX2_primitive_builder implements PrimitiveBuilder {
			kf2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tf2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			km(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tm(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			melmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			qo(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			r(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
	
	public UnderexcLimX2() {
		UnderexcLimX2_attributes = new BaseClass[UnderexcLimX2_primitive_builder.values().length];
	}

	public void updateAttributeInArray(UnderexcLimX2_primitive_builder attrEnum, BaseClass value) {
		try {
			UnderexcLimX2_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//UnderexcLimX2_ATTR_ENUM attrEnum = UnderexcLimX2_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			UnderexcLimX2_primitive_builder attrEnum = UnderexcLimX2_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (UnderexcLimX2_primitive_builder attrEnum: UnderexcLimX2_primitive_builder.values()) {
			BaseClass bc = UnderexcLimX2_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "UnderexcLimX2";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new UnderexcLimX2();
        }
};
