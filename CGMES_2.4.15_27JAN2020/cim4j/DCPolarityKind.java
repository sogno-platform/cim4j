package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Polarity for DC circuits.
*/
public class DCPolarityKind extends BaseClass
{
	private enum DCPolarityKind_ENUM
	{
			/**
		 * Positive pole.
		 */
		positive,
			/**
		 * Middle pole, potentially grounded.
		 */
		middle,
			/**
		 * Negative pole.
		 */
		negative,
			MAX_DCPolarityKind_ENUM;
	}

	private DCPolarityKind_ENUM value;

	public BaseClass construct() {
		return new DCPolarityKind();
        }

	public DCPolarityKind() {}

	public DCPolarityKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = DCPolarityKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = DCPolarityKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "DCPolarityKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

