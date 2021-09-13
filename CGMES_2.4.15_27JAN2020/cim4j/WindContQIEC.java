package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;
import cim4j.WindLVRTQcontrolModesKind;
import cim4j.WindQcontrolModesKind;


import cim4j.WindTurbineType3or4IEC;

/*
Q control model.  Reference: IEC Standard 61400-27-1 Section 6.6.5.6.
*/
public class WindContQIEC extends IdentifiedObject
{
	private BaseClass[] WindContQIEC_class_attributes;
	private BaseClass[] WindContQIEC_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum WindContQIEC_primitive_builder implements PrimitiveBuilder {
		iqh1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		iqmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		iqmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		iqpost(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kiq(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kiu(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kpq(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kpu(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kqv(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		qmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		qmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		rdroop(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tiq(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tpfilt(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tpost(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tqord(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tufilt(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		udb1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		udb2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		umax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		umin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		uqdip(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		uref0(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		windLVRTQcontrolModesType(){
			public BaseClass construct (java.lang.String value) {
				return new WindLVRTQcontrolModesKind(value);
			}
		},
		windQcontrolModesType(){
			public BaseClass construct (java.lang.String value) {
				return new WindQcontrolModesKind(value);
			}
		},
		xdroop(){
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

	private enum WindContQIEC_class_attributes_enum {
		iqh1,
		iqmax,
		iqmin,
		iqpost,
		kiq,
		kiu,
		kpq,
		kpu,
		kqv,
		qmax,
		qmin,
		rdroop,
		tiq,
		tpfilt,
		tpost,
		tqord,
		tufilt,
		udb1,
		udb2,
		umax,
		umin,
		uqdip,
		uref0,
		windLVRTQcontrolModesType,
		windQcontrolModesType,
		xdroop,
		WindTurbineType3or4IEC,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public WindContQIEC() {
		WindContQIEC_primitive_attributes = new BaseClass[WindContQIEC_primitive_builder.values().length];
		WindContQIEC_class_attributes = new BaseClass[WindContQIEC_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(WindContQIEC_class_attributes_enum attrEnum, BaseClass value) {
		try {
			WindContQIEC_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(WindContQIEC_primitive_builder attrEnum, BaseClass value) {
		try {
			WindContQIEC_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			WindContQIEC_class_attributes_enum attrEnum = WindContQIEC_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated WindContQIEC, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			WindContQIEC_primitive_builder attrEnum = WindContQIEC_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated WindContQIEC, setting " + attrName  + " to: "  + value);
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
			for (WindContQIEC_primitive_builder attrEnum: WindContQIEC_primitive_builder.values()) {
				BaseClass bc = WindContQIEC_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindContQIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (WindContQIEC_class_attributes_enum attrEnum: WindContQIEC_class_attributes_enum.values()) {
				BaseClass bc = WindContQIEC_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    WindContQIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(WindContQIEC) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "WindContQIEC";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new WindContQIEC();
        }
};
