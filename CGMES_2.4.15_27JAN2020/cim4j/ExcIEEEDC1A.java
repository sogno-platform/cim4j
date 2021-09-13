package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;
import cim4j.Simple_Float;
import cim4j.Boolean;



/*
The class represents IEEE Std 421.5-2005 type DC1A model. This model represents field-controlled dc commutator exciters with continuously acting voltage regulators (especially the direct-acting rheostatic, rotating amplifier, and magnetic amplifier types).  Because this model has been widely implemented by the industry, it is sometimes used to represent other types of systems when detailed data for them are not available or when a simplified model is required.   Reference: IEEE Standard 421.5-2005 Section 5.1.
*/
public class ExcIEEEDC1A extends ExcitationSystemDynamics
{
	private BaseClass[] ExcIEEEDC1A_class_attributes;
	private BaseClass[] ExcIEEEDC1A_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcIEEEDC1A_primitive_builder implements PrimitiveBuilder {
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
		efd1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		seefd1(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		efd2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		seefd2(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		uelin(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		exclim(){
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

	private enum ExcIEEEDC1A_class_attributes_enum {
		ka,
		ta,
		tb,
		tc,
		vrmax,
		vrmin,
		ke,
		te,
		kf,
		tf,
		efd1,
		seefd1,
		efd2,
		seefd2,
		uelin,
		exclim,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcIEEEDC1A() {
		ExcIEEEDC1A_primitive_attributes = new BaseClass[ExcIEEEDC1A_primitive_builder.values().length];
		ExcIEEEDC1A_class_attributes = new BaseClass[ExcIEEEDC1A_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcIEEEDC1A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcIEEEDC1A_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcIEEEDC1A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEDC1A_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcIEEEDC1A_class_attributes_enum attrEnum = ExcIEEEDC1A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcIEEEDC1A, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEDC1A_primitive_builder attrEnum = ExcIEEEDC1A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcIEEEDC1A, setting " + attrName  + " to: "  + value);
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
			for (ExcIEEEDC1A_primitive_builder attrEnum: ExcIEEEDC1A_primitive_builder.values()) {
				BaseClass bc = ExcIEEEDC1A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEDC1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcIEEEDC1A_class_attributes_enum attrEnum: ExcIEEEDC1A_class_attributes_enum.values()) {
				BaseClass bc = ExcIEEEDC1A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEDC1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcIEEEDC1A) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcIEEEDC1A";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcIEEEDC1A();
        }
};
