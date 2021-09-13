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
	private BaseClass[] GovSteamIEEE1_class_attributes;
	private BaseClass[] GovSteamIEEE1_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

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

	private enum GovSteamIEEE1_class_attributes_enum {
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
		k2,
		t5,
		k3,
		k4,
		t6,
		k5,
		k6,
		t7,
		k7,
		k8,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovSteamIEEE1() {
		GovSteamIEEE1_primitive_attributes = new BaseClass[GovSteamIEEE1_primitive_builder.values().length];
		GovSteamIEEE1_class_attributes = new BaseClass[GovSteamIEEE1_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovSteamIEEE1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovSteamIEEE1_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovSteamIEEE1_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteamIEEE1_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovSteamIEEE1_class_attributes_enum attrEnum = GovSteamIEEE1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovSteamIEEE1, setting " + attrName);
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
			System.out.println("Updated GovSteamIEEE1, setting " + attrName  + " to: "  + value);
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
			for (GovSteamIEEE1_primitive_builder attrEnum: GovSteamIEEE1_primitive_builder.values()) {
				BaseClass bc = GovSteamIEEE1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamIEEE1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovSteamIEEE1_class_attributes_enum attrEnum: GovSteamIEEE1_class_attributes_enum.values()) {
				BaseClass bc = GovSteamIEEE1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteamIEEE1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovSteamIEEE1) RDFID: " + rdfid;
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
