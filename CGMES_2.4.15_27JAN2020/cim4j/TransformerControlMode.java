package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Control modes for a transformer.
*/
public class TransformerControlMode extends BaseClass
{
	private enum TransformerControlMode_ENUM
	{
			/**
		 * Voltage control
		 */
		volt,
			/**
		 * Reactive power flow control
		 */
		reactive,
			MAX_TransformerControlMode_ENUM;
	}

	private TransformerControlMode_ENUM value;

	public BaseClass construct() {
		return new TransformerControlMode();
        }

	public TransformerControlMode() {}

	public TransformerControlMode(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = TransformerControlMode_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = TransformerControlMode_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "TransformerControlMode";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

