package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TurbineGovernorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;
import cim4j.Simple_Float;
import cim4j.Temperature;



/*
Generic turbogas with acceleration and temperature controller.
*/
public class GovGAST3 extends TurbineGovernorDynamics
{
	private BaseClass[] GovGAST3_class_attributes;
	private BaseClass[] GovGAST3_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GovGAST3_primitive_builder implements PrimitiveBuilder {
		bp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tg(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		rcmx(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		rcmn(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ky(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ty(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tac(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		kac(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		tc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		bca(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kca(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		dtc(){
			public BaseClass construct (java.lang.String value) {
				return new Temperature(value);
			}
		},
		ka(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tsi(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		ksi(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ttc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tfen(){
			public BaseClass construct (java.lang.String value) {
				return new Temperature(value);
			}
		},
		td(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tt(){
			public BaseClass construct (java.lang.String value) {
				return new Temperature(value);
			}
		},
		mxef(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		mnef(){
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

	private enum GovGAST3_class_attributes_enum {
		bp,
		tg,
		rcmx,
		rcmn,
		ky,
		ty,
		tac,
		kac,
		tc,
		bca,
		kca,
		dtc,
		ka,
		tsi,
		ksi,
		ttc,
		tfen,
		td,
		tt,
		mxef,
		mnef,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovGAST3() {
		GovGAST3_primitive_attributes = new BaseClass[GovGAST3_primitive_builder.values().length];
		GovGAST3_class_attributes = new BaseClass[GovGAST3_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovGAST3_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovGAST3_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovGAST3_primitive_builder attrEnum, BaseClass value) {
		try {
			GovGAST3_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovGAST3_class_attributes_enum attrEnum = GovGAST3_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovGAST3, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovGAST3_primitive_builder attrEnum = GovGAST3_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GovGAST3, setting " + attrName  + " to: "  + value);
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
			for (GovGAST3_primitive_builder attrEnum: GovGAST3_primitive_builder.values()) {
				BaseClass bc = GovGAST3_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovGAST3." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovGAST3_class_attributes_enum attrEnum: GovGAST3_class_attributes_enum.values()) {
				BaseClass bc = GovGAST3_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovGAST3." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovGAST3) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GovGAST3";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovGAST3();
        }
};
