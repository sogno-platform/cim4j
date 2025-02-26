/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Governor control flag for Francis hydro model.
 */
public class FrancisGovernorControlKind extends BaseClass {

	private static final Logging LOG = Logging.getLogger(FrancisGovernorControlKind.class);

	private enum FrancisGovernorControlKind_ENUM {
		/**
		 * Mechanic-hydraulic regulator with tacho-accelerometer (Cflag = 1).
		 */
		mechanicHydrolicTachoAccelerator,
		/**
		 * Mechanic-hydraulic regulator with transient feedback (Cflag=2).
		 */
		mechanicHydraulicTransientFeedback,
		/**
		 * Electromechanical and electrohydraulic regulator (Cflag=3).
		 */
		electromechanicalElectrohydraulic,
		MAX_FrancisGovernorControlKind_ENUM
	}

	private FrancisGovernorControlKind_ENUM value;

	private boolean initialized = false;

	public FrancisGovernorControlKind() {
	}

	public FrancisGovernorControlKind(java.lang.String s) {
		setValue(s);
	}

	@Override
	public BaseClass construct() {
		return new FrancisGovernorControlKind();
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
			value = FrancisGovernorControlKind_ENUM.valueOf(s.trim());
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

	private final java.lang.String debugName = "FrancisGovernorControlKind";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
