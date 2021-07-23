package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DynamicsFunctionBlock;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.Seconds;
import cim4j.PU;



/*
Abstract parent class for all synchronous and asynchronous machine standard models.
*/
public class RotatingMachineDynamics extends DynamicsFunctionBlock
{
	private BaseClass[] RotatingMachineDynamics_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum RotatingMachineDynamics_primitive_builder implements PrimitiveBuilder {
			damping(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			inertia(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			saturationFactor(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			saturationFactor120(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			statorLeakageReactance(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			statorResistance(){
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

		
		
		
		
		
		
	
	public RotatingMachineDynamics() {
		RotatingMachineDynamics_attributes = new BaseClass[RotatingMachineDynamics_primitive_builder.values().length];
	}

	public void updateAttributeInArray(RotatingMachineDynamics_primitive_builder attrEnum, BaseClass value) {
		try {
			RotatingMachineDynamics_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//RotatingMachineDynamics_ATTR_ENUM attrEnum = RotatingMachineDynamics_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			RotatingMachineDynamics_primitive_builder attrEnum = RotatingMachineDynamics_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (RotatingMachineDynamics_primitive_builder attrEnum: RotatingMachineDynamics_primitive_builder.values()) {
			BaseClass bc = RotatingMachineDynamics_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "RotatingMachineDynamics";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new RotatingMachineDynamics();
        }
};
