package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PowerSystemStabilizerDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.PU;
import cim4j.Seconds;
import cim4j.Boolean;



/*
Italian PSS - three input PSS (speed, frequency, power).
*/
public class Pss1 extends PowerSystemStabilizerDynamics
{
	private BaseClass[] Pss1_class_attributes;
	private BaseClass[] Pss1_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Pss1_primitive_builder implements PrimitiveBuilder {
		kw(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kf(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kpe(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		pmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ks(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		vsmn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vsmx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tpe(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t5(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t6(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t7(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t8(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t9(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t10(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		vadat(){
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

	private enum Pss1_class_attributes_enum {
		kw,
		kf,
		kpe,
		pmin,
		ks,
		vsmn,
		vsmx,
		tpe,
		t5,
		t6,
		t7,
		t8,
		t9,
		t10,
		vadat,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public Pss1() {
		Pss1_primitive_attributes = new BaseClass[Pss1_primitive_builder.values().length];
		Pss1_class_attributes = new BaseClass[Pss1_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Pss1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Pss1_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Pss1_primitive_builder attrEnum, BaseClass value) {
		try {
			Pss1_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Pss1_class_attributes_enum attrEnum = Pss1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Pss1, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Pss1_primitive_builder attrEnum = Pss1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Pss1, setting " + attrName  + " to: "  + value);
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
			for (Pss1_primitive_builder attrEnum: Pss1_primitive_builder.values()) {
				BaseClass bc = Pss1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Pss1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Pss1_class_attributes_enum attrEnum: Pss1_class_attributes_enum.values()) {
				BaseClass bc = Pss1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Pss1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Pss1) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Pss1";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Pss1();
        }
};
