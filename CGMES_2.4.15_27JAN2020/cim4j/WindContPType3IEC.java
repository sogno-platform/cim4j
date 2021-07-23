package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Boolean;
import cim4j.Seconds;
import cim4j.Simple_Float;


import cim4j.WindGenTurbineType3IEC;
import cim4j.WindDynamicsLookupTable;

/*
P control model Type 3.  Reference: IEC Standard 61400-27-1 Section 6.6.5.3.
*/
public class WindContPType3IEC extends IdentifiedObject
{
	private BaseClass[] WindContPType3IEC_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum WindContPType3IEC_primitive_builder implements PrimitiveBuilder {
			dpmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			dtrisemaxlvrt(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kdtd(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kip(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kpp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			mplvrt(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			omegaoffset(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			pdtdmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			rramp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tdvs(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			temin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tomegafilt(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tpfilt(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tpord(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			tufilt(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tuscale(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			twref(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			udvs(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			updip(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			wdtd(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			zeta(){
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public WindContPType3IEC() {
		WindContPType3IEC_attributes = new BaseClass[WindContPType3IEC_primitive_builder.values().length];
	}

	public void updateAttributeInArray(WindContPType3IEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindContPType3IEC_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//WindContPType3IEC_ATTR_ENUM attrEnum = WindContPType3IEC_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindContPType3IEC_primitive_builder attrEnum = WindContPType3IEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (WindContPType3IEC_primitive_builder attrEnum: WindContPType3IEC_primitive_builder.values()) {
			BaseClass bc = WindContPType3IEC_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "WindContPType3IEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindContPType3IEC();
        }
};
