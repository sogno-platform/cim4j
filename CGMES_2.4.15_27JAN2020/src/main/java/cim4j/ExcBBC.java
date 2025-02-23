package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Seconds;
import cim4j.PU;
import cim4j.Boolean;



/*
Transformer fed static excitation system (static with ABB regulator). This model represents a static excitation system in which a gated thyristor bridge fed by a transformer at the main generator terminals feeds the main generator directly.
*/
public class ExcBBC extends ExcitationSystemDynamics
{
	private BaseClass[] ExcBBC_class_attributes;
	private BaseClass[] ExcBBC_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcBBC_primitive_builder implements PrimitiveBuilder {
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
		k(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vrmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vrmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		efdmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		efdmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		xe(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		_switch(){
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

	private enum ExcBBC_class_attributes_enum {
		t1,
		t2,
		t3,
		t4,
		k,
		vrmin,
		vrmax,
		efdmin,
		efdmax,
		xe,
		_switch,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
	
	public ExcBBC() {
		ExcBBC_primitive_attributes = new BaseClass[ExcBBC_primitive_builder.values().length];
		ExcBBC_class_attributes = new BaseClass[ExcBBC_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcBBC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcBBC_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcBBC_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcBBC_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcBBC_class_attributes_enum attrEnum = ExcBBC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcBBC, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcBBC_primitive_builder attrEnum = ExcBBC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcBBC, setting " + attrName  + " to: "  + value);
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
			for (ExcBBC_primitive_builder attrEnum: ExcBBC_primitive_builder.values()) {
				BaseClass bc = ExcBBC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcBBC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcBBC_class_attributes_enum attrEnum: ExcBBC_class_attributes_enum.values()) {
				BaseClass bc = ExcBBC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcBBC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcBBC) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcBBC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcBBC();
        }
};
