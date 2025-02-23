package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Simple_Float;
import cim4j.WindLookupTableFunctionKind;
import cim4j.Integer;


import cim4j.WindContCurrLimIEC;
import cim4j.WindContPType3IEC;
import cim4j.WindContRotorRIEC;
import cim4j.WindPlantFreqPcontrolIEC;

/*
The class models a look up table for the purpose of wind standard models.
*/
public class WindDynamicsLookupTable extends IdentifiedObject
{
	private BaseClass[] WindDynamicsLookupTable_class_attributes;
	private BaseClass[] WindDynamicsLookupTable_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum WindDynamicsLookupTable_primitive_builder implements PrimitiveBuilder {
		input(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		lookupTableFunctionType(){
			public BaseClass construct (java.lang.String value) {
				return new WindLookupTableFunctionKind(value);
			}
		},
		output(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		sequence(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum WindDynamicsLookupTable_class_attributes_enum {
		WindContCurrLimIEC,
		WindContPType3IEC,
		WindContRotorRIEC,
		input,
		lookupTableFunctionType,
		output,
		sequence,
		WindPlantFreqPcontrolIEC,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
	
	public WindDynamicsLookupTable() {
		WindDynamicsLookupTable_primitive_attributes = new BaseClass[WindDynamicsLookupTable_primitive_builder.values().length];
		WindDynamicsLookupTable_class_attributes = new BaseClass[WindDynamicsLookupTable_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(WindDynamicsLookupTable_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindDynamicsLookupTable_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(WindDynamicsLookupTable_primitive_builder attrEnum, BaseClass value) {
		try {
			WindDynamicsLookupTable_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindDynamicsLookupTable_class_attributes_enum attrEnum = WindDynamicsLookupTable_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated WindDynamicsLookupTable, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindDynamicsLookupTable_primitive_builder attrEnum = WindDynamicsLookupTable_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated WindDynamicsLookupTable, setting " + attrName  + " to: "  + value);
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
			for (WindDynamicsLookupTable_primitive_builder attrEnum: WindDynamicsLookupTable_primitive_builder.values()) {
				BaseClass bc = WindDynamicsLookupTable_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindDynamicsLookupTable." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindDynamicsLookupTable_class_attributes_enum attrEnum: WindDynamicsLookupTable_class_attributes_enum.values()) {
				BaseClass bc = WindDynamicsLookupTable_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindDynamicsLookupTable." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(WindDynamicsLookupTable) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "WindDynamicsLookupTable";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindDynamicsLookupTable();
        }
};
