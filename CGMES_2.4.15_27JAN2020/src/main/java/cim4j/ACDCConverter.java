package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ConductingEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ApparentPower;
import cim4j.ActivePower;
import cim4j.Voltage;
import cim4j.Integer;
import cim4j.Resistance;
import cim4j.ReactivePower;
import cim4j.CurrentFlow;


import cim4j.ActivePowerPerCurrentFlow;
import cim4j.ACDCConverterDCTerminal;
import cim4j.Terminal;

/*
A unit with valves for three phases, together with unit control equipment, essential protective and switching devices, DC storage capacitors, phase reactors and auxiliaries, if any, used for conversion.
*/
public class ACDCConverter extends ConductingEquipment
{
	private BaseClass[] ACDCConverter_class_attributes;
	private BaseClass[] ACDCConverter_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ACDCConverter_primitive_builder implements PrimitiveBuilder {
		baseS(){
			public BaseClass construct (java.lang.String value) {
				return new ApparentPower(value);
			}
		},
		idleLoss(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		maxUdc(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
		minUdc(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
		numberOfValves(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
		ratedUdc(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
		resistiveLoss(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
		valveU0(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
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
		targetPpcc(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		targetUdc(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
		idc(){
			public BaseClass construct (java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
		poleLossP(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		uc(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
		udc(){
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

	private enum ACDCConverter_class_attributes_enum {
		baseS,
		idleLoss,
		maxUdc,
		minUdc,
		numberOfValves,
		ratedUdc,
		resistiveLoss,
		switchingLoss,
		valveU0,
		DCTerminals,
		PccTerminal,
		p,
		q,
		targetPpcc,
		targetUdc,
		idc,
		poleLossP,
		uc,
		udc,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ACDCConverter() {
		ACDCConverter_primitive_attributes = new BaseClass[ACDCConverter_primitive_builder.values().length];
		ACDCConverter_class_attributes = new BaseClass[ACDCConverter_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ACDCConverter_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ACDCConverter_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ACDCConverter_primitive_builder attrEnum, BaseClass value) {
		try {
			ACDCConverter_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ACDCConverter_class_attributes_enum attrEnum = ACDCConverter_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ACDCConverter, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ACDCConverter_primitive_builder attrEnum = ACDCConverter_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ACDCConverter, setting " + attrName  + " to: "  + value);
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
			for (ACDCConverter_primitive_builder attrEnum: ACDCConverter_primitive_builder.values()) {
				BaseClass bc = ACDCConverter_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ACDCConverter." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ACDCConverter_class_attributes_enum attrEnum: ACDCConverter_class_attributes_enum.values()) {
				BaseClass bc = ACDCConverter_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ACDCConverter." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ACDCConverter) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ACDCConverter";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ACDCConverter();
        }
};
