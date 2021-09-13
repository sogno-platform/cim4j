package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.EnergyConsumer;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.ConformLoadGroup;

/*
ConformLoad represent loads that follow a daily load change pattern where the pattern can be used to scale the load with a system load.
*/
public class ConformLoad extends EnergyConsumer
{
	private BaseClass[] ConformLoad_class_attributes;
	private BaseClass[] ConformLoad_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ConformLoad_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ConformLoad_class_attributes_enum {
		LoadGroup,
			LAST_ENUM;
	}

		
	
	public ConformLoad() {
		ConformLoad_primitive_attributes = new BaseClass[ConformLoad_primitive_builder.values().length];
		ConformLoad_class_attributes = new BaseClass[ConformLoad_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ConformLoad_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ConformLoad_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ConformLoad_primitive_builder attrEnum, BaseClass value) {
		try {
			ConformLoad_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ConformLoad_class_attributes_enum attrEnum = ConformLoad_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ConformLoad, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ConformLoad_primitive_builder attrEnum = ConformLoad_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ConformLoad, setting " + attrName  + " to: "  + value);
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
			for (ConformLoad_primitive_builder attrEnum: ConformLoad_primitive_builder.values()) {
				BaseClass bc = ConformLoad_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ConformLoad." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ConformLoad_class_attributes_enum attrEnum: ConformLoad_class_attributes_enum.values()) {
				BaseClass bc = ConformLoad_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ConformLoad." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ConformLoad) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ConformLoad";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ConformLoad();
        }
};
