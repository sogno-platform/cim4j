package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TurbineGovernorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Simple_Float;
import cim4j.Seconds;



/*
Detailed electro-hydraulic governor for steam unit.
*/
public class GovSteamFV4 extends TurbineGovernorDynamics
{
	private BaseClass[] GovSteamFV4_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum GovSteamFV4_primitive_builder implements PrimitiveBuilder {
			kf1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kf3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			lps(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			lpi(){
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
			crmx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			crmn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kpt(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kit(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			rvgmx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			rvgmn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			svmx(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			svmn(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			srmx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			srmn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kpp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kip(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			rsmimx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			rsmimn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kmp1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kmp2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			srsmp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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
			ty(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			yhpmx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			yhpmn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tam(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tcm(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ympmx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ympmn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			y(){
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
			tmp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			khp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			pr1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			pr2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			psmn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kpc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kic(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kdc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tdc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			cpsmx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			cpsmn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			krc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tf1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tf2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tv(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ksh(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovSteamFV4() {
		GovSteamFV4_attributes = new BaseClass[GovSteamFV4_primitive_builder.values().length];
	}

	public void updateAttributeInArray(GovSteamFV4_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteamFV4_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//GovSteamFV4_ATTR_ENUM attrEnum = GovSteamFV4_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovSteamFV4_primitive_builder attrEnum = GovSteamFV4_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (GovSteamFV4_primitive_builder attrEnum: GovSteamFV4_primitive_builder.values()) {
			BaseClass bc = GovSteamFV4_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "GovSteamFV4";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovSteamFV4();
        }
};
