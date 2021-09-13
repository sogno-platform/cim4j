package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.Switch;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;





/*
A ProtectedSwitch is a switching device that can be operated by ProtectionEquipment.
*/
public class ProtectedSwitch extends Switch
{
	private BaseClass[] ProtectedSwitch_class_attributes;
	private BaseClass[] ProtectedSwitch_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ProtectedSwitch_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ProtectedSwitch_class_attributes_enum {
			LAST_ENUM;
	}

	
	public ProtectedSwitch() {
		ProtectedSwitch_primitive_attributes = new BaseClass[ProtectedSwitch_primitive_builder.values().length];
		ProtectedSwitch_class_attributes = new BaseClass[ProtectedSwitch_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ProtectedSwitch_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ProtectedSwitch_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ProtectedSwitch_primitive_builder attrEnum, BaseClass value) {
		try {
			ProtectedSwitch_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ProtectedSwitch_class_attributes_enum attrEnum = ProtectedSwitch_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ProtectedSwitch, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ProtectedSwitch_primitive_builder attrEnum = ProtectedSwitch_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ProtectedSwitch, setting " + attrName  + " to: "  + value);
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
			for (ProtectedSwitch_primitive_builder attrEnum: ProtectedSwitch_primitive_builder.values()) {
				BaseClass bc = ProtectedSwitch_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ProtectedSwitch." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ProtectedSwitch_class_attributes_enum attrEnum: ProtectedSwitch_class_attributes_enum.values()) {
				BaseClass bc = ProtectedSwitch_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ProtectedSwitch." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ProtectedSwitch) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ProtectedSwitch";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ProtectedSwitch();
        }
};
