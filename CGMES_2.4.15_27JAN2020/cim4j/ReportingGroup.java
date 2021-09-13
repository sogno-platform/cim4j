package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.BusNameMarker;
import cim4j.TopologicalNode;

/*
A reporting group is used for various ad-hoc groupings used for reporting.
*/
public class ReportingGroup extends IdentifiedObject
{
	private BaseClass[] ReportingGroup_class_attributes;
	private BaseClass[] ReportingGroup_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ReportingGroup_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ReportingGroup_class_attributes_enum {
		BusNameMarker,
		TopologicalNode,
			LAST_ENUM;
	}

		
		
	
	public ReportingGroup() {
		ReportingGroup_primitive_attributes = new BaseClass[ReportingGroup_primitive_builder.values().length];
		ReportingGroup_class_attributes = new BaseClass[ReportingGroup_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ReportingGroup_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ReportingGroup_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ReportingGroup_primitive_builder attrEnum, BaseClass value) {
		try {
			ReportingGroup_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ReportingGroup_class_attributes_enum attrEnum = ReportingGroup_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ReportingGroup, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ReportingGroup_primitive_builder attrEnum = ReportingGroup_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ReportingGroup, setting " + attrName  + " to: "  + value);
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
			for (ReportingGroup_primitive_builder attrEnum: ReportingGroup_primitive_builder.values()) {
				BaseClass bc = ReportingGroup_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ReportingGroup." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ReportingGroup_class_attributes_enum attrEnum: ReportingGroup_class_attributes_enum.values()) {
				BaseClass bc = ReportingGroup_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ReportingGroup." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ReportingGroup) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ReportingGroup";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ReportingGroup();
        }
};
