package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.DCBaseTerminal;
import cim4j.DCEquipmentContainer;
import cim4j.DCTopologicalNode;

/*
DC nodes are points where terminals of DC conducting equipment are connected together with zero impedance.
*/
public class DCNode extends IdentifiedObject
{
	private BaseClass[] DCNode_class_attributes;
	private BaseClass[] DCNode_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum DCNode_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum DCNode_class_attributes_enum {
		DCTerminals,
		DCEquipmentContainer,
		DCTopologicalNode,
			LAST_ENUM;
	}

		
		
		
	
	public DCNode() {
		DCNode_primitive_attributes = new BaseClass[DCNode_primitive_builder.values().length];
		DCNode_class_attributes = new BaseClass[DCNode_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DCNode_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DCNode_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DCNode_primitive_builder attrEnum, BaseClass value) {
		try {
			DCNode_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DCNode_class_attributes_enum attrEnum = DCNode_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DCNode, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DCNode_primitive_builder attrEnum = DCNode_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated DCNode, setting " + attrName  + " to: "  + value);
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
			for (DCNode_primitive_builder attrEnum: DCNode_primitive_builder.values()) {
				BaseClass bc = DCNode_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCNode." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DCNode_class_attributes_enum attrEnum: DCNode_class_attributes_enum.values()) {
				BaseClass bc = DCNode_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCNode." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DCNode) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "DCNode";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DCNode();
        }
};
