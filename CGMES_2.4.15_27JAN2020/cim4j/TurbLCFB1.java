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
	private BaseClass[] TurbLCFB1_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
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

		
		
		
		
		
		
		
		
		
		
		
		
	
	public TurbLCFB1() {
		TurbLCFB1_attributes = new BaseClass[TurbLCFB1_primitive_builder.values().length];
	}

	public void updateAttributeInArray(TurbLCFB1_primitive_builder attrEnum, BaseClass value) {
		try {
			TurbLCFB1_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//TurbLCFB1_ATTR_ENUM attrEnum = TurbLCFB1_ATTR_BC_ENUM.valueOf(attrName);
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
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (TurbLCFB1_primitive_builder attrEnum: TurbLCFB1_primitive_builder.values()) {
			BaseClass bc = TurbLCFB1_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
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
