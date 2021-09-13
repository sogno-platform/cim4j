package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.ExcST6BOELselectorKind;
import cim4j.Seconds;



/*
The class represents IEEE Std 421.5-2005 type ST6B model. This model consists of a PI voltage regulator with an inner loop field voltage regulator and pre-control. The field voltage regulator implements a proportional control. The pre-control and the delay in the feedback circuit increase the dynamic response.  Reference: IEEE Standard 421.5-2005 Section 7.6.
*/
public class ExcIEEEST6B extends ExcitationSystemDynamics
{
	private BaseClass[] ExcIEEEST6B_class_attributes;
	private BaseClass[] ExcIEEEST6B_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcIEEEST6B_primitive_builder implements PrimitiveBuilder {
		ilr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kci(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kff(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kg(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kia(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		klr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		km(){
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
				return new ExcST6BOELselectorKind(value);
			}
		},
		tg(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		vamax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vamin(){
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

	private enum ExcIEEEST6B_class_attributes_enum {
		ilr,
		kci,
		kff,
		kg,
		kia,
		klr,
		km,
		kpa,
		oelin,
		tg,
		vamax,
		vamin,
		vrmax,
		vrmin,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcIEEEST6B() {
		ExcIEEEST6B_primitive_attributes = new BaseClass[ExcIEEEST6B_primitive_builder.values().length];
		ExcIEEEST6B_class_attributes = new BaseClass[ExcIEEEST6B_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcIEEEST6B_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcIEEEST6B_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcIEEEST6B_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEST6B_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcIEEEST6B_class_attributes_enum attrEnum = ExcIEEEST6B_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcIEEEST6B, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEST6B_primitive_builder attrEnum = ExcIEEEST6B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcIEEEST6B, setting " + attrName  + " to: "  + value);
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
			for (ExcIEEEST6B_primitive_builder attrEnum: ExcIEEEST6B_primitive_builder.values()) {
				BaseClass bc = ExcIEEEST6B_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEST6B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcIEEEST6B_class_attributes_enum attrEnum: ExcIEEEST6B_class_attributes_enum.values()) {
				BaseClass bc = ExcIEEEST6B_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEST6B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcIEEEST6B) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcIEEEST6B";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcIEEEST6B();
        }
};
