package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.TopologicalNode;

/*
An electrically connected subset of the network. Topological islands can change as the current network state changes: e.g. due to  - disconnect switches or breakers change state in a SCADA/EMS - manual creation, change or deletion of topological nodes in a planning tool.
*/
public class TopologicalIsland extends IdentifiedObject
{
	private BaseClass[] TopologicalIsland_class_attributes;
	private BaseClass[] TopologicalIsland_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum TopologicalIsland_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum TopologicalIsland_class_attributes_enum {
		AngleRefTopologicalNode,
		TopologicalNodes,
			LAST_ENUM;
	}

		
		
	
	public TopologicalIsland() {
		TopologicalIsland_primitive_attributes = new BaseClass[TopologicalIsland_primitive_builder.values().length];
		TopologicalIsland_class_attributes = new BaseClass[TopologicalIsland_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(TopologicalIsland_class_attributes_enum attrEnum, BaseClass value) {
		try {
			TopologicalIsland_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(TopologicalIsland_primitive_builder attrEnum, BaseClass value) {
		try {
			TopologicalIsland_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			TopologicalIsland_class_attributes_enum attrEnum = TopologicalIsland_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated TopologicalIsland, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			TopologicalIsland_primitive_builder attrEnum = TopologicalIsland_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated TopologicalIsland, setting " + attrName  + " to: "  + value);
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
			for (TopologicalIsland_primitive_builder attrEnum: TopologicalIsland_primitive_builder.values()) {
				BaseClass bc = TopologicalIsland_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TopologicalIsland." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (TopologicalIsland_class_attributes_enum attrEnum: TopologicalIsland_class_attributes_enum.values()) {
				BaseClass bc = TopologicalIsland_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TopologicalIsland." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(TopologicalIsland) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "TopologicalIsland";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new TopologicalIsland();
        }
};
