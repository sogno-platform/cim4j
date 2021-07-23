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
	private BaseClass[] ConnectivityNode_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
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

		
		
		
		
		
		
		
		
		
		
	
	public ConnectivityNode() {
		ConnectivityNode_attributes = new BaseClass[ConnectivityNode_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ConnectivityNode_primitive_builder attrEnum, BaseClass value) {
		try {
			ConnectivityNode_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ConnectivityNode_ATTR_ENUM attrEnum = ConnectivityNode_ATTR_BC_ENUM.valueOf(attrName);
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
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ConnectivityNode_primitive_builder attrEnum: ConnectivityNode_primitive_builder.values()) {
			BaseClass bc = ConnectivityNode_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
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
