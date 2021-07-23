package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Integer;
import cim4j.Resistance;
import cim4j.Boolean;
import cim4j.Reactance;


import cim4j.BaseVoltage;
import cim4j.Terminal;
import cim4j.PhaseTapChanger;
import cim4j.RatioTapChanger;

/*
A conducting connection point of a power transformer. It corresponds to a physical transformer winding terminal.  In earlier CIM versions, the TransformerWinding class served a similar purpose, but this class is more flexible because it associates to terminal but is not a specialization of ConductingEquipment.
*/
public class TransformerEnd extends IdentifiedObject
{
	private BaseClass[] TransformerEnd_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum TransformerEnd_primitive_builder implements PrimitiveBuilder {
			endNumber(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
			rground(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
			grounded(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			xground(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
	
	public TransformerEnd() {
		TransformerEnd_attributes = new BaseClass[TransformerEnd_primitive_builder.values().length];
	}

	public void updateAttributeInArray(TransformerEnd_primitive_builder attrEnum, BaseClass value) {
		try {
			TransformerEnd_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//TransformerEnd_ATTR_ENUM attrEnum = TransformerEnd_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			TransformerEnd_primitive_builder attrEnum = TransformerEnd_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (TransformerEnd_primitive_builder attrEnum: TransformerEnd_primitive_builder.values()) {
			BaseClass bc = TransformerEnd_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "TransformerEnd";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new TransformerEnd();
        }
};
