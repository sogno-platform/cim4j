package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DiscontinuousExcitationControlDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;



/*
The class represents IEEE Type DEC1A discontinuous excitation control model that boosts generator excitation to a level higher than that demanded by the voltage regulator and stabilizer immediately following a system fault.  Reference: IEEE Standard 421.5-2005 Section 12.2.
*/
public class DiscExcContIEEEDEC1A extends DiscontinuousExcitationControlDynamics
{
	private BaseClass[] DiscExcContIEEEDEC1A_class_attributes;
	private BaseClass[] DiscExcContIEEEDEC1A_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum DiscExcContIEEEDEC1A_primitive_builder implements PrimitiveBuilder {
		vtlmt(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vomax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vomin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ketl(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vtc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		val(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		esc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kan(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tan(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tw5(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		vsmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vsmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		td(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tl1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tl2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		vtm(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vtn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vanmax(){
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

	private enum DiscExcContIEEEDEC1A_class_attributes_enum {
		vtlmt,
		vomax,
		vomin,
		ketl,
		vtc,
		val,
		esc,
		kan,
		tan,
		tw5,
		vsmax,
		vsmin,
		td,
		tl1,
		tl2,
		vtm,
		vtn,
		vanmax,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public DiscExcContIEEEDEC1A() {
		DiscExcContIEEEDEC1A_primitive_attributes = new BaseClass[DiscExcContIEEEDEC1A_primitive_builder.values().length];
		DiscExcContIEEEDEC1A_class_attributes = new BaseClass[DiscExcContIEEEDEC1A_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DiscExcContIEEEDEC1A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DiscExcContIEEEDEC1A_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DiscExcContIEEEDEC1A_primitive_builder attrEnum, BaseClass value) {
		try {
			DiscExcContIEEEDEC1A_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DiscExcContIEEEDEC1A_class_attributes_enum attrEnum = DiscExcContIEEEDEC1A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DiscExcContIEEEDEC1A, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DiscExcContIEEEDEC1A_primitive_builder attrEnum = DiscExcContIEEEDEC1A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated DiscExcContIEEEDEC1A, setting " + attrName  + " to: "  + value);
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
			for (DiscExcContIEEEDEC1A_primitive_builder attrEnum: DiscExcContIEEEDEC1A_primitive_builder.values()) {
				BaseClass bc = DiscExcContIEEEDEC1A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiscExcContIEEEDEC1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DiscExcContIEEEDEC1A_class_attributes_enum attrEnum: DiscExcContIEEEDEC1A_class_attributes_enum.values()) {
				BaseClass bc = DiscExcContIEEEDEC1A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiscExcContIEEEDEC1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DiscExcContIEEEDEC1A) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "DiscExcContIEEEDEC1A";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DiscExcContIEEEDEC1A();
        }
};
