/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Inductance per unit of length.
 */
public class InductancePerLength extends BaseClass {

	private static final Logging LOG = Logging.getLogger(InductancePerLength.class);

	private double value = 0.0;

	private boolean initialized = false;

	public InductancePerLength() {
	}

	public InductancePerLength(double v) {
		value = v;
		initialized = true;
	}

	public InductancePerLength(java.lang.String s) {
		setValue(s);
	}

	@Override
	public BaseClass construct() {
		return new InductancePerLength();
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

	private final java.lang.String debugName = "InductancePerLength";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
