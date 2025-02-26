/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Type of rotor on physical machine.
 */
public class RotorKind extends BaseClass {

	private static final Logging LOG = Logging.getLogger(RotorKind.class);

	private enum RotorKind_ENUM {
		/**
		 * Round rotor type of synchronous machine.
		 */
		roundRotor,
		/**
		 * Salient pole type of synchronous machine.
		 */
		salientPole,
		MAX_RotorKind_ENUM
	}

	private RotorKind_ENUM value;

	private boolean initialized = false;

	public RotorKind() {
	}

	public RotorKind(java.lang.String s) {
		setValue(s);
	}

	@Override
	public BaseClass construct() {
		return new RotorKind();
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
			value = RotorKind_ENUM.valueOf(s.trim());
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

	private final java.lang.String debugName = "RotorKind";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
