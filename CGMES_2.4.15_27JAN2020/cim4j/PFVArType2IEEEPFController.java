package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PFVArControllerType2Dynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Simple_Float;
import cim4j.Boolean;



/*
The class represents IEEE PF Controller Type 2 which is a summing point type controller and makes up the outside loop of a two-loop system. This controller is implemented as a slow PI type controller. The voltage regulator forms the inner loop and is implemented as a fast controller.  Reference: IEEE Standard 421.5-2005 Section 11.4.
*/
public class PFVArType2IEEEPFController extends PFVArControllerType2Dynamics
{
	private BaseClass[] PFVArType2IEEEPFController_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum PFVArType2IEEEPFController_primitive_builder implements PrimitiveBuilder {
			pfref(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vref(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vclmt(){
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
			vs(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			exlon(){
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

		
		
		
		
		
		
		
	
	public PFVArType2IEEEPFController() {
		PFVArType2IEEEPFController_attributes = new BaseClass[PFVArType2IEEEPFController_primitive_builder.values().length];
	}

	public void updateAttributeInArray(PFVArType2IEEEPFController_primitive_builder attrEnum, BaseClass value) {
		try {
			PFVArType2IEEEPFController_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//PFVArType2IEEEPFController_ATTR_ENUM attrEnum = PFVArType2IEEEPFController_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PFVArType2IEEEPFController_primitive_builder attrEnum = PFVArType2IEEEPFController_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (PFVArType2IEEEPFController_primitive_builder attrEnum: PFVArType2IEEEPFController_primitive_builder.values()) {
			BaseClass bc = PFVArType2IEEEPFController_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "PFVArType2IEEEPFController";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PFVArType2IEEEPFController();
        }
};
