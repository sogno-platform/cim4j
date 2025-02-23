package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.WindGenTurbineType1IEC;

/*
The constant aerodynamic torque model assumes that the aerodynamic torque is constant.  Reference: IEC Standard 61400-27-1 Section 6.6.1.1.
*/
public class WindAeroConstIEC extends IdentifiedObject
{
	private BaseClass[] WindAeroConstIEC_class_attributes;
	private BaseClass[] WindAeroConstIEC_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum WindAeroConstIEC_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum WindAeroConstIEC_class_attributes_enum {
		WindGenTurbineType1IEC,
			LAST_ENUM;
	}

		
	
	public WindAeroConstIEC() {
		WindAeroConstIEC_primitive_attributes = new BaseClass[WindAeroConstIEC_primitive_builder.values().length];
		WindAeroConstIEC_class_attributes = new BaseClass[WindAeroConstIEC_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(WindAeroConstIEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindAeroConstIEC_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(WindAeroConstIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindAeroConstIEC_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindAeroConstIEC_class_attributes_enum attrEnum = WindAeroConstIEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated WindAeroConstIEC, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindAeroConstIEC_primitive_builder attrEnum = WindAeroConstIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated WindAeroConstIEC, setting " + attrName  + " to: "  + value);
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
			for (WindAeroConstIEC_primitive_builder attrEnum: WindAeroConstIEC_primitive_builder.values()) {
				BaseClass bc = WindAeroConstIEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindAeroConstIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindAeroConstIEC_class_attributes_enum attrEnum: WindAeroConstIEC_class_attributes_enum.values()) {
				BaseClass bc = WindAeroConstIEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindAeroConstIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(WindAeroConstIEC) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "WindAeroConstIEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindAeroConstIEC();
        }
};
