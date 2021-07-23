package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TurbineGovernorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.PU;
import cim4j.Seconds;



/*
Simplified governor model.
*/
public class GovSteam2 extends TurbineGovernorDynamics
{
	private BaseClass[] GovSteam2_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum GovSteam2_primitive_builder implements PrimitiveBuilder {
			k(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			dbf(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			t1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			pmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			pmin(){
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

		
		
		
		
		
		
		
		
	
	public GovSteam2() {
		GovSteam2_attributes = new BaseClass[GovSteam2_primitive_builder.values().length];
	}

	public void updateAttributeInArray(GovSteam2_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteam2_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//GovSteam2_ATTR_ENUM attrEnum = GovSteam2_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovSteam2_primitive_builder attrEnum = GovSteam2_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (GovSteam2_primitive_builder attrEnum: GovSteam2_primitive_builder.values()) {
			BaseClass bc = GovSteam2_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "GovSteam2";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovSteam2();
        }
};
