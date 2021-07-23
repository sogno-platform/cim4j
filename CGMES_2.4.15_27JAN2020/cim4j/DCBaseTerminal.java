package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ACDCTerminal;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.DCNode;
import cim4j.DCTopologicalNode;

/*
An electrical connection point at a piece of DC conducting equipment. DC terminals are connected at one physical DC node that may have multiple DC terminals connected. A DC node is similar to an AC connectivity node. The model enforces that DC connections are distinct from AC connections.
*/
public class DCBaseTerminal extends ACDCTerminal
{
	private BaseClass[] DCBaseTerminal_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum DCBaseTerminal_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
	
	public DCBaseTerminal() {
		DCBaseTerminal_attributes = new BaseClass[DCBaseTerminal_primitive_builder.values().length];
	}

	public void updateAttributeInArray(DCBaseTerminal_primitive_builder attrEnum, BaseClass value) {
		try {
			DCBaseTerminal_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//DCBaseTerminal_ATTR_ENUM attrEnum = DCBaseTerminal_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DCBaseTerminal_primitive_builder attrEnum = DCBaseTerminal_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (DCBaseTerminal_primitive_builder attrEnum: DCBaseTerminal_primitive_builder.values()) {
			BaseClass bc = DCBaseTerminal_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "DCBaseTerminal";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DCBaseTerminal();
        }
};
