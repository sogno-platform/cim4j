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
Proportional/Integral Regulator Excitation System Model.  This model can be used to represent excitation systems with a proportional-integral (PI) voltage regulator controller.
*/
public class ExcPIC extends ExcitationSystemDynamics
{
	private BaseClass[] ExcPIC_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ExcPIC_primitive_builder implements PrimitiveBuilder {
			ka(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ta1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			vr1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vr2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ta2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ta3(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ta4(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			vrmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vrmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kf(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tf1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tf2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			efdmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			efdmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ke(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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
				return new PU(value);
			}
		},
			e2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			se2(){
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
			kc(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcPIC() {
		ExcPIC_attributes = new BaseClass[ExcPIC_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ExcPIC_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcPIC_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ExcPIC_ATTR_ENUM attrEnum = ExcPIC_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcPIC_primitive_builder attrEnum = ExcPIC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ExcPIC_primitive_builder attrEnum: ExcPIC_primitive_builder.values()) {
			BaseClass bc = ExcPIC_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ExcPIC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcPIC();
        }
};
