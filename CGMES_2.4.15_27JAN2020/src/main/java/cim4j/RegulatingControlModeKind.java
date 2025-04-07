/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * The kind of regulation model.   For example regulating voltage, reactive power, active power, etc.
 */
public class RegulatingControlModeKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(RegulatingControlModeKind.class);

    private enum RegulatingControlModeKind_ENUM {
        /**
         * Voltage is specified.
         */
        voltage,
        /**
         * Active power is specified.
         */
        activePower,
        /**
         * Reactive power is specified.
         */
        reactivePower,
        /**
         * Current flow is specified.
         */
        currentFlow,
        /**
         * Admittance is specified.
         */
        admittance,
        /**
         * Control switches on/off by time of day. The times may change on the weekend, or in different seasons.
         */
        timeScheduled,
        /**
         * Control switches on/off based on the local temperature (i.e., a thermostat).
         */
        temperature,
        /**
         * Power factor is specified.
         */
        powerFactor,
        MAX_RegulatingControlModeKind_ENUM
    }

    private RegulatingControlModeKind_ENUM value;

    private boolean initialized = false;

    public RegulatingControlModeKind() {
    }

    public RegulatingControlModeKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new RegulatingControlModeKind();
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
            value = RegulatingControlModeKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "RegulatingControlModeKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
