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
	private BaseClass[] ACDCTerminal_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
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

		
		
		
		
		
	
	public ACDCTerminal() {
		ACDCTerminal_attributes = new BaseClass[ACDCTerminal_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ACDCTerminal_primitive_builder attrEnum, BaseClass value) {
		try {
			ACDCTerminal_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ACDCTerminal_ATTR_ENUM attrEnum = ACDCTerminal_ATTR_BC_ENUM.valueOf(attrName);
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
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ACDCTerminal_primitive_builder attrEnum: ACDCTerminal_primitive_builder.values()) {
			BaseClass bc = ACDCTerminal_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
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
