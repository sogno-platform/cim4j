/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Type of rate feedback signals.
 */
public class ExcREXSFeedbackSignalKind extends BaseClass {

	private static final Logging LOG = Logging.getLogger(ExcREXSFeedbackSignalKind.class);

	private enum ExcREXSFeedbackSignalKind_ENUM {
		/**
		 * The voltage regulator output voltage is used. It is the same as exciter field voltage.
		 */
		fieldVoltage,
		/**
		 * The exciter field current is used.
		 */
		fieldCurrent,
		/**
		 * The output voltage of the exciter is used.
		 */
		outputVoltage,
		MAX_ExcREXSFeedbackSignalKind_ENUM
	}

	private ExcREXSFeedbackSignalKind_ENUM value;

	private boolean initialized = false;

	public ExcREXSFeedbackSignalKind() {
	}

	public ExcREXSFeedbackSignalKind(java.lang.String s) {
		setValue(s);
	}

	@Override
	public BaseClass construct() {
		return new ExcREXSFeedbackSignalKind();
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
			value = ExcREXSFeedbackSignalKind_ENUM.valueOf(s.trim());
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

	private final java.lang.String debugName = "ExcREXSFeedbackSignalKind";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
