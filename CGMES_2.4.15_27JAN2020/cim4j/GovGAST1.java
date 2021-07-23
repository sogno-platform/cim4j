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
import cim4j.Simple_Float;
import cim4j.Frequency;



/*
Modified single shaft gas turbine.
*/
public class GovGAST1 extends TurbineGovernorDynamics
{
	private BaseClass[] GovGAST1_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum GovGAST1_primitive_builder implements PrimitiveBuilder {
			mwbase(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
			r(){
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
			t3(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			lmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kt(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			fidle(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			rmax(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			loadinc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tltr(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ltrate(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
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
			ka(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			t4(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t5(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovGAST1() {
		GovGAST1_attributes = new BaseClass[GovGAST1_primitive_builder.values().length];
	}

	public void updateAttributeInArray(GovGAST1_primitive_builder attrEnum, BaseClass value) {
		try {
			GovGAST1_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//GovGAST1_ATTR_ENUM attrEnum = GovGAST1_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovGAST1_primitive_builder attrEnum = GovGAST1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (GovGAST1_primitive_builder attrEnum: GovGAST1_primitive_builder.values()) {
			BaseClass bc = GovGAST1_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "GovGAST1";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovGAST1();
        }
};
