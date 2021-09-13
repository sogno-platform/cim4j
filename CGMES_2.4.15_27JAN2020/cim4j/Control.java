package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;
import cim4j.UnitMultiplier;
import cim4j.UnitSymbol;


import cim4j.DateTime;
import cim4j.PowerSystemResource;

/*
Control is used for supervisory/device control. It represents control outputs that are used to change the state in a process, e.g. close or open breaker, a set point value or a raise lower command.
*/
public class Control extends IdentifiedObject
{
	private BaseClass[] Control_class_attributes;
	private BaseClass[] Control_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Control_primitive_builder implements PrimitiveBuilder {
		controlType(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		operationInProgress(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		unitMultiplier(){
			public BaseClass construct (java.lang.String value) {
				return new UnitMultiplier(value);
			}
		},
		unitSymbol(){
			public BaseClass construct (java.lang.String value) {
				return new UnitSymbol(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum Control_class_attributes_enum {
		controlType,
		operationInProgress,
		timeStamp,
		unitMultiplier,
		unitSymbol,
		PowerSystemResource,
			LAST_ENUM;
	}

		
		
		
		
		
		
	
	public Control() {
		Control_primitive_attributes = new BaseClass[Control_primitive_builder.values().length];
		Control_class_attributes = new BaseClass[Control_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Control_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Control_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Control_primitive_builder attrEnum, BaseClass value) {
		try {
			Control_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Control_class_attributes_enum attrEnum = Control_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Control, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Control_primitive_builder attrEnum = Control_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Control, setting " + attrName  + " to: "  + value);
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
			for (Control_primitive_builder attrEnum: Control_primitive_builder.values()) {
				BaseClass bc = Control_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Control." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Control_class_attributes_enum attrEnum: Control_class_attributes_enum.values()) {
				BaseClass bc = Control_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Control." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Control) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Control";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Control();
        }
};
