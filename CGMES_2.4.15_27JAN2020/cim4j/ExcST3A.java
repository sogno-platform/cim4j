package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;
import cim4j.AngleDegrees;



/*
Modified IEEE ST3A static excitation system with added speed multiplier.
*/
public class ExcST3A extends ExcitationSystemDynamics
{
	private BaseClass[] ExcST3A_class_attributes;
	private BaseClass[] ExcST3A_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcST3A_primitive_builder implements PrimitiveBuilder {
		vimax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vimin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kj(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
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
		efdmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		km(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tm(){
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
		kg(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		thetap(){
			public BaseClass construct (java.lang.String value) {
				return new AngleDegrees(value);
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
		xl(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vbmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vgmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ks(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ks1(){
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

	private enum ExcST3A_class_attributes_enum {
		vimax,
		vimin,
		kj,
		tb,
		tc,
		efdmax,
		km,
		tm,
		vrmax,
		vrmin,
		kg,
		kp,
		thetap,
		ki,
		kc,
		xl,
		vbmax,
		vgmax,
		ks,
		ks1,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcST3A() {
		ExcST3A_primitive_attributes = new BaseClass[ExcST3A_primitive_builder.values().length];
		ExcST3A_class_attributes = new BaseClass[ExcST3A_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcST3A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcST3A_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcST3A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcST3A_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcST3A_class_attributes_enum attrEnum = ExcST3A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcST3A, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcST3A_primitive_builder attrEnum = ExcST3A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcST3A, setting " + attrName  + " to: "  + value);
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
			for (ExcST3A_primitive_builder attrEnum: ExcST3A_primitive_builder.values()) {
				BaseClass bc = ExcST3A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcST3A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcST3A_class_attributes_enum attrEnum: ExcST3A_class_attributes_enum.values()) {
				BaseClass bc = ExcST3A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcST3A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcST3A) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcST3A";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcST3A();
        }
};
