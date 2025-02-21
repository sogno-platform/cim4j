package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.RegulatingCondEq;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ActivePower;
import cim4j.ReactivePower;
import cim4j.Boolean;
import cim4j.CurrentFlow;
import cim4j.Simple_Float;
import cim4j.PU;
import cim4j.Integer;


import cim4j.ActivePowerPerFrequency;

/*
This class represents external network and it is used for IEC 60909 calculations.
*/
public class ExternalNetworkInjection extends RegulatingCondEq
{
	private BaseClass[] ExternalNetworkInjection_class_attributes;
	private BaseClass[] ExternalNetworkInjection_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExternalNetworkInjection_primitive_builder implements PrimitiveBuilder {
		maxP(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		maxQ(){
			public BaseClass construct (java.lang.String value) {
				return new ReactivePower(value);
			}
		},
		minP(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		minQ(){
			public BaseClass construct (java.lang.String value) {
				return new ReactivePower(value);
			}
		},
		ikSecond(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		maxInitialSymShCCurrent(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
		maxR0ToX0Ratio(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		maxR1ToX1Ratio(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		maxZ0ToZ1Ratio(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		minInitialSymShCCurrent(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
		minR0ToX0Ratio(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		minR1ToX1Ratio(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		minZ0ToZ1Ratio(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		voltageFactor(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		referencePriority(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
		p(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		q(){
			public BaseClass construct (java.lang.String value) {
				return new ReactivePower(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ExternalNetworkInjection_class_attributes_enum {
		governorSCD,
		maxP,
		maxQ,
		minP,
		minQ,
		ikSecond,
		maxInitialSymShCCurrent,
		maxR0ToX0Ratio,
		maxR1ToX1Ratio,
		maxZ0ToZ1Ratio,
		minInitialSymShCCurrent,
		minR0ToX0Ratio,
		minR1ToX1Ratio,
		minZ0ToZ1Ratio,
		voltageFactor,
		referencePriority,
		p,
		q,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExternalNetworkInjection() {
		ExternalNetworkInjection_primitive_attributes = new BaseClass[ExternalNetworkInjection_primitive_builder.values().length];
		ExternalNetworkInjection_class_attributes = new BaseClass[ExternalNetworkInjection_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExternalNetworkInjection_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExternalNetworkInjection_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExternalNetworkInjection_primitive_builder attrEnum, BaseClass value) {
		try {
			ExternalNetworkInjection_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExternalNetworkInjection_class_attributes_enum attrEnum = ExternalNetworkInjection_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExternalNetworkInjection, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExternalNetworkInjection_primitive_builder attrEnum = ExternalNetworkInjection_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExternalNetworkInjection, setting " + attrName  + " to: "  + value);
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
			for (ExternalNetworkInjection_primitive_builder attrEnum: ExternalNetworkInjection_primitive_builder.values()) {
				BaseClass bc = ExternalNetworkInjection_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExternalNetworkInjection." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExternalNetworkInjection_class_attributes_enum attrEnum: ExternalNetworkInjection_class_attributes_enum.values()) {
				BaseClass bc = ExternalNetworkInjection_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExternalNetworkInjection." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExternalNetworkInjection) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExternalNetworkInjection";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExternalNetworkInjection();
        }
};
