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
Steam turbine governor with reheat time constants and modeling of the effects of fast valve closing to reduce mechanical power.
*/
public class GovSteamFV2 extends TurbineGovernorDynamics
{
	private BaseClass[] GovSteamFV2_class_attributes;
	private BaseClass[] GovSteamFV2_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GovSteamFV2_primitive_builder implements PrimitiveBuilder {
		mwbase(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		r(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		t1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		vmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		k(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		t3(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		dt(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tt(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		ta(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tb(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		ti(){
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

	private enum GovSteamFV2_class_attributes_enum {
		mwbase,
		r,
		t1,
		vmax,
		vmin,
		k,
		t3,
		dt,
		tt,
		ta,
		tb,
		tc,
		ti,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovSteamFV2() {
		GovSteamFV2_primitive_attributes = new BaseClass[GovSteamFV2_primitive_builder.values().length];
		GovSteamFV2_class_attributes = new BaseClass[GovSteamFV2_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovSteamFV2_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovSteamFV2_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovSteamFV2_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteamFV2_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovSteamFV2_class_attributes_enum attrEnum = GovSteamFV2_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovSteamFV2, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovSteamFV2_primitive_builder attrEnum = GovSteamFV2_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GovSteamFV2, setting " + attrName  + " to: "  + value);
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
			for (GovSteamFV2_primitive_builder attrEnum: GovSteamFV2_primitive_builder.values()) {
				BaseClass bc = GovSteamFV2_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamFV2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovSteamFV2_class_attributes_enum attrEnum: GovSteamFV2_class_attributes_enum.values()) {
				BaseClass bc = GovSteamFV2_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamFV2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovSteamFV2) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GovSteamFV2";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovSteamFV2();
        }
};
