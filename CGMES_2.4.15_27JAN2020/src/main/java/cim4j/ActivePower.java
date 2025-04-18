/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Product of RMS value of the voltage and the RMS value of the in-phase component of the current.
 */
public class ActivePower extends BaseClass {

	private static final Logging LOG = Logging.getLogger(ActivePower.class);

	private double value = 0.0;

	private boolean initialized = false;

	public ActivePower() {
	}

	public ActivePower(double v) {
		value = v;
		initialized = true;
	}

	public ActivePower(java.lang.String s) {
		setValue(s);
	}

	@Override
	public BaseClass construct() {
		return new ActivePower();
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

	private final java.lang.String debugName = "ActivePower";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
