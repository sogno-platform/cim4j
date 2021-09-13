package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PowerSystemResource;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.ConnectivityNode;
import cim4j.TopologicalNode;

/*
A base class for all objects that may contain connectivity nodes or topological nodes.
*/
public class ConnectivityNodeContainer extends PowerSystemResource
{
	private BaseClass[] ConnectivityNodeContainer_class_attributes;
	private BaseClass[] ConnectivityNodeContainer_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ConnectivityNodeContainer_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ConnectivityNodeContainer_class_attributes_enum {
		ConnectivityNodes,
		TopologicalNode,
			LAST_ENUM;
	}

		
		
	
	public ConnectivityNodeContainer() {
		ConnectivityNodeContainer_primitive_attributes = new BaseClass[ConnectivityNodeContainer_primitive_builder.values().length];
		ConnectivityNodeContainer_class_attributes = new BaseClass[ConnectivityNodeContainer_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ConnectivityNodeContainer_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ConnectivityNodeContainer_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ConnectivityNodeContainer_primitive_builder attrEnum, BaseClass value) {
		try {
			ConnectivityNodeContainer_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ConnectivityNodeContainer_class_attributes_enum attrEnum = ConnectivityNodeContainer_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ConnectivityNodeContainer, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ConnectivityNodeContainer_primitive_builder attrEnum = ConnectivityNodeContainer_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ConnectivityNodeContainer, setting " + attrName  + " to: "  + value);
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
			for (ConnectivityNodeContainer_primitive_builder attrEnum: ConnectivityNodeContainer_primitive_builder.values()) {
				BaseClass bc = ConnectivityNodeContainer_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ConnectivityNodeContainer." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ConnectivityNodeContainer_class_attributes_enum attrEnum: ConnectivityNodeContainer_class_attributes_enum.values()) {
				BaseClass bc = ConnectivityNodeContainer_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ConnectivityNodeContainer." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ConnectivityNodeContainer) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ConnectivityNodeContainer";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ConnectivityNodeContainer();
        }
};
