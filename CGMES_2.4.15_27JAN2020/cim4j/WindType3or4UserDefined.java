package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.WindTurbineType3or4Dynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;


import cim4j.ProprietaryParameterDynamics;

/*
Wind Type 3 or Type 4 function block whose dynamic behaviour is described by
*/
public class WindType3or4UserDefined extends WindTurbineType3or4Dynamics
{
	private BaseClass[] WindType3or4UserDefined_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum WindType3or4UserDefined_primitive_builder implements PrimitiveBuilder {
			proprietary(){
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

		
		
	
	public WindType3or4UserDefined() {
		WindType3or4UserDefined_attributes = new BaseClass[WindType3or4UserDefined_primitive_builder.values().length];
	}

	public void updateAttributeInArray(WindType3or4UserDefined_primitive_builder attrEnum, BaseClass value) {
		try {
			WindType3or4UserDefined_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//WindType3or4UserDefined_ATTR_ENUM attrEnum = WindType3or4UserDefined_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindType3or4UserDefined_primitive_builder attrEnum = WindType3or4UserDefined_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (WindType3or4UserDefined_primitive_builder attrEnum: WindType3or4UserDefined_primitive_builder.values()) {
			BaseClass bc = WindType3or4UserDefined_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "WindType3or4UserDefined";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindType3or4UserDefined();
        }
};
