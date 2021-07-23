package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Susceptance;
import cim4j.Conductance;
import cim4j.Integer;


import cim4j.NonlinearShuntCompensator;

/*
A non linear shunt compensator bank or section admittance value.
*/
public class NonlinearShuntCompensatorPoint extends BaseClass
{
	private BaseClass[] NonlinearShuntCompensatorPoint_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum NonlinearShuntCompensatorPoint_primitive_builder implements PrimitiveBuilder {
			b(){
			public BaseClass construct (java.lang.String value) {
				return new Susceptance(value);
			}
		},
			g(){
			public BaseClass construct (java.lang.String value) {
				return new Conductance(value);
			}
		},
			sectionNumber(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
			b0(){
			public BaseClass construct (java.lang.String value) {
				return new Susceptance(value);
			}
		},
			g0(){
			public BaseClass construct (java.lang.String value) {
				return new Conductance(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
	
	public NonlinearShuntCompensatorPoint() {
		NonlinearShuntCompensatorPoint_attributes = new BaseClass[NonlinearShuntCompensatorPoint_primitive_builder.values().length];
	}

	public void updateAttributeInArray(NonlinearShuntCompensatorPoint_primitive_builder attrEnum, BaseClass value) {
		try {
			NonlinearShuntCompensatorPoint_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//NonlinearShuntCompensatorPoint_ATTR_ENUM attrEnum = NonlinearShuntCompensatorPoint_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			NonlinearShuntCompensatorPoint_primitive_builder attrEnum = NonlinearShuntCompensatorPoint_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (NonlinearShuntCompensatorPoint_primitive_builder attrEnum: NonlinearShuntCompensatorPoint_primitive_builder.values()) {
			BaseClass bc = NonlinearShuntCompensatorPoint_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "NonlinearShuntCompensatorPoint";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new NonlinearShuntCompensatorPoint();
        }
};
