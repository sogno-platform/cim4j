package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ConnectivityNodeContainer;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.EquivalentEquipment;

/*
A class that represents an external meshed network that has been reduced to an electrically equivalent model. The ConnectivityNodes contained in the equivalent are intended to reflect internal nodes of the equivalent. The boundary Connectivity nodes where the equivalent connects outside itself are NOT contained by the equivalent.
*/
public class EquivalentNetwork extends ConnectivityNodeContainer
{
	private BaseClass[] EquivalentNetwork_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum EquivalentNetwork_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
	
	public EquivalentNetwork() {
		EquivalentNetwork_attributes = new BaseClass[EquivalentNetwork_primitive_builder.values().length];
	}

	public void updateAttributeInArray(EquivalentNetwork_primitive_builder attrEnum, BaseClass value) {
		try {
			EquivalentNetwork_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//EquivalentNetwork_ATTR_ENUM attrEnum = EquivalentNetwork_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			EquivalentNetwork_primitive_builder attrEnum = EquivalentNetwork_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (EquivalentNetwork_primitive_builder attrEnum: EquivalentNetwork_primitive_builder.values()) {
			BaseClass bc = EquivalentNetwork_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "EquivalentNetwork";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new EquivalentNetwork();
        }
};
