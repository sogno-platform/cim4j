package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ACDCTerminal;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PhaseCode;


import cim4j.ACDCConverter;
import cim4j.ConductingEquipment;
import cim4j.RegulatingControl;
import cim4j.TieFlow;
import cim4j.TransformerEnd;
import cim4j.ConnectivityNode;
import cim4j.MutualCoupling;
import cim4j.SvPowerFlow;
import cim4j.RemoteInputSignal;
import cim4j.TopologicalNode;

/*
An AC electrical connection point to a piece of conducting equipment. Terminals are connected at physical connection points called connectivity nodes.
*/
public class Terminal extends ACDCTerminal
{
	private BaseClass[] Terminal_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum Terminal_primitive_builder implements PrimitiveBuilder {
			phases(){
			public BaseClass construct (java.lang.String value) {
				return new PhaseCode(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
		
		
	
	public Terminal() {
		Terminal_attributes = new BaseClass[Terminal_primitive_builder.values().length];
	}

	public void updateAttributeInArray(Terminal_primitive_builder attrEnum, BaseClass value) {
		try {
			Terminal_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//Terminal_ATTR_ENUM attrEnum = Terminal_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Terminal_primitive_builder attrEnum = Terminal_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (Terminal_primitive_builder attrEnum: Terminal_primitive_builder.values()) {
			BaseClass bc = Terminal_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "Terminal";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Terminal();
        }
};
