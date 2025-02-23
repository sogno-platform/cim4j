package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.CoordinateSystem;
import cim4j.PowerSystemResource;
import cim4j.PositionPoint;

/*
The place, scene, or point of something where someone or something has been, is, and/or will be at a given moment in time. It can be defined with one or more postition points (coordinates) in a given coordinate system.
*/
public class Location extends IdentifiedObject
{
	private BaseClass[] Location_class_attributes;
	private BaseClass[] Location_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Location_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum Location_class_attributes_enum {
		CoordinateSystem,
		PowerSystemResources,
		PositionPoints,
			LAST_ENUM;
	}

		
		
		
	
	public Location() {
		Location_primitive_attributes = new BaseClass[Location_primitive_builder.values().length];
		Location_class_attributes = new BaseClass[Location_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Location_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Location_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Location_primitive_builder attrEnum, BaseClass value) {
		try {
			Location_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Location_class_attributes_enum attrEnum = Location_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Location, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Location_primitive_builder attrEnum = Location_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Location, setting " + attrName  + " to: "  + value);
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
			for (Location_primitive_builder attrEnum: Location_primitive_builder.values()) {
				BaseClass bc = Location_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Location." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Location_class_attributes_enum attrEnum: Location_class_attributes_enum.values()) {
				BaseClass bc = Location_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Location." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Location) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Location";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Location();
        }
};
