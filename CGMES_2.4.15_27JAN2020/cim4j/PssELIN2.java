package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PowerSystemStabilizerDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Seconds;
import cim4j.PU;



/*
Power system stabilizer typically associated with ExcELIN2 (though PssIEEE2B or Pss2B can also be used).
*/
public class PssELIN2 extends PowerSystemStabilizerDynamics
{
	private BaseClass[] PssELIN2_class_attributes;
	private BaseClass[] PssELIN2_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PssELIN2_primitive_builder implements PrimitiveBuilder {
		ts1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		ts2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		ts3(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		ts4(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		ts5(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		ts6(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		ks1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ks2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ppss(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		apss(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		psslim(){
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

	private enum PssELIN2_class_attributes_enum {
		ts1,
		ts2,
		ts3,
		ts4,
		ts5,
		ts6,
		ks1,
		ks2,
		ppss,
		apss,
		psslim,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
	
	public PssELIN2() {
		PssELIN2_primitive_attributes = new BaseClass[PssELIN2_primitive_builder.values().length];
		PssELIN2_class_attributes = new BaseClass[PssELIN2_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PssELIN2_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PssELIN2_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PssELIN2_primitive_builder attrEnum, BaseClass value) {
		try {
			PssELIN2_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PssELIN2_class_attributes_enum attrEnum = PssELIN2_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PssELIN2, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PssELIN2_primitive_builder attrEnum = PssELIN2_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PssELIN2, setting " + attrName  + " to: "  + value);
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
			for (PssELIN2_primitive_builder attrEnum: PssELIN2_primitive_builder.values()) {
				BaseClass bc = PssELIN2_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssELIN2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PssELIN2_class_attributes_enum attrEnum: PssELIN2_class_attributes_enum.values()) {
				BaseClass bc = PssELIN2_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssELIN2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PssELIN2) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PssELIN2";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PssELIN2();
        }
};
