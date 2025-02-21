package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.SynchronousMachineDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;





/*
The simplified model represents a synchronous generator as a constant internal voltage behind an impedance ( + ) as shown in the Simplified diagram.  Since internal voltage is held constant, there is no  input and any excitation system model will be ignored.  There is also no  output.  This model should not be used for representing a real generator except, perhaps, small generators whose response is insignificant.    The parameters used for the Simplified model include:
*/
public class SynchronousMachineSimplified extends SynchronousMachineDynamics
{
	private BaseClass[] SynchronousMachineSimplified_class_attributes;
	private BaseClass[] SynchronousMachineSimplified_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum SynchronousMachineSimplified_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum SynchronousMachineSimplified_class_attributes_enum {
			LAST_ENUM;
	}

	
	public SynchronousMachineSimplified() {
		SynchronousMachineSimplified_primitive_attributes = new BaseClass[SynchronousMachineSimplified_primitive_builder.values().length];
		SynchronousMachineSimplified_class_attributes = new BaseClass[SynchronousMachineSimplified_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(SynchronousMachineSimplified_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SynchronousMachineSimplified_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(SynchronousMachineSimplified_primitive_builder attrEnum, BaseClass value) {
		try {
			SynchronousMachineSimplified_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SynchronousMachineSimplified_class_attributes_enum attrEnum = SynchronousMachineSimplified_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated SynchronousMachineSimplified, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SynchronousMachineSimplified_primitive_builder attrEnum = SynchronousMachineSimplified_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated SynchronousMachineSimplified, setting " + attrName  + " to: "  + value);
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
			for (SynchronousMachineSimplified_primitive_builder attrEnum: SynchronousMachineSimplified_primitive_builder.values()) {
				BaseClass bc = SynchronousMachineSimplified_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SynchronousMachineSimplified." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SynchronousMachineSimplified_class_attributes_enum attrEnum: SynchronousMachineSimplified_class_attributes_enum.values()) {
				BaseClass bc = SynchronousMachineSimplified_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SynchronousMachineSimplified." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(SynchronousMachineSimplified) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "SynchronousMachineSimplified";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new SynchronousMachineSimplified();
        }
};
