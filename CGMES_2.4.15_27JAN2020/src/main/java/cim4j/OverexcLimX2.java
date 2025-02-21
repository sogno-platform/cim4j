package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.OverexcitationLimiterDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;
import cim4j.PU;
import cim4j.Seconds;



/*
Field Voltage or Current overexcitation limiter designed to protect the generator field of an AC machine with automatic excitation control from overheating due to prolonged overexcitation.
*/
public class OverexcLimX2 extends OverexcitationLimiterDynamics
{
	private BaseClass[] OverexcLimX2_class_attributes;
	private BaseClass[] OverexcLimX2_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum OverexcLimX2_primitive_builder implements PrimitiveBuilder {
		m(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		efdrated(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		efd1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		t1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		efd2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		t2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		efd3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		t3(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		efddes(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kmx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vlow(){
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

	private enum OverexcLimX2_class_attributes_enum {
		m,
		efdrated,
		efd1,
		t1,
		efd2,
		t2,
		efd3,
		t3,
		efddes,
		kmx,
		vlow,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
	
	public OverexcLimX2() {
		OverexcLimX2_primitive_attributes = new BaseClass[OverexcLimX2_primitive_builder.values().length];
		OverexcLimX2_class_attributes = new BaseClass[OverexcLimX2_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(OverexcLimX2_class_attributes_enum attrEnum, BaseClass value) {
		try {
			OverexcLimX2_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(OverexcLimX2_primitive_builder attrEnum, BaseClass value) {
		try {
			OverexcLimX2_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			OverexcLimX2_class_attributes_enum attrEnum = OverexcLimX2_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated OverexcLimX2, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			OverexcLimX2_primitive_builder attrEnum = OverexcLimX2_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated OverexcLimX2, setting " + attrName  + " to: "  + value);
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
			for (OverexcLimX2_primitive_builder attrEnum: OverexcLimX2_primitive_builder.values()) {
				BaseClass bc = OverexcLimX2_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    OverexcLimX2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (OverexcLimX2_class_attributes_enum attrEnum: OverexcLimX2_class_attributes_enum.values()) {
				BaseClass bc = OverexcLimX2_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    OverexcLimX2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(OverexcLimX2) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "OverexcLimX2";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new OverexcLimX2();
        }
};
