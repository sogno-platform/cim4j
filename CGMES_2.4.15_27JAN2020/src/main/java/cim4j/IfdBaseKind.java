/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Excitation base system mode.
 */
public class IfdBaseKind extends BaseClass {

	private static final Logging LOG = Logging.getLogger(IfdBaseKind.class);

	private enum IfdBaseKind_ENUM {
		/**
		 * Air gap line mode.  ifdBaseValue is computed, not defined by the user, in this mode.
		 */
		ifag,
		/**
		 * No load system with saturation mode.  ifdBaseValue is computed, not defined by the user, in this mode.
		 */
		ifnl,
		/**
		 * Full load system mode.  ifdBaseValue is computed, not defined by the user, in this mode.
		 */
		iffl,
		/**
		 * Free mode.  ifdBaseValue is defined by the user in this mode.
		 */
		other,
		MAX_IfdBaseKind_ENUM
	}

	private IfdBaseKind_ENUM value;

	private boolean initialized = false;

	public IfdBaseKind() {
	}

	public IfdBaseKind(java.lang.String s) {
		setValue(s);
	}

	@Override
	public BaseClass construct() {
		return new IfdBaseKind();
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
			value = IfdBaseKind_ENUM.valueOf(s.trim());
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

	private final java.lang.String debugName = "IfdBaseKind";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
