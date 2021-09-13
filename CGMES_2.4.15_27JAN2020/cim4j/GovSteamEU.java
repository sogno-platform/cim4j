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
	private BaseClass[] GovSteamEU_class_attributes;
	private BaseClass[] GovSteamEU_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

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

	private enum GovSteamEU_class_attributes_enum {
		mwbase,
		tp,
		ke,
		tip,
		tdp,
		tfp,
		tf,
		kfcor,
		db1,
		wfmax,
		wfmin,
		pmax,
		ten,
		tw,
		kwcor,
		db2,
		wwmax,
		wwmin,
		wmax1,
		wmax2,
		tvhp,
		cho,
		chc,
		hhpmax,
		tvip,
		cio,
		cic,
		simx,
		thp,
		trh,
		tlp,
		prhmax,
		khp,
		klp,
		tb,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovSteamEU() {
		GovSteamEU_primitive_attributes = new BaseClass[GovSteamEU_primitive_builder.values().length];
		GovSteamEU_class_attributes = new BaseClass[GovSteamEU_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovSteamEU_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovSteamEU_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovSteamEU_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteamEU_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovSteamEU_class_attributes_enum attrEnum = GovSteamEU_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovSteamEU, setting " + attrName);
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
			System.out.println("Updated GovSteamEU, setting " + attrName  + " to: "  + value);
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
			for (GovSteamEU_primitive_builder attrEnum: GovSteamEU_primitive_builder.values()) {
				BaseClass bc = GovSteamEU_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamEU." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovSteamEU_class_attributes_enum attrEnum: GovSteamEU_class_attributes_enum.values()) {
				BaseClass bc = GovSteamEU_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamEU." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovSteamEU) RDFID: " + rdfid;
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
