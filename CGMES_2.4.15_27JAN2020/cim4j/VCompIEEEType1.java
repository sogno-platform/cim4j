package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.VoltageCompensatorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;



/*
Reference: IEEE Standard 421.5-2005 Section 4.
*/
public class VCompIEEEType1 extends VoltageCompensatorDynamics
{
	private BaseClass[] VCompIEEEType1_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum VCompIEEEType1_primitive_builder implements PrimitiveBuilder {
			rc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			xc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tr(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
	
	public VCompIEEEType1() {
		VCompIEEEType1_attributes = new BaseClass[VCompIEEEType1_primitive_builder.values().length];
	}

	public void updateAttributeInArray(VCompIEEEType1_primitive_builder attrEnum, BaseClass value) {
		try {
			VCompIEEEType1_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//VCompIEEEType1_ATTR_ENUM attrEnum = VCompIEEEType1_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			VCompIEEEType1_primitive_builder attrEnum = VCompIEEEType1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (VCompIEEEType1_primitive_builder attrEnum: VCompIEEEType1_primitive_builder.values()) {
			BaseClass bc = VCompIEEEType1_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "VCompIEEEType1";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new VCompIEEEType1();
        }
};
