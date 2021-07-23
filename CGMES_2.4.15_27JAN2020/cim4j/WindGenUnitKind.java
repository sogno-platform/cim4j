package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Kind of wind generating unit.
*/
public class WindGenUnitKind extends BaseClass
{
	private enum WindGenUnitKind_ENUM
	{
			/**
		 * The wind generating unit is located offshore.
		 */
		offshore,
			/**
		 * The wind generating unit is located onshore.
		 */
		onshore,
			MAX_WindGenUnitKind_ENUM;
	}

	private WindGenUnitKind_ENUM value;

	public BaseClass construct() {
		return new WindGenUnitKind();
        }

	public WindGenUnitKind() {}

	public WindGenUnitKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = WindGenUnitKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = WindGenUnitKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "WindGenUnitKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

