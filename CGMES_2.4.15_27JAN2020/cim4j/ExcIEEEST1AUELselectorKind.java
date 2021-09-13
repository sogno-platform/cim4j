package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Type of connection for the UEL input used in ExcIEEEST1A.
*/
public class ExcIEEEST1AUELselectorKind extends BaseClass
{
	private enum ExcIEEEST1AUELselectorKind_ENUM
	{
			/**
		 * Ignore UEL signal.
		 */
		ignoreUELsignal,
			/**
		 * UEL input HV gate with voltage regulator output.
		 */
		inputHVgateVoltageOutput,
			/**
		 * UEL input HV gate with error signal.
		 */
		inputHVgateErrorSignal,
			/**
		 * UEL input added to error signal.
		 */
		inputAddedToErrorSignal,
			MAX_ExcIEEEST1AUELselectorKind_ENUM;
	}

	private ExcIEEEST1AUELselectorKind_ENUM value;

	public BaseClass construct() {
		return new ExcIEEEST1AUELselectorKind();
        }

	public ExcIEEEST1AUELselectorKind() {}

	public ExcIEEEST1AUELselectorKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = ExcIEEEST1AUELselectorKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = ExcIEEEST1AUELselectorKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "ExcIEEEST1AUELselectorKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

