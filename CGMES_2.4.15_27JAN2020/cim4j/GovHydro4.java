package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TurbineGovernorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ActivePower;
import cim4j.Seconds;
import cim4j.Simple_Float;
import cim4j.PU;
import cim4j.Frequency;



/*
Hydro turbine and governor. Represents plants with straight-forward penstock configurations and hydraulic governors of traditional 'dashpot' type.  This model can be used to represent simple, Francis, Pelton or Kaplan turbines.
*/
public class GovHydro4 extends TurbineGovernorDynamics
{
	private BaseClass[] GovHydro4_class_attributes;
	private BaseClass[] GovHydro4_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GovHydro4_primitive_builder implements PrimitiveBuilder {
		mwbase(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		tg(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tp(){
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
		rperm(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		rtemp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tr(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
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
		hdam(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		qn1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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
		gv0(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		pgv0(){
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
		bgv0(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		bgv1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		bgv2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		bgv3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		bgv4(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		bgv5(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		bmax(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		tblade(){
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

	private enum GovHydro4_class_attributes_enum {
		mwbase,
		tg,
		tp,
		uo,
		uc,
		gmax,
		gmin,
		rperm,
		rtemp,
		tr,
		tw,
		at,
		dturb,
		hdam,
		qn1,
		db1,
		eps,
		db2,
		gv0,
		pgv0,
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
		bgv0,
		bgv1,
		bgv2,
		bgv3,
		bgv4,
		bgv5,
		bmax,
		tblade,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovHydro4() {
		GovHydro4_primitive_attributes = new BaseClass[GovHydro4_primitive_builder.values().length];
		GovHydro4_class_attributes = new BaseClass[GovHydro4_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovHydro4_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovHydro4_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovHydro4_primitive_builder attrEnum, BaseClass value) {
		try {
			GovHydro4_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovHydro4_class_attributes_enum attrEnum = GovHydro4_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovHydro4, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovHydro4_primitive_builder attrEnum = GovHydro4_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GovHydro4, setting " + attrName  + " to: "  + value);
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
			for (GovHydro4_primitive_builder attrEnum: GovHydro4_primitive_builder.values()) {
				BaseClass bc = GovHydro4_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydro4." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovHydro4_class_attributes_enum attrEnum: GovHydro4_class_attributes_enum.values()) {
				BaseClass bc = GovHydro4_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydro4." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovHydro4) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GovHydro4";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovHydro4();
        }
};
