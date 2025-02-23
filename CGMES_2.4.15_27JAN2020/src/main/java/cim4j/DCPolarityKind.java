/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Polarity for DC circuits.
 */
public class DCPolarityKind extends BaseClass {

	private static final Logging LOG = Logging.getLogger(DCPolarityKind.class);

	private enum DCPolarityKind_ENUM {
		/**
		 * Positive pole.
		 */
		positive,
		/**
		 * Middle pole, potentially grounded.
		 */
		middle,
		/**
		 * Negative pole.
		 */
		negative,
		MAX_DCPolarityKind_ENUM
	}

	private DCPolarityKind_ENUM value;

	private boolean initialized = false;

	public DCPolarityKind() {
	}

	public DCPolarityKind(java.lang.String s) {
		setValue(s);
	}

	@Override
	public BaseClass construct() {
		return new DCPolarityKind();
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
			value = DCPolarityKind_ENUM.valueOf(s.trim());
			initialized = true;
		} catch (IllegalArgumentException iae) {
			LOG.error("IllegalArgumentException: " + iae.getMessage());
		}
	}

	@Override
	public Object getValue() {
		return value.toString();
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attrName);
	}

	@Override
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attrName);
	}

	@Override
	public java.lang.String toString(boolean topClass) {
		return "Enum (" + value.toString() + ")";
	}

	private final java.lang.String debugName = "DCPolarityKind";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
