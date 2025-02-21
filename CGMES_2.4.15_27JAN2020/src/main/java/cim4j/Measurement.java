package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PhaseCode;
import cim4j.UnitSymbol;
import cim4j.UnitMultiplier;


import cim4j.ACDCTerminal;
import cim4j.PowerSystemResource;

/*
A Measurement represents any measured, calculated or non-measured non-calculated quantity. Any piece of equipment may contain Measurements, e.g. a substation may have temperature measurements and door open indications, a transformer may have oil temperature and tank pressure measurements, a bay may contain a number of power flow measurements and a Breaker may contain a switch status measurement.  The PSR - Measurement association is intended to capture this use of Measurement and is included in the naming hierarchy based on EquipmentContainer. The naming hierarchy typically has Measurements as leafs, e.g. Substation-VoltageLevel-Bay-Switch-Measurement. Some Measurements represent quantities related to a particular sensor location in the network, e.g. a voltage transformer (PT) at a busbar or a current transformer (CT) at the bar between a breaker and an isolator. The sensing position is not captured in the PSR - Measurement association. Instead it is captured by the Measurement - Terminal association that is used to define the sensing location in the network topology. The location is defined by the connection of the Terminal to ConductingEquipment.  If both a Terminal and PSR are associated, and the PSR is of type ConductingEquipment, the associated Terminal should belong to that ConductingEquipment instance. When the sensor location is needed both Measurement-PSR and Measurement-Terminal are used. The Measurement-Terminal association is never used alone.
*/
public class Measurement extends IdentifiedObject
{
	private BaseClass[] Measurement_class_attributes;
	private BaseClass[] Measurement_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Measurement_primitive_builder implements PrimitiveBuilder {
		measurementType(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		phases(){
			public BaseClass construct (java.lang.String value) {
				return new PhaseCode(value);
			}
		},
		unitSymbol(){
			public BaseClass construct (java.lang.String value) {
				return new UnitSymbol(value);
			}
		},
		unitMultiplier(){
			public BaseClass construct (java.lang.String value) {
				return new UnitMultiplier(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum Measurement_class_attributes_enum {
		measurementType,
		phases,
		unitSymbol,
		unitMultiplier,
		Terminal,
		PowerSystemResource,
			LAST_ENUM;
	}

		
		
		
		
		
		
	
	public Measurement() {
		Measurement_primitive_attributes = new BaseClass[Measurement_primitive_builder.values().length];
		Measurement_class_attributes = new BaseClass[Measurement_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Measurement_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Measurement_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Measurement_primitive_builder attrEnum, BaseClass value) {
		try {
			Measurement_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Measurement_class_attributes_enum attrEnum = Measurement_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Measurement, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Measurement_primitive_builder attrEnum = Measurement_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Measurement, setting " + attrName  + " to: "  + value);
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
			for (Measurement_primitive_builder attrEnum: Measurement_primitive_builder.values()) {
				BaseClass bc = Measurement_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Measurement." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Measurement_class_attributes_enum attrEnum: Measurement_class_attributes_enum.values()) {
				BaseClass bc = Measurement_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Measurement." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Measurement) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Measurement";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Measurement();
        }
};
