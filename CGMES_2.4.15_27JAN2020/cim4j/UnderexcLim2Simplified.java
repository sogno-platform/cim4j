package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.UnderexcitationLimiterDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;



/*
This model can be derived from UnderexcLimIEEE2. The limit characteristic (look -up table) is a single straight-line, the same as UnderexcLimIEEE2 (see Figure 10.4 (p 32), IEEE 421.5-2005 Section 10.2).
*/
public class UnderexcLim2Simplified extends UnderexcitationLimiterDynamics
{
	private BaseClass[] UnderexcLim2Simplified_class_attributes;
	private BaseClass[] UnderexcLim2Simplified_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum UnderexcLim2Simplified_primitive_builder implements PrimitiveBuilder {
		q0(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		q1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		p0(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		p1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kui(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vuimin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vuimax(){
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

	private enum UnderexcLim2Simplified_class_attributes_enum {
		q0,
		q1,
		p0,
		p1,
		kui,
		vuimin,
		vuimax,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
	
	public UnderexcLim2Simplified() {
		UnderexcLim2Simplified_primitive_attributes = new BaseClass[UnderexcLim2Simplified_primitive_builder.values().length];
		UnderexcLim2Simplified_class_attributes = new BaseClass[UnderexcLim2Simplified_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(UnderexcLim2Simplified_class_attributes_enum attrEnum, BaseClass value) {
		try {
			UnderexcLim2Simplified_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(UnderexcLim2Simplified_primitive_builder attrEnum, BaseClass value) {
		try {
			UnderexcLim2Simplified_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			UnderexcLim2Simplified_class_attributes_enum attrEnum = UnderexcLim2Simplified_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated UnderexcLim2Simplified, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			UnderexcLim2Simplified_primitive_builder attrEnum = UnderexcLim2Simplified_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated UnderexcLim2Simplified, setting " + attrName  + " to: "  + value);
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
			for (UnderexcLim2Simplified_primitive_builder attrEnum: UnderexcLim2Simplified_primitive_builder.values()) {
				BaseClass bc = UnderexcLim2Simplified_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    UnderexcLim2Simplified." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (UnderexcLim2Simplified_class_attributes_enum attrEnum: UnderexcLim2Simplified_class_attributes_enum.values()) {
				BaseClass bc = UnderexcLim2Simplified_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    UnderexcLim2Simplified." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(UnderexcLim2Simplified) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "UnderexcLim2Simplified";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new UnderexcLim2Simplified();
        }
};
