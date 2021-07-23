package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TurbineGovernorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ActivePower;
import cim4j.PU;
import cim4j.Seconds;
import cim4j.Boolean;
import cim4j.Simple_Float;
import cim4j.Temperature;



/*
Gas turbine model.
*/
public class GovGAST2 extends TurbineGovernorDynamics
{
	private BaseClass[] GovGAST2_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum GovGAST2_primitive_builder implements PrimitiveBuilder {
			mwbase(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			w(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			x(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			y(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			z(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			etd(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tcd(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			trate(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			t(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ecr(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			k3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			a(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			b(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			c(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			tf(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			kf(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			k5(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			k4(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			t3(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t4(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tt(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t5(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			af1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			bf1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			af2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			bf2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			cf2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tr(){
			public BaseClass construct (java.lang.String value) {
				return new Temperature(value);
			}
		},
			k6(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tc(){
			public BaseClass construct (java.lang.String value) {
				return new Temperature(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovGAST2() {
		GovGAST2_attributes = new BaseClass[GovGAST2_primitive_builder.values().length];
	}

	public void updateAttributeInArray(GovGAST2_primitive_builder attrEnum, BaseClass value) {
		try {
			GovGAST2_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//GovGAST2_ATTR_ENUM attrEnum = GovGAST2_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovGAST2_primitive_builder attrEnum = GovGAST2_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (GovGAST2_primitive_builder attrEnum: GovGAST2_primitive_builder.values()) {
			BaseClass bc = GovGAST2_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "GovGAST2";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovGAST2();
        }
};
