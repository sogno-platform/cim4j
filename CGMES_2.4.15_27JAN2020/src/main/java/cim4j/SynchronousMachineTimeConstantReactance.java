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
	private BaseClass[] SynchronousMachineTimeConstantReactance_class_attributes;
	private BaseClass[] SynchronousMachineTimeConstantReactance_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

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

	private enum SynchronousMachineTimeConstantReactance_class_attributes_enum {
		rotorType,
		modelType,
		ks,
		xDirectSync,
		xDirectTrans,
		xDirectSubtrans,
		xQuadSync,
		xQuadTrans,
		xQuadSubtrans,
		tpdo,
		tppdo,
		tpqo,
		tppqo,
		tc,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public SynchronousMachineTimeConstantReactance() {
		SynchronousMachineTimeConstantReactance_primitive_attributes = new BaseClass[SynchronousMachineTimeConstantReactance_primitive_builder.values().length];
		SynchronousMachineTimeConstantReactance_class_attributes = new BaseClass[SynchronousMachineTimeConstantReactance_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(SynchronousMachineTimeConstantReactance_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SynchronousMachineTimeConstantReactance_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(SynchronousMachineTimeConstantReactance_primitive_builder attrEnum, BaseClass value) {
		try {
			SynchronousMachineTimeConstantReactance_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SynchronousMachineTimeConstantReactance_class_attributes_enum attrEnum = SynchronousMachineTimeConstantReactance_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated SynchronousMachineTimeConstantReactance, setting " + attrName);
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
			System.out.println("Updated SynchronousMachineTimeConstantReactance, setting " + attrName  + " to: "  + value);
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
			for (SynchronousMachineTimeConstantReactance_primitive_builder attrEnum: SynchronousMachineTimeConstantReactance_primitive_builder.values()) {
				BaseClass bc = SynchronousMachineTimeConstantReactance_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SynchronousMachineTimeConstantReactance." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SynchronousMachineTimeConstantReactance_class_attributes_enum attrEnum: SynchronousMachineTimeConstantReactance_class_attributes_enum.values()) {
				BaseClass bc = SynchronousMachineTimeConstantReactance_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SynchronousMachineTimeConstantReactance." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(SynchronousMachineTimeConstantReactance) RDFID: " + rdfid;
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
