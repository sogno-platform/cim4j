package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TurbineGovernorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ActivePower;
import cim4j.PU;
import cim4j.DroopSignalFeedbackKind;
import cim4j.Seconds;
import cim4j.Boolean;
import cim4j.Simple_Float;



/*
General model for any prime mover with a PID governor, used primarily for combustion turbine and combined cycle units. This model can be used to represent a variety of prime movers controlled by PID governors.  It is suitable, for example, for representation of     Additional information on this model is available in the 2012 IEEE report, , section 3.1.2.3 page 3-4 (GGOV1).
*/
public class GovCT1 extends TurbineGovernorDynamics
{
	private BaseClass[] GovCT1_class_attributes;
	private BaseClass[] GovCT1_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GovCT1_primitive_builder implements PrimitiveBuilder {
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
		rselect(){
			public BaseClass construct (java.lang.String value) {
				return new DroopSignalFeedbackKind(value);
			}
		},
		tpelec(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		maxerr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		minerr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kpgov(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kigov(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kdgov(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tdgov(){
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
		tact(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		kturb(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		wfnl(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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
		wfspd(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		teng(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tfload(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		kpload(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kiload(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ldref(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		dm(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ropen(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		rclose(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kimw(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		aset(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ka(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ta(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		db(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tsa(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tsb(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		rup(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		rdown(){
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

	private enum GovCT1_class_attributes_enum {
		mwbase,
		r,
		rselect,
		tpelec,
		maxerr,
		minerr,
		kpgov,
		kigov,
		kdgov,
		tdgov,
		vmax,
		vmin,
		tact,
		kturb,
		wfnl,
		tb,
		tc,
		wfspd,
		teng,
		tfload,
		kpload,
		kiload,
		ldref,
		dm,
		ropen,
		rclose,
		kimw,
		aset,
		ka,
		ta,
		db,
		tsa,
		tsb,
		rup,
		rdown,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovCT1() {
		GovCT1_primitive_attributes = new BaseClass[GovCT1_primitive_builder.values().length];
		GovCT1_class_attributes = new BaseClass[GovCT1_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovCT1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovCT1_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovCT1_primitive_builder attrEnum, BaseClass value) {
		try {
			GovCT1_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovCT1_class_attributes_enum attrEnum = GovCT1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovCT1, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovCT1_primitive_builder attrEnum = GovCT1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GovCT1, setting " + attrName  + " to: "  + value);
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
			for (GovCT1_primitive_builder attrEnum: GovCT1_primitive_builder.values()) {
				BaseClass bc = GovCT1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovCT1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovCT1_class_attributes_enum attrEnum: GovCT1_class_attributes_enum.values()) {
				BaseClass bc = GovCT1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovCT1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovCT1) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GovCT1";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovCT1();
        }
};
