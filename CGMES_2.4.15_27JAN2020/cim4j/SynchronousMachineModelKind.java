package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Type of synchronous machine model used in Dynamic simulation applications.
*/
public class SynchronousMachineModelKind extends BaseClass
{
	private enum SynchronousMachineModelKind_ENUM
	{
			/**
		 * Subtransient synchronous machine model.
		 */
		subtransient,
			/**
		 * WECC Type F variant of subtransient synchronous machine model.
		 */
		subtransientTypeF,
			/**
		 * WECC Type J variant of subtransient synchronous machine model.
		 */
		subtransientTypeJ,
			/**
		 * Simplified version of subtransient synchronous machine model where magnetic coupling between the direct and quadrature axes is ignored.
		 */
		subtransientSimplified,
			/**
		 * Simplified version of a subtransient synchronous machine model with no damper circuit on d-axis.
		 */
		subtransientSimplifiedDirectAxis,
			MAX_SynchronousMachineModelKind_ENUM;
	}

	private SynchronousMachineModelKind_ENUM value;

	public BaseClass construct() {
		return new SynchronousMachineModelKind();
        }

	public SynchronousMachineModelKind() {}

	public SynchronousMachineModelKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = SynchronousMachineModelKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = SynchronousMachineModelKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "SynchronousMachineModelKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

