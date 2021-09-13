package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;


import cim4j.Terminal;
import cim4j.ConnectivityNodeContainer;
import cim4j.TopologicalNode;

/*
Connectivity nodes are points where terminals of AC conducting equipment are connected together with zero impedance.
*/
public class ConnectivityNode extends IdentifiedObject
{
	private BaseClass[] ConnectivityNode_class_attributes;
	private BaseClass[] ConnectivityNode_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ConnectivityNode_primitive_builder implements PrimitiveBuilder {
		boundaryPoint(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		fromEndIsoCode(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		fromEndName(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		fromEndNameTso(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		toEndIsoCode(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		toEndName(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		toEndNameTso(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ConnectivityNode_class_attributes_enum {
		Terminals,
		ConnectivityNodeContainer,
		TopologicalNode,
		boundaryPoint,
		fromEndIsoCode,
		fromEndName,
		fromEndNameTso,
		toEndIsoCode,
		toEndName,
		toEndNameTso,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
	
	public ConnectivityNode() {
		ConnectivityNode_primitive_attributes = new BaseClass[ConnectivityNode_primitive_builder.values().length];
		ConnectivityNode_class_attributes = new BaseClass[ConnectivityNode_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ConnectivityNode_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ConnectivityNode_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ConnectivityNode_primitive_builder attrEnum, BaseClass value) {
		try {
			ConnectivityNode_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ConnectivityNode_class_attributes_enum attrEnum = ConnectivityNode_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ConnectivityNode, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ConnectivityNode_primitive_builder attrEnum = ConnectivityNode_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ConnectivityNode, setting " + attrName  + " to: "  + value);
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
			for (ConnectivityNode_primitive_builder attrEnum: ConnectivityNode_primitive_builder.values()) {
				BaseClass bc = ConnectivityNode_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ConnectivityNode." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ConnectivityNode_class_attributes_enum attrEnum: ConnectivityNode_class_attributes_enum.values()) {
				BaseClass bc = ConnectivityNode_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ConnectivityNode." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ConnectivityNode) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ConnectivityNode";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ConnectivityNode();
        }
};
