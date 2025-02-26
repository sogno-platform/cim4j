/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Date as "yyyy-mm-dd", which conforms with ISO 8601. UTC time zone is specified as "yyyy-mm-ddZ". A local timezone relative UTC is specified as "yyyy-mm-dd(+/-)hh:mm".
 */
public class Date extends BaseClass {

	private java.lang.String value = "";

	private boolean initialized = false;

	public Date() {
	}

	public Date(java.lang.String s) {
		setValue(s);
	}

	@Override
	public BaseClass construct() {
		return new Date();
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

	private final java.lang.String debugName = "Date";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
