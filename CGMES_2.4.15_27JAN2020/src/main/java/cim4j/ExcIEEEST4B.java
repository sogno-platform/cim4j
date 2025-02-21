package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;
import cim4j.AngleDegrees;



/*
The class represents IEEE Std 421.5-2005 type ST4B model. This model is a variation of the Type ST3A model, with a proportional plus integral (PI) regulator block replacing the lag-lead regulator characteristic that is in the ST3A model. Both potential and compound source rectifier excitation systems are modeled.  The PI regulator blocks have non-windup limits that are represented. The voltage regulator of this model is typically implemented digitally.  Reference: IEEE Standard 421.5-2005 Section 7.4.
*/
public class ExcIEEEST4B extends ExcitationSystemDynamics
{
	private BaseClass[] ExcIEEEST4B_class_attributes;
	private BaseClass[] ExcIEEEST4B_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcIEEEST4B_primitive_builder implements PrimitiveBuilder {
		kpr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kir(){
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
		kpm(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kim(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vmmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vmmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kg(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		thetap(){
			public BaseClass construct (java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		ki(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		xl(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vbmax(){
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

	private enum ExcIEEEST4B_class_attributes_enum {
		kpr,
		kir,
		ta,
		vrmax,
		vrmin,
		kpm,
		kim,
		vmmax,
		vmmin,
		kg,
		kp,
		thetap,
		ki,
		kc,
		xl,
		vbmax,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcIEEEST4B() {
		ExcIEEEST4B_primitive_attributes = new BaseClass[ExcIEEEST4B_primitive_builder.values().length];
		ExcIEEEST4B_class_attributes = new BaseClass[ExcIEEEST4B_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcIEEEST4B_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcIEEEST4B_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcIEEEST4B_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEST4B_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcIEEEST4B_class_attributes_enum attrEnum = ExcIEEEST4B_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcIEEEST4B, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEST4B_primitive_builder attrEnum = ExcIEEEST4B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcIEEEST4B, setting " + attrName  + " to: "  + value);
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
			for (ExcIEEEST4B_primitive_builder attrEnum: ExcIEEEST4B_primitive_builder.values()) {
				BaseClass bc = ExcIEEEST4B_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEST4B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcIEEEST4B_class_attributes_enum attrEnum: ExcIEEEST4B_class_attributes_enum.values()) {
				BaseClass bc = ExcIEEEST4B_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcIEEEST4B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcIEEEST4B) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcIEEEST4B";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcIEEEST4B();
        }
};
