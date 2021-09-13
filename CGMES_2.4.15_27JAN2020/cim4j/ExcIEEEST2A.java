package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;
import cim4j.Boolean;



/*
The class represents IEEE Std 421.5-2005 type ST2A model. Some static systems utilize both current and voltage sources (generator terminal quantities) to comprise the power source.  The regulator controls the exciter output through controlled saturation of the power transformer components.  These compound-source rectifier excitation systems are designated Type ST2A and are represented by ExcIEEEST2A.  Reference: IEEE Standard 421.5-2005 Section 7.2.
*/
public class ExcIEEEST2A extends ExcitationSystemDynamics
{
	private BaseClass[] ExcIEEEST2A_class_attributes;
	private BaseClass[] ExcIEEEST2A_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcIEEEST2A_primitive_builder implements PrimitiveBuilder {
		ka(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ta(){
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
		kf(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tf(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
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
		efdmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		uelin(){
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

	private enum ExcIEEEST2A_class_attributes_enum {
		ka,
		ta,
		vrmax,
		vrmin,
		ke,
		te,
		kf,
		tf,
		kp,
		ki,
		kc,
		efdmax,
		uelin,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcIEEEST2A() {
		ExcIEEEST2A_primitive_attributes = new BaseClass[ExcIEEEST2A_primitive_builder.values().length];
		ExcIEEEST2A_class_attributes = new BaseClass[ExcIEEEST2A_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcIEEEST2A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcIEEEST2A_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcIEEEST2A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEST2A_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcIEEEST2A_class_attributes_enum attrEnum = ExcIEEEST2A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcIEEEST2A, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEST2A_primitive_builder attrEnum = ExcIEEEST2A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcIEEEST2A, setting " + attrName  + " to: "  + value);
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
			for (ExcIEEEST2A_primitive_builder attrEnum: ExcIEEEST2A_primitive_builder.values()) {
				BaseClass bc = ExcIEEEST2A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEST2A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcIEEEST2A_class_attributes_enum attrEnum: ExcIEEEST2A_class_attributes_enum.values()) {
				BaseClass bc = ExcIEEEST2A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEST2A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcIEEEST2A) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcIEEEST2A";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcIEEEST2A();
        }
};
