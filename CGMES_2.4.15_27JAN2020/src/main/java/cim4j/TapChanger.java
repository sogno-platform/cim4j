package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PowerSystemResource;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Integer;
import cim4j.Boolean;
import cim4j.Voltage;
import cim4j.Simple_Float;


import cim4j.TapChangerControl;
import cim4j.TapSchedule;
import cim4j.SvTapStep;

/*
Mechanism for changing transformer winding tap positions.
*/
public class TapChanger extends PowerSystemResource
{
	private BaseClass[] TapChanger_class_attributes;
	private BaseClass[] TapChanger_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum TapChanger_primitive_builder implements PrimitiveBuilder {
		highStep(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
		lowStep(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
		ltcFlag(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		neutralStep(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
		neutralU(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
		normalStep(){
			public BaseClass construct (java.lang.String value) {
				return new Integer(value);
			}
		},
		controlEnabled(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		step(){
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

	private enum TapChanger_class_attributes_enum {
		highStep,
		lowStep,
		ltcFlag,
		neutralStep,
		neutralU,
		normalStep,
		TapChangerControl,
		TapSchedules,
		controlEnabled,
		step,
		SvTapStep,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
	
	public TapChanger() {
		TapChanger_primitive_attributes = new BaseClass[TapChanger_primitive_builder.values().length];
		TapChanger_class_attributes = new BaseClass[TapChanger_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(TapChanger_class_attributes_enum attrEnum, BaseClass value) {
		try {
			TapChanger_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(TapChanger_primitive_builder attrEnum, BaseClass value) {
		try {
			TapChanger_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			TapChanger_class_attributes_enum attrEnum = TapChanger_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated TapChanger, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			TapChanger_primitive_builder attrEnum = TapChanger_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated TapChanger, setting " + attrName  + " to: "  + value);
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
			for (TapChanger_primitive_builder attrEnum: TapChanger_primitive_builder.values()) {
				BaseClass bc = TapChanger_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TapChanger." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (TapChanger_class_attributes_enum attrEnum: TapChanger_class_attributes_enum.values()) {
				BaseClass bc = TapChanger_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TapChanger." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(TapChanger) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "TapChanger";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new TapChanger();
        }
};
