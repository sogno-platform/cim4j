package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.DiscontinuousExcitationControlDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;


import cim4j.ProprietaryParameterDynamics;

/*
Discontinuous excitation control function block whose dynamic behaviour is described by
*/
public class DiscontinuousExcitationControlUserDefined extends DiscontinuousExcitationControlDynamics
{
	private BaseClass[] DiscontinuousExcitationControlUserDefined_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum DiscontinuousExcitationControlUserDefined_primitive_builder implements PrimitiveBuilder {
			proprietary(){
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

		
		
	
	public DiscontinuousExcitationControlUserDefined() {
		DiscontinuousExcitationControlUserDefined_attributes = new BaseClass[DiscontinuousExcitationControlUserDefined_primitive_builder.values().length];
	}

	public void updateAttributeInArray(DiscontinuousExcitationControlUserDefined_primitive_builder attrEnum, BaseClass value) {
		try {
			DiscontinuousExcitationControlUserDefined_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//DiscontinuousExcitationControlUserDefined_ATTR_ENUM attrEnum = DiscontinuousExcitationControlUserDefined_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DiscontinuousExcitationControlUserDefined_primitive_builder attrEnum = DiscontinuousExcitationControlUserDefined_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (DiscontinuousExcitationControlUserDefined_primitive_builder attrEnum: DiscontinuousExcitationControlUserDefined_primitive_builder.values()) {
			BaseClass bc = DiscontinuousExcitationControlUserDefined_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "DiscontinuousExcitationControlUserDefined";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DiscontinuousExcitationControlUserDefined();
        }
};
