package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;


import cim4j.Terminal;
import cim4j.ControlArea;

/*
A flow specification in terms of location and direction for a control area.
*/
public class TieFlow extends BaseClass
{
	private BaseClass[] TieFlow_class_attributes;
	private BaseClass[] TieFlow_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum TieFlow_primitive_builder implements PrimitiveBuilder {
		positiveFlowIn(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum TieFlow_class_attributes_enum {
		Terminal,
		ControlArea,
		positiveFlowIn,
			LAST_ENUM;
	}

		
		
		
	
	public TieFlow() {
		TieFlow_primitive_attributes = new BaseClass[TieFlow_primitive_builder.values().length];
		TieFlow_class_attributes = new BaseClass[TieFlow_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(TieFlow_class_attributes_enum attrEnum, BaseClass value) {
		try {
			TieFlow_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(TieFlow_primitive_builder attrEnum, BaseClass value) {
		try {
			TieFlow_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			TieFlow_class_attributes_enum attrEnum = TieFlow_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated TieFlow, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			TieFlow_primitive_builder attrEnum = TieFlow_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated TieFlow, setting " + attrName  + " to: "  + value);
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
			for (TieFlow_primitive_builder attrEnum: TieFlow_primitive_builder.values()) {
				BaseClass bc = TieFlow_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TieFlow." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (TieFlow_class_attributes_enum attrEnum: TieFlow_class_attributes_enum.values()) {
				BaseClass bc = TieFlow_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TieFlow." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(TieFlow) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "TieFlow";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new TieFlow();
        }
};
