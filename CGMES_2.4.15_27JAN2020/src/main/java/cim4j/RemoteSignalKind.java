package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Type of input signal coming from remote bus.
*/
public class RemoteSignalKind extends BaseClass
{
	private enum RemoteSignalKind_ENUM
	{
			/**
		 * Input is voltage frequency from remote terminal bus.
		 */
		remoteBusVoltageFrequency,
			/**
		 * Input is voltage frequency deviation from remote terminal bus.
		 */
		remoteBusVoltageFrequencyDeviation,
			/**
		 * Input is frequency from remote terminal bus.
		 */
		remoteBusFrequency,
			/**
		 * Input is frequency deviation from remote terminal bus.
		 */
		remoteBusFrequencyDeviation,
			/**
		 * Input is voltage amplitude from remote terminal bus.
		 */
		remoteBusVoltageAmplitude,
			/**
		 * Input is voltage from remote terminal bus.
		 */
		remoteBusVoltage,
			/**
		 * Input is branch current amplitude from remote terminal bus.
		 */
		remoteBranchCurrentAmplitude,
			/**
		 * Input is branch current amplitude derivative from remote terminal bus.
		 */
		remoteBusVoltageAmplitudeDerivative,
			/**
		 * Input is PU voltage derivative from remote terminal bus.
		 */
		remotePuBusVoltageDerivative,
			MAX_RemoteSignalKind_ENUM;
	}

	private RemoteSignalKind_ENUM value;

	public BaseClass construct() {
		return new RemoteSignalKind();
        }

	public RemoteSignalKind() {}

	public RemoteSignalKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = RemoteSignalKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = RemoteSignalKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "RemoteSignalKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

