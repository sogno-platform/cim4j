package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Type of connection for the OEL input used for static excitation systems type 6B.
*/
public class ExcST6BOELselectorKind extends BaseClass
{
	private enum ExcST6BOELselectorKind_ENUM
	{
			/**
		 * No OEL input is used.
		 */
		noOELinput,
			/**
		 * The connection is before UEL.
		 */
		beforeUEL,
			/**
		 * The connection is after UEL.
		 */
		afterUEL,
			MAX_ExcST6BOELselectorKind_ENUM;
	}

	private ExcST6BOELselectorKind_ENUM value;

	public BaseClass construct() {
		return new ExcST6BOELselectorKind();
        }

	public ExcST6BOELselectorKind() {}

	public ExcST6BOELselectorKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = ExcST6BOELselectorKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = ExcST6BOELselectorKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "ExcST6BOELselectorKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

