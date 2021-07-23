package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.RotatingMachine;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ReactivePower;
import cim4j.PerCent;
import cim4j.SynchronousMachineKind;
import cim4j.Boolean;
import cim4j.Resistance;
import cim4j.Reactance;
import cim4j.CurrentFlow;
import cim4j.Simple_Float;
import cim4j.PU;
import cim4j.ShortCircuitRotorKind;
import cim4j.SynchronousMachineOperatingMode;
import cim4j.Integer;


import cim4j.ReactiveCapabilityCurve;
import cim4j.SynchronousMachineDynamics;

/*
An electromechanical device that operates with shaft rotating synchronously with the network. It is a single machine operating either as a generator or synchronous condenser or pump.
*/
public class SynchronousMachine extends RotatingMachine
{
	private BaseClass[] SynchronousMachine_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum SynchronousMachine_primitive_builder implements PrimitiveBuilder {
			maxQ(){
			public BaseClass construct (java.lang.String value) {
				return new ReactivePower(value);
			}
		},
			minQ(){
			public BaseClass construct (java.lang.String value) {
				return new ReactivePower(value);
			}
		},
			qPercent(){
			public BaseClass construct (java.lang.String value) {
				return new PerCent(value);
			}
		},
			type(){
			public BaseClass construct (java.lang.String value) {
				return new SynchronousMachineKind(value);
			}
		},
			earthing(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			earthingStarPointR(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
			earthingStarPointX(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
			ikk(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
			mu(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			r0(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			r2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			satDirectSubtransX(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			satDirectSyncX(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			satDirectTransX(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			shortCircuitRotorType(){
			public BaseClass construct (java.lang.String value) {
				return new ShortCircuitRotorKind(value);
			}
		},
			voltageRegulationRange(){
			public BaseClass construct (java.lang.String value) {
				return new PerCent(value);
			}
		},
			r(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
			x0(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			x2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			operatingMode(){
			public BaseClass construct (java.lang.String value) {
				return new SynchronousMachineOperatingMode(value);
			}
		},
			referencePriority(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public SynchronousMachine() {
		SynchronousMachine_attributes = new BaseClass[SynchronousMachine_primitive_builder.values().length];
	}

	public void updateAttributeInArray(SynchronousMachine_primitive_builder attrEnum, BaseClass value) {
		try {
			SynchronousMachine_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//SynchronousMachine_ATTR_ENUM attrEnum = SynchronousMachine_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SynchronousMachine_primitive_builder attrEnum = SynchronousMachine_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (SynchronousMachine_primitive_builder attrEnum: SynchronousMachine_primitive_builder.values()) {
			BaseClass bc = SynchronousMachine_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "SynchronousMachine";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new SynchronousMachine();
        }
};
