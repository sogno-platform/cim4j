package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Types applicable to the control of real power and/or DC voltage by voltage source converter.
*/
public class VsPpccControlKind extends BaseClass
{
	private enum VsPpccControlKind_ENUM
	{
			/**
		 * Control variable (target) is real power at PCC bus.
		 */
		pPcc,
			/**
		 * Control variable (target) is DC voltage and real power at PCC bus is derived.
		 */
		udc,
			/**
		 * Control variables (targets) are both active power at point of common coupling and local DC voltage, with the droop.
		 */
		pPccAndUdcDroop,
			/**
		 * Control variables (targets) are both active power at point of common coupling and compensated DC voltage, with the droop; compensation factor is the resistance, as an approximation of the DC voltage of a common (real or virtual) node in the DC network.
		 */
		pPccAndUdcDroopWithCompensation,
			/**
		 * Control variables (targets) are both active power at point of common coupling and the pilot DC voltage, with the droop.
		 */
		pPccAndUdcDroopPilot,
			MAX_VsPpccControlKind_ENUM;
	}

	private VsPpccControlKind_ENUM value;

	public BaseClass construct() {
		return new VsPpccControlKind();
        }

	public VsPpccControlKind() {}

	public VsPpccControlKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = VsPpccControlKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = VsPpccControlKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "VsPpccControlKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

