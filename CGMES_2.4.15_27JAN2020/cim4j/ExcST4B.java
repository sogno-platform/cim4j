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
import cim4j.Boolean;



/*
Modified IEEE ST4B static excitation system with maximum inner loop feedback gain .
*/
public class ExcST4B extends ExcitationSystemDynamics
{
	private BaseClass[] ExcST4B_class_attributes;
	private BaseClass[] ExcST4B_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcST4B_primitive_builder implements PrimitiveBuilder {
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
		vgmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		uel(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		lvgate(){
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

	private enum ExcST4B_class_attributes_enum {
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
		vgmax,
		uel,
		lvgate,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcST4B() {
		ExcST4B_primitive_attributes = new BaseClass[ExcST4B_primitive_builder.values().length];
		ExcST4B_class_attributes = new BaseClass[ExcST4B_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcST4B_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcST4B_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcST4B_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcST4B_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcST4B_class_attributes_enum attrEnum = ExcST4B_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcST4B, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcST4B_primitive_builder attrEnum = ExcST4B_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcST4B, setting " + attrName  + " to: "  + value);
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
			for (ExcST4B_primitive_builder attrEnum: ExcST4B_primitive_builder.values()) {
				BaseClass bc = ExcST4B_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcST4B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcST4B_class_attributes_enum attrEnum: ExcST4B_class_attributes_enum.values()) {
				BaseClass bc = ExcST4B_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcST4B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcST4B) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcST4B";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcST4B();
        }
};
