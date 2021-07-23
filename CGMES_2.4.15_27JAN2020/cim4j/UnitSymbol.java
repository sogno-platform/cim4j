package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
The units defined for usage in the CIM.
*/
public class UnitSymbol extends BaseClass
{
	private enum UnitSymbol_ENUM
	{
			/**
		 * Apparent power in volt ampere.
		 */
		VA,
			/**
		 * Active power in watt.
		 */
		W,
			/**
		 * Reactive power in volt ampere reactive.
		 */
		VAr,
			/**
		 * Apparent energy in volt ampere hours.
		 */
		VAh,
			/**
		 * Real energy in what hours.
		 */
		Wh,
			/**
		 * Reactive energy in volt ampere reactive hours.
		 */
		VArh,
			/**
		 * Voltage in volt.
		 */
		V,
			/**
		 * Resistance in ohm.
		 */
		ohm,
			/**
		 * Current in ampere.
		 */
		A,
			/**
		 * Capacitance in farad.
		 */
		F,
			/**
		 * Inductance in henry.
		 */
		H,
			/**
		 * Relative temperature in degrees Celsius. In the SI unit system the symbol is [SYMBOL REMOVED]C. Electric charge is measured in coulomb that has the unit symbol C. To distinguish degree Celsius form coulomb the symbol used in the UML is degC. Reason for not using [SYMBOL REMOVED]C is the special character [SYMBOL REMOVED] is difficult to manage in software.
		 */
		degC,
			/**
		 * Time in seconds.
		 */
		s,
			/**
		 * Time in minutes.
		 */
		min,
			/**
		 * Time in hours.
		 */
		h,
			/**
		 * Plane angle in degrees.
		 */
		deg,
			/**
		 * Plane angle in radians.
		 */
		rad,
			/**
		 * Energy in joule.
		 */
		J,
			/**
		 * Force in newton.
		 */
		N,
			/**
		 * Conductance in siemens.
		 */
		S,
			/**
		 * Dimension less quantity, e.g. count, per unit, etc.
		 */
		none,
			/**
		 * Frequency in hertz.
		 */
		Hz,
			/**
		 * Mass in gram.
		 */
		g,
			/**
		 * Pressure in pascal (n/m2).
		 */
		Pa,
			/**
		 * Length in meter.
		 */
		m,
			/**
		 * Area in square meters.
		 */
		m2,
			/**
		 * Volume in cubic meters.
		 */
		m3,
			MAX_UnitSymbol_ENUM;
	}

	private UnitSymbol_ENUM value;

	public BaseClass construct() {
		return new UnitSymbol();
        }

	public UnitSymbol() {}

	public UnitSymbol(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = UnitSymbol_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = UnitSymbol_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "UnitSymbol";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

