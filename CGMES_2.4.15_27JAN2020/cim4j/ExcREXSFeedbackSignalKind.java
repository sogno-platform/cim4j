package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Type of rate feedback signals.
*/
public class ExcREXSFeedbackSignalKind extends BaseClass
{
	private enum ExcREXSFeedbackSignalKind_ENUM
	{
			/**
		 * The voltage regulator output voltage is used. It is the same as exciter field voltage.
		 */
		fieldVoltage,
			/**
		 * The exciter field current is used.
		 */
		fieldCurrent,
			/**
		 * The output voltage of the exciter is used.
		 */
		outputVoltage,
			MAX_ExcREXSFeedbackSignalKind_ENUM;
	}

	private ExcREXSFeedbackSignalKind_ENUM value;

	public BaseClass construct() {
		return new ExcREXSFeedbackSignalKind();
        }

	public ExcREXSFeedbackSignalKind() {}

	public ExcREXSFeedbackSignalKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = ExcREXSFeedbackSignalKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = ExcREXSFeedbackSignalKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "ExcREXSFeedbackSignalKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

