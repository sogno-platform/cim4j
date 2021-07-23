package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TurbineGovernorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ActivePower;
import cim4j.PU;
import cim4j.Seconds;



/*
Cross compound turbine governor model.
*/
public class GovSteamCC extends TurbineGovernorDynamics
{
	private BaseClass[] GovSteamCC_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum GovSteamCC_primitive_builder implements PrimitiveBuilder {
			mwbase(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			pmaxhp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			rhp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			t1hp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t3hp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t4hp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t5hp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			fhp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			dhp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			pmaxlp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			rlp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			t1lp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t3lp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t4lp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t5lp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			flp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			dlp(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovSteamCC() {
		GovSteamCC_attributes = new BaseClass[GovSteamCC_primitive_builder.values().length];
	}

	public void updateAttributeInArray(GovSteamCC_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteamCC_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//GovSteamCC_ATTR_ENUM attrEnum = GovSteamCC_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovSteamCC_primitive_builder attrEnum = GovSteamCC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (GovSteamCC_primitive_builder attrEnum: GovSteamCC_primitive_builder.values()) {
			BaseClass bc = GovSteamCC_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "GovSteamCC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovSteamCC();
        }
};
