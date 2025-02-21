package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.SubGeographicalRegion;

/*
A geographical region of a power system network model.
*/
public class GeographicalRegion extends IdentifiedObject
{
	private BaseClass[] GeographicalRegion_class_attributes;
	private BaseClass[] GeographicalRegion_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GeographicalRegion_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum GeographicalRegion_class_attributes_enum {
		Regions,
			LAST_ENUM;
	}

		
	
	public GeographicalRegion() {
		GeographicalRegion_primitive_attributes = new BaseClass[GeographicalRegion_primitive_builder.values().length];
		GeographicalRegion_class_attributes = new BaseClass[GeographicalRegion_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GeographicalRegion_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GeographicalRegion_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GeographicalRegion_primitive_builder attrEnum, BaseClass value) {
		try {
			GeographicalRegion_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GeographicalRegion_class_attributes_enum attrEnum = GeographicalRegion_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GeographicalRegion, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GeographicalRegion_primitive_builder attrEnum = GeographicalRegion_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GeographicalRegion, setting " + attrName  + " to: "  + value);
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
			for (GeographicalRegion_primitive_builder attrEnum: GeographicalRegion_primitive_builder.values()) {
				BaseClass bc = GeographicalRegion_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GeographicalRegion." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GeographicalRegion_class_attributes_enum attrEnum: GeographicalRegion_class_attributes_enum.values()) {
				BaseClass bc = GeographicalRegion_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GeographicalRegion." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GeographicalRegion) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GeographicalRegion";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GeographicalRegion();
        }
};
