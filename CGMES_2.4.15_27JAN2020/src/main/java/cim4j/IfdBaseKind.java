package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Excitation base system mode.
*/
public class IfdBaseKind extends BaseClass
{
	private enum IfdBaseKind_ENUM
	{
			/**
		 * Air gap line mode.  ifdBaseValue is computed, not defined by the user, in this mode.
		 */
		ifag,
			/**
		 * No load system with saturation mode.  ifdBaseValue is computed, not defined by the user, in this mode.
		 */
		ifnl,
			/**
		 * Full load system mode.  ifdBaseValue is computed, not defined by the user, in this mode.
		 */
		iffl,
			/**
		 * Free mode.  ifdBaseValue is defined by the user in this mode.
		 */
		other,
			MAX_IfdBaseKind_ENUM;
	}

	private IfdBaseKind_ENUM value;

	public BaseClass construct() {
		return new IfdBaseKind();
        }

	public IfdBaseKind() {}

	public IfdBaseKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = IfdBaseKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = IfdBaseKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "IfdBaseKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

