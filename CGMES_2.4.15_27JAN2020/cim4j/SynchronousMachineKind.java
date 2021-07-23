package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Synchronous machine type.
*/
public class SynchronousMachineKind extends BaseClass
{
	private enum SynchronousMachineKind_ENUM
	{
			/**
		 * 
		 */
		generator,
			/**
		 * 
		 */
		condenser,
			/**
		 * 
		 */
		generatorOrCondenser,
			/**
		 * 
		 */
		motor,
			/**
		 * 
		 */
		generatorOrMotor,
			/**
		 * 
		 */
		motorOrCondenser,
			/**
		 * 
		 */
		generatorOrCondenserOrMotor,
			MAX_SynchronousMachineKind_ENUM;
	}

	private SynchronousMachineKind_ENUM value;

	public BaseClass construct() {
		return new SynchronousMachineKind();
        }

	public SynchronousMachineKind() {}

	public SynchronousMachineKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = SynchronousMachineKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = SynchronousMachineKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "SynchronousMachineKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

