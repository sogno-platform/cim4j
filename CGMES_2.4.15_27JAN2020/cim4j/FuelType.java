package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Type of fuel.
*/
public class FuelType extends BaseClass
{
	private enum FuelType_ENUM
	{
			/**
		 * Generic coal, not including lignite type.
		 */
		coal,
			/**
		 * Oil.
		 */
		oil,
			/**
		 * Natural gas.
		 */
		gas,
			/**
		 * The fuel is lignite coal.  Note that this is a special type of coal, so the other enum of coal is reserved for hard coal types or if the exact type of coal is not known.
		 */
		lignite,
			/**
		 * Hard coal
		 */
		hardCoal,
			/**
		 * Oil Shale
		 */
		oilShale,
			MAX_FuelType_ENUM;
	}

	private FuelType_ENUM value;

	public BaseClass construct() {
		return new FuelType();
        }

	public FuelType() {}

	public FuelType(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = FuelType_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = FuelType_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "FuelType";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

