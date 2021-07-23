package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ConductingEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;
import cim4j.CurrentFlow;


import cim4j.SwitchSchedule;

/*
A generic device designed to close, or open, or both, one or more electric circuits.  All switches are two terminal devices including grounding switches.
*/
public class Switch extends ConductingEquipment
{
	private BaseClass[] Switch_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum Switch_primitive_builder implements PrimitiveBuilder {
			normalOpen(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			ratedCurrent(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
			retained(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			open(){
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

		
		
		
		
		
	
	public Switch() {
		Switch_attributes = new BaseClass[Switch_primitive_builder.values().length];
	}

	public void updateAttributeInArray(Switch_primitive_builder attrEnum, BaseClass value) {
		try {
			Switch_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//Switch_ATTR_ENUM attrEnum = Switch_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Switch_primitive_builder attrEnum = Switch_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (Switch_primitive_builder attrEnum: Switch_primitive_builder.values()) {
			BaseClass bc = Switch_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "Switch";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Switch();
        }
};
