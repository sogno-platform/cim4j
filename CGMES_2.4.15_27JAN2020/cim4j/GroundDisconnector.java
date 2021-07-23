package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.Switch;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;





/*
A manually operated or motor operated mechanical switching device used for isolating a circuit or equipment from ground.
*/
public class GroundDisconnector extends Switch
{
	private BaseClass[] GroundDisconnector_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum GroundDisconnector_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	
	public GroundDisconnector() {
		GroundDisconnector_attributes = new BaseClass[GroundDisconnector_primitive_builder.values().length];
	}

	public void updateAttributeInArray(GroundDisconnector_primitive_builder attrEnum, BaseClass value) {
		try {
			GroundDisconnector_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//GroundDisconnector_ATTR_ENUM attrEnum = GroundDisconnector_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GroundDisconnector_primitive_builder attrEnum = GroundDisconnector_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (GroundDisconnector_primitive_builder attrEnum: GroundDisconnector_primitive_builder.values()) {
			BaseClass bc = GroundDisconnector_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "GroundDisconnector";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GroundDisconnector();
        }
};
