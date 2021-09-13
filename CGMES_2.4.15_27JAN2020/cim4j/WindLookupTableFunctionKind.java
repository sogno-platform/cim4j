package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Function of the lookup table.
*/
public class WindLookupTableFunctionKind extends BaseClass
{
	private enum WindLookupTableFunctionKind_ENUM
	{
			/**
		 * Power versus slip lookup table (f()). It is used for rotor resistance control model, IEC 61400-27-1, section 6.6.5.2.
		 */
		fpslip,
			/**
		 * Power vs. speed lookup table (f()). It is used for P control model type 3, IEC 61400-27-1, section 6.6.5.3.
		 */
		fpomega,
			/**
		 * Lookup table for voltage dependency of active current limits (i()). It is used for current limitation model, IEC 61400-27-1, section 6.6.5.7.
		 */
		ipvdl,
			/**
		 * Lookup table for voltage dependency of reactive current limits (i()). It is used for current limitation model, IEC 61400-27-1, section 6.6.5.7.
		 */
		iqvdl,
			/**
		 * Power vs. frequency lookup table (()). It is used for wind power plant frequency and active power control model, IEC 61400-27-1, Annex E.
		 */
		fdpf,
			MAX_WindLookupTableFunctionKind_ENUM;
	}

	private WindLookupTableFunctionKind_ENUM value;

	public BaseClass construct() {
		return new WindLookupTableFunctionKind();
        }

	public WindLookupTableFunctionKind() {}

	public WindLookupTableFunctionKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = WindLookupTableFunctionKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = WindLookupTableFunctionKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "WindLookupTableFunctionKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

