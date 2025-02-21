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
import cim4j.Boolean;
import cim4j.Frequency;



/*
Fourth order lead-lag governor and hydro turbine.
*/
public class GovHydroR extends TurbineGovernorDynamics
{
	private BaseClass[] GovHydroR_class_attributes;
	private BaseClass[] GovHydroR_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GovHydroR_primitive_builder implements PrimitiveBuilder {
		mwbase(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
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
		r(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		td(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
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
		t7(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t8(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		velop(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		velcl(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ki(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kg(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		gmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		gmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tt(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		inputSignal(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
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
		db2(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		tw(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		at(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		dturb(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		qnl(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		h0(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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

	private enum GovHydroR_class_attributes_enum {
		mwbase,
		pmax,
		pmin,
		r,
		td,
		t1,
		t2,
		t3,
		t4,
		t5,
		t6,
		t7,
		t8,
		tp,
		velop,
		velcl,
		ki,
		kg,
		gmax,
		gmin,
		tt,
		inputSignal,
		db1,
		eps,
		db2,
		tw,
		at,
		dturb,
		qnl,
		h0,
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovHydroR() {
		GovHydroR_primitive_attributes = new BaseClass[GovHydroR_primitive_builder.values().length];
		GovHydroR_class_attributes = new BaseClass[GovHydroR_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovHydroR_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovHydroR_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovHydroR_primitive_builder attrEnum, BaseClass value) {
		try {
			GovHydroR_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovHydroR_class_attributes_enum attrEnum = GovHydroR_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovHydroR, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovHydroR_primitive_builder attrEnum = GovHydroR_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GovHydroR, setting " + attrName  + " to: "  + value);
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
			for (GovHydroR_primitive_builder attrEnum: GovHydroR_primitive_builder.values()) {
				BaseClass bc = GovHydroR_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydroR." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovHydroR_class_attributes_enum attrEnum: GovHydroR_class_attributes_enum.values()) {
				BaseClass bc = GovHydroR_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydroR." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovHydroR) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GovHydroR";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovHydroR();
        }
};
