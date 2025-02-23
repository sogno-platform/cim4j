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
The class represents the Type UEL1 model which has a circular limit boundary when plotted in terms of machine reactive power vs. real power output.  Reference: IEEE UEL1 421.5-2005 Section 10.1.
*/
public class UnderexcLimIEEE1 extends UnderexcitationLimiterDynamics
{
	private BaseClass[] UnderexcLimIEEE1_class_attributes;
	private BaseClass[] UnderexcLimIEEE1_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum UnderexcLimIEEE1_primitive_builder implements PrimitiveBuilder {
		kur(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kuc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kuf(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vurmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vucmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum UnderexcLimIEEE1_class_attributes_enum {
		kur,
		kuc,
		kuf,
		vurmax,
		vucmax,
		kui,
		kul,
		vuimax,
		vuimin,
		tu1,
		tu2,
		tu3,
		tu4,
		vulmax,
		vulmin,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public UnderexcLimIEEE1() {
		UnderexcLimIEEE1_primitive_attributes = new BaseClass[UnderexcLimIEEE1_primitive_builder.values().length];
		UnderexcLimIEEE1_class_attributes = new BaseClass[UnderexcLimIEEE1_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(UnderexcLimIEEE1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			UnderexcLimIEEE1_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(UnderexcLimIEEE1_primitive_builder attrEnum, BaseClass value) {
		try {
			UnderexcLimIEEE1_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			UnderexcLimIEEE1_class_attributes_enum attrEnum = UnderexcLimIEEE1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated UnderexcLimIEEE1, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			UnderexcLimIEEE1_primitive_builder attrEnum = UnderexcLimIEEE1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated UnderexcLimIEEE1, setting " + attrName  + " to: "  + value);
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
			for (UnderexcLimIEEE1_primitive_builder attrEnum: UnderexcLimIEEE1_primitive_builder.values()) {
				BaseClass bc = UnderexcLimIEEE1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    UnderexcLimIEEE1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (UnderexcLimIEEE1_class_attributes_enum attrEnum: UnderexcLimIEEE1_class_attributes_enum.values()) {
				BaseClass bc = UnderexcLimIEEE1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    UnderexcLimIEEE1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(UnderexcLimIEEE1) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "UnderexcLimIEEE1";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new UnderexcLimIEEE1();
        }
};
