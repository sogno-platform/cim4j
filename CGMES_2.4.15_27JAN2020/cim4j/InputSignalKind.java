package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Input signal type.  In Dynamics modelling, commonly represented by j parameter.
*/
public class InputSignalKind extends BaseClass
{
	private enum InputSignalKind_ENUM
	{
			/**
		 * Input signal is rotor or shaft speed (angular frequency).
		 */
		rotorSpeed,
			/**
		 * Input signal is rotor or shaft angular frequency deviation.
		 */
		rotorAngularFrequencyDeviation,
			/**
		 * Input signal is bus voltage fr
		 */
		busFrequency,
			/**
		 * Input signal is deviation of bus voltage frequ
		 */
		busFrequencyDeviation,
			/**
		 * Input signal is generator electrical power on rated S.
		 */
		generatorElectricalPower,
			/**
		 * Input signal is generating accelerating power.
		 */
		generatorAcceleratingPower,
			/**
		 * Input signal
		 */
		busVoltage,
			/**
		 * Input signal is derivative of bus voltag
		 */
		busVoltageDerivative,
			/**
		 * Input signal is amplitude of remote branch current.
		 */
		branchCurrent,
			/**
		 * Input signal is generator field current.
		 */
		fieldCurrent,
			MAX_InputSignalKind_ENUM;
	}

	private InputSignalKind_ENUM value;

	public BaseClass construct() {
		return new InputSignalKind();
        }

	public InputSignalKind() {}

	public InputSignalKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = InputSignalKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = InputSignalKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "InputSignalKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

