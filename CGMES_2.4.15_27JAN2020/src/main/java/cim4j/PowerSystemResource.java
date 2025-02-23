package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.Control;
import cim4j.Measurement;
import cim4j.Location;

/*
A power system resource can be an item of equipment such as a switch, an equipment container containing many individual items of equipment such as a substation, or an organisational entity such as sub-control area. Power system resources can have measurements associated.
*/
public class PowerSystemResource extends IdentifiedObject
{
	private BaseClass[] PowerSystemResource_class_attributes;
	private BaseClass[] PowerSystemResource_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PowerSystemResource_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum PowerSystemResource_class_attributes_enum {
		Controls,
		Measurements,
		Location,
			LAST_ENUM;
	}

		
		
		
	
	public PowerSystemResource() {
		PowerSystemResource_primitive_attributes = new BaseClass[PowerSystemResource_primitive_builder.values().length];
		PowerSystemResource_class_attributes = new BaseClass[PowerSystemResource_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PowerSystemResource_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PowerSystemResource_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PowerSystemResource_primitive_builder attrEnum, BaseClass value) {
		try {
			PowerSystemResource_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PowerSystemResource_class_attributes_enum attrEnum = PowerSystemResource_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PowerSystemResource, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PowerSystemResource_primitive_builder attrEnum = PowerSystemResource_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PowerSystemResource, setting " + attrName  + " to: "  + value);
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
			for (PowerSystemResource_primitive_builder attrEnum: PowerSystemResource_primitive_builder.values()) {
				BaseClass bc = PowerSystemResource_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PowerSystemResource." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PowerSystemResource_class_attributes_enum attrEnum: PowerSystemResource_class_attributes_enum.values()) {
				BaseClass bc = PowerSystemResource_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PowerSystemResource." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PowerSystemResource) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PowerSystemResource";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PowerSystemResource();
        }
};
