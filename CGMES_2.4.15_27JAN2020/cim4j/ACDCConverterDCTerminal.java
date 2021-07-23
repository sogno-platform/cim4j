package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DCBaseTerminal;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.DCPolarityKind;


import cim4j.ACDCConverter;

/*
A DC electrical connection point at the AC/DC converter. The AC/DC converter is electrically connected also to the AC side. The AC connection is inherited from the AC conducting equipment in the same way as any other AC equipment. The AC/DC converter DC terminal is separate from generic DC terminal to restrict the connection with the AC side to AC/DC converter and so that no other DC conducting equipment can be connected to the AC side.
*/
public class ACDCConverterDCTerminal extends DCBaseTerminal
{
	private BaseClass[] ACDCConverterDCTerminal_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ACDCConverterDCTerminal_primitive_builder implements PrimitiveBuilder {
			polarity(){
			public BaseClass construct (java.lang.String value) {
				return new DCPolarityKind(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
	
	public ACDCConverterDCTerminal() {
		ACDCConverterDCTerminal_attributes = new BaseClass[ACDCConverterDCTerminal_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ACDCConverterDCTerminal_primitive_builder attrEnum, BaseClass value) {
		try {
			ACDCConverterDCTerminal_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ACDCConverterDCTerminal_ATTR_ENUM attrEnum = ACDCConverterDCTerminal_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ACDCConverterDCTerminal_primitive_builder attrEnum = ACDCConverterDCTerminal_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ACDCConverterDCTerminal_primitive_builder attrEnum: ACDCConverterDCTerminal_primitive_builder.values()) {
			BaseClass bc = ACDCConverterDCTerminal_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ACDCConverterDCTerminal";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ACDCConverterDCTerminal();
        }
};
