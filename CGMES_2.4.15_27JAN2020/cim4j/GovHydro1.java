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
Basic Hydro turbine governor model.
*/
public class GovHydro1 extends TurbineGovernorDynamics
{
	private BaseClass[] GovHydro1_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum GovHydro1_primitive_builder implements PrimitiveBuilder {
			mwbase(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
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
			tf(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tg(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			velm(){
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
			hdam(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovHydro1() {
		GovHydro1_attributes = new BaseClass[GovHydro1_primitive_builder.values().length];
	}

	public void updateAttributeInArray(GovHydro1_primitive_builder attrEnum, BaseClass value) {
		try {
			GovHydro1_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//GovHydro1_ATTR_ENUM attrEnum = GovHydro1_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovHydro1_primitive_builder attrEnum = GovHydro1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (GovHydro1_primitive_builder attrEnum: GovHydro1_primitive_builder.values()) {
			BaseClass bc = GovHydro1_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "GovHydro1";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovHydro1();
        }
};
