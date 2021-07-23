package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
The operating mode of an HVDC bipole.
*/
public class DCConverterOperatingModeKind extends BaseClass
{
	private enum DCConverterOperatingModeKind_ENUM
	{
			/**
		 * Bipolar operation.
		 */
		bipolar,
			/**
		 * Monopolar operation with metallic return
		 */
		monopolarMetallicReturn,
			/**
		 * Monopolar operation with ground return
		 */
		monopolarGroundReturn,
			MAX_DCConverterOperatingModeKind_ENUM;
	}

	private DCConverterOperatingModeKind_ENUM value;

	public BaseClass construct() {
		return new DCConverterOperatingModeKind();
        }

	public DCConverterOperatingModeKind() {}

	public DCConverterOperatingModeKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = DCConverterOperatingModeKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = DCConverterOperatingModeKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "DCConverterOperatingModeKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

