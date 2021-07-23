package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;



/*
Detailed Excitation System Model - ELIN (VATECH).  This model represents an all-static excitation system. A PI voltage controller establishes a desired field current set point for a proportional current controller. The integrator of the PI controller has a follow-up input to match its signal to the present field current.  Power system stabilizer models used in conjunction with this excitation system model: PssELIN2, PssIEEE2B, Pss2B.
*/
public class ExcELIN2 extends ExcitationSystemDynamics
{
	private BaseClass[] ExcELIN2_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ExcELIN2_primitive_builder implements PrimitiveBuilder {
			k1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			k1ec(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kd1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tb1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			pid1max(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ti1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			iefmax2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			k2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ketb(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			upmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			upmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			te(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			xp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			te2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ke2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ve1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			seve1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ve2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			seve2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tr4(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			k3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ti3(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			k4(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ti4(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			iefmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			iefmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			efdbas(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcELIN2() {
		ExcELIN2_attributes = new BaseClass[ExcELIN2_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ExcELIN2_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcELIN2_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ExcELIN2_ATTR_ENUM attrEnum = ExcELIN2_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcELIN2_primitive_builder attrEnum = ExcELIN2_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ExcELIN2_primitive_builder attrEnum: ExcELIN2_primitive_builder.values()) {
			BaseClass bc = ExcELIN2_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ExcELIN2";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcELIN2();
        }
};
