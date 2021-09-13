package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.ExcREXSFeedbackSignalKind;
import cim4j.Seconds;



/*
General Purpose Rotating Excitation System Model.  This model can be used to represent a wide range of excitation systems whose DC power source is an AC or DC generator. It encompasses IEEE type AC1, AC2, DC1, and DC2 excitation system models.
*/
public class ExcREXS extends ExcitationSystemDynamics
{
	private BaseClass[] ExcREXS_class_attributes;
	private BaseClass[] ExcREXS_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcREXS_primitive_builder implements PrimitiveBuilder {
		e1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		e2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		fbf(){
			public BaseClass construct (java.lang.String value) {
				return new ExcREXSFeedbackSignalKind(value);
			}
		},
		flimf(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kd(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ke(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kefd(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kf(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		kh(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kii(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kip(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ks(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kvi(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kvp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kvphz(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		nvphz(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		se1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		se2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ta(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tb1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tb2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tc1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tc2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		te(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tf(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
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
		tp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		vcmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vfmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vfmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vimax(){
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
		xc(){
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

	private enum ExcREXS_class_attributes_enum {
		e1,
		e2,
		fbf,
		flimf,
		kc,
		kd,
		ke,
		kefd,
		kf,
		kh,
		kii,
		kip,
		ks,
		kvi,
		kvp,
		kvphz,
		nvphz,
		se1,
		se2,
		ta,
		tb1,
		tb2,
		tc1,
		tc2,
		te,
		tf,
		tf1,
		tf2,
		tp,
		vcmax,
		vfmax,
		vfmin,
		vimax,
		vrmax,
		vrmin,
		xc,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcREXS() {
		ExcREXS_primitive_attributes = new BaseClass[ExcREXS_primitive_builder.values().length];
		ExcREXS_class_attributes = new BaseClass[ExcREXS_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcREXS_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcREXS_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcREXS_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcREXS_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcREXS_class_attributes_enum attrEnum = ExcREXS_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcREXS, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcREXS_primitive_builder attrEnum = ExcREXS_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcREXS, setting " + attrName  + " to: "  + value);
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
			for (ExcREXS_primitive_builder attrEnum: ExcREXS_primitive_builder.values()) {
				BaseClass bc = ExcREXS_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcREXS." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcREXS_class_attributes_enum attrEnum: ExcREXS_class_attributes_enum.values()) {
				BaseClass bc = ExcREXS_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcREXS." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcREXS) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcREXS";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcREXS();
        }
};
