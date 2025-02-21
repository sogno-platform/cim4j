package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PFVArControllerType1Dynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;
import cim4j.Seconds;
import cim4j.PU;
import cim4j.Simple_Float;



/*
The class represents IEEE PF Controller Type 1 which operates by moving the voltage reference directly.  Reference: IEEE Standard 421.5-2005 Section 11.2.
*/
public class PFVArType1IEEEPFController extends PFVArControllerType1Dynamics
{
	private BaseClass[] PFVArType1IEEEPFController_class_attributes;
	private BaseClass[] PFVArType1IEEEPFController_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PFVArType1IEEEPFController_primitive_builder implements PrimitiveBuilder {
		ovex(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		tpfc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		vitmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vpf(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vpfcbw(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		vpfref(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vvtmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vvtmin(){
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

	private enum PFVArType1IEEEPFController_class_attributes_enum {
		ovex,
		tpfc,
		vitmin,
		vpf,
		vpfcbw,
		vpfref,
		vvtmax,
		vvtmin,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
	
	public PFVArType1IEEEPFController() {
		PFVArType1IEEEPFController_primitive_attributes = new BaseClass[PFVArType1IEEEPFController_primitive_builder.values().length];
		PFVArType1IEEEPFController_class_attributes = new BaseClass[PFVArType1IEEEPFController_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PFVArType1IEEEPFController_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PFVArType1IEEEPFController_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PFVArType1IEEEPFController_primitive_builder attrEnum, BaseClass value) {
		try {
			PFVArType1IEEEPFController_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PFVArType1IEEEPFController_class_attributes_enum attrEnum = PFVArType1IEEEPFController_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PFVArType1IEEEPFController, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PFVArType1IEEEPFController_primitive_builder attrEnum = PFVArType1IEEEPFController_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PFVArType1IEEEPFController, setting " + attrName  + " to: "  + value);
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
			for (PFVArType1IEEEPFController_primitive_builder attrEnum: PFVArType1IEEEPFController_primitive_builder.values()) {
				BaseClass bc = PFVArType1IEEEPFController_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PFVArType1IEEEPFController." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PFVArType1IEEEPFController_class_attributes_enum attrEnum: PFVArType1IEEEPFController_class_attributes_enum.values()) {
				BaseClass bc = PFVArType1IEEEPFController_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PFVArType1IEEEPFController." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PFVArType1IEEEPFController) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PFVArType1IEEEPFController";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PFVArType1IEEEPFController();
        }
};
