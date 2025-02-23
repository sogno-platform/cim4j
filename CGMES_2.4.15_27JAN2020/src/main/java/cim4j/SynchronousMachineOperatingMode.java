package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Synchronous machine operating mode.
*/
public class SynchronousMachineOperatingMode extends BaseClass
{
	private enum SynchronousMachineOperatingMode_ENUM
	{
			/**
		 * 
		 */
		generator,
			/**
		 * 
		 */
		condenser,
			/**
		 * 
		 */
		motor,
			MAX_SynchronousMachineOperatingMode_ENUM;
	}

	private SynchronousMachineOperatingMode_ENUM value;

	public BaseClass construct() {
		return new SynchronousMachineOperatingMode();
        }

	public SynchronousMachineOperatingMode() {}

	public SynchronousMachineOperatingMode(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = SynchronousMachineOperatingMode_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = SynchronousMachineOperatingMode_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "SynchronousMachineOperatingMode";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

