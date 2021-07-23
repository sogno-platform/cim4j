package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.AsynchronousMachineDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;



/*
The parameters used for models expressed in time constant reactance form include:
*/
public class AsynchronousMachineTimeConstantReactance extends AsynchronousMachineDynamics
{
	private BaseClass[] AsynchronousMachineTimeConstantReactance_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum AsynchronousMachineTimeConstantReactance_primitive_builder implements PrimitiveBuilder {
			xs(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			xp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			xpp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tpo(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tppo(){
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

		
		
		
		
		
	
	public AsynchronousMachineTimeConstantReactance() {
		AsynchronousMachineTimeConstantReactance_attributes = new BaseClass[AsynchronousMachineTimeConstantReactance_primitive_builder.values().length];
	}

	public void updateAttributeInArray(AsynchronousMachineTimeConstantReactance_primitive_builder attrEnum, BaseClass value) {
		try {
			AsynchronousMachineTimeConstantReactance_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//AsynchronousMachineTimeConstantReactance_ATTR_ENUM attrEnum = AsynchronousMachineTimeConstantReactance_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			AsynchronousMachineTimeConstantReactance_primitive_builder attrEnum = AsynchronousMachineTimeConstantReactance_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (AsynchronousMachineTimeConstantReactance_primitive_builder attrEnum: AsynchronousMachineTimeConstantReactance_primitive_builder.values()) {
			BaseClass bc = AsynchronousMachineTimeConstantReactance_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "AsynchronousMachineTimeConstantReactance";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new AsynchronousMachineTimeConstantReactance();
        }
};
