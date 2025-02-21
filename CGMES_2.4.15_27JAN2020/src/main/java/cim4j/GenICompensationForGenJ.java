package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;


import cim4j.SynchronousMachineDynamics;
import cim4j.VCompIEEEType2;

/*
This class provides the resistive and reactive components of compensation for the generator associated with the IEEE Type 2 voltage compensator for current flow out of one of the other generators in the interconnection.
*/
public class GenICompensationForGenJ extends IdentifiedObject
{
	private BaseClass[] GenICompensationForGenJ_class_attributes;
	private BaseClass[] GenICompensationForGenJ_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GenICompensationForGenJ_primitive_builder implements PrimitiveBuilder {
		rcij(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		xcij(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum GenICompensationForGenJ_class_attributes_enum {
		SynchronousMachineDynamics,
		VcompIEEEType2,
		rcij,
		xcij,
			LAST_ENUM;
	}

		
		
		
		
	
	public GenICompensationForGenJ() {
		GenICompensationForGenJ_primitive_attributes = new BaseClass[GenICompensationForGenJ_primitive_builder.values().length];
		GenICompensationForGenJ_class_attributes = new BaseClass[GenICompensationForGenJ_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GenICompensationForGenJ_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GenICompensationForGenJ_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GenICompensationForGenJ_primitive_builder attrEnum, BaseClass value) {
		try {
			GenICompensationForGenJ_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GenICompensationForGenJ_class_attributes_enum attrEnum = GenICompensationForGenJ_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GenICompensationForGenJ, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GenICompensationForGenJ_primitive_builder attrEnum = GenICompensationForGenJ_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GenICompensationForGenJ, setting " + attrName  + " to: "  + value);
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
			for (GenICompensationForGenJ_primitive_builder attrEnum: GenICompensationForGenJ_primitive_builder.values()) {
				BaseClass bc = GenICompensationForGenJ_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GenICompensationForGenJ." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GenICompensationForGenJ_class_attributes_enum attrEnum: GenICompensationForGenJ_class_attributes_enum.values()) {
				BaseClass bc = GenICompensationForGenJ_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GenICompensationForGenJ." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GenICompensationForGenJ) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GenICompensationForGenJ";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GenICompensationForGenJ();
        }
};
