package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TurbineGovernorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.PU;
import cim4j.Seconds;



/*
Simplified governor model.
*/
public class GovSteam2 extends TurbineGovernorDynamics
{
	private BaseClass[] GovSteam2_class_attributes;
	private BaseClass[] GovSteam2_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GovSteam2_primitive_builder implements PrimitiveBuilder {
		k(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		dbf(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		t1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t2(){
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
		mxef(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		mnef(){
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

	private enum GovSteam2_class_attributes_enum {
		k,
		dbf,
		t1,
		t2,
		pmax,
		pmin,
		mxef,
		mnef,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
	
	public GovSteam2() {
		GovSteam2_primitive_attributes = new BaseClass[GovSteam2_primitive_builder.values().length];
		GovSteam2_class_attributes = new BaseClass[GovSteam2_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovSteam2_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovSteam2_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovSteam2_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteam2_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovSteam2_class_attributes_enum attrEnum = GovSteam2_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovSteam2, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovSteam2_primitive_builder attrEnum = GovSteam2_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GovSteam2, setting " + attrName  + " to: "  + value);
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
			for (GovSteam2_primitive_builder attrEnum: GovSteam2_primitive_builder.values()) {
				BaseClass bc = GovSteam2_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteam2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovSteam2_class_attributes_enum attrEnum: GovSteam2_class_attributes_enum.values()) {
				BaseClass bc = GovSteam2_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteam2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovSteam2) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GovSteam2";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovSteam2();
        }
};
