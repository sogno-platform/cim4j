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
The class represents IEEE Type DEC2A model for the discontinuous excitation control. This system provides transient excitation boosting via an open-loop control as initiated by a trigger signal generated remotely.  Reference: IEEE Standard 421.5-2005 Section 12.3.
*/
public class DiscExcContIEEEDEC2A extends DiscontinuousExcitationControlDynamics
{
	private BaseClass[] DiscExcContIEEEDEC2A_class_attributes;
	private BaseClass[] DiscExcContIEEEDEC2A_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum DiscExcContIEEEDEC2A_primitive_builder implements PrimitiveBuilder {
		vk(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		td1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		td2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		vdmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vdmax(){
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

	private enum DiscExcContIEEEDEC2A_class_attributes_enum {
		vk,
		td1,
		td2,
		vdmin,
		vdmax,
			LAST_ENUM;
	}

		
		
		
		
		
	
	public DiscExcContIEEEDEC2A() {
		DiscExcContIEEEDEC2A_primitive_attributes = new BaseClass[DiscExcContIEEEDEC2A_primitive_builder.values().length];
		DiscExcContIEEEDEC2A_class_attributes = new BaseClass[DiscExcContIEEEDEC2A_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DiscExcContIEEEDEC2A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DiscExcContIEEEDEC2A_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DiscExcContIEEEDEC2A_primitive_builder attrEnum, BaseClass value) {
		try {
			DiscExcContIEEEDEC2A_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DiscExcContIEEEDEC2A_class_attributes_enum attrEnum = DiscExcContIEEEDEC2A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DiscExcContIEEEDEC2A, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DiscExcContIEEEDEC2A_primitive_builder attrEnum = DiscExcContIEEEDEC2A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated DiscExcContIEEEDEC2A, setting " + attrName  + " to: "  + value);
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
			for (DiscExcContIEEEDEC2A_primitive_builder attrEnum: DiscExcContIEEEDEC2A_primitive_builder.values()) {
				BaseClass bc = DiscExcContIEEEDEC2A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiscExcContIEEEDEC2A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DiscExcContIEEEDEC2A_class_attributes_enum attrEnum: DiscExcContIEEEDEC2A_class_attributes_enum.values()) {
				BaseClass bc = DiscExcContIEEEDEC2A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiscExcContIEEEDEC2A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DiscExcContIEEEDEC2A) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "DiscExcContIEEEDEC2A";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DiscExcContIEEEDEC2A();
        }
};
