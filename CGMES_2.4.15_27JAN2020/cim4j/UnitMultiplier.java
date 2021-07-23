package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
The unit multipliers defined for the CIM.
*/
public class UnitMultiplier extends BaseClass
{
	private enum UnitMultiplier_ENUM
	{
			/**
		 * Pico 10**-12.
		 */
		p,
			/**
		 * Nano 10**-9.
		 */
		n,
			/**
		 * Micro 10**-6.
		 */
		micro,
			/**
		 * Milli 10**-3.
		 */
		m,
			/**
		 * Centi 10**-2.
		 */
		c,
			/**
		 * Deci 10**-1.
		 */
		d,
			/**
		 * Kilo 10**3.
		 */
		k,
			/**
		 * Mega 10**6.
		 */
		M,
			/**
		 * Giga 10**9.
		 */
		G,
			/**
		 * Tera 10**12.
		 */
		T,
			/**
		 * No multiplier or equivalently multiply by 1.
		 */
		none,
			MAX_UnitMultiplier_ENUM;
	}

	private UnitMultiplier_ENUM value;

	public BaseClass construct() {
		return new UnitMultiplier();
        }

	public UnitMultiplier() {}

	public UnitMultiplier(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = UnitMultiplier_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = UnitMultiplier_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "UnitMultiplier";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

