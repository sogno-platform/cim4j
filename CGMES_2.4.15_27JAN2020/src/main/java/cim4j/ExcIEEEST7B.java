package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.ExcST7BOELselectorKind;
import cim4j.Seconds;
import cim4j.ExcST7BUELselectorKind;



/*
The class represents IEEE Std 421.5-2005 type ST7B model. This model is representative of static potential-source excitation systems. In this system, the AVR consists of a PI voltage regulator. A phase lead-lag filter in series allows introduction of a derivative function, typically used with brushless excitation systems. In that case, the regulator is of the PID type. In addition, the terminal voltage channel includes a phase lead-lag filter.  The AVR includes the appropriate inputs on its reference for overexcitation limiter (OEL1), underexcitation limiter (UEL), stator current limiter (SCL), and current compensator (DROOP). All these limitations, when they work at voltage reference level, keep the PSS (VS signal from Type PSS1A, PSS2A, or PSS2B) in operation. However, the UEL limitation can also be transferred to the high value (HV) gate acting on the output signal. In addition, the output signal passes through a low value (LV) gate for a ceiling overexcitation limiter (OEL2).  Reference: IEEE Standard 421.5-2005 Section 7.7.
*/
public class ExcIEEEST7B extends ExcitationSystemDynamics
{
	private BaseClass[] ExcIEEEST7B_class_attributes;
	private BaseClass[] ExcIEEEST7B_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcIEEEST7B_primitive_builder implements PrimitiveBuilder {
		kh(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kia(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kl(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kpa(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		oelin(){
			public BaseClass construct (java.lang.String value) {
				return new ExcST7BOELselectorKind(value);
			}
		},
		tb(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tf(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tg(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tia(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		uelin(){
			public BaseClass construct (java.lang.String value) {
				return new ExcST7BUELselectorKind(value);
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
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ExcIEEEST7B_class_attributes_enum {
		kh,
		kia,
		kl,
		kpa,
		oelin,
		tb,
		tc,
		tf,
		tg,
		tia,
		uelin,
		vmax,
		vmin,
		vrmax,
		vrmin,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcIEEEST7B() {
		ExcIEEEST7B_primitive_attributes = new BaseClass[ExcIEEEST7B_primitive_builder.values().length];
		ExcIEEEST7B_class_attributes = new BaseClass[ExcIEEEST7B_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcIEEEST7B_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcIEEEST7B_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcIEEEST7B_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEST7B_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcIEEEST7B_class_attributes_enum attrEnum = ExcIEEEST7B_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcIEEEST7B, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEST7B_primitive_builder attrEnum = ExcIEEEST7B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcIEEEST7B, setting " + attrName  + " to: "  + value);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString(boolean topClass) {
		java.lang.String result = "";
		java.lang.String indent = "";
		if (topClass) {
			for (ExcIEEEST7B_primitive_builder attrEnum: ExcIEEEST7B_primitive_builder.values()) {
				BaseClass bc = ExcIEEEST7B_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEST7B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcIEEEST7B_class_attributes_enum attrEnum: ExcIEEEST7B_class_attributes_enum.values()) {
				BaseClass bc = ExcIEEEST7B_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEST7B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcIEEEST7B) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcIEEEST7B";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcIEEEST7B();
        }
};
