package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;



/*
Specifies a set of Limits that are associated with a Measurement. A Measurement may have several LimitSets corresponding to seasonal or other changing conditions. The condition is captured in the name and description attributes. The same LimitSet may be used for several Measurements. In particular percentage limits are used this way.
*/
public class LimitSet extends IdentifiedObject
{
	private BaseClass[] LimitSet_class_attributes;
	private BaseClass[] LimitSet_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum LimitSet_primitive_builder implements PrimitiveBuilder {
		isPercentageLimits(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum LimitSet_class_attributes_enum {
		isPercentageLimits,
			LAST_ENUM;
	}

		
	
	public LimitSet() {
		LimitSet_primitive_attributes = new BaseClass[LimitSet_primitive_builder.values().length];
		LimitSet_class_attributes = new BaseClass[LimitSet_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(LimitSet_class_attributes_enum attrEnum, BaseClass value) {
		try {
			LimitSet_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(LimitSet_primitive_builder attrEnum, BaseClass value) {
		try {
			LimitSet_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			LimitSet_class_attributes_enum attrEnum = LimitSet_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated LimitSet, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			LimitSet_primitive_builder attrEnum = LimitSet_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated LimitSet, setting " + attrName  + " to: "  + value);
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
			for (LimitSet_primitive_builder attrEnum: LimitSet_primitive_builder.values()) {
				BaseClass bc = LimitSet_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LimitSet." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (LimitSet_class_attributes_enum attrEnum: LimitSet_class_attributes_enum.values()) {
				BaseClass bc = LimitSet_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LimitSet." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(LimitSet) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "LimitSet";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new LimitSet();
        }
};
