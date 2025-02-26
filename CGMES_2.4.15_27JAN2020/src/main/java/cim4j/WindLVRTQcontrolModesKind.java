/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * LVRT Q control modes .
 */
public class WindLVRTQcontrolModesKind extends BaseClass {

	private static final Logging LOG = Logging.getLogger(WindLVRTQcontrolModesKind.class);

	private enum WindLVRTQcontrolModesKind_ENUM {
		/**
		 * Voltage dependent reactive current injection ().
		 */
		mode1,
		/**
		 * Reactive current injection controlled as the pre-fault value plus an additional voltage dependent reactive current injection ().
		 */
		mode2,
		/**
		 * Reactive current injection controlled as the pre-fault value plus an additional voltage dependent reactive current injection during fault, and as the pre-fault value plus an additional constant reactive current injection post fault ().
		 */
		mode3,
		MAX_WindLVRTQcontrolModesKind_ENUM
	}

	private WindLVRTQcontrolModesKind_ENUM value;

	private boolean initialized = false;

	public WindLVRTQcontrolModesKind() {
	}

	public WindLVRTQcontrolModesKind(java.lang.String s) {
		setValue(s);
	}

	@Override
	public BaseClass construct() {
		return new WindLVRTQcontrolModesKind();
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
			value = WindLVRTQcontrolModesKind_ENUM.valueOf(s.trim());
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

	private final java.lang.String debugName = "WindLVRTQcontrolModesKind";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
