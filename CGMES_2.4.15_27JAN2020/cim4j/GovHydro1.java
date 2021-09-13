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
	private BaseClass[] GovHydro1_class_attributes;
	private BaseClass[] GovHydro1_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

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

	private enum GovHydro1_class_attributes_enum {
		mwbase,
		rperm,
		rtemp,
		tr,
		tf,
		tg,
		velm,
		gmax,
		gmin,
		tw,
		at,
		dturb,
		qnl,
		hdam,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovHydro1() {
		GovHydro1_primitive_attributes = new BaseClass[GovHydro1_primitive_builder.values().length];
		GovHydro1_class_attributes = new BaseClass[GovHydro1_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovHydro1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovHydro1_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovHydro1_primitive_builder attrEnum, BaseClass value) {
		try {
			GovHydro1_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovHydro1_class_attributes_enum attrEnum = GovHydro1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovHydro1, setting " + attrName);
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
			System.out.println("Updated GovHydro1, setting " + attrName  + " to: "  + value);
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
			for (GovHydro1_primitive_builder attrEnum: GovHydro1_primitive_builder.values()) {
				BaseClass bc = GovHydro1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydro1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovHydro1_class_attributes_enum attrEnum: GovHydro1_class_attributes_enum.values()) {
				BaseClass bc = GovHydro1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydro1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovHydro1) RDFID: " + rdfid;
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
