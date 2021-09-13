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
Simplified GovSteamIEEE1 Steam turbine governor model with Prmax limit and fast valving.
*/
public class GovSteamFV3 extends TurbineGovernorDynamics
{
	private BaseClass[] GovSteamFV3_class_attributes;
	private BaseClass[] GovSteamFV3_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GovSteamFV3_primitive_builder implements PrimitiveBuilder {
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
				return new PU(value);
			}
		},
		t5(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		k2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		t6(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		k3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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
		prmax(){
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

	private enum GovSteamFV3_class_attributes_enum {
		mwbase,
		k,
		t1,
		t2,
		t3,
		uo,
		uc,
		pmax,
		pmin,
		t4,
		k1,
		t5,
		k2,
		t6,
		k3,
		ta,
		tb,
		tc,
		prmax,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovSteamFV3() {
		GovSteamFV3_primitive_attributes = new BaseClass[GovSteamFV3_primitive_builder.values().length];
		GovSteamFV3_class_attributes = new BaseClass[GovSteamFV3_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovSteamFV3_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovSteamFV3_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovSteamFV3_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteamFV3_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovSteamFV3_class_attributes_enum attrEnum = GovSteamFV3_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovSteamFV3, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovSteamFV3_primitive_builder attrEnum = GovSteamFV3_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GovSteamFV3, setting " + attrName  + " to: "  + value);
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
			for (GovSteamFV3_primitive_builder attrEnum: GovSteamFV3_primitive_builder.values()) {
				BaseClass bc = GovSteamFV3_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamFV3." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovSteamFV3_class_attributes_enum attrEnum: GovSteamFV3_class_attributes_enum.values()) {
				BaseClass bc = GovSteamFV3_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamFV3." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovSteamFV3) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GovSteamFV3";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovSteamFV3();
        }
};
