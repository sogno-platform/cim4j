/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Type of connection for the UEL input used in ExcIEEEST1A.
 */
public class ExcIEEEST1AUELselectorKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(ExcIEEEST1AUELselectorKind.class);

    private enum ExcIEEEST1AUELselectorKind_ENUM {
        /**
         * Ignore UEL signal.
         */
        ignoreUELsignal,
        /**
         * UEL input HV gate with voltage regulator output.
         */
        inputHVgateVoltageOutput,
        /**
         * UEL input HV gate with error signal.
         */
        inputHVgateErrorSignal,
        /**
         * UEL input added to error signal.
         */
        inputAddedToErrorSignal,
        MAX_ExcIEEEST1AUELselectorKind_ENUM
    }

    private ExcIEEEST1AUELselectorKind_ENUM value;

    private boolean initialized = false;

    public ExcIEEEST1AUELselectorKind() {
    }

    public ExcIEEEST1AUELselectorKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new ExcIEEEST1AUELselectorKind();
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
            value = ExcIEEEST1AUELselectorKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "ExcIEEEST1AUELselectorKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
