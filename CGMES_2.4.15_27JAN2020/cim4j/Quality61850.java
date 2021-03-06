package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;
import cim4j.Source;
import cim4j.Validity;



/*
Quality flags in this class are as defined in IEC 61850, except for estimatorReplaced, which has been included in this class for convenience.
*/
public class Quality61850 extends BaseClass
{
	private BaseClass[] Quality61850_class_attributes;
	private BaseClass[] Quality61850_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Quality61850_primitive_builder implements PrimitiveBuilder {
		badReference(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		estimatorReplaced(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		failure(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		oldData(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		operatorBlocked(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		oscillatory(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		outOfRange(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		overFlow(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		source(){
			public BaseClass construct (java.lang.String value) {
				return new Source(value);
			}
		},
		suspect(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		test(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		validity(){
			public BaseClass construct (java.lang.String value) {
				return new Validity(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum Quality61850_class_attributes_enum {
		badReference,
		estimatorReplaced,
		failure,
		oldData,
		operatorBlocked,
		oscillatory,
		outOfRange,
		overFlow,
		source,
		suspect,
		test,
		validity,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
	
	public Quality61850() {
		Quality61850_primitive_attributes = new BaseClass[Quality61850_primitive_builder.values().length];
		Quality61850_class_attributes = new BaseClass[Quality61850_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Quality61850_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Quality61850_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Quality61850_primitive_builder attrEnum, BaseClass value) {
		try {
			Quality61850_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Quality61850_class_attributes_enum attrEnum = Quality61850_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Quality61850, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Quality61850_primitive_builder attrEnum = Quality61850_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Quality61850, setting " + attrName  + " to: "  + value);
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
			for (Quality61850_primitive_builder attrEnum: Quality61850_primitive_builder.values()) {
				BaseClass bc = Quality61850_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Quality61850." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Quality61850_class_attributes_enum attrEnum: Quality61850_class_attributes_enum.values()) {
				BaseClass bc = Quality61850_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Quality61850." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Quality61850) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Quality61850";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Quality61850();
        }
};
