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
The class represents IEEE Type DEC3A model. In some systems, the stabilizer output is disconnected from the regulator immediately following a severe fault to prevent the stabilizer from competing with action of voltage regulator during the first swing.  Reference: IEEE Standard 421.5-2005 Section 12.4.
*/
public class DiscExcContIEEEDEC3A extends DiscontinuousExcitationControlDynamics
{
	private BaseClass[] DiscExcContIEEEDEC3A_class_attributes;
	private BaseClass[] DiscExcContIEEEDEC3A_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum DiscExcContIEEEDEC3A_primitive_builder implements PrimitiveBuilder {
		vtmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tdr(){
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

	private enum DiscExcContIEEEDEC3A_class_attributes_enum {
		vtmin,
		tdr,
			LAST_ENUM;
	}

		
		
	
	public DiscExcContIEEEDEC3A() {
		DiscExcContIEEEDEC3A_primitive_attributes = new BaseClass[DiscExcContIEEEDEC3A_primitive_builder.values().length];
		DiscExcContIEEEDEC3A_class_attributes = new BaseClass[DiscExcContIEEEDEC3A_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DiscExcContIEEEDEC3A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DiscExcContIEEEDEC3A_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DiscExcContIEEEDEC3A_primitive_builder attrEnum, BaseClass value) {
		try {
			DiscExcContIEEEDEC3A_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DiscExcContIEEEDEC3A_class_attributes_enum attrEnum = DiscExcContIEEEDEC3A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DiscExcContIEEEDEC3A, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DiscExcContIEEEDEC3A_primitive_builder attrEnum = DiscExcContIEEEDEC3A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated DiscExcContIEEEDEC3A, setting " + attrName  + " to: "  + value);
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
			for (DiscExcContIEEEDEC3A_primitive_builder attrEnum: DiscExcContIEEEDEC3A_primitive_builder.values()) {
				BaseClass bc = DiscExcContIEEEDEC3A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiscExcContIEEEDEC3A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DiscExcContIEEEDEC3A_class_attributes_enum attrEnum: DiscExcContIEEEDEC3A_class_attributes_enum.values()) {
				BaseClass bc = DiscExcContIEEEDEC3A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiscExcContIEEEDEC3A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DiscExcContIEEEDEC3A) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "DiscExcContIEEEDEC3A";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DiscExcContIEEEDEC3A();
        }
};
