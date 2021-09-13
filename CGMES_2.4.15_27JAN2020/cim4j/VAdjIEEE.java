package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.VoltageAdjusterDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.PU;
import cim4j.Seconds;



/*
The class represents IEEE Voltage Adjuster which is used to represent the voltage adjuster in either a power factor or var control system.  Reference: IEEE Standard 421.5-2005 Section 11.1.
*/
public class VAdjIEEE extends VoltageAdjusterDynamics
{
	private BaseClass[] VAdjIEEE_class_attributes;
	private BaseClass[] VAdjIEEE_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum VAdjIEEE_primitive_builder implements PrimitiveBuilder {
		vadjf(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		adjslew(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		vadjmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vadjmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		taon(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		taoff(){
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

	private enum VAdjIEEE_class_attributes_enum {
		vadjf,
		adjslew,
		vadjmax,
		vadjmin,
		taon,
		taoff,
			LAST_ENUM;
	}

		
		
		
		
		
		
	
	public VAdjIEEE() {
		VAdjIEEE_primitive_attributes = new BaseClass[VAdjIEEE_primitive_builder.values().length];
		VAdjIEEE_class_attributes = new BaseClass[VAdjIEEE_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(VAdjIEEE_class_attributes_enum attrEnum, BaseClass value) {
		try {
			VAdjIEEE_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(VAdjIEEE_primitive_builder attrEnum, BaseClass value) {
		try {
			VAdjIEEE_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			VAdjIEEE_class_attributes_enum attrEnum = VAdjIEEE_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated VAdjIEEE, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			VAdjIEEE_primitive_builder attrEnum = VAdjIEEE_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated VAdjIEEE, setting " + attrName  + " to: "  + value);
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
			for (VAdjIEEE_primitive_builder attrEnum: VAdjIEEE_primitive_builder.values()) {
				BaseClass bc = VAdjIEEE_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    VAdjIEEE." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (VAdjIEEE_class_attributes_enum attrEnum: VAdjIEEE_class_attributes_enum.values()) {
				BaseClass bc = VAdjIEEE_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    VAdjIEEE." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(VAdjIEEE) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "VAdjIEEE";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new VAdjIEEE();
        }
};
