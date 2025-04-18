/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Operating mode for HVDC line operating as Current Source Converter.
 */
public class CsOperatingModeKind extends BaseClass {

	private static final Logging LOG = Logging.getLogger(CsOperatingModeKind.class);

	private enum CsOperatingModeKind_ENUM {
		/**
		 * Operating as inverter
		 */
		inverter,
		/**
		 * Operating as rectifier.
		 */
		rectifier,
		MAX_CsOperatingModeKind_ENUM
	}

	private CsOperatingModeKind_ENUM value;

	private boolean initialized = false;

	public CsOperatingModeKind() {
	}

	public CsOperatingModeKind(java.lang.String s) {
		setValue(s);
	}

	@Override
	public BaseClass construct() {
		return new CsOperatingModeKind();
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
			value = CsOperatingModeKind_ENUM.valueOf(s.trim());
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

	private final java.lang.String debugName = "CsOperatingModeKind";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
