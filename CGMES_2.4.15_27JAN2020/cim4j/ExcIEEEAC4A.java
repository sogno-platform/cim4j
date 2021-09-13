package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;



/*
The class represents IEEE Std 421.5-2005 type AC4A model. The model represents type AC4A alternator-supplied controlled-rectifier excitation system which is quite different from the other type ac systems. This high initial response excitation system utilizes a full thyristor bridge in the exciter output circuit.  The voltage regulator controls the firing of the thyristor bridges. The exciter alternator uses an independent voltage regulator to control its output voltage to a constant value. These effects are not modeled; however, transient loading effects on the exciter alternator are included.   Reference: IEEE Standard 421.5-2005 Section 6.4.
*/
public class ExcIEEEAC4A extends ExcitationSystemDynamics
{
	private BaseClass[] ExcIEEEAC4A_class_attributes;
	private BaseClass[] ExcIEEEAC4A_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcIEEEAC4A_primitive_builder implements PrimitiveBuilder {
		vimax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vimin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tb(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		ka(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ta(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		vrmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vrmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kc(){
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

	private enum ExcIEEEAC4A_class_attributes_enum {
		vimax,
		vimin,
		tc,
		tb,
		ka,
		ta,
		vrmax,
		vrmin,
		kc,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
	
	public ExcIEEEAC4A() {
		ExcIEEEAC4A_primitive_attributes = new BaseClass[ExcIEEEAC4A_primitive_builder.values().length];
		ExcIEEEAC4A_class_attributes = new BaseClass[ExcIEEEAC4A_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcIEEEAC4A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcIEEEAC4A_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcIEEEAC4A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEAC4A_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcIEEEAC4A_class_attributes_enum attrEnum = ExcIEEEAC4A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcIEEEAC4A, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEAC4A_primitive_builder attrEnum = ExcIEEEAC4A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcIEEEAC4A, setting " + attrName  + " to: "  + value);
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
			for (ExcIEEEAC4A_primitive_builder attrEnum: ExcIEEEAC4A_primitive_builder.values()) {
				BaseClass bc = ExcIEEEAC4A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEAC4A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcIEEEAC4A_class_attributes_enum attrEnum: ExcIEEEAC4A_class_attributes_enum.values()) {
				BaseClass bc = ExcIEEEAC4A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEAC4A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcIEEEAC4A) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcIEEEAC4A";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcIEEEAC4A();
        }
};
