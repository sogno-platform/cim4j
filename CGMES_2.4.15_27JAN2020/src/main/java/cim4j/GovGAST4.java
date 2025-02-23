package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TurbineGovernorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;



/*
Generic turbogas.
*/
public class GovGAST4 extends TurbineGovernorDynamics
{
	private BaseClass[] GovGAST4_class_attributes;
	private BaseClass[] GovGAST4_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GovGAST4_primitive_builder implements PrimitiveBuilder {
		bp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tv(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		ta(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tcm(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		ktm(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tm(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		rymx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		rymn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		mxef(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		mnef(){
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

	private enum GovGAST4_class_attributes_enum {
		bp,
		tv,
		ta,
		tc,
		tcm,
		ktm,
		tm,
		rymx,
		rymn,
		mxef,
		mnef,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
	
	public GovGAST4() {
		GovGAST4_primitive_attributes = new BaseClass[GovGAST4_primitive_builder.values().length];
		GovGAST4_class_attributes = new BaseClass[GovGAST4_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovGAST4_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovGAST4_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovGAST4_primitive_builder attrEnum, BaseClass value) {
		try {
			GovGAST4_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovGAST4_class_attributes_enum attrEnum = GovGAST4_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovGAST4, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovGAST4_primitive_builder attrEnum = GovGAST4_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GovGAST4, setting " + attrName  + " to: "  + value);
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
			for (GovGAST4_primitive_builder attrEnum: GovGAST4_primitive_builder.values()) {
				BaseClass bc = GovGAST4_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovGAST4." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovGAST4_class_attributes_enum attrEnum: GovGAST4_class_attributes_enum.values()) {
				BaseClass bc = GovGAST4_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovGAST4." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovGAST4) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GovGAST4";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovGAST4();
        }
};
