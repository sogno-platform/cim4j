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
	private BaseClass[] GovSteam1_class_attributes;
	private BaseClass[] GovSteam1_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

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

	private enum GovSteam1_class_attributes_enum {
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
		db1,
		eps,
		sdb1,
		sdb2,
		db2,
		valve,
		gv1,
		pgv1,
		gv2,
		pgv2,
		gv3,
		pgv3,
		gv4,
		pgv4,
		gv5,
		pgv5,
		gv6,
		pgv6,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovSteam1() {
		GovSteam1_primitive_attributes = new BaseClass[GovSteam1_primitive_builder.values().length];
		GovSteam1_class_attributes = new BaseClass[GovSteam1_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovSteam1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovSteam1_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovSteam1_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteam1_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovSteam1_class_attributes_enum attrEnum = GovSteam1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovSteam1, setting " + attrName);
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
			System.out.println("Updated GovSteam1, setting " + attrName  + " to: "  + value);
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
			for (GovSteam1_primitive_builder attrEnum: GovSteam1_primitive_builder.values()) {
				BaseClass bc = GovSteam1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteam1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovSteam1_class_attributes_enum attrEnum: GovSteam1_class_attributes_enum.values()) {
				BaseClass bc = GovSteam1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteam1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovSteam1) RDFID: " + rdfid;
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
