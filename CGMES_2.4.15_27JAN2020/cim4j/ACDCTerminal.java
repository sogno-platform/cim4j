package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Integer;
import cim4j.Boolean;


import cim4j.BusNameMarker;
import cim4j.OperationalLimitSet;
import cim4j.Measurement;

/*
An electrical connection point (AC or DC) to a piece of conducting equipment. Terminals are connected at physical connection points called connectivity nodes.
*/
public class ACDCTerminal extends IdentifiedObject
{
	private BaseClass[] ACDCTerminal_class_attributes;
	private BaseClass[] ACDCTerminal_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ACDCTerminal_primitive_builder implements PrimitiveBuilder {
		sequenceNumber(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
		connected(){
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

	private enum ACDCTerminal_class_attributes_enum {
		BusNameMarker,
		sequenceNumber,
		OperationalLimitSet,
		Measurements,
		connected,
			LAST_ENUM;
	}

		
		
		
		
		
	
	public ACDCTerminal() {
		ACDCTerminal_primitive_attributes = new BaseClass[ACDCTerminal_primitive_builder.values().length];
		ACDCTerminal_class_attributes = new BaseClass[ACDCTerminal_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ACDCTerminal_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ACDCTerminal_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ACDCTerminal_primitive_builder attrEnum, BaseClass value) {
		try {
			ACDCTerminal_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ACDCTerminal_class_attributes_enum attrEnum = ACDCTerminal_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ACDCTerminal, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ACDCTerminal_primitive_builder attrEnum = ACDCTerminal_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ACDCTerminal, setting " + attrName  + " to: "  + value);
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
			for (ACDCTerminal_primitive_builder attrEnum: ACDCTerminal_primitive_builder.values()) {
				BaseClass bc = ACDCTerminal_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ACDCTerminal." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ACDCTerminal_class_attributes_enum attrEnum: ACDCTerminal_class_attributes_enum.values()) {
				BaseClass bc = ACDCTerminal_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ACDCTerminal." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ACDCTerminal) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ACDCTerminal";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ACDCTerminal();
        }
};
