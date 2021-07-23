package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Seconds;
import cim4j.PU;



/*
Static PI transformer fed excitation system: ELIN (VATECH) - simplified model.  This model represents an all-static excitation system. A PI voltage controller establishes a desired field current set point for a proportional current controller. The integrator of the PI controller has a follow-up input to match its signal to the present field current.  A power system stabilizer with power input is included in the model.
*/
public class ExcELIN1 extends ExcitationSystemDynamics
{
	private BaseClass[] ExcELIN1_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ExcELIN1_primitive_builder implements PrimitiveBuilder {
			tfi(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tnu(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			vpu(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vpi(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vpnf(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			dpnf(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tsw(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			efmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			efmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			xe(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ks1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ks2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ts1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ts2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			smax(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcELIN1() {
		ExcELIN1_attributes = new BaseClass[ExcELIN1_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ExcELIN1_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcELIN1_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ExcELIN1_ATTR_ENUM attrEnum = ExcELIN1_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcELIN1_primitive_builder attrEnum = ExcELIN1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ExcELIN1_primitive_builder attrEnum: ExcELIN1_primitive_builder.values()) {
			BaseClass bc = ExcELIN1_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ExcELIN1";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcELIN1();
        }
};
