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
	private BaseClass[] DiscExcContIEEEDEC1A_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public DiscExcContIEEEDEC1A() {
		DiscExcContIEEEDEC1A_attributes = new BaseClass[DiscExcContIEEEDEC1A_primitive_builder.values().length];
	}

	public void updateAttributeInArray(DiscExcContIEEEDEC1A_primitive_builder attrEnum, BaseClass value) {
		try {
			DiscExcContIEEEDEC1A_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//DiscExcContIEEEDEC1A_ATTR_ENUM attrEnum = DiscExcContIEEEDEC1A_ATTR_BC_ENUM.valueOf(attrName);
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
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (DiscExcContIEEEDEC1A_primitive_builder attrEnum: DiscExcContIEEEDEC1A_primitive_builder.values()) {
			BaseClass bc = DiscExcContIEEEDEC1A_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
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
