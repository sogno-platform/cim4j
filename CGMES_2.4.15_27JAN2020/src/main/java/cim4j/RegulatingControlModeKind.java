package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
The kind of regulation model.   For example regulating voltage, reactive power, active power, etc.
*/
public class RegulatingControlModeKind extends BaseClass
{
	private enum RegulatingControlModeKind_ENUM
	{
			/**
		 * Voltage is specified.
		 */
		voltage,
			/**
		 * Active power is specified.
		 */
		activePower,
			/**
		 * Reactive power is specified.
		 */
		reactivePower,
			/**
		 * Current flow is specified.
		 */
		currentFlow,
			/**
		 * Admittance is specified.
		 */
		admittance,
			/**
		 * Control switches on/off by time of day. The times may change on the weekend, or in different seasons.
		 */
		timeScheduled,
			/**
		 * Control switches on/off based on the local temperature (i.e., a thermostat).
		 */
		temperature,
			/**
		 * Power factor is specified.
		 */
		powerFactor,
			MAX_RegulatingControlModeKind_ENUM;
	}

	private RegulatingControlModeKind_ENUM value;

	public BaseClass construct() {
		return new RegulatingControlModeKind();
        }

	public RegulatingControlModeKind() {}

	public RegulatingControlModeKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = RegulatingControlModeKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = RegulatingControlModeKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "RegulatingControlModeKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

