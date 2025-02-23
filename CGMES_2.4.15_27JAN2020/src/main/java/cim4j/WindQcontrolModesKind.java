package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
General wind turbine Q control modes .
*/
public class WindQcontrolModesKind extends BaseClass
{
	private enum WindQcontrolModesKind_ENUM
	{
			/**
		 * Voltage control ().
		 */
		voltage,
			/**
		 * Reactive power control ().
		 */
		reactivePower,
			/**
		 * Open loop reactive power control (only used with closed loop at plant level) ().
		 */
		openLoopReactivePower,
			/**
		 * Power factor control ().
		 */
		powerFactor,
			MAX_WindQcontrolModesKind_ENUM;
	}

	private WindQcontrolModesKind_ENUM value;

	public BaseClass construct() {
		return new WindQcontrolModesKind();
        }

	public WindQcontrolModesKind() {}

	public WindQcontrolModesKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = WindQcontrolModesKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = WindQcontrolModesKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "WindQcontrolModesKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

