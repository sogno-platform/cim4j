package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Kind of Asynchronous Machine.
*/
public class AsynchronousMachineKind extends BaseClass
{
	private enum AsynchronousMachineKind_ENUM
	{
			/**
		 * The Asynchronous Machine is a generator.
		 */
		generator,
			/**
		 * The Asynchronous Machine is a motor.
		 */
		motor,
			MAX_AsynchronousMachineKind_ENUM;
	}

	private AsynchronousMachineKind_ENUM value;

	public BaseClass construct() {
		return new AsynchronousMachineKind();
        }

	public AsynchronousMachineKind() {}

	public AsynchronousMachineKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = AsynchronousMachineKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = AsynchronousMachineKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "AsynchronousMachineKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

