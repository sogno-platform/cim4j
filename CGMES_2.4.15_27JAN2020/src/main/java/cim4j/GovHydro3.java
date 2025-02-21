package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TurbineGovernorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ActivePower;
import cim4j.PU;
import cim4j.Boolean;
import cim4j.Seconds;
import cim4j.Simple_Float;
import cim4j.Frequency;



/*
Modified IEEE Hydro Governor-Turbine Model.  This model differs from that defined in the IEEE modeling guideline paper in that the limits on gate position and velocity do not permit "wind up" of the upstream signals.
*/
public class GovHydro3 extends TurbineGovernorDynamics
{
	private BaseClass[] GovHydro3_class_attributes;
	private BaseClass[] GovHydro3_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GovHydro3_primitive_builder implements PrimitiveBuilder {
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
		governorControl(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		rgate(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		relec(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		td(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tf(){
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
		k1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		k2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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
		tt(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
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

	private enum GovHydro3_class_attributes_enum {
		mwbase,
		pmax,
		pmin,
		governorControl,
		rgate,
		relec,
		td,
		tf,
		tp,
		velop,
		velcl,
		k1,
		k2,
		ki,
		kg,
		tt,
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovHydro3() {
		GovHydro3_primitive_attributes = new BaseClass[GovHydro3_primitive_builder.values().length];
		GovHydro3_class_attributes = new BaseClass[GovHydro3_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovHydro3_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovHydro3_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovHydro3_primitive_builder attrEnum, BaseClass value) {
		try {
			GovHydro3_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovHydro3_class_attributes_enum attrEnum = GovHydro3_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovHydro3, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovHydro3_primitive_builder attrEnum = GovHydro3_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GovHydro3, setting " + attrName  + " to: "  + value);
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
			for (GovHydro3_primitive_builder attrEnum: GovHydro3_primitive_builder.values()) {
				BaseClass bc = GovHydro3_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydro3." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovHydro3_class_attributes_enum attrEnum: GovHydro3_class_attributes_enum.values()) {
				BaseClass bc = GovHydro3_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydro3." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovHydro3) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GovHydro3";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovHydro3();
        }
};
