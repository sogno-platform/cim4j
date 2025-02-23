package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.Curve;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.EquivalentInjection;
import cim4j.SynchronousMachine;

/*
Reactive power rating envelope versus the synchronous machine's active power, in both the generating and motoring modes. For each active power value there is a corresponding high and low reactive power limit  value. Typically there will be a separate curve for each coolant condition, such as hydrogen pressure.  The Y1 axis values represent reactive minimum and the Y2 axis values represent reactive maximum.
*/
public class ReactiveCapabilityCurve extends Curve
{
	private BaseClass[] ReactiveCapabilityCurve_class_attributes;
	private BaseClass[] ReactiveCapabilityCurve_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ReactiveCapabilityCurve_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ReactiveCapabilityCurve_class_attributes_enum {
		EquivalentInjection,
		InitiallyUsedBySynchronousMachines,
			LAST_ENUM;
	}

		
		
	
	public ReactiveCapabilityCurve() {
		ReactiveCapabilityCurve_primitive_attributes = new BaseClass[ReactiveCapabilityCurve_primitive_builder.values().length];
		ReactiveCapabilityCurve_class_attributes = new BaseClass[ReactiveCapabilityCurve_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ReactiveCapabilityCurve_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ReactiveCapabilityCurve_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ReactiveCapabilityCurve_primitive_builder attrEnum, BaseClass value) {
		try {
			ReactiveCapabilityCurve_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ReactiveCapabilityCurve_class_attributes_enum attrEnum = ReactiveCapabilityCurve_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ReactiveCapabilityCurve, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ReactiveCapabilityCurve_primitive_builder attrEnum = ReactiveCapabilityCurve_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ReactiveCapabilityCurve, setting " + attrName  + " to: "  + value);
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
			for (ReactiveCapabilityCurve_primitive_builder attrEnum: ReactiveCapabilityCurve_primitive_builder.values()) {
				BaseClass bc = ReactiveCapabilityCurve_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ReactiveCapabilityCurve." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ReactiveCapabilityCurve_class_attributes_enum attrEnum: ReactiveCapabilityCurve_class_attributes_enum.values()) {
				BaseClass bc = ReactiveCapabilityCurve_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ReactiveCapabilityCurve." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ReactiveCapabilityCurve) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ReactiveCapabilityCurve";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ReactiveCapabilityCurve();
        }
};
