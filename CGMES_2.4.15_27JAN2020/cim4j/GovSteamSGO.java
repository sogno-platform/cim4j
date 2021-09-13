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



/*
Simplified Steam turbine governor model.
*/
public class GovSteamSGO extends TurbineGovernorDynamics
{
	private BaseClass[] GovSteamSGO_class_attributes;
	private BaseClass[] GovSteamSGO_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GovSteamSGO_primitive_builder implements PrimitiveBuilder {
		mwbase(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
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
		t4(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t5(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t6(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		k1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		k2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		k3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		pmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		pmin(){
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

	private enum GovSteamSGO_class_attributes_enum {
		mwbase,
		t1,
		t2,
		t3,
		t4,
		t5,
		t6,
		k1,
		k2,
		k3,
		pmax,
		pmin,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovSteamSGO() {
		GovSteamSGO_primitive_attributes = new BaseClass[GovSteamSGO_primitive_builder.values().length];
		GovSteamSGO_class_attributes = new BaseClass[GovSteamSGO_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovSteamSGO_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovSteamSGO_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovSteamSGO_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteamSGO_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovSteamSGO_class_attributes_enum attrEnum = GovSteamSGO_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovSteamSGO, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovSteamSGO_primitive_builder attrEnum = GovSteamSGO_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GovSteamSGO, setting " + attrName  + " to: "  + value);
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
			for (GovSteamSGO_primitive_builder attrEnum: GovSteamSGO_primitive_builder.values()) {
				BaseClass bc = GovSteamSGO_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamSGO." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovSteamSGO_class_attributes_enum attrEnum: GovSteamSGO_class_attributes_enum.values()) {
				BaseClass bc = GovSteamSGO_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamSGO." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovSteamSGO) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GovSteamSGO";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovSteamSGO();
        }
};
