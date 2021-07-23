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
	private BaseClass[] IdentifiedObject_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
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

		
		
		
		
		
		
	
	public IdentifiedObject() {
		IdentifiedObject_attributes = new BaseClass[IdentifiedObject_primitive_builder.values().length];
	}

	public void updateAttributeInArray(IdentifiedObject_primitive_builder attrEnum, BaseClass value) {
		try {
			IdentifiedObject_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//IdentifiedObject_ATTR_ENUM attrEnum = IdentifiedObject_ATTR_BC_ENUM.valueOf(attrName);
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
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (IdentifiedObject_primitive_builder attrEnum: IdentifiedObject_primitive_builder.values()) {
			BaseClass bc = IdentifiedObject_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
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
