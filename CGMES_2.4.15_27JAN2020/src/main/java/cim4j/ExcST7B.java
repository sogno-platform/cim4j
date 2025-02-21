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
Modified IEEE ST7B static excitation system without stator current limiter (SCL) and current compensator (DROOP) inputs.
*/
public class ExcST7B extends ExcitationSystemDynamics
{
	private BaseClass[] ExcST7B_class_attributes;
	private BaseClass[] ExcST7B_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcST7B_primitive_builder implements PrimitiveBuilder {
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
		ts(){
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

	private enum ExcST7B_class_attributes_enum {
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
		ts,
		uelin,
		vmax,
		vmin,
		vrmax,
		vrmin,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcST7B() {
		ExcST7B_primitive_attributes = new BaseClass[ExcST7B_primitive_builder.values().length];
		ExcST7B_class_attributes = new BaseClass[ExcST7B_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcST7B_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcST7B_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcST7B_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcST7B_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcST7B_class_attributes_enum attrEnum = ExcST7B_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcST7B, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcST7B_primitive_builder attrEnum = ExcST7B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcST7B, setting " + attrName  + " to: "  + value);
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
			for (ExcST7B_primitive_builder attrEnum: ExcST7B_primitive_builder.values()) {
				BaseClass bc = ExcST7B_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcST7B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcST7B_class_attributes_enum attrEnum: ExcST7B_class_attributes_enum.values()) {
				BaseClass bc = ExcST7B_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcST7B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcST7B) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcST7B";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcST7B();
        }
};
