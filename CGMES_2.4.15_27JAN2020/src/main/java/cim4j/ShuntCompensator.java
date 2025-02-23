package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.RegulatingCondEq;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Seconds;
import cim4j.Boolean;
import cim4j.Integer;
import cim4j.Voltage;
import cim4j.Simple_Float;


import cim4j.DateTime;
import cim4j.VoltagePerReactivePower;
import cim4j.SvShuntCompensatorSections;

/*
A shunt capacitor or reactor or switchable bank of shunt capacitors or reactors. A section of a shunt compensator is an individual capacitor or reactor.  A negative value for reactivePerSection indicates that the compensator is a reactor. ShuntCompensator is a single terminal device.  Ground is implied.
*/
public class ShuntCompensator extends RegulatingCondEq
{
	private BaseClass[] ShuntCompensator_class_attributes;
	private BaseClass[] ShuntCompensator_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ShuntCompensator_primitive_builder implements PrimitiveBuilder {
		aVRDelay(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		grounded(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		maximumSections(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
		nomU(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
		normalSections(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
		switchOnCount(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
		sections(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ShuntCompensator_class_attributes_enum {
		aVRDelay,
		grounded,
		maximumSections,
		nomU,
		normalSections,
		switchOnCount,
		switchOnDate,
		voltageSensitivity,
		sections,
		SvShuntCompensatorSections,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
	
	public ShuntCompensator() {
		ShuntCompensator_primitive_attributes = new BaseClass[ShuntCompensator_primitive_builder.values().length];
		ShuntCompensator_class_attributes = new BaseClass[ShuntCompensator_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ShuntCompensator_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ShuntCompensator_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ShuntCompensator_primitive_builder attrEnum, BaseClass value) {
		try {
			ShuntCompensator_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ShuntCompensator_class_attributes_enum attrEnum = ShuntCompensator_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ShuntCompensator, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ShuntCompensator_primitive_builder attrEnum = ShuntCompensator_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ShuntCompensator, setting " + attrName  + " to: "  + value);
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
			for (ShuntCompensator_primitive_builder attrEnum: ShuntCompensator_primitive_builder.values()) {
				BaseClass bc = ShuntCompensator_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ShuntCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ShuntCompensator_class_attributes_enum attrEnum: ShuntCompensator_class_attributes_enum.values()) {
				BaseClass bc = ShuntCompensator_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ShuntCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ShuntCompensator) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ShuntCompensator";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ShuntCompensator();
        }
};
