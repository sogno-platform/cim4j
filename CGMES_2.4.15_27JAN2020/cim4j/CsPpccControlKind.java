package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Active power control modes for HVDC line operating as Current Source Converter.
*/
public class CsPpccControlKind extends BaseClass
{
	private enum CsPpccControlKind_ENUM
	{
			/**
		 * Active power control at AC side.
		 */
		activePower,
			/**
		 * DC voltage control.
		 */
		dcVoltage,
			/**
		 * DC current control
		 */
		dcCurrent,
			MAX_CsPpccControlKind_ENUM;
	}

	private CsPpccControlKind_ENUM value;

	public BaseClass construct() {
		return new CsPpccControlKind();
        }

	public CsPpccControlKind() {}

	public CsPpccControlKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = CsPpccControlKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = CsPpccControlKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "CsPpccControlKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

