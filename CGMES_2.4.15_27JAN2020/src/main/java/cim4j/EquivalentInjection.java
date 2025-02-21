package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.EquivalentEquipment;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ActivePower;
import cim4j.ReactivePower;
import cim4j.Boolean;
import cim4j.Resistance;
import cim4j.Reactance;
import cim4j.Voltage;


import cim4j.ReactiveCapabilityCurve;

/*
This class represents equivalent injections (generation or load).  Voltage regulation is allowed only at the point of connection.
*/
public class EquivalentInjection extends EquivalentEquipment
{
	private BaseClass[] EquivalentInjection_class_attributes;
	private BaseClass[] EquivalentInjection_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum EquivalentInjection_primitive_builder implements PrimitiveBuilder {
		maxP(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		maxQ(){
			public BaseClass construct (java.lang.String value) {
				return new ReactivePower(value);
			}
		},
		minP(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		minQ(){
			public BaseClass construct (java.lang.String value) {
				return new ReactivePower(value);
			}
		},
		regulationCapability(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		r(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
		r0(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
		r2(){
			public BaseClass construct (java.lang.String value) {
				return new Resistance(value);
			}
		},
		x(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
		x0(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
		x2(){
			public BaseClass construct (java.lang.String value) {
				return new Reactance(value);
			}
		},
		regulationStatus(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
		regulationTarget(){
			public BaseClass construct (java.lang.String value) {
				return new Voltage(value);
			}
		},
		p(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		q(){
			public BaseClass construct (java.lang.String value) {
				return new ReactivePower(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum EquivalentInjection_class_attributes_enum {
		ReactiveCapabilityCurve,
		maxP,
		maxQ,
		minP,
		minQ,
		regulationCapability,
		r,
		r0,
		r2,
		x,
		x0,
		x2,
		regulationStatus,
		regulationTarget,
		p,
		q,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public EquivalentInjection() {
		EquivalentInjection_primitive_attributes = new BaseClass[EquivalentInjection_primitive_builder.values().length];
		EquivalentInjection_class_attributes = new BaseClass[EquivalentInjection_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(EquivalentInjection_class_attributes_enum attrEnum, BaseClass value) {
		try {
			EquivalentInjection_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(EquivalentInjection_primitive_builder attrEnum, BaseClass value) {
		try {
			EquivalentInjection_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			EquivalentInjection_class_attributes_enum attrEnum = EquivalentInjection_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated EquivalentInjection, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			EquivalentInjection_primitive_builder attrEnum = EquivalentInjection_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated EquivalentInjection, setting " + attrName  + " to: "  + value);
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
			for (EquivalentInjection_primitive_builder attrEnum: EquivalentInjection_primitive_builder.values()) {
				BaseClass bc = EquivalentInjection_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EquivalentInjection." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (EquivalentInjection_class_attributes_enum attrEnum: EquivalentInjection_class_attributes_enum.values()) {
				BaseClass bc = EquivalentInjection_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    EquivalentInjection." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(EquivalentInjection) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "EquivalentInjection";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new EquivalentInjection();
        }
};
