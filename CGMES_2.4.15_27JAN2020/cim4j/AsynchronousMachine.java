package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.RotatingMachine;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Frequency;
import cim4j.Boolean;
import cim4j.PerCent;
import cim4j.Simple_Float;
import cim4j.Integer;
import cim4j.ActivePower;
import cim4j.AsynchronousMachineKind;


import cim4j.RotationSpeed;
import cim4j.AsynchronousMachineDynamics;

/*
A rotating machine whose shaft rotates asynchronously with the electrical field.  Also known as an induction machine with no external connection to the rotor windings, e.g squirrel-cage induction machine.
*/
public class AsynchronousMachine extends RotatingMachine
{
	private BaseClass[] AsynchronousMachine_class_attributes;
	private BaseClass[] AsynchronousMachine_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum AsynchronousMachine_primitive_builder implements PrimitiveBuilder {
		nominalFrequency(){
			public BaseClass construct (java.lang.String value) {
				return new Frequency(value);
			}
		},
		converterFedDrive(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		efficiency(){
			public BaseClass construct (java.lang.String value) {
				return new PerCent(value);
			}
		},
		iaIrRatio(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		polePairNumber(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
		ratedMechanicalPower(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		reversible(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		rxLockedRotorRatio(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		asynchronousMachineType(){
			public BaseClass construct (java.lang.String value) {
				return new AsynchronousMachineKind(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum AsynchronousMachine_class_attributes_enum {
		nominalFrequency,
		nominalSpeed,
		converterFedDrive,
		efficiency,
		iaIrRatio,
		polePairNumber,
		ratedMechanicalPower,
		reversible,
		rxLockedRotorRatio,
		asynchronousMachineType,
		AsynchronousMachineDynamics,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
	
	public AsynchronousMachine() {
		AsynchronousMachine_primitive_attributes = new BaseClass[AsynchronousMachine_primitive_builder.values().length];
		AsynchronousMachine_class_attributes = new BaseClass[AsynchronousMachine_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(AsynchronousMachine_class_attributes_enum attrEnum, BaseClass value) {
		try {
			AsynchronousMachine_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(AsynchronousMachine_primitive_builder attrEnum, BaseClass value) {
		try {
			AsynchronousMachine_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			AsynchronousMachine_class_attributes_enum attrEnum = AsynchronousMachine_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated AsynchronousMachine, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			AsynchronousMachine_primitive_builder attrEnum = AsynchronousMachine_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated AsynchronousMachine, setting " + attrName  + " to: "  + value);
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
			for (AsynchronousMachine_primitive_builder attrEnum: AsynchronousMachine_primitive_builder.values()) {
				BaseClass bc = AsynchronousMachine_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    AsynchronousMachine." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (AsynchronousMachine_class_attributes_enum attrEnum: AsynchronousMachine_class_attributes_enum.values()) {
				BaseClass bc = AsynchronousMachine_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    AsynchronousMachine." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(AsynchronousMachine) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "AsynchronousMachine";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new AsynchronousMachine();
        }
};
