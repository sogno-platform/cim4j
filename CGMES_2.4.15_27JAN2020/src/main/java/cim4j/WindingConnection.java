package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Winding connection type.
*/
public class WindingConnection extends BaseClass
{
	private enum WindingConnection_ENUM
	{
			/**
		 * Delta
		 */
		D,
			/**
		 * Wye
		 */
		Y,
			/**
		 * ZigZag
		 */
		Z,
			/**
		 * Wye, with neutral brought out for grounding.
		 */
		Yn,
			/**
		 * ZigZag, with neutral brought out for grounding.
		 */
		Zn,
			/**
		 * Autotransformer common winding
		 */
		A,
			/**
		 * Independent winding, for single-phase connections
		 */
		I,
			MAX_WindingConnection_ENUM;
	}

	private WindingConnection_ENUM value;

	public BaseClass construct() {
		return new WindingConnection();
        }

	public WindingConnection() {}

	public WindingConnection(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = WindingConnection_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = WindingConnection_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "WindingConnection";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

