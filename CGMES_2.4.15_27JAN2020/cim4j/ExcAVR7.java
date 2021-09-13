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
IVO excitation system.
*/
public class ExcAVR7 extends ExcitationSystemDynamics
{
	private BaseClass[] ExcAVR7_class_attributes;
	private BaseClass[] ExcAVR7_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcAVR7_primitive_builder implements PrimitiveBuilder {
		k1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		a1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		a2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		t1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		vmax1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vmin1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		k3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		a3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		a4(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		t3(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t4(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		vmax3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vmin3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		k5(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		a5(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		a6(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		t5(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t6(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		vmax5(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vmin5(){
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

	private enum ExcAVR7_class_attributes_enum {
		k1,
		a1,
		a2,
		t1,
		t2,
		vmax1,
		vmin1,
		k3,
		a3,
		a4,
		t3,
		t4,
		vmax3,
		vmin3,
		k5,
		a5,
		a6,
		t5,
		t6,
		vmax5,
		vmin5,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcAVR7() {
		ExcAVR7_primitive_attributes = new BaseClass[ExcAVR7_primitive_builder.values().length];
		ExcAVR7_class_attributes = new BaseClass[ExcAVR7_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcAVR7_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcAVR7_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcAVR7_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcAVR7_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcAVR7_class_attributes_enum attrEnum = ExcAVR7_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcAVR7, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcAVR7_primitive_builder attrEnum = ExcAVR7_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcAVR7, setting " + attrName  + " to: "  + value);
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
			for (ExcAVR7_primitive_builder attrEnum: ExcAVR7_primitive_builder.values()) {
				BaseClass bc = ExcAVR7_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAVR7." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcAVR7_class_attributes_enum attrEnum: ExcAVR7_class_attributes_enum.values()) {
				BaseClass bc = ExcAVR7_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAVR7." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcAVR7) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcAVR7";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcAVR7();
        }
};
