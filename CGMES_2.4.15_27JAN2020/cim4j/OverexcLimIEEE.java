package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.OverexcitationLimiterDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Simple_Float;



/*
The over excitation limiter model is intended to represent the significant features of OELs necessary for some large-scale system studies. It is the result of a pragmatic approach to obtain a model that can be widely applied with attainable data from generator owners. An attempt to include all variations in the functionality of OELs and duplicate how they interact with the rest of the excitation systems would likely result in a level of application insufficient for the studies for which they are intended.  Reference: IEEE OEL 421.5-2005 Section 9.
*/
public class OverexcLimIEEE extends OverexcitationLimiterDynamics
{
	private BaseClass[] OverexcLimIEEE_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum OverexcLimIEEE_primitive_builder implements PrimitiveBuilder {
			itfpu(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ifdmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ifdlim(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			hyst(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kcd(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kramp(){
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

		
		
		
		
		
		
	
	public OverexcLimIEEE() {
		OverexcLimIEEE_attributes = new BaseClass[OverexcLimIEEE_primitive_builder.values().length];
	}

	public void updateAttributeInArray(OverexcLimIEEE_primitive_builder attrEnum, BaseClass value) {
		try {
			OverexcLimIEEE_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//OverexcLimIEEE_ATTR_ENUM attrEnum = OverexcLimIEEE_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			OverexcLimIEEE_primitive_builder attrEnum = OverexcLimIEEE_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (OverexcLimIEEE_primitive_builder attrEnum: OverexcLimIEEE_primitive_builder.values()) {
			BaseClass bc = OverexcLimIEEE_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "OverexcLimIEEE";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new OverexcLimIEEE();
        }
};
