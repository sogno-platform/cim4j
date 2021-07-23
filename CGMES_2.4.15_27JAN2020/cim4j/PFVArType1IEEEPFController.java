package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PFVArControllerType1Dynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;
import cim4j.Seconds;
import cim4j.PU;
import cim4j.Simple_Float;



/*
The class represents IEEE PF Controller Type 1 which operates by moving the voltage reference directly.  Reference: IEEE Standard 421.5-2005 Section 11.2.
*/
public class PFVArType1IEEEPFController extends PFVArControllerType1Dynamics
{
	private BaseClass[] PFVArType1IEEEPFController_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum PFVArType1IEEEPFController_primitive_builder implements PrimitiveBuilder {
			ovex(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			tpfc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			vitmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vpf(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vpfcbw(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			vpfref(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vvtmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vvtmin(){
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

		
		
		
		
		
		
		
		
	
	public PFVArType1IEEEPFController() {
		PFVArType1IEEEPFController_attributes = new BaseClass[PFVArType1IEEEPFController_primitive_builder.values().length];
	}

	public void updateAttributeInArray(PFVArType1IEEEPFController_primitive_builder attrEnum, BaseClass value) {
		try {
			PFVArType1IEEEPFController_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//PFVArType1IEEEPFController_ATTR_ENUM attrEnum = PFVArType1IEEEPFController_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PFVArType1IEEEPFController_primitive_builder attrEnum = PFVArType1IEEEPFController_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (PFVArType1IEEEPFController_primitive_builder attrEnum: PFVArType1IEEEPFController_primitive_builder.values()) {
			BaseClass bc = PFVArType1IEEEPFController_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "PFVArType1IEEEPFController";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PFVArType1IEEEPFController();
        }
};
