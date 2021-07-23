package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.Curve;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.GeneratingUnit;

/*
Relationship between the generating unit's gross active power output on the X-axis (measured at the terminals of the machine(s)) and the generating unit's net active power output on the Y-axis (based on utility-defined measurements at the power station). Station service loads, when modeled, should be treated as non-conforming bus loads. There may be more than one curve, depending on the auxiliary equipment that is in service.
*/
public class GrossToNetActivePowerCurve extends Curve
{
	private BaseClass[] GrossToNetActivePowerCurve_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum GrossToNetActivePowerCurve_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
	
	public GrossToNetActivePowerCurve() {
		GrossToNetActivePowerCurve_attributes = new BaseClass[GrossToNetActivePowerCurve_primitive_builder.values().length];
	}

	public void updateAttributeInArray(GrossToNetActivePowerCurve_primitive_builder attrEnum, BaseClass value) {
		try {
			GrossToNetActivePowerCurve_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//GrossToNetActivePowerCurve_ATTR_ENUM attrEnum = GrossToNetActivePowerCurve_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GrossToNetActivePowerCurve_primitive_builder attrEnum = GrossToNetActivePowerCurve_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (GrossToNetActivePowerCurve_primitive_builder attrEnum: GrossToNetActivePowerCurve_primitive_builder.values()) {
			BaseClass bc = GrossToNetActivePowerCurve_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "GrossToNetActivePowerCurve";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GrossToNetActivePowerCurve();
        }
};
