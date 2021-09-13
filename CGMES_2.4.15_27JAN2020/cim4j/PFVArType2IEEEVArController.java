package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PFVArControllerType2Dynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Simple_Float;
import cim4j.Boolean;



/*
The class represents IEEE VAR Controller Type 2 which is a summing point type controller. It makes up the outside loop of a two-loop system. This controller is implemented as a slow PI type controller, and the voltage regulator forms the inner loop and is implemented as a fast controller.  Reference: IEEE Standard 421.5-2005 Section 11.5.
*/
public class PFVArType2IEEEVArController extends PFVArControllerType2Dynamics
{
	private BaseClass[] PFVArType2IEEEVArController_class_attributes;
	private BaseClass[] PFVArType2IEEEVArController_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PFVArType2IEEEVArController_primitive_builder implements PrimitiveBuilder {
		qref(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vref(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vclmt(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ki(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vs(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		exlon(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum PFVArType2IEEEVArController_class_attributes_enum {
		qref,
		vref,
		vclmt,
		kp,
		ki,
		vs,
		exlon,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
	
	public PFVArType2IEEEVArController() {
		PFVArType2IEEEVArController_primitive_attributes = new BaseClass[PFVArType2IEEEVArController_primitive_builder.values().length];
		PFVArType2IEEEVArController_class_attributes = new BaseClass[PFVArType2IEEEVArController_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PFVArType2IEEEVArController_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PFVArType2IEEEVArController_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PFVArType2IEEEVArController_primitive_builder attrEnum, BaseClass value) {
		try {
			PFVArType2IEEEVArController_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PFVArType2IEEEVArController_class_attributes_enum attrEnum = PFVArType2IEEEVArController_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PFVArType2IEEEVArController, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PFVArType2IEEEVArController_primitive_builder attrEnum = PFVArType2IEEEVArController_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PFVArType2IEEEVArController, setting " + attrName  + " to: "  + value);
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
			for (PFVArType2IEEEVArController_primitive_builder attrEnum: PFVArType2IEEEVArController_primitive_builder.values()) {
				BaseClass bc = PFVArType2IEEEVArController_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PFVArType2IEEEVArController." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PFVArType2IEEEVArController_class_attributes_enum attrEnum: PFVArType2IEEEVArController_class_attributes_enum.values()) {
				BaseClass bc = PFVArType2IEEEVArController_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PFVArType2IEEEVArController." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PFVArType2IEEEVArController) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PFVArType2IEEEVArController";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PFVArType2IEEEVArController();
        }
};
