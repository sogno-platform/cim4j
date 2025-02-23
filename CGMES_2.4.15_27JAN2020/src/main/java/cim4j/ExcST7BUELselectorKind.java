package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Type of connection for the UEL input used for static excitation systems type 7B.
*/
public class ExcST7BUELselectorKind extends BaseClass
{
	private enum ExcST7BUELselectorKind_ENUM
	{
			/**
		 * No UEL input is used.
		 */
		noUELinput,
			/**
		 * The signal is added to Vref.
		 */
		addVref,
			/**
		 * The signal is connected in the input of the HV gate.
		 */
		inputHVgate,
			/**
		 * The signal is connected in the output of the HV gate.
		 */
		outputHVgate,
			MAX_ExcST7BUELselectorKind_ENUM;
	}

	private ExcST7BUELselectorKind_ENUM value;

	public BaseClass construct() {
		return new ExcST7BUELselectorKind();
        }

	public ExcST7BUELselectorKind() {}

	public ExcST7BUELselectorKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = ExcST7BUELselectorKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = ExcST7BUELselectorKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "ExcST7BUELselectorKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

