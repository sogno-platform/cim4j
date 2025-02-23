package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Integer;


import cim4j.ReportingGroup;
import cim4j.ACDCTerminal;

/*
Used to apply user standard names to topology buses. Typically used for "bus/branch" case generation. Associated with one or more terminals that are normally connected with the bus name.    The associated terminals are normally connected by non-retained switches. For a ring bus station configuration, all busbar terminals in the ring are typically associated.   For a breaker and a half scheme, both busbars would normally be associated.  For a ring bus, all busbars would normally be associated.  For a "straight" busbar configuration, normally only the main terminal at the busbar would be associated.
*/
public class BusNameMarker extends IdentifiedObject
{
	private BaseClass[] BusNameMarker_class_attributes;
	private BaseClass[] BusNameMarker_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum BusNameMarker_primitive_builder implements PrimitiveBuilder {
		priority(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum BusNameMarker_class_attributes_enum {
		priority,
		ReportingGroup,
		Terminal,
			LAST_ENUM;
	}

		
		
		
	
	public BusNameMarker() {
		BusNameMarker_primitive_attributes = new BaseClass[BusNameMarker_primitive_builder.values().length];
		BusNameMarker_class_attributes = new BaseClass[BusNameMarker_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(BusNameMarker_class_attributes_enum attrEnum, BaseClass value) {
		try {
			BusNameMarker_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(BusNameMarker_primitive_builder attrEnum, BaseClass value) {
		try {
			BusNameMarker_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			BusNameMarker_class_attributes_enum attrEnum = BusNameMarker_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated BusNameMarker, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			BusNameMarker_primitive_builder attrEnum = BusNameMarker_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated BusNameMarker, setting " + attrName  + " to: "  + value);
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
			for (BusNameMarker_primitive_builder attrEnum: BusNameMarker_primitive_builder.values()) {
				BaseClass bc = BusNameMarker_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    BusNameMarker." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (BusNameMarker_class_attributes_enum attrEnum: BusNameMarker_class_attributes_enum.values()) {
				BaseClass bc = BusNameMarker_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    BusNameMarker." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(BusNameMarker) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "BusNameMarker";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new BusNameMarker();
        }
};
