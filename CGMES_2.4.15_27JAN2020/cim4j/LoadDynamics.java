package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.EnergyConsumer;

/*
Load whose behaviour is described by reference to a standard model   A standard feature of dynamic load behaviour modelling is the ability to associate the same behaviour to multiple energy consumers by means of a single aggregate load definition.  Aggregate loads are used to represent all or part of the real and reactive load from one or more loads in the static (power flow) data. This load is usually the aggregation of many individual load devices and the load model is approximate representation of the aggregate response of the load devices to system disturbances. The load model is always applied to individual bus loads (energy consumers) but a single set of load model parameters can used for all loads in the grouping.
*/
public class LoadDynamics extends IdentifiedObject
{
	private BaseClass[] LoadDynamics_class_attributes;
	private BaseClass[] LoadDynamics_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum LoadDynamics_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum LoadDynamics_class_attributes_enum {
		EnergyConsumer,
			LAST_ENUM;
	}

		
	
	public LoadDynamics() {
		LoadDynamics_primitive_attributes = new BaseClass[LoadDynamics_primitive_builder.values().length];
		LoadDynamics_class_attributes = new BaseClass[LoadDynamics_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(LoadDynamics_class_attributes_enum attrEnum, BaseClass value) {
		try {
			LoadDynamics_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(LoadDynamics_primitive_builder attrEnum, BaseClass value) {
		try {
			LoadDynamics_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			LoadDynamics_class_attributes_enum attrEnum = LoadDynamics_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated LoadDynamics, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			LoadDynamics_primitive_builder attrEnum = LoadDynamics_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated LoadDynamics, setting " + attrName  + " to: "  + value);
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
			for (LoadDynamics_primitive_builder attrEnum: LoadDynamics_primitive_builder.values()) {
				BaseClass bc = LoadDynamics_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LoadDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (LoadDynamics_class_attributes_enum attrEnum: LoadDynamics_class_attributes_enum.values()) {
				BaseClass bc = LoadDynamics_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LoadDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(LoadDynamics) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "LoadDynamics";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new LoadDynamics();
        }
};
