package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Boolean;
import cim4j.ApparentPower;
import cim4j.Seconds;



/*
Slovakian Excitation System Model.  UEL and secondary voltage control are included in this model. When this model is used, there cannot be a separate underexcitation limiter or VAr controller model.
*/
public class ExcSK extends ExcitationSystemDynamics
{
	private BaseClass[] ExcSK_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ExcSK_primitive_builder implements PrimitiveBuilder {
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
			emax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			emin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			k(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			k1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			k2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kce(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kd(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kgob(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kqi(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kqob(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kqp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			nq(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			qconoff(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			qz(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			remote(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			sbase(){
			public BaseClass construct (java.lang.String value) {
				return new ApparentPower(value);
			}
		},
			tc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			te(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ti(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tr(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			uimax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			uimin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			urmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			urmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vtmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vtmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			yp(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcSK() {
		ExcSK_attributes = new BaseClass[ExcSK_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ExcSK_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcSK_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ExcSK_ATTR_ENUM attrEnum = ExcSK_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcSK_primitive_builder attrEnum = ExcSK_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ExcSK_primitive_builder attrEnum: ExcSK_primitive_builder.values()) {
			BaseClass bc = ExcSK_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ExcSK";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcSK();
        }
};
