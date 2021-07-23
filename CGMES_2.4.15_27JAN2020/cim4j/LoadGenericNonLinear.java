package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.LoadDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.GenericNonLinearLoadModelKind;
import cim4j.Simple_Float;
import cim4j.Seconds;



/*
These load models (known also as generic non-linear dynamic (GNLD) load models) can be used in mid-term and long-term voltage stability simulations (i.e., to study voltage collapse), as they can replace a more detailed representation of aggregate load, including induction motors, thermostatically controlled and static loads.
*/
public class LoadGenericNonLinear extends LoadDynamics
{
	private BaseClass[] LoadGenericNonLinear_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum LoadGenericNonLinear_primitive_builder implements PrimitiveBuilder {
			genericNonLinearLoadModelType(){
			public BaseClass construct (java.lang.String value) {
				return new GenericNonLinearLoadModelKind(value);
			}
		},
			pt(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			qt(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			tp(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tq(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ls(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			lt(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			bs(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			bt(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
	
	public LoadGenericNonLinear() {
		LoadGenericNonLinear_attributes = new BaseClass[LoadGenericNonLinear_primitive_builder.values().length];
	}

	public void updateAttributeInArray(LoadGenericNonLinear_primitive_builder attrEnum, BaseClass value) {
		try {
			LoadGenericNonLinear_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//LoadGenericNonLinear_ATTR_ENUM attrEnum = LoadGenericNonLinear_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			LoadGenericNonLinear_primitive_builder attrEnum = LoadGenericNonLinear_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (LoadGenericNonLinear_primitive_builder attrEnum: LoadGenericNonLinear_primitive_builder.values()) {
			BaseClass bc = LoadGenericNonLinear_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "LoadGenericNonLinear";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new LoadGenericNonLinear();
        }
};
