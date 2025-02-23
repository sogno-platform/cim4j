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



/*
Woodward PID Hydro Governor.
*/
public class GovHydroWPID extends TurbineGovernorDynamics
{
	private BaseClass[] GovHydroWPID_class_attributes;
	private BaseClass[] GovHydroWPID_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GovHydroWPID_primitive_builder implements PrimitiveBuilder {
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
		reg(){
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
				return new PU(value);
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
				return new PU(value);
			}
		},
		velmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		gatmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		gatmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tw(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
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
		d(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		gv3(){
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
		pgv3(){
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

	private enum GovHydroWPID_class_attributes_enum {
		mwbase,
		treg,
		reg,
		kp,
		ki,
		kd,
		ta,
		tb,
		velmax,
		velmin,
		gatmax,
		gatmin,
		tw,
		pmax,
		pmin,
		d,
		gv3,
		gv1,
		pgv1,
		gv2,
		pgv2,
		pgv3,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovHydroWPID() {
		GovHydroWPID_primitive_attributes = new BaseClass[GovHydroWPID_primitive_builder.values().length];
		GovHydroWPID_class_attributes = new BaseClass[GovHydroWPID_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovHydroWPID_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovHydroWPID_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovHydroWPID_primitive_builder attrEnum, BaseClass value) {
		try {
			GovHydroWPID_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovHydroWPID_class_attributes_enum attrEnum = GovHydroWPID_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovHydroWPID, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovHydroWPID_primitive_builder attrEnum = GovHydroWPID_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GovHydroWPID, setting " + attrName  + " to: "  + value);
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
			for (GovHydroWPID_primitive_builder attrEnum: GovHydroWPID_primitive_builder.values()) {
				BaseClass bc = GovHydroWPID_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydroWPID." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovHydroWPID_class_attributes_enum attrEnum: GovHydroWPID_class_attributes_enum.values()) {
				BaseClass bc = GovHydroWPID_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovHydroWPID." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovHydroWPID) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GovHydroWPID";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovHydroWPID();
        }
};
