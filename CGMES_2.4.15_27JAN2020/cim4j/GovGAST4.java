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
	private BaseClass[] GovGAST4_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
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

		
		
		
		
		
		
		
		
		
		
		
	
	public GovGAST4() {
		GovGAST4_attributes = new BaseClass[GovGAST4_primitive_builder.values().length];
	}

	public void updateAttributeInArray(GovGAST4_primitive_builder attrEnum, BaseClass value) {
		try {
			GovGAST4_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//GovGAST4_ATTR_ENUM attrEnum = GovGAST4_ATTR_BC_ENUM.valueOf(attrName);
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
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (GovGAST4_primitive_builder attrEnum: GovGAST4_primitive_builder.values()) {
			BaseClass bc = GovGAST4_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
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
