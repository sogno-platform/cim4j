package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Specifies the capability of the hydro generating unit to convert energy as a generator or pump.
*/
public class HydroEnergyConversionKind extends BaseClass
{
	private enum HydroEnergyConversionKind_ENUM
	{
			/**
		 * Able to generate power, but not able to pump water for energy storage.
		 */
		generator,
			/**
		 * Able to both generate power and pump water for energy storage.
		 */
		pumpAndGenerator,
			MAX_HydroEnergyConversionKind_ENUM;
	}

	private HydroEnergyConversionKind_ENUM value;

	public BaseClass construct() {
		return new HydroEnergyConversionKind();
        }

	public HydroEnergyConversionKind() {}

	public HydroEnergyConversionKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = HydroEnergyConversionKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = HydroEnergyConversionKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "HydroEnergyConversionKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

