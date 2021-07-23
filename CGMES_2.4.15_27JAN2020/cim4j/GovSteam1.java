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
import cim4j.Frequency;
import cim4j.Boolean;



/*
Steam turbine governor model, based on the GovSteamIEEE1 model  (with optional deadband and nonlinear valve gain added).
*/
public class GovSteam1 extends TurbineGovernorDynamics
{
	private BaseClass[] GovSteam1_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum GovSteam1_primitive_builder implements PrimitiveBuilder {
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
			db1(){
			public BaseClass construct (java.lang.String value) {
				return new Frequency(value);
			}
		},
			eps(){
			public BaseClass construct (java.lang.String value) {
				return new Frequency(value);
			}
		},
			sdb1(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			sdb2(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			db2(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			valve(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			gv1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			pgv1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			gv2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			pgv2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			gv3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			pgv3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			gv4(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			pgv4(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			gv5(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			pgv5(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			gv6(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			pgv6(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovSteam1() {
		GovSteam1_attributes = new BaseClass[GovSteam1_primitive_builder.values().length];
	}

	public void updateAttributeInArray(GovSteam1_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteam1_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//GovSteam1_ATTR_ENUM attrEnum = GovSteam1_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovSteam1_primitive_builder attrEnum = GovSteam1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (GovSteam1_primitive_builder attrEnum: GovSteam1_primitive_builder.values()) {
			BaseClass bc = GovSteam1_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "GovSteam1";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovSteam1();
        }
};
