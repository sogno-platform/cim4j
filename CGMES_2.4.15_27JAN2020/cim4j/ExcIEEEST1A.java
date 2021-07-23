package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Boolean;
import cim4j.Seconds;
import cim4j.ExcIEEEST1AUELselectorKind;



/*
The class represents IEEE Std 421.5-2005 type ST1A model. This model represents systems in which excitation power is supplied through a transformer from the generator terminals (or the unit's auxiliary bus) and is regulated by a controlled rectifier.  The maximum exciter voltage available from such systems is directly related to the generator terminal voltage.  Reference: IEEE Standard 421.5-2005 Section 7.1.
*/
public class ExcIEEEST1A extends ExcitationSystemDynamics
{
	private BaseClass[] ExcIEEEST1A_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum ExcIEEEST1A_primitive_builder implements PrimitiveBuilder {
			ilr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			ka(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kf(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			klr(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			pssin(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			ta(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tb(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tb1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tc1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tf(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			uelin(){
			public BaseClass construct (java.lang.String value) {
				return new ExcIEEEST1AUELselectorKind(value);
			}
		},
			vamax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vamin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vimax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vimin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vrmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vrmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public ExcIEEEST1A() {
		ExcIEEEST1A_attributes = new BaseClass[ExcIEEEST1A_primitive_builder.values().length];
	}

	public void updateAttributeInArray(ExcIEEEST1A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcIEEEST1A_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//ExcIEEEST1A_ATTR_ENUM attrEnum = ExcIEEEST1A_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcIEEEST1A_primitive_builder attrEnum = ExcIEEEST1A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (ExcIEEEST1A_primitive_builder attrEnum: ExcIEEEST1A_primitive_builder.values()) {
			BaseClass bc = ExcIEEEST1A_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "ExcIEEEST1A";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcIEEEST1A();
        }
};
