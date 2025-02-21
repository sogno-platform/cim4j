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
	private BaseClass[] MutualCoupling_class_attributes;
	private BaseClass[] MutualCoupling_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

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

	private enum MutualCoupling_class_attributes_enum {
		First_Terminal,
		Second_Terminal,
		b0ch,
		distance11,
		distance12,
		distance21,
		distance22,
		g0ch,
		r0,
		x0,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
	
	public MutualCoupling() {
		MutualCoupling_primitive_attributes = new BaseClass[MutualCoupling_primitive_builder.values().length];
		MutualCoupling_class_attributes = new BaseClass[MutualCoupling_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(MutualCoupling_class_attributes_enum attrEnum, BaseClass value) {
		try {
			MutualCoupling_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(MutualCoupling_primitive_builder attrEnum, BaseClass value) {
		try {
			MutualCoupling_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			MutualCoupling_class_attributes_enum attrEnum = MutualCoupling_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated MutualCoupling, setting " + attrName);
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
			System.out.println("Updated MutualCoupling, setting " + attrName  + " to: "  + value);
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
			for (MutualCoupling_primitive_builder attrEnum: MutualCoupling_primitive_builder.values()) {
				BaseClass bc = MutualCoupling_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    MutualCoupling." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (MutualCoupling_class_attributes_enum attrEnum: MutualCoupling_class_attributes_enum.values()) {
				BaseClass bc = MutualCoupling_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    MutualCoupling." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(MutualCoupling) RDFID: " + rdfid;
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
