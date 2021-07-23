package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Susceptance;
import cim4j.Length;
import cim4j.Conductance;
import cim4j.Resistance;
import cim4j.Reactance;


import cim4j.Terminal;

/*
This class represents the zero sequence line mutual coupling.
*/
public class MutualCoupling extends IdentifiedObject
{
	private BaseClass[] MutualCoupling_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum MutualCoupling_primitive_builder implements PrimitiveBuilder {
			b0ch(){
			public BaseClass construct (java.lang.String value) {
				return new Susceptance(value);
			}
		},
			distance11(){
			public BaseClass construct (java.lang.String value) {
				return new Length(value);
			}
		},
			distance12(){
			public BaseClass construct (java.lang.String value) {
				return new Length(value);
			}
		},
			distance21(){
			public BaseClass construct (java.lang.String value) {
				return new Length(value);
			}
		},
			distance22(){
			public BaseClass construct (java.lang.String value) {
				return new Length(value);
			}
		},
			g0ch(){
			public BaseClass construct (java.lang.String value) {
				return new Conductance(value);
			}
		},
			r0(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
			x0(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
	
	public MutualCoupling() {
		MutualCoupling_attributes = new BaseClass[MutualCoupling_primitive_builder.values().length];
	}

	public void updateAttributeInArray(MutualCoupling_primitive_builder attrEnum, BaseClass value) {
		try {
			MutualCoupling_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//MutualCoupling_ATTR_ENUM attrEnum = MutualCoupling_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			MutualCoupling_primitive_builder attrEnum = MutualCoupling_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (MutualCoupling_primitive_builder attrEnum: MutualCoupling_primitive_builder.values()) {
			BaseClass bc = MutualCoupling_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "MutualCoupling";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new MutualCoupling();
        }
};
