package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.SynchronousMachineDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;





/*
The simplified model represents a synchronous generator as a constant internal voltage behind an impedance ( + ) as shown in the Simplified diagram.  Since internal voltage is held constant, there is no  input and any excitation system model will be ignored.  There is also no  output.  This model should not be used for representing a real generator except, perhaps, small generators whose response is insignificant.    The parameters used for the Simplified model include:
*/
public class SynchronousMachineSimplified extends SynchronousMachineDynamics
{
	private BaseClass[] SynchronousMachineSimplified_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum SynchronousMachineSimplified_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	
	public SynchronousMachineSimplified() {
		SynchronousMachineSimplified_attributes = new BaseClass[SynchronousMachineSimplified_primitive_builder.values().length];
	}

	public void updateAttributeInArray(SynchronousMachineSimplified_primitive_builder attrEnum, BaseClass value) {
		try {
			SynchronousMachineSimplified_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//SynchronousMachineSimplified_ATTR_ENUM attrEnum = SynchronousMachineSimplified_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SynchronousMachineSimplified_primitive_builder attrEnum = SynchronousMachineSimplified_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (SynchronousMachineSimplified_primitive_builder attrEnum: SynchronousMachineSimplified_primitive_builder.values()) {
			BaseClass bc = SynchronousMachineSimplified_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "SynchronousMachineSimplified";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new SynchronousMachineSimplified();
        }
};
