package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.PU;
import cim4j.Seconds;


import cim4j.LoadAggregate;

/*
Aggregate induction motor load. This model  is used to represent a fraction of an ordinary load as "induction motor load".  It allows load that is treated as ordinary constant power in power flow analysis to be represented by an induction motor in dynamic simulation.  If  = 0. or  = , or  = 0.,  only one cage is represented. Magnetic saturation is not modelled. Either a "one-cage" or "two-cage" model of the induction machine can be modelled. Magnetic saturation is not modelled.  This model is intended for representation of aggregations of many motors dispersed through a load represented at a high voltage bus but where there is no information on the characteristics of individual motors.  This model treats a fraction of the constant power part of a load as a motor. During initialisation, the initial power drawn by the motor is set equal to  times the constant  part of the static load.  The remainder of the load is left as static load.  The reactive power demand of the motor is calculated during initialisation as a function of voltage at the load bus. This reactive power demand may be less than or greater than the constant  component of the load.  If the motor's reactive demand is greater than the constant  component of the load, the model inserts a shunt capacitor at the terminal of the motor to bring its reactive demand down to equal the constant  reactive load.   If a motor model and a static load model are both present for a load, the motor  is assumed to be subtracted from the power flow constant  load before the static load model is applied.  The remainder of the load, if any, is then represented by the static load model.
*/
public class LoadMotor extends IdentifiedObject
{
	private BaseClass[] LoadMotor_class_attributes;
	private BaseClass[] LoadMotor_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum LoadMotor_primitive_builder implements PrimitiveBuilder {
		pfrac(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		lfac(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ls(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		lp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		lpp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ra(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tpo(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tppo(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		h(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		d(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		vt(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tv(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tbkr(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum LoadMotor_class_attributes_enum {
		LoadAggregate,
		pfrac,
		lfac,
		ls,
		lp,
		lpp,
		ra,
		tpo,
		tppo,
		h,
		d,
		vt,
		tv,
		tbkr,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public LoadMotor() {
		LoadMotor_primitive_attributes = new BaseClass[LoadMotor_primitive_builder.values().length];
		LoadMotor_class_attributes = new BaseClass[LoadMotor_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(LoadMotor_class_attributes_enum attrEnum, BaseClass value) {
		try {
			LoadMotor_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(LoadMotor_primitive_builder attrEnum, BaseClass value) {
		try {
			LoadMotor_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			LoadMotor_class_attributes_enum attrEnum = LoadMotor_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated LoadMotor, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			LoadMotor_primitive_builder attrEnum = LoadMotor_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated LoadMotor, setting " + attrName  + " to: "  + value);
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
			for (LoadMotor_primitive_builder attrEnum: LoadMotor_primitive_builder.values()) {
				BaseClass bc = LoadMotor_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LoadMotor." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (LoadMotor_class_attributes_enum attrEnum: LoadMotor_class_attributes_enum.values()) {
				BaseClass bc = LoadMotor_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LoadMotor." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(LoadMotor) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "LoadMotor";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new LoadMotor();
        }
};
