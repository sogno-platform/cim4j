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
	private BaseClass[] GovHydroWEH_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovHydroWEH() {
		GovHydroWEH_attributes = new BaseClass[GovHydroWEH_primitive_builder.values().length];
	}

	public void updateAttributeInArray(GovHydroWEH_primitive_builder attrEnum, BaseClass value) {
		try {
			GovHydroWEH_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//GovHydroWEH_ATTR_ENUM attrEnum = GovHydroWEH_ATTR_BC_ENUM.valueOf(attrName);
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
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (GovHydroWEH_primitive_builder attrEnum: GovHydroWEH_primitive_builder.values()) {
			BaseClass bc = GovHydroWEH_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
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
