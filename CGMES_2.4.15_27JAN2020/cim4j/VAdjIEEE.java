package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.VoltageAdjusterDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.PU;
import cim4j.Seconds;



/*
The class represents IEEE Voltage Adjuster which is used to represent the voltage adjuster in either a power factor or var control system.  Reference: IEEE Standard 421.5-2005 Section 11.1.
*/
public class VAdjIEEE extends VoltageAdjusterDynamics
{
	private BaseClass[] VAdjIEEE_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum VAdjIEEE_primitive_builder implements PrimitiveBuilder {
			vadjf(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			adjslew(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			vadjmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vadjmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			taon(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			taoff(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
	
	public VAdjIEEE() {
		VAdjIEEE_attributes = new BaseClass[VAdjIEEE_primitive_builder.values().length];
	}

	public void updateAttributeInArray(VAdjIEEE_primitive_builder attrEnum, BaseClass value) {
		try {
			VAdjIEEE_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//VAdjIEEE_ATTR_ENUM attrEnum = VAdjIEEE_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			VAdjIEEE_primitive_builder attrEnum = VAdjIEEE_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (VAdjIEEE_primitive_builder attrEnum: VAdjIEEE_primitive_builder.values()) {
			BaseClass bc = VAdjIEEE_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "VAdjIEEE";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new VAdjIEEE();
        }
};
