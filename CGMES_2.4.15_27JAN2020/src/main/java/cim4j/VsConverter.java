package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ACDCConverter;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.CurrentFlow;
import cim4j.PU;
import cim4j.Resistance;
import cim4j.VsPpccControlKind;
import cim4j.VsQpccControlKind;
import cim4j.PerCent;
import cim4j.ReactivePower;
import cim4j.Voltage;
import cim4j.AngleDegrees;


import cim4j.VsCapabilityCurve;

/*
DC side of the voltage source converter (VSC).
*/
public class VsConverter extends ACDCConverter
{
	private BaseClass[] VsConverter_class_attributes;
	private BaseClass[] VsConverter_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum VsConverter_primitive_builder implements PrimitiveBuilder {
		maxModulationIndex(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		maxValveCurrent(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
		droop(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		droopCompensation(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
		pPccControl(){
			public BaseClass construct (java.lang.String value) {
				return new VsPpccControlKind(value);
			}
		},
		qPccControl(){
			public BaseClass construct (java.lang.String value) {
				return new VsQpccControlKind(value);
			}
		},
		qShare(){
			public BaseClass construct (java.lang.String value) {
				return new PerCent(value);
			}
		},
		targetQpcc(){
			public BaseClass construct (java.lang.String value) {
				return new ReactivePower(value);
			}
		},
		targetUpcc(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
		delta(){
			public BaseClass construct (java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		uf(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum VsConverter_class_attributes_enum {
		CapabilityCurve,
		maxModulationIndex,
		maxValveCurrent,
		droop,
		droopCompensation,
		pPccControl,
		qPccControl,
		qShare,
		targetQpcc,
		targetUpcc,
		delta,
		uf,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
	
	public VsConverter() {
		VsConverter_primitive_attributes = new BaseClass[VsConverter_primitive_builder.values().length];
		VsConverter_class_attributes = new BaseClass[VsConverter_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(VsConverter_class_attributes_enum attrEnum, BaseClass value) {
		try {
			VsConverter_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(VsConverter_primitive_builder attrEnum, BaseClass value) {
		try {
			VsConverter_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			VsConverter_class_attributes_enum attrEnum = VsConverter_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated VsConverter, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			VsConverter_primitive_builder attrEnum = VsConverter_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated VsConverter, setting " + attrName  + " to: "  + value);
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
			for (VsConverter_primitive_builder attrEnum: VsConverter_primitive_builder.values()) {
				BaseClass bc = VsConverter_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    VsConverter." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (VsConverter_class_attributes_enum attrEnum: VsConverter_class_attributes_enum.values()) {
				BaseClass bc = VsConverter_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    VsConverter." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(VsConverter) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "VsConverter";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new VsConverter();
        }
};
