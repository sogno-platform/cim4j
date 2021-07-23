package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
The direction attribute describes the side of  a limit that is a violation.
*/
public class OperationalLimitDirectionKind extends BaseClass
{
	private enum OperationalLimitDirectionKind_ENUM
	{
			/**
		 * High means that a monitored value above the limit value is a violation.   If applied to a terminal flow, the positive direction is into the terminal.
		 */
		high,
			/**
		 * Low means a monitored value below the limit is a violation.  If applied to a terminal flow, the positive direction is into the terminal.
		 */
		low,
			/**
		 * An absoluteValue limit means that a monitored absolute value above the limit value is a violation.
		 */
		absoluteValue,
			MAX_OperationalLimitDirectionKind_ENUM;
	}

	private OperationalLimitDirectionKind_ENUM value;

	public BaseClass construct() {
		return new OperationalLimitDirectionKind();
        }

	public OperationalLimitDirectionKind() {}

	public OperationalLimitDirectionKind(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = OperationalLimitDirectionKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = OperationalLimitDirectionKind_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "OperationalLimitDirectionKind";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString() {
		return "";
	}
};

