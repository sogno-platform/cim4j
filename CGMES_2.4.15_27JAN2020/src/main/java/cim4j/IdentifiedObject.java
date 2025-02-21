package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.DiagramObject;

/*
This is a root class to provide common identification for all classes needing identification and naming attributes.
*/
public class IdentifiedObject extends BaseClass
{
	private BaseClass[] IdentifiedObject_class_attributes;
	private BaseClass[] IdentifiedObject_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum IdentifiedObject_primitive_builder implements PrimitiveBuilder {
		mRID(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		name(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		description(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		energyIdentCodeEic(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		shortName(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum IdentifiedObject_class_attributes_enum {
		DiagramObjects,
		mRID,
		name,
		description,
		energyIdentCodeEic,
		shortName,
			LAST_ENUM;
	}

		
		
		
		
		
		
	
	public IdentifiedObject() {
		IdentifiedObject_primitive_attributes = new BaseClass[IdentifiedObject_primitive_builder.values().length];
		IdentifiedObject_class_attributes = new BaseClass[IdentifiedObject_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(IdentifiedObject_class_attributes_enum attrEnum, BaseClass value) {
		try {
			IdentifiedObject_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(IdentifiedObject_primitive_builder attrEnum, BaseClass value) {
		try {
			IdentifiedObject_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			IdentifiedObject_class_attributes_enum attrEnum = IdentifiedObject_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated IdentifiedObject, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			IdentifiedObject_primitive_builder attrEnum = IdentifiedObject_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated IdentifiedObject, setting " + attrName  + " to: "  + value);
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
			for (IdentifiedObject_primitive_builder attrEnum: IdentifiedObject_primitive_builder.values()) {
				BaseClass bc = IdentifiedObject_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    IdentifiedObject." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (IdentifiedObject_class_attributes_enum attrEnum: IdentifiedObject_class_attributes_enum.values()) {
				BaseClass bc = IdentifiedObject_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    IdentifiedObject." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(IdentifiedObject) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "IdentifiedObject";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new IdentifiedObject();
        }
};
