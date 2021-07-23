package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Type of rotor, used by short circuit applications.
*/
public class ShortCircuitRotorKind extends BaseClass
{
	private enum ShortCircuitRotorKind_ENUM
	{
			/**
		 * Salient pole 1 in the IEC 60909
		 */
		salientPole1,
			/**
		 * Salient pole 2 in IEC 60909
		 */
		salientPole2,
			/**
		 * Turbo Series 1 in the IEC 60909
		 */
		turboSeries1,
			/**
		 * Turbo series 2 in IEC 60909
		 */
		turboSeries2,
			MAX_ShortCircuitRotorKind_ENUM;
	}

	private ShortCircuitRotorKind_ENUM value;

	public BaseClass construct() {
		return new ShortCircuitRotorKind();
        }

	public ShortCircuitRotorKind() {}

	public ShortCircuitRotorKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = ShortCircuitRotorKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = ShortCircuitRotorKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "ShortCircuitRotorKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

