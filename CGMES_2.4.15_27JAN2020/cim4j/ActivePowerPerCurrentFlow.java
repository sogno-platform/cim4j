package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.UnitMultiplier;
import cim4j.UnitSymbol;


import cim4j.Float;

/*

*/
public class ActivePowerPerCurrentFlow extends BaseClass
{
	private BaseClass[] ActivePowerPerCurrentFlow_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ActivePowerPerCurrentFlow_primitive_builder implements PrimitiveBuilder {
			denominatorMultiplier(){
			public BaseClass construct (java.lang.String value) {
				return new UnitMultiplier(value);
			}
		},
			denominatorUnit(){
			public BaseClass construct (java.lang.String value) {
				return new UnitSymbol(value);
			}
		},
			multiplier(){
			public BaseClass construct (java.lang.String value) {
				return new UnitMultiplier(value);
			}
		},
			unit(){
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

		
		
		
		
		
	
	public ActivePowerPerCurrentFlow() {
		ActivePowerPerCurrentFlow_attributes = new BaseClass[ActivePowerPerCurrentFlow_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ActivePowerPerCurrentFlow_primitive_builder attrEnum, BaseClass value) {
		try {
			ActivePowerPerCurrentFlow_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ActivePowerPerCurrentFlow_ATTR_ENUM attrEnum = ActivePowerPerCurrentFlow_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ActivePowerPerCurrentFlow_primitive_builder attrEnum = ActivePowerPerCurrentFlow_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ActivePowerPerCurrentFlow_primitive_builder attrEnum: ActivePowerPerCurrentFlow_primitive_builder.values()) {
			BaseClass bc = ActivePowerPerCurrentFlow_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ActivePowerPerCurrentFlow";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ActivePowerPerCurrentFlow();
        }
};
