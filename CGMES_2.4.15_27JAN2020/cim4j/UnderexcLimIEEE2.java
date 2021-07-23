package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.UnderexcitationLimiterDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Seconds;
import cim4j.PU;
import cim4j.Simple_Float;



/*
The class represents the Type UEL2 which has either a straight-line or multi-segment characteristic when plotted in terms of machine reactive power output vs. real power output.  Reference: IEEE UEL2 421.5-2005 Section 10.2.  (Limit characteristic lookup table shown in Figure 10.4 (p 32) of the standard).
*/
public class UnderexcLimIEEE2 extends UnderexcitationLimiterDynamics
{
	private BaseClass[] UnderexcLimIEEE2_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum UnderexcLimIEEE2_primitive_builder implements PrimitiveBuilder {
			tuv(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tup(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tuq(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			kui(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kul(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vuimax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vuimin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kuf(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kfb(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tul(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tu1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tu2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tu3(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tu4(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			vulmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vulmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			p0(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			q0(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			p1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			q1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			p2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			q2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			p3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			q3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			p4(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			q4(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			p5(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			q5(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			p6(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			q6(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			p7(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			q7(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			p8(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			q8(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			p9(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			q9(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			p10(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			q10(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			k1(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			k2(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public UnderexcLimIEEE2() {
		UnderexcLimIEEE2_attributes = new BaseClass[UnderexcLimIEEE2_primitive_builder.values().length];
	}

	public void updateAttributeInArray(UnderexcLimIEEE2_primitive_builder attrEnum, BaseClass value) {
		try {
			UnderexcLimIEEE2_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//UnderexcLimIEEE2_ATTR_ENUM attrEnum = UnderexcLimIEEE2_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			UnderexcLimIEEE2_primitive_builder attrEnum = UnderexcLimIEEE2_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (UnderexcLimIEEE2_primitive_builder attrEnum: UnderexcLimIEEE2_primitive_builder.values()) {
			BaseClass bc = UnderexcLimIEEE2_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "UnderexcLimIEEE2";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new UnderexcLimIEEE2();
        }
};
