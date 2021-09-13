package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Type of generic non-linear load model.
*/
public class GenericNonLinearLoadModelKind extends BaseClass
{
	private enum GenericNonLinearLoadModelKind_ENUM
	{
			/**
		 * Exponential recovery model.
		 */
		exponentialRecovery,
			/**
		 * Load adaptive model.
		 */
		loadAdaptive,
			MAX_GenericNonLinearLoadModelKind_ENUM;
	}

	private GenericNonLinearLoadModelKind_ENUM value;

	public BaseClass construct() {
		return new GenericNonLinearLoadModelKind();
        }

	public GenericNonLinearLoadModelKind() {}

	public GenericNonLinearLoadModelKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = GenericNonLinearLoadModelKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = GenericNonLinearLoadModelKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "GenericNonLinearLoadModelKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

