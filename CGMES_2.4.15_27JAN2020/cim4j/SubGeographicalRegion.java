package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.DCLine;
import cim4j.GeographicalRegion;
import cim4j.Line;
import cim4j.Substation;

/*
A subset of a geographical region of a power system network model.
*/
public class SubGeographicalRegion extends IdentifiedObject
{
	private BaseClass[] SubGeographicalRegion_class_attributes;
	private BaseClass[] SubGeographicalRegion_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum SubGeographicalRegion_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum SubGeographicalRegion_class_attributes_enum {
		DCLines,
		Region,
		Lines,
		Substations,
			LAST_ENUM;
	}

		
		
		
		
	
	public SubGeographicalRegion() {
		SubGeographicalRegion_primitive_attributes = new BaseClass[SubGeographicalRegion_primitive_builder.values().length];
		SubGeographicalRegion_class_attributes = new BaseClass[SubGeographicalRegion_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(SubGeographicalRegion_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SubGeographicalRegion_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(SubGeographicalRegion_primitive_builder attrEnum, BaseClass value) {
		try {
			SubGeographicalRegion_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SubGeographicalRegion_class_attributes_enum attrEnum = SubGeographicalRegion_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated SubGeographicalRegion, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SubGeographicalRegion_primitive_builder attrEnum = SubGeographicalRegion_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated SubGeographicalRegion, setting " + attrName  + " to: "  + value);
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
			for (SubGeographicalRegion_primitive_builder attrEnum: SubGeographicalRegion_primitive_builder.values()) {
				BaseClass bc = SubGeographicalRegion_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SubGeographicalRegion." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SubGeographicalRegion_class_attributes_enum attrEnum: SubGeographicalRegion_class_attributes_enum.values()) {
				BaseClass bc = SubGeographicalRegion_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SubGeographicalRegion." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(SubGeographicalRegion) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "SubGeographicalRegion";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new SubGeographicalRegion();
        }
};
