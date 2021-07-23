package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.PU;
import cim4j.Seconds;



/*
Italian excitation system corresponding to IEEE (1968) Type 1 Model. It represents exciter dynamo and electromechanical regulator.
*/
public class ExcAVR1 extends ExcitationSystemDynamics
{
	private BaseClass[] ExcAVR1_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ExcAVR1_primitive_builder implements PrimitiveBuilder {
			ka(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			vrmn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vrmx(){
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
			te(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			e1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			se1(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			e2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			se2(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			kf(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			tf(){
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

		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcAVR1() {
		ExcAVR1_attributes = new BaseClass[ExcAVR1_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ExcAVR1_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcAVR1_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ExcAVR1_ATTR_ENUM attrEnum = ExcAVR1_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcAVR1_primitive_builder attrEnum = ExcAVR1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ExcAVR1_primitive_builder attrEnum: ExcAVR1_primitive_builder.values()) {
			BaseClass bc = ExcAVR1_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ExcAVR1";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcAVR1();
        }
};
