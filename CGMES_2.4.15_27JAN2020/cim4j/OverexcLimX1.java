package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.OverexcitationLimiterDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;



/*
Field voltage over excitation limiter.
*/
public class OverexcLimX1 extends OverexcitationLimiterDynamics
{
	private BaseClass[] OverexcLimX1_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum OverexcLimX1_primitive_builder implements PrimitiveBuilder {
			efdrated(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			efd1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			t1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			efd2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			t2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			efd3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			t3(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			efddes(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kmx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vlow(){
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

		
		
		
		
		
		
		
		
		
		
	
	public OverexcLimX1() {
		OverexcLimX1_attributes = new BaseClass[OverexcLimX1_primitive_builder.values().length];
	}

	public void updateAttributeInArray(OverexcLimX1_primitive_builder attrEnum, BaseClass value) {
		try {
			OverexcLimX1_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//OverexcLimX1_ATTR_ENUM attrEnum = OverexcLimX1_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			OverexcLimX1_primitive_builder attrEnum = OverexcLimX1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (OverexcLimX1_primitive_builder attrEnum: OverexcLimX1_primitive_builder.values()) {
			BaseClass bc = OverexcLimX1_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "OverexcLimX1";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new OverexcLimX1();
        }
};
