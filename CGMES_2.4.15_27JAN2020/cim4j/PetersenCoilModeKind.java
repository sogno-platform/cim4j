package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
The mode of operation for a Petersen coil.
*/
public class PetersenCoilModeKind extends BaseClass
{
	private enum PetersenCoilModeKind_ENUM
	{
			/**
		 * Fixed position.
		 */
		fixed,
			/**
		 * Manual positioning.
		 */
		manual,
			/**
		 * Automatic positioning.
		 */
		automaticPositioning,
			MAX_PetersenCoilModeKind_ENUM;
	}

	private PetersenCoilModeKind_ENUM value;

	public BaseClass construct() {
		return new PetersenCoilModeKind();
        }

	public PetersenCoilModeKind() {}

	public PetersenCoilModeKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = PetersenCoilModeKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = PetersenCoilModeKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "PetersenCoilModeKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

