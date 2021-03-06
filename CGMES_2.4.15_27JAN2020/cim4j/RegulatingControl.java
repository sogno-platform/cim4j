package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PowerSystemResource;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.RegulatingControlModeKind;
import cim4j.Boolean;
import cim4j.Simple_Float;
import cim4j.UnitMultiplier;


import cim4j.Terminal;
import cim4j.RegulatingCondEq;
import cim4j.RegulationSchedule;

/*
Specifies a set of equipment that works together to control a power system quantity such as voltage or flow.  Remote bus voltage control is possible by specifying the controlled terminal located at some place remote from the controlling equipment. In case multiple equipment, possibly of different types, control same terminal there must be only one RegulatingControl at that terminal. The most specific subtype of RegulatingControl shall be used in case such equipment participate in the control, e.g. TapChangerControl for tap changers. For flow control  load sign convention is used, i.e. positive sign means flow out from a TopologicalNode (bus) into the conducting equipment.
*/
public class RegulatingControl extends PowerSystemResource
{
	private BaseClass[] RegulatingControl_class_attributes;
	private BaseClass[] RegulatingControl_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum RegulatingControl_primitive_builder implements PrimitiveBuilder {
		mode(){
			public BaseClass construct (java.lang.String value) {
				return new RegulatingControlModeKind(value);
			}
		},
		discrete(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		enabled(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		targetDeadband(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		targetValue(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		targetValueUnitMultiplier(){
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

	private enum RegulatingControl_class_attributes_enum {
		Terminal,
		RegulatingCondEq,
		mode,
		RegulationSchedule,
		discrete,
		enabled,
		targetDeadband,
		targetValue,
		targetValueUnitMultiplier,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
	
	public RegulatingControl() {
		RegulatingControl_primitive_attributes = new BaseClass[RegulatingControl_primitive_builder.values().length];
		RegulatingControl_class_attributes = new BaseClass[RegulatingControl_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(RegulatingControl_class_attributes_enum attrEnum, BaseClass value) {
		try {
			RegulatingControl_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(RegulatingControl_primitive_builder attrEnum, BaseClass value) {
		try {
			RegulatingControl_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			RegulatingControl_class_attributes_enum attrEnum = RegulatingControl_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated RegulatingControl, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			RegulatingControl_primitive_builder attrEnum = RegulatingControl_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated RegulatingControl, setting " + attrName  + " to: "  + value);
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
			for (RegulatingControl_primitive_builder attrEnum: RegulatingControl_primitive_builder.values()) {
				BaseClass bc = RegulatingControl_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RegulatingControl." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (RegulatingControl_class_attributes_enum attrEnum: RegulatingControl_class_attributes_enum.values()) {
				BaseClass bc = RegulatingControl_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RegulatingControl." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(RegulatingControl) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "RegulatingControl";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new RegulatingControl();
        }
};
