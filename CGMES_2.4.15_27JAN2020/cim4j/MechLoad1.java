package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.MechanicalLoadDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;



/*
Mechanical load model type 1.
*/
public class MechLoad1 extends MechanicalLoadDynamics
{
	private BaseClass[] MechLoad1_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum MechLoad1_primitive_builder implements PrimitiveBuilder {
			a(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			b(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			d(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			e(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
	
	public MechLoad1() {
		MechLoad1_attributes = new BaseClass[MechLoad1_primitive_builder.values().length];
	}

	public void updateAttributeInArray(MechLoad1_primitive_builder attrEnum, BaseClass value) {
		try {
			MechLoad1_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//MechLoad1_ATTR_ENUM attrEnum = MechLoad1_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			MechLoad1_primitive_builder attrEnum = MechLoad1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (MechLoad1_primitive_builder attrEnum: MechLoad1_primitive_builder.values()) {
			BaseClass bc = MechLoad1_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "MechLoad1";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new MechLoad1();
        }
};
