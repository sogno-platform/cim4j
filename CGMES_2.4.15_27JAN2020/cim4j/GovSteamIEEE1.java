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
import cim4j.Simple_Float;



/*
IEEE steam turbine governor model.  Ref
*/
public class GovSteamIEEE1 extends TurbineGovernorDynamics
{
	private BaseClass[] GovSteamIEEE1_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum GovSteamIEEE1_primitive_builder implements PrimitiveBuilder {
			mwbase(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			k(){
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
			t3(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			uo(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			uc(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
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
			t4(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
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
			t5(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			k3(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			k4(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			t6(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			k5(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			k6(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			t7(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			k7(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			k8(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovSteamIEEE1() {
		GovSteamIEEE1_attributes = new BaseClass[GovSteamIEEE1_primitive_builder.values().length];
	}

	public void updateAttributeInArray(GovSteamIEEE1_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteamIEEE1_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//GovSteamIEEE1_ATTR_ENUM attrEnum = GovSteamIEEE1_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovSteamIEEE1_primitive_builder attrEnum = GovSteamIEEE1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (GovSteamIEEE1_primitive_builder attrEnum: GovSteamIEEE1_primitive_builder.values()) {
			BaseClass bc = GovSteamIEEE1_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "GovSteamIEEE1";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovSteamIEEE1();
        }
};
