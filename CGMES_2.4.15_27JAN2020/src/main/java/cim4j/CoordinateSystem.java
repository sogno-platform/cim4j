package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.Location;

/*
Coordinate reference system.
*/
public class CoordinateSystem extends IdentifiedObject
{
	private BaseClass[] CoordinateSystem_class_attributes;
	private BaseClass[] CoordinateSystem_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum CoordinateSystem_primitive_builder implements PrimitiveBuilder {
		crsUrn(){
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

	private enum CoordinateSystem_class_attributes_enum {
		crsUrn,
		Location,
			LAST_ENUM;
	}

		
		
	
	public CoordinateSystem() {
		CoordinateSystem_primitive_attributes = new BaseClass[CoordinateSystem_primitive_builder.values().length];
		CoordinateSystem_class_attributes = new BaseClass[CoordinateSystem_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(CoordinateSystem_class_attributes_enum attrEnum, BaseClass value) {
		try {
			CoordinateSystem_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(CoordinateSystem_primitive_builder attrEnum, BaseClass value) {
		try {
			CoordinateSystem_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			CoordinateSystem_class_attributes_enum attrEnum = CoordinateSystem_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated CoordinateSystem, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			CoordinateSystem_primitive_builder attrEnum = CoordinateSystem_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated CoordinateSystem, setting " + attrName  + " to: "  + value);
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
			for (CoordinateSystem_primitive_builder attrEnum: CoordinateSystem_primitive_builder.values()) {
				BaseClass bc = CoordinateSystem_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    CoordinateSystem." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (CoordinateSystem_class_attributes_enum attrEnum: CoordinateSystem_class_attributes_enum.values()) {
				BaseClass bc = CoordinateSystem_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    CoordinateSystem." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(CoordinateSystem) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "CoordinateSystem";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new CoordinateSystem();
        }
};
