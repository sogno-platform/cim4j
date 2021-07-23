package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
The orientation of the coordinate system with respect to top, left, and the coordinate number system.
*/
public class OrientationKind extends BaseClass
{
	private enum OrientationKind_ENUM
	{
			/**
		 * For 2D diagrams, a negative orientation gives the left-hand orientation (favoured by computer graphics displays) with X values increasing from left to right and Y values increasing from top to bottom.   This is also known as a left hand orientation.
		 */
		negative,
			MAX_OrientationKind_ENUM;
	}

	private OrientationKind_ENUM value;

	public BaseClass construct() {
		return new OrientationKind();
        }

	public OrientationKind() {}

	public OrientationKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = OrientationKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = OrientationKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "OrientationKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

