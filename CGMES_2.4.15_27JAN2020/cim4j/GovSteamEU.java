package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TurbineGovernorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ActivePower;
import cim4j.Seconds;
import cim4j.PU;
import cim4j.Simple_Float;



/*
Simplified model  of boiler and steam turbine with PID governor.
*/
public class GovSteamEU extends TurbineGovernorDynamics
{
	private BaseClass[] GovSteamEU_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum GovSteamEU_primitive_builder implements PrimitiveBuilder {
			mwbase(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			tp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ke(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tip(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tdp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tfp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tf(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			kfcor(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			db1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			wfmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			wfmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			pmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ten(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tw(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			kwcor(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			db2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			wwmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			wwmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			wmax1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			wmax2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tvhp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			cho(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			chc(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			hhpmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tvip(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			cio(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			cic(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			simx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			thp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			trh(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tlp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			prhmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			khp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			klp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tb(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovSteamEU() {
		GovSteamEU_attributes = new BaseClass[GovSteamEU_primitive_builder.values().length];
	}

	public void updateAttributeInArray(GovSteamEU_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteamEU_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//GovSteamEU_ATTR_ENUM attrEnum = GovSteamEU_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovSteamEU_primitive_builder attrEnum = GovSteamEU_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (GovSteamEU_primitive_builder attrEnum: GovSteamEU_primitive_builder.values()) {
			BaseClass bc = GovSteamEU_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "GovSteamEU";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovSteamEU();
        }
};
