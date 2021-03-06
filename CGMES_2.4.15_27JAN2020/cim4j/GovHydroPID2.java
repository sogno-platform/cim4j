package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TurbineGovernorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ActivePower;
import cim4j.Seconds;
import cim4j.PU;
import cim4j.Simple_Float;
import cim4j.Boolean;



/*
Hydro turbine and governor. Represents plants with straight forward penstock configurations and "three term" electro-hydraulic governors (i.e. Woodard electronic).
*/
public class GovHydroPID2 extends TurbineGovernorDynamics
{
	private BaseClass[] GovHydroPID2_class_attributes;
	private BaseClass[] GovHydroPID2_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GovHydroPID2_primitive_builder implements PrimitiveBuilder {
		mwbase(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		treg(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		rperm(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ki(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kd(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ta(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tb(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		velmax(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		velmin(){
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
		d(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		g0(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		g1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		p1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		g2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		p2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		p3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		atw(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		feedbackSignal(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum GovHydroPID2_class_attributes_enum {
		mwbase,
		treg,
		rperm,
		kp,
		ki,
		kd,
		ta,
		tb,
		velmax,
		velmin,
		gmax,
		gmin,
		tw,
		d,
		g0,
		g1,
		p1,
		g2,
		p2,
		p3,
		atw,
		feedbackSignal,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovHydroPID2() {
		GovHydroPID2_primitive_attributes = new BaseClass[GovHydroPID2_primitive_builder.values().length];
		GovHydroPID2_class_attributes = new BaseClass[GovHydroPID2_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovHydroPID2_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovHydroPID2_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovHydroPID2_primitive_builder attrEnum, BaseClass value) {
		try {
			GovHydroPID2_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovHydroPID2_class_attributes_enum attrEnum = GovHydroPID2_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovHydroPID2, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovHydroPID2_primitive_builder attrEnum = GovHydroPID2_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GovHydroPID2, setting " + attrName  + " to: "  + value);
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
			for (GovHydroPID2_primitive_builder attrEnum: GovHydroPID2_primitive_builder.values()) {
				BaseClass bc = GovHydroPID2_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydroPID2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovHydroPID2_class_attributes_enum attrEnum: GovHydroPID2_class_attributes_enum.values()) {
				BaseClass bc = GovHydroPID2_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydroPID2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovHydroPID2) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GovHydroPID2";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovHydroPID2();
        }
};
