/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Type of input signal coming from remote bus.
 */
public class RemoteSignalKind extends BaseClass {

	private static final Logging LOG = Logging.getLogger(RemoteSignalKind.class);

	private enum RemoteSignalKind_ENUM {
		/**
		 * Input is voltage frequency from remote terminal bus.
		 */
		remoteBusVoltageFrequency,
		/**
		 * Input is voltage frequency deviation from remote terminal bus.
		 */
		remoteBusVoltageFrequencyDeviation,
		/**
		 * Input is frequency from remote terminal bus.
		 */
		remoteBusFrequency,
		/**
		 * Input is frequency deviation from remote terminal bus.
		 */
		remoteBusFrequencyDeviation,
		/**
		 * Input is voltage amplitude from remote terminal bus.
		 */
		remoteBusVoltageAmplitude,
		/**
		 * Input is voltage from remote terminal bus.
		 */
		remoteBusVoltage,
		/**
		 * Input is branch current amplitude from remote terminal bus.
		 */
		remoteBranchCurrentAmplitude,
		/**
		 * Input is branch current amplitude derivative from remote terminal bus.
		 */
		remoteBusVoltageAmplitudeDerivative,
		/**
		 * Input is PU voltage derivative from remote terminal bus.
		 */
		remotePuBusVoltageDerivative,
		MAX_RemoteSignalKind_ENUM
	}

	private RemoteSignalKind_ENUM value;

	private boolean initialized = false;

	public RemoteSignalKind() {
	}

	public RemoteSignalKind(java.lang.String s) {
		setValue(s);
	}

	@Override
	public BaseClass construct() {
		return new RemoteSignalKind();
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
			value = RemoteSignalKind_ENUM.valueOf(s.trim());
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

	private final java.lang.String debugName = "RemoteSignalKind";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
