package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TurbineGovernorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ActivePower;
import cim4j.Simple_Float;
import cim4j.Seconds;
import cim4j.PU;
import cim4j.Boolean;



/*
Woodward Electric Hydro Governor Model.
*/
public class GovHydroWEH extends TurbineGovernorDynamics
{
	private BaseClass[] GovHydroWEH_class_attributes;
	private BaseClass[] GovHydroWEH_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GovHydroWEH_primitive_builder implements PrimitiveBuilder {
		mwbase(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		rpg(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		rpp(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		tpe(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		kp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ki(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kd(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		td(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tdv(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tg(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		gtmxop(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		gtmxcl(){
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
		dturb(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tw(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		db(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		dpv(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		dicn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		feedbackSignal(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		gv1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		gv2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		gv3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		gv4(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		gv5(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		fl1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		fl2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		fl3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		fl4(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		fl5(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		fp1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		fp2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		fp3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		fp4(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		fp5(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		fp6(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		fp7(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		fp8(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		fp9(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		fp10(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		pmss1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		pmss2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		pmss3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		pmss4(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		pmss5(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		pmss6(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		pmss7(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		pmss8(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		pmss9(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		pmss10(){
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

	private enum GovHydroWEH_class_attributes_enum {
		mwbase,
		rpg,
		rpp,
		tpe,
		kp,
		ki,
		kd,
		td,
		tp,
		tdv,
		tg,
		gtmxop,
		gtmxcl,
		gmax,
		gmin,
		dturb,
		tw,
		db,
		dpv,
		dicn,
		feedbackSignal,
		gv1,
		gv2,
		gv3,
		gv4,
		gv5,
		fl1,
		fl2,
		fl3,
		fl4,
		fl5,
		fp1,
		fp2,
		fp3,
		fp4,
		fp5,
		fp6,
		fp7,
		fp8,
		fp9,
		fp10,
		pmss1,
		pmss2,
		pmss3,
		pmss4,
		pmss5,
		pmss6,
		pmss7,
		pmss8,
		pmss9,
		pmss10,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovHydroWEH() {
		GovHydroWEH_primitive_attributes = new BaseClass[GovHydroWEH_primitive_builder.values().length];
		GovHydroWEH_class_attributes = new BaseClass[GovHydroWEH_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovHydroWEH_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovHydroWEH_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovHydroWEH_primitive_builder attrEnum, BaseClass value) {
		try {
			GovHydroWEH_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovHydroWEH_class_attributes_enum attrEnum = GovHydroWEH_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovHydroWEH, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovHydroWEH_primitive_builder attrEnum = GovHydroWEH_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GovHydroWEH, setting " + attrName  + " to: "  + value);
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
			for (GovHydroWEH_primitive_builder attrEnum: GovHydroWEH_primitive_builder.values()) {
				BaseClass bc = GovHydroWEH_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydroWEH." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovHydroWEH_class_attributes_enum attrEnum: GovHydroWEH_class_attributes_enum.values()) {
				BaseClass bc = GovHydroWEH_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydroWEH." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovHydroWEH) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GovHydroWEH";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovHydroWEH();
        }
};
