package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ProtectedSwitch;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;





/*
A mechanical switching device capable of making, carrying, and breaking currents under normal circuit conditions and also making, carrying for a specified time, and breaking currents under specified abnormal circuit conditions e.g.  those of short circuit.
*/
public class Breaker extends ProtectedSwitch
{
	private BaseClass[] Breaker_class_attributes;
	private BaseClass[] Breaker_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Breaker_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum Breaker_class_attributes_enum {
			LAST_ENUM;
	}

	
	public Breaker() {
		Breaker_primitive_attributes = new BaseClass[Breaker_primitive_builder.values().length];
		Breaker_class_attributes = new BaseClass[Breaker_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Breaker_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Breaker_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Breaker_primitive_builder attrEnum, BaseClass value) {
		try {
			Breaker_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Breaker_class_attributes_enum attrEnum = Breaker_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Breaker, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Breaker_primitive_builder attrEnum = Breaker_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Breaker, setting " + attrName  + " to: "  + value);
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
			for (Breaker_primitive_builder attrEnum: Breaker_primitive_builder.values()) {
				BaseClass bc = Breaker_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Breaker." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Breaker_class_attributes_enum attrEnum: Breaker_class_attributes_enum.values()) {
				BaseClass bc = Breaker_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Breaker." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Breaker) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Breaker";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Breaker();
        }
};
