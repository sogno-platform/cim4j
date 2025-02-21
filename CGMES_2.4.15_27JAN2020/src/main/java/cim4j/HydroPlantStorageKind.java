package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
The type of hydro power plant.
*/
public class HydroPlantStorageKind extends BaseClass
{
	private enum HydroPlantStorageKind_ENUM
	{
			/**
		 * Run of river.
		 */
		runOfRiver,
			/**
		 * Pumped storage.
		 */
		pumpedStorage,
			/**
		 * Storage.
		 */
		storage,
			MAX_HydroPlantStorageKind_ENUM;
	}

	private HydroPlantStorageKind_ENUM value;

	public BaseClass construct() {
		return new HydroPlantStorageKind();
        }

	public HydroPlantStorageKind() {}

	public HydroPlantStorageKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = HydroPlantStorageKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = HydroPlantStorageKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "HydroPlantStorageKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

