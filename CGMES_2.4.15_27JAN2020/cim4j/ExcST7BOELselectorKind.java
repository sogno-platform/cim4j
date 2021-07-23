package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Type of connection for the OEL input used for static excitation systems type 7B.
*/
public class ExcST7BOELselectorKind extends BaseClass
{
	private enum ExcST7BOELselectorKind_ENUM
	{
			/**
		 * No OEL input is used.
		 */
		noOELinput,
			/**
		 * The signal is added to Vref.
		 */
		addVref,
			/**
		 * The signal is connected in the input of the LV gate.
		 */
		inputLVgate,
			/**
		 * The signal is connected in the output of the LV gate.
		 */
		outputLVgate,
			MAX_ExcST7BOELselectorKind_ENUM;
	}

	private ExcST7BOELselectorKind_ENUM value;

	public BaseClass construct() {
		return new ExcST7BOELselectorKind();
        }

	public ExcST7BOELselectorKind() {}

	public ExcST7BOELselectorKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = ExcST7BOELselectorKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = ExcST7BOELselectorKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "ExcST7BOELselectorKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

