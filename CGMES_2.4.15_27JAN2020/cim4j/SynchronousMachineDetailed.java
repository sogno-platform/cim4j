package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.SynchronousMachineDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.IfdBaseKind;
import cim4j.CurrentFlow;



/*
All synchronous machine detailed types use a subset of the same data parameters and input/output variables.   The several variations differ in the following ways:   It is not necessary for each simulation tool to have separate models for each of the model types.  The same model can often be used for several types by alternative logic within the model.  Also, differences in saturation representation may not result in significant model performance differences so model substitutions are often acceptable.
*/
public class SynchronousMachineDetailed extends SynchronousMachineDynamics
{
	private BaseClass[] SynchronousMachineDetailed_class_attributes;
	private BaseClass[] SynchronousMachineDetailed_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum SynchronousMachineDetailed_primitive_builder implements PrimitiveBuilder {
		saturationFactorQAxis(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		saturationFactor120QAxis(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		efdBaseRatio(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ifdBaseType(){
			public BaseClass construct (java.lang.String value) {
				return new IfdBaseKind(value);
			}
		},
		ifdBaseValue(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum SynchronousMachineDetailed_class_attributes_enum {
		saturationFactorQAxis,
		saturationFactor120QAxis,
		efdBaseRatio,
		ifdBaseType,
		ifdBaseValue,
			LAST_ENUM;
	}

		
		
		
		
		
	
	public SynchronousMachineDetailed() {
		SynchronousMachineDetailed_primitive_attributes = new BaseClass[SynchronousMachineDetailed_primitive_builder.values().length];
		SynchronousMachineDetailed_class_attributes = new BaseClass[SynchronousMachineDetailed_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(SynchronousMachineDetailed_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SynchronousMachineDetailed_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(SynchronousMachineDetailed_primitive_builder attrEnum, BaseClass value) {
		try {
			SynchronousMachineDetailed_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SynchronousMachineDetailed_class_attributes_enum attrEnum = SynchronousMachineDetailed_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated SynchronousMachineDetailed, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SynchronousMachineDetailed_primitive_builder attrEnum = SynchronousMachineDetailed_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated SynchronousMachineDetailed, setting " + attrName  + " to: "  + value);
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
			for (SynchronousMachineDetailed_primitive_builder attrEnum: SynchronousMachineDetailed_primitive_builder.values()) {
				BaseClass bc = SynchronousMachineDetailed_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SynchronousMachineDetailed." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SynchronousMachineDetailed_class_attributes_enum attrEnum: SynchronousMachineDetailed_class_attributes_enum.values()) {
				BaseClass bc = SynchronousMachineDetailed_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SynchronousMachineDetailed." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(SynchronousMachineDetailed) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "SynchronousMachineDetailed";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new SynchronousMachineDetailed();
        }
};
