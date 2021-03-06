package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.SynchronousMachineDetailed;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;



/*
The electrical equations for all variations of the synchronous models are based on the SynchronousEquivalentCircuit diagram for the direct and quadrature axes.    =  +   =  +  *  / ( + )  =  +  * *  / ( *  +  *  +  * )  =  +   =  +  *  / (+ )  =  +  **  / ( *  +  *  +  * )  = ( + ) / ( * )  = ( *  +  *  +  * ) / ( *  * ( + )  = ( + ) / ( * )  = ( *  +  *  +  * )/ ( *  * ( + ) Same equations using CIM attributes from SynchronousMachineTimeConstantReactance class on left of = sign and SynchronousMachineEquivalentCircuit class on right (except as noted): xDirectSync = xad + RotatingMachineDynamics.statorLeakageReactance xDirectTrans = RotatingMachineDynamics.statorLeakageReactance + xad * xfd / (xad + xfd) xDirectSubtrans = RotatingMachineDynamics.statorLeakageReactance + xad * xfd * x1d / (xad * xfd + xad * x1d + xfd * x1d) xQuadSync = xaq + RotatingMachineDynamics.statorLeakageReactance xQuadTrans = RotatingMachineDynamics.statorLeakageReactance + xaq * x1q / (xaq+ x1q) xQuadSubtrans = RotatingMachineDynamics.statorLeakageReactance + xaq * x1q* x2q / (xaq * x1q + xaq * x2q + x1q * x2q)  tpdo = (xad + xfd) / (2*pi*nominal frequency * rfd) tppdo = (xad * xfd + xad * x1d + xfd * x1d) / (2*pi*nominal frequency * r1d * (xad + xfd) tpqo = (xaq + x1q) / (2*pi*nominal frequency * r1q) tppqo = (xaq * x1q + xaq * x2q + x1q * x2q)/ (2*pi*nominal frequency * r2q * (xaq + x1q).  Are only valid for a simplified model where "Canay" reactance is zero.
*/
public class SynchronousMachineEquivalentCircuit extends SynchronousMachineDetailed
{
	private BaseClass[] SynchronousMachineEquivalentCircuit_class_attributes;
	private BaseClass[] SynchronousMachineEquivalentCircuit_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum SynchronousMachineEquivalentCircuit_primitive_builder implements PrimitiveBuilder {
		xad(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		rfd(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		xfd(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		r1d(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		x1d(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		xf1d(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		xaq(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		r1q(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		x1q(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		r2q(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		x2q(){
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

	private enum SynchronousMachineEquivalentCircuit_class_attributes_enum {
		xad,
		rfd,
		xfd,
		r1d,
		x1d,
		xf1d,
		xaq,
		r1q,
		x1q,
		r2q,
		x2q,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
	
	public SynchronousMachineEquivalentCircuit() {
		SynchronousMachineEquivalentCircuit_primitive_attributes = new BaseClass[SynchronousMachineEquivalentCircuit_primitive_builder.values().length];
		SynchronousMachineEquivalentCircuit_class_attributes = new BaseClass[SynchronousMachineEquivalentCircuit_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(SynchronousMachineEquivalentCircuit_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SynchronousMachineEquivalentCircuit_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(SynchronousMachineEquivalentCircuit_primitive_builder attrEnum, BaseClass value) {
		try {
			SynchronousMachineEquivalentCircuit_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SynchronousMachineEquivalentCircuit_class_attributes_enum attrEnum = SynchronousMachineEquivalentCircuit_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated SynchronousMachineEquivalentCircuit, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SynchronousMachineEquivalentCircuit_primitive_builder attrEnum = SynchronousMachineEquivalentCircuit_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated SynchronousMachineEquivalentCircuit, setting " + attrName  + " to: "  + value);
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
			for (SynchronousMachineEquivalentCircuit_primitive_builder attrEnum: SynchronousMachineEquivalentCircuit_primitive_builder.values()) {
				BaseClass bc = SynchronousMachineEquivalentCircuit_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SynchronousMachineEquivalentCircuit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SynchronousMachineEquivalentCircuit_class_attributes_enum attrEnum: SynchronousMachineEquivalentCircuit_class_attributes_enum.values()) {
				BaseClass bc = SynchronousMachineEquivalentCircuit_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SynchronousMachineEquivalentCircuit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(SynchronousMachineEquivalentCircuit) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "SynchronousMachineEquivalentCircuit";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new SynchronousMachineEquivalentCircuit();
        }
};
