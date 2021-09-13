package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
The type of control area.
*/
public class ControlAreaTypeKind extends BaseClass
{
	private enum ControlAreaTypeKind_ENUM
	{
			/**
		 * Used for automatic generation control.
		 */
		AGC,
			/**
		 * Used for load forecast.
		 */
		Forecast,
			/**
		 * Used for interchange specification or control.
		 */
		Interchange,
			MAX_ControlAreaTypeKind_ENUM;
	}

	private ControlAreaTypeKind_ENUM value;

	public BaseClass construct() {
		return new ControlAreaTypeKind();
        }

	public ControlAreaTypeKind() {}

	public ControlAreaTypeKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = ControlAreaTypeKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = ControlAreaTypeKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "ControlAreaTypeKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

