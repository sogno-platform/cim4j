package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Governor control flag for Francis hydro model.
*/
public class FrancisGovernorControlKind extends BaseClass
{
	private enum FrancisGovernorControlKind_ENUM
	{
			/**
		 * Mechanic-hydraulic regulator with tacho-accelerometer (Cflag = 1).
		 */
		mechanicHydrolicTachoAccelerator,
			/**
		 * Mechanic-hydraulic regulator with transient feedback (Cflag=2).
		 */
		mechanicHydraulicTransientFeedback,
			/**
		 * Electromechanical and electrohydraulic regulator (Cflag=3).
		 */
		electromechanicalElectrohydraulic,
			MAX_FrancisGovernorControlKind_ENUM;
	}

	private FrancisGovernorControlKind_ENUM value;

	public BaseClass construct() {
		return new FrancisGovernorControlKind();
        }

	public FrancisGovernorControlKind() {}

	public FrancisGovernorControlKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = FrancisGovernorControlKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = FrancisGovernorControlKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "FrancisGovernorControlKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

