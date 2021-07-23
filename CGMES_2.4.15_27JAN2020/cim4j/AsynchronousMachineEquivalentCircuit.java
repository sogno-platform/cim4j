package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.AsynchronousMachineDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;



/*
The electrical equations of all variations of the asynchronous model are based on the AsynchronousEquivalentCircuit diagram for the direct and quadrature axes, with two equivalent rotor windings in each axis.      =  +   =  +  *  / ( + )  =  +  * *  / ( *  +  *  +  * )  = ( + ) / ( * )  = ( *  +  *  +  * ) / ( *  * (+ ) Same equations using CIM attributes from AsynchronousMachineTimeConstantReactance class on left of = sign and AsynchronousMachineEquivalentCircuit class on right (except as noted): xs = xm + RotatingMachineDynamics.statorLeakageReactance xp = RotatingMachineDynamics.statorLeakageReactance + xm * xlr1 / (xm + xlr1) xpp = RotatingMachineDynamics.statorLeakageReactance + xm * xlr1* xlr2 / (xm * xlr1 + xm * xlr2 + xlr1 * xlr2) tpo = (xm + xlr1) / (2*pi*nominal frequency * rr1) tppo = (xm * xlr1 + xm * xlr2 + xlr1 * xlr2) / (2*pi*nominal frequency * rr2 * (xm + xlr1).
*/
public class AsynchronousMachineEquivalentCircuit extends AsynchronousMachineDynamics
{
	private BaseClass[] AsynchronousMachineEquivalentCircuit_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum AsynchronousMachineEquivalentCircuit_primitive_builder implements PrimitiveBuilder {
			xm(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			rr1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			xlr1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			rr2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			xlr2(){
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

		
		
		
		
		
	
	public AsynchronousMachineEquivalentCircuit() {
		AsynchronousMachineEquivalentCircuit_attributes = new BaseClass[AsynchronousMachineEquivalentCircuit_primitive_builder.values().length];
	}

	public void updateAttributeInArray(AsynchronousMachineEquivalentCircuit_primitive_builder attrEnum, BaseClass value) {
		try {
			AsynchronousMachineEquivalentCircuit_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//AsynchronousMachineEquivalentCircuit_ATTR_ENUM attrEnum = AsynchronousMachineEquivalentCircuit_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			AsynchronousMachineEquivalentCircuit_primitive_builder attrEnum = AsynchronousMachineEquivalentCircuit_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (AsynchronousMachineEquivalentCircuit_primitive_builder attrEnum: AsynchronousMachineEquivalentCircuit_primitive_builder.values()) {
			BaseClass bc = AsynchronousMachineEquivalentCircuit_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "AsynchronousMachineEquivalentCircuit";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new AsynchronousMachineEquivalentCircuit();
        }
};
