/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * A floating point number. The range is unspecified and not limited.
 */
public class Simple_Float extends BaseClass {

	private static final Logging LOG = Logging.getLogger(Simple_Float.class);

	private double value = 0.0;

	private boolean initialized = false;

	public Simple_Float() {
	}

	public Simple_Float(double v) {
		value = v;
		initialized = true;
	}

	public Simple_Float(java.lang.String s) {
		setValue(s);
	}

	@Override
	public BaseClass construct() {
		return new Simple_Float();
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
		try {
			value = java.lang.Float.valueOf(s.trim()).floatValue();
			initialized = true;
		} catch (NumberFormatException nfe) {
			LOG.error("NumberFormatException: " + nfe.getMessage());
		}
	}

	@Override
	public Object getValue() {
		return Double.valueOf(value);
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		throw new IllegalArgumentException("Float class cannot set attribute: " + attrName);
	}

	@Override
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		throw new IllegalArgumentException("Float class cannot set attribute: " + attrName);
	}

	@Override
	public java.lang.String toString(boolean topClass) {
		return "Float: (" + Double.toString(value) + ")";
	}

	private final java.lang.String debugName = "Simple_Float";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
