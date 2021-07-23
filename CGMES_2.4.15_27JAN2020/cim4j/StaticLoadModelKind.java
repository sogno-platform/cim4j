package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Type of static load model.
*/
public class StaticLoadModelKind extends BaseClass
{
	private enum StaticLoadModelKind_ENUM
	{
			/**
		 * Exponential P and Q equations are used and the following attributes are required: kp1, kp2, kp3, kpf, ep1, ep2, ep3 kq1, kq2, kq3, kqf, eq1, eq2, eq3.
		 */
		exponential,
			/**
		 * ZIP1 P and Q equations are used and the following attributes are required: kp1, kp2, kp3, kpf kq1, kq2, kq3, kqf.
		 */
		zIP1,
			/**
		 * This model separates the frequency-dependent load (primarily motors) from other load.  ZIP2 P and Q equations are used and the following attributes are required: kp1, kp2, kp3, kq4, kpf kq1, kq2, kq3, kq4, kqf.
		 */
		zIP2,
			/**
		 * The load is represented as a constant impedance.  ConstantZ P and Q equations are used and no attributes are required.
		 */
		constantZ,
			MAX_StaticLoadModelKind_ENUM;
	}

	private StaticLoadModelKind_ENUM value;

	public BaseClass construct() {
		return new StaticLoadModelKind();
        }

	public StaticLoadModelKind() {}

	public StaticLoadModelKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = StaticLoadModelKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = StaticLoadModelKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "StaticLoadModelKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

