/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * MonthDay format as "--mm-dd", which conforms with XSD data type gMonthDay.
 */
public class MonthDay extends BaseClass {

	private java.lang.String value = "";

	private boolean initialized = false;

	public MonthDay() {
	}

	public MonthDay(java.lang.String s) {
		setValue(s);
	}

	@Override
	public BaseClass construct() {
		return new MonthDay();
	}

	@Override
	public boolean isPrimitive() {
		return true;
	}

	@Override
	public boolean isInitialized() {
		return initialized;
	}

	@Override
	public void setValue(java.lang.String s) {
		value = s;
		initialized = true;
	}

	@Override
	public Object getValue() {
		return value;
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		throw new IllegalArgumentException("String class cannot set attribute: " + attrName);
	}

	@Override
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		throw new IllegalArgumentException("String class cannot set attribute: " + attrName);
	}

	@Override
	public java.lang.String toString(boolean topClass) {
		return value;
	}

	private final java.lang.String debugName = "MonthDay";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
