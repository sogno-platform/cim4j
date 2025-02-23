package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Style or shape of curve.
*/
public class CurveStyle extends BaseClass
{
	private enum CurveStyle_ENUM
	{
			/**
		 * The Y-axis values are assumed constant until the next curve point and prior to the first curve point.
		 */
		constantYValue,
			/**
		 * The Y-axis values are assumed to be a straight line between values.  Also known as linear interpolation.
		 */
		straightLineYValues,
			MAX_CurveStyle_ENUM;
	}

	private CurveStyle_ENUM value;

	public BaseClass construct() {
		return new CurveStyle();
        }

	public CurveStyle() {}

	public CurveStyle(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = CurveStyle_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = CurveStyle_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "CurveStyle";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

