package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PFVArControllerType2Dynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;
import cim4j.PU;



/*
Power factor / Reactive power regulator. This model represents the power factor or reactive power controller such as the Basler SCP-250. The controller measures power factor or reactive power (PU on generator rated power) and compares it with the operator's set point.
*/
public class PFVArType2Common1 extends PFVArControllerType2Dynamics
{
	private BaseClass[] PFVArType2Common1_class_attributes;
	private BaseClass[] PFVArType2Common1_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PFVArType2Common1_primitive_builder implements PrimitiveBuilder {
		j(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		kp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ki(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		max(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ref(){
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

	private enum PFVArType2Common1_class_attributes_enum {
		j,
		kp,
		ki,
		max,
		ref,
			LAST_ENUM;
	}

		
		
		
		
		
	
	public PFVArType2Common1() {
		PFVArType2Common1_primitive_attributes = new BaseClass[PFVArType2Common1_primitive_builder.values().length];
		PFVArType2Common1_class_attributes = new BaseClass[PFVArType2Common1_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PFVArType2Common1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PFVArType2Common1_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PFVArType2Common1_primitive_builder attrEnum, BaseClass value) {
		try {
			PFVArType2Common1_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PFVArType2Common1_class_attributes_enum attrEnum = PFVArType2Common1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PFVArType2Common1, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PFVArType2Common1_primitive_builder attrEnum = PFVArType2Common1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PFVArType2Common1, setting " + attrName  + " to: "  + value);
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
			for (PFVArType2Common1_primitive_builder attrEnum: PFVArType2Common1_primitive_builder.values()) {
				BaseClass bc = PFVArType2Common1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PFVArType2Common1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PFVArType2Common1_class_attributes_enum attrEnum: PFVArType2Common1_class_attributes_enum.values()) {
				BaseClass bc = PFVArType2Common1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PFVArType2Common1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PFVArType2Common1) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PFVArType2Common1";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PFVArType2Common1();
        }
};
