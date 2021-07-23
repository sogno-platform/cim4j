package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Operating mode for HVDC line operating as Current Source Converter.
*/
public class CsOperatingModeKind extends BaseClass
{
	private enum CsOperatingModeKind_ENUM
	{
			/**
		 * Operating as inverter
		 */
		inverter,
			/**
		 * Operating as rectifier.
		 */
		rectifier,
			MAX_CsOperatingModeKind_ENUM;
	}

	private CsOperatingModeKind_ENUM value;

	public BaseClass construct() {
		return new CsOperatingModeKind();
        }

	public CsOperatingModeKind() {}

	public CsOperatingModeKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = CsOperatingModeKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = CsOperatingModeKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "CsOperatingModeKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

