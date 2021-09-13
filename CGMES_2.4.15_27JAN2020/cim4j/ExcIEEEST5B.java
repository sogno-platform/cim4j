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
The class represents IEEE Std 421.5-2005 type ST5B model. The Type ST5B excitation system is a variation of the Type ST1A model, with alternative overexcitation and underexcitation inputs and additional limits.  Reference: IEEE Standard 421.5-2005 Section 7.5.   Note: the block diagram in the IEEE 421.5 standard has input signal Vc and does not indicate the summation point with Vref. The implementation of the ExcIEEEST5B shall consider summation point with Vref.
*/
public class ExcIEEEST5B extends ExcitationSystemDynamics
{
	private BaseClass[] ExcIEEEST5B_class_attributes;
	private BaseClass[] ExcIEEEST5B_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcIEEEST5B_primitive_builder implements PrimitiveBuilder {
		kr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		t1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		kc(){
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
		tc1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tb1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tc2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tb2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		toc1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tob1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		toc2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tob2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tuc1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tub1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tuc2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tub2(){
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

	private enum ExcIEEEST5B_class_attributes_enum {
		kr,
		t1,
		kc,
		vrmax,
		vrmin,
		tc1,
		tb1,
		tc2,
		tb2,
		toc1,
		tob1,
		toc2,
		tob2,
		tuc1,
		tub1,
		tuc2,
		tub2,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcIEEEST5B() {
		ExcIEEEST5B_primitive_attributes = new BaseClass[ExcIEEEST5B_primitive_builder.values().length];
		ExcIEEEST5B_class_attributes = new BaseClass[ExcIEEEST5B_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcIEEEST5B_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcIEEEST5B_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcIEEEST5B_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEST5B_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcIEEEST5B_class_attributes_enum attrEnum = ExcIEEEST5B_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcIEEEST5B, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEST5B_primitive_builder attrEnum = ExcIEEEST5B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcIEEEST5B, setting " + attrName  + " to: "  + value);
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
			for (ExcIEEEST5B_primitive_builder attrEnum: ExcIEEEST5B_primitive_builder.values()) {
				BaseClass bc = ExcIEEEST5B_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEST5B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcIEEEST5B_class_attributes_enum attrEnum: ExcIEEEST5B_class_attributes_enum.values()) {
				BaseClass bc = ExcIEEEST5B_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEST5B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcIEEEST5B) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcIEEEST5B";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcIEEEST5B();
        }
};
