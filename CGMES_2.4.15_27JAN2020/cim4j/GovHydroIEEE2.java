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



/*
IEEE hydro turbine governor model represents plants with straightforward penstock configurations and hydraulic-dashpot governors.  Ref
*/
public class GovHydroIEEE2 extends TurbineGovernorDynamics
{
	private BaseClass[] GovHydroIEEE2_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum GovHydroIEEE2_primitive_builder implements PrimitiveBuilder {
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
			rperm(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			rtemp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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
			kturb(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			aturb(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			bturb(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovHydroIEEE2() {
		GovHydroIEEE2_attributes = new BaseClass[GovHydroIEEE2_primitive_builder.values().length];
	}

	public void updateAttributeInArray(GovHydroIEEE2_primitive_builder attrEnum, BaseClass value) {
		try {
			GovHydroIEEE2_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//GovHydroIEEE2_ATTR_ENUM attrEnum = GovHydroIEEE2_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovHydroIEEE2_primitive_builder attrEnum = GovHydroIEEE2_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (GovHydroIEEE2_primitive_builder attrEnum: GovHydroIEEE2_primitive_builder.values()) {
			BaseClass bc = GovHydroIEEE2_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "GovHydroIEEE2";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovHydroIEEE2();
        }
};
