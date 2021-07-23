package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*

*/
public class VsQpccControlKind extends BaseClass
{
	private enum VsQpccControlKind_ENUM
	{
			/**
		 * 
		 */
		reactivePcc,
			/**
		 * 
		 */
		voltagePcc,
			/**
		 * 
		 */
		powerFactorPcc,
			MAX_VsQpccControlKind_ENUM;
	}

	private VsQpccControlKind_ENUM value;

	public BaseClass construct() {
		return new VsQpccControlKind();
        }

	public VsQpccControlKind() {}

	public VsQpccControlKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = VsQpccControlKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = VsQpccControlKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "VsQpccControlKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

