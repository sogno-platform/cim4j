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
IEEE hydro turbine governor model represents plants with straightforward penstock configurations and hydraulic-dashpot governors.
*/
public class GovHydro2 extends TurbineGovernorDynamics
{
	private BaseClass[] GovHydro2_class_attributes;
	private BaseClass[] GovHydro2_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GovHydro2_primitive_builder implements PrimitiveBuilder {
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

	private enum GovHydro2_class_attributes_enum {
		mwbase,
		tg,
		tp,
		uo,
		uc,
		pmax,
		pmin,
		rperm,
		rtemp,
		tr,
		tw,
		kturb,
		aturb,
		bturb,
		db1,
		eps,
		db2,
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovHydro2() {
		GovHydro2_primitive_attributes = new BaseClass[GovHydro2_primitive_builder.values().length];
		GovHydro2_class_attributes = new BaseClass[GovHydro2_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovHydro2_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovHydro2_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovHydro2_primitive_builder attrEnum, BaseClass value) {
		try {
			GovHydro2_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovHydro2_class_attributes_enum attrEnum = GovHydro2_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovHydro2, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovHydro2_primitive_builder attrEnum = GovHydro2_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GovHydro2, setting " + attrName  + " to: "  + value);
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
			for (GovHydro2_primitive_builder attrEnum: GovHydro2_primitive_builder.values()) {
				BaseClass bc = GovHydro2_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydro2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovHydro2_class_attributes_enum attrEnum: GovHydro2_class_attributes_enum.values()) {
				BaseClass bc = GovHydro2_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydro2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovHydro2) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GovHydro2";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovHydro2();
        }
};
