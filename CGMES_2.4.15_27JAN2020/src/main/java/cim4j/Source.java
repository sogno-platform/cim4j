package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Source gives information related to the origin of a value.
*/
public class Source extends BaseClass
{
	private enum Source_ENUM
	{
			/**
		 * The value is provided by input from the process I/O or being calculated from some function.
		 */
		PROCESS,
			/**
		 * The value contains a default value.
		 */
		DEFAULTED,
			/**
		 * The value is provided by input of an operator or by an automatic source.
		 */
		SUBSTITUTED,
			MAX_Source_ENUM;
	}

	private Source_ENUM value;

	public BaseClass construct() {
		return new Source();
        }

	public Source() {}

	public Source(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = Source_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = Source_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "Source";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

