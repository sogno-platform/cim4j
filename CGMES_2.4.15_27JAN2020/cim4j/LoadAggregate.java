package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.LoadDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.LoadStatic;
import cim4j.LoadMotor;

/*
Standard aggregate load model comprised of static and/or dynamic components.  A static load model represents the sensitivity of the real and reactive power consumed by the load to the amplitude and frequency of the bus voltage. A dynamic load model can used to represent the aggregate response of the motor components of the load.
*/
public class LoadAggregate extends LoadDynamics
{
	private BaseClass[] LoadAggregate_class_attributes;
	private BaseClass[] LoadAggregate_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum LoadAggregate_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum LoadAggregate_class_attributes_enum {
		LoadStatic,
		LoadMotor,
			LAST_ENUM;
	}

		
		
	
	public LoadAggregate() {
		LoadAggregate_primitive_attributes = new BaseClass[LoadAggregate_primitive_builder.values().length];
		LoadAggregate_class_attributes = new BaseClass[LoadAggregate_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(LoadAggregate_class_attributes_enum attrEnum, BaseClass value) {
		try {
			LoadAggregate_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(LoadAggregate_primitive_builder attrEnum, BaseClass value) {
		try {
			LoadAggregate_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			LoadAggregate_class_attributes_enum attrEnum = LoadAggregate_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated LoadAggregate, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			LoadAggregate_primitive_builder attrEnum = LoadAggregate_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated LoadAggregate, setting " + attrName  + " to: "  + value);
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
			for (LoadAggregate_primitive_builder attrEnum: LoadAggregate_primitive_builder.values()) {
				BaseClass bc = LoadAggregate_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LoadAggregate." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (LoadAggregate_class_attributes_enum attrEnum: LoadAggregate_class_attributes_enum.values()) {
				BaseClass bc = LoadAggregate_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LoadAggregate." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(LoadAggregate) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "LoadAggregate";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new LoadAggregate();
        }
};
