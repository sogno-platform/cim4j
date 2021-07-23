package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Integer;
import cim4j.Boolean;
import cim4j.Simple_Float;


import cim4j.WindPlantUserDefined;
import cim4j.WindType1or2UserDefined;
import cim4j.WindType3or4UserDefined;
import cim4j.SynchronousMachineUserDefined;
import cim4j.AsynchronousMachineUserDefined;
import cim4j.TurbineGovernorUserDefined;
import cim4j.TurbineLoadControllerUserDefined;
import cim4j.MechanicalLoadUserDefined;
import cim4j.ExcitationSystemUserDefined;
import cim4j.OverexcitationLimiterUserDefined;
import cim4j.UnderexcitationLimiterUserDefined;
import cim4j.PowerSystemStabilizerUserDefined;
import cim4j.DiscontinuousExcitationControlUserDefined;
import cim4j.PFVArControllerType1UserDefined;
import cim4j.VoltageAdjusterUserDefined;
import cim4j.PFVArControllerType2UserDefined;
import cim4j.VoltageCompensatorUserDefined;
import cim4j.LoadUserDefined;

/*
Supports definition of one or more parameters of several different datatypes for use by proprietary user-defined models.  NOTE: This class does not inherit from IdentifiedObject since it is not intended that a single instance of it be referenced by more than one proprietary user-defined model instance.
*/
public class ProprietaryParameterDynamics extends BaseClass
{
	private BaseClass[] ProprietaryParameterDynamics_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ProprietaryParameterDynamics_primitive_builder implements PrimitiveBuilder {
			parameterNumber(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
			booleanParameterValue(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			integerParameterValue(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
			floatParameterValue(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ProprietaryParameterDynamics() {
		ProprietaryParameterDynamics_attributes = new BaseClass[ProprietaryParameterDynamics_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ProprietaryParameterDynamics_primitive_builder attrEnum, BaseClass value) {
		try {
			ProprietaryParameterDynamics_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ProprietaryParameterDynamics_ATTR_ENUM attrEnum = ProprietaryParameterDynamics_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ProprietaryParameterDynamics_primitive_builder attrEnum = ProprietaryParameterDynamics_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ProprietaryParameterDynamics_primitive_builder attrEnum: ProprietaryParameterDynamics_primitive_builder.values()) {
			BaseClass bc = ProprietaryParameterDynamics_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ProprietaryParameterDynamics";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ProprietaryParameterDynamics();
        }
};
