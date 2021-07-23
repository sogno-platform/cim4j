package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.SynchronousMachineDetailed;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.RotorKind;
import cim4j.SynchronousMachineModelKind;
import cim4j.Simple_Float;
import cim4j.PU;
import cim4j.Seconds;



/*
Synchronous machine detailed modelling types are defined by the combination of the attributes SynchronousMachineTimeConstantReactance.modelType and SynchronousMachineTimeConstantReactance.rotorType.     The parameters used for models expressed in time constant reactance form include:
*/
public class SynchronousMachineTimeConstantReactance extends SynchronousMachineDetailed
{
	private BaseClass[] SynchronousMachineTimeConstantReactance_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum SynchronousMachineTimeConstantReactance_primitive_builder implements PrimitiveBuilder {
			rotorType(){
			public BaseClass construct (java.lang.String value) {
				return new RotorKind(value);
			}
		},
			modelType(){
			public BaseClass construct (java.lang.String value) {
				return new SynchronousMachineModelKind(value);
			}
		},
			ks(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			xDirectSync(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			xDirectTrans(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			xDirectSubtrans(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			xQuadSync(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			xQuadTrans(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			xQuadSubtrans(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tpdo(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tppdo(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tpqo(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tppqo(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tc(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public SynchronousMachineTimeConstantReactance() {
		SynchronousMachineTimeConstantReactance_attributes = new BaseClass[SynchronousMachineTimeConstantReactance_primitive_builder.values().length];
	}

	public void updateAttributeInArray(SynchronousMachineTimeConstantReactance_primitive_builder attrEnum, BaseClass value) {
		try {
			SynchronousMachineTimeConstantReactance_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//SynchronousMachineTimeConstantReactance_ATTR_ENUM attrEnum = SynchronousMachineTimeConstantReactance_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SynchronousMachineTimeConstantReactance_primitive_builder attrEnum = SynchronousMachineTimeConstantReactance_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (SynchronousMachineTimeConstantReactance_primitive_builder attrEnum: SynchronousMachineTimeConstantReactance_primitive_builder.values()) {
			BaseClass bc = SynchronousMachineTimeConstantReactance_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "SynchronousMachineTimeConstantReactance";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new SynchronousMachineTimeConstantReactance();
        }
};
