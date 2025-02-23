package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
The source of controls for a generating unit.
*/
public class GeneratorControlSource extends BaseClass
{
	private enum GeneratorControlSource_ENUM
	{
			/**
		 * Not available.
		 */
		unavailable,
			/**
		 * Off of automatic generation control (AGC).
		 */
		offAGC,
			/**
		 * On automatic generation control (AGC).
		 */
		onAGC,
			/**
		 * Plant is controlling.
		 */
		plantControl,
			MAX_GeneratorControlSource_ENUM;
	}

	private GeneratorControlSource_ENUM value;

	public BaseClass construct() {
		return new GeneratorControlSource();
        }

	public GeneratorControlSource() {}

	public GeneratorControlSource(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = GeneratorControlSource_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = GeneratorControlSource_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "GeneratorControlSource";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

