package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.EnergyConsumer;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;





/*
Station supply with load derived from the station output.
*/
public class StationSupply extends EnergyConsumer
{
	private BaseClass[] StationSupply_class_attributes;
	private BaseClass[] StationSupply_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum StationSupply_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum StationSupply_class_attributes_enum {
			LAST_ENUM;
	}

	
	public StationSupply() {
		StationSupply_primitive_attributes = new BaseClass[StationSupply_primitive_builder.values().length];
		StationSupply_class_attributes = new BaseClass[StationSupply_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(StationSupply_class_attributes_enum attrEnum, BaseClass value) {
		try {
			StationSupply_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(StationSupply_primitive_builder attrEnum, BaseClass value) {
		try {
			StationSupply_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			StationSupply_class_attributes_enum attrEnum = StationSupply_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated StationSupply, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			StationSupply_primitive_builder attrEnum = StationSupply_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated StationSupply, setting " + attrName  + " to: "  + value);
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
			for (StationSupply_primitive_builder attrEnum: StationSupply_primitive_builder.values()) {
				BaseClass bc = StationSupply_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    StationSupply." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (StationSupply_class_attributes_enum attrEnum: StationSupply_class_attributes_enum.values()) {
				BaseClass bc = StationSupply_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    StationSupply." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(StationSupply) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "StationSupply";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new StationSupply();
        }
};
