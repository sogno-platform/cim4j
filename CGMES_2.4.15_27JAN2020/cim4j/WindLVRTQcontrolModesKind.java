package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
LVRT Q control modes .
*/
public class WindLVRTQcontrolModesKind extends BaseClass
{
	private enum WindLVRTQcontrolModesKind_ENUM
	{
			/**
		 * Voltage dependent reactive current injection ().
		 */
		mode1,
			/**
		 * Reactive current injection controlled as the pre-fault value plus an additional voltage dependent reactive current injection ().
		 */
		mode2,
			/**
		 * Reactive current injection controlled as the pre-fault value plus an additional voltage dependent reactive current injection during fault, and as the pre-fault value plus an additional constant reactive current injection post fault ().
		 */
		mode3,
			MAX_WindLVRTQcontrolModesKind_ENUM;
	}

	private WindLVRTQcontrolModesKind_ENUM value;

	public BaseClass construct() {
		return new WindLVRTQcontrolModesKind();
        }

	public WindLVRTQcontrolModesKind() {}

	public WindLVRTQcontrolModesKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = WindLVRTQcontrolModesKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = WindLVRTQcontrolModesKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "WindLVRTQcontrolModesKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

