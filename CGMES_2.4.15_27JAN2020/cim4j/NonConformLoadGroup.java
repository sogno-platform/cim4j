package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.LoadGroup;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.NonConformLoad;
import cim4j.NonConformLoadSchedule;

/*
Loads that do not follow a daily and seasonal load variation pattern.
*/
public class NonConformLoadGroup extends LoadGroup
{
	private BaseClass[] NonConformLoadGroup_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum NonConformLoadGroup_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
	
	public NonConformLoadGroup() {
		NonConformLoadGroup_attributes = new BaseClass[NonConformLoadGroup_primitive_builder.values().length];
	}

	public void updateAttributeInArray(NonConformLoadGroup_primitive_builder attrEnum, BaseClass value) {
		try {
			NonConformLoadGroup_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//NonConformLoadGroup_ATTR_ENUM attrEnum = NonConformLoadGroup_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			NonConformLoadGroup_primitive_builder attrEnum = NonConformLoadGroup_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (NonConformLoadGroup_primitive_builder attrEnum: NonConformLoadGroup_primitive_builder.values()) {
			BaseClass bc = NonConformLoadGroup_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "NonConformLoadGroup";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new NonConformLoadGroup();
        }
};
