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
	private BaseClass[] DCBaseTerminal_class_attributes;
	private BaseClass[] DCBaseTerminal_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum DCBaseTerminal_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum DCBaseTerminal_class_attributes_enum {
		DCNode,
		DCTopologicalNode,
			LAST_ENUM;
	}

		
		
	
	public DCBaseTerminal() {
		DCBaseTerminal_primitive_attributes = new BaseClass[DCBaseTerminal_primitive_builder.values().length];
		DCBaseTerminal_class_attributes = new BaseClass[DCBaseTerminal_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DCBaseTerminal_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DCBaseTerminal_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DCBaseTerminal_primitive_builder attrEnum, BaseClass value) {
		try {
			DCBaseTerminal_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DCBaseTerminal_class_attributes_enum attrEnum = DCBaseTerminal_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DCBaseTerminal, setting " + attrName);
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
			System.out.println("Updated DCBaseTerminal, setting " + attrName  + " to: "  + value);
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
			for (DCBaseTerminal_primitive_builder attrEnum: DCBaseTerminal_primitive_builder.values()) {
				BaseClass bc = DCBaseTerminal_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCBaseTerminal." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DCBaseTerminal_class_attributes_enum attrEnum: DCBaseTerminal_class_attributes_enum.values()) {
				BaseClass bc = DCBaseTerminal_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCBaseTerminal." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DCBaseTerminal) RDFID: " + rdfid;
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
