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
import cim4j.Boolean;



/*
Italian excitation system. It represents static exciter and electric voltage regulator.
*/
public class ExcAVR4 extends ExcitationSystemDynamics
{
	private BaseClass[] ExcAVR4_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ExcAVR4_primitive_builder implements PrimitiveBuilder {
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
			t4(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ke(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			vfmx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vfmn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kif(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			tif(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			t1if(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			imul(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcAVR4() {
		ExcAVR4_attributes = new BaseClass[ExcAVR4_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ExcAVR4_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcAVR4_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ExcAVR4_ATTR_ENUM attrEnum = ExcAVR4_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcAVR4_primitive_builder attrEnum = ExcAVR4_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ExcAVR4_primitive_builder attrEnum: ExcAVR4_primitive_builder.values()) {
			BaseClass bc = ExcAVR4_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ExcAVR4";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcAVR4();
        }
};
