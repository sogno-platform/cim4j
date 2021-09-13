package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TurbineLoadControllerDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ActivePower;
import cim4j.Boolean;
import cim4j.PU;
import cim4j.Seconds;



/*
Turbine Load Controller model developed in the WECC.  This model represents a supervisory turbine load controller that acts to maintain turbine power at a set value by continuous adjustment of the turbine governor speed-load reference. This model is intended to represent slow reset 'outer loop' controllers managing the action of the turbine governor.
*/
public class TurbLCFB1 extends TurbineLoadControllerDynamics
{
	private BaseClass[] TurbLCFB1_class_attributes;
	private BaseClass[] TurbLCFB1_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum TurbLCFB1_primitive_builder implements PrimitiveBuilder {
		mwbase(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		speedReferenceGovernor(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		db(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		emax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		fb(){
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
		fbf(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		pbf(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		tpelec(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		irmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		pmwset(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum TurbLCFB1_class_attributes_enum {
		mwbase,
		speedReferenceGovernor,
		db,
		emax,
		fb,
		kp,
		ki,
		fbf,
		pbf,
		tpelec,
		irmax,
		pmwset,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
	
	public TurbLCFB1() {
		TurbLCFB1_primitive_attributes = new BaseClass[TurbLCFB1_primitive_builder.values().length];
		TurbLCFB1_class_attributes = new BaseClass[TurbLCFB1_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(TurbLCFB1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			TurbLCFB1_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(TurbLCFB1_primitive_builder attrEnum, BaseClass value) {
		try {
			TurbLCFB1_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			TurbLCFB1_class_attributes_enum attrEnum = TurbLCFB1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated TurbLCFB1, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			TurbLCFB1_primitive_builder attrEnum = TurbLCFB1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated TurbLCFB1, setting " + attrName  + " to: "  + value);
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
			for (TurbLCFB1_primitive_builder attrEnum: TurbLCFB1_primitive_builder.values()) {
				BaseClass bc = TurbLCFB1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TurbLCFB1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (TurbLCFB1_class_attributes_enum attrEnum: TurbLCFB1_class_attributes_enum.values()) {
				BaseClass bc = TurbLCFB1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TurbLCFB1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(TurbLCFB1) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "TurbLCFB1";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new TurbLCFB1();
        }
};
