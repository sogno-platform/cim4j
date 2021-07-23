package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;


import cim4j.SvInjection;
import cim4j.SvVoltage;
import cim4j.TopologicalIsland;
import cim4j.BaseVoltage;
import cim4j.ConnectivityNode;
import cim4j.ConnectivityNodeContainer;
import cim4j.ReportingGroup;
import cim4j.Terminal;

/*
For a detailed substation model a topological node is a set of connectivity nodes that, in the current network state, are connected together through any type of closed switches, including  jumpers. Topological nodes change as the current network state changes (i.e., switches, breakers, etc. change state). For a planning model, switch statuses are not used to form topological nodes. Instead they are manually created or deleted in a model builder tool. Topological nodes maintained this way are also called "busses".
*/
public class TopologicalNode extends IdentifiedObject
{
	private BaseClass[] TopologicalNode_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum TopologicalNode_primitive_builder implements PrimitiveBuilder {
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public TopologicalNode() {
		TopologicalNode_attributes = new BaseClass[TopologicalNode_primitive_builder.values().length];
	}

	public void updateAttributeInArray(TopologicalNode_primitive_builder attrEnum, BaseClass value) {
		try {
			TopologicalNode_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//TopologicalNode_ATTR_ENUM attrEnum = TopologicalNode_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			TopologicalNode_primitive_builder attrEnum = TopologicalNode_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (TopologicalNode_primitive_builder attrEnum: TopologicalNode_primitive_builder.values()) {
			BaseClass bc = TopologicalNode_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "TopologicalNode";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new TopologicalNode();
        }
};
