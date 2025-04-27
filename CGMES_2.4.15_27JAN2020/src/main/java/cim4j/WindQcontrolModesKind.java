/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * General wind turbine Q control modes .
 */
public class WindQcontrolModesKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(WindQcontrolModesKind.class);

    private enum WindQcontrolModesKind_ENUM {
        /**
         * Voltage control ().
         */
        voltage,
        /**
         * Reactive power control ().
         */
        reactivePower,
        /**
         * Open loop reactive power control (only used with closed loop at plant level) ().
         */
        openLoopReactivePower,
        /**
         * Power factor control ().
         */
        powerFactor,
        MAX_WindQcontrolModesKind_ENUM
    }

    private WindQcontrolModesKind_ENUM value;

    private boolean initialized = false;

    public WindQcontrolModesKind() {
    }

    public WindQcontrolModesKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new WindQcontrolModesKind();
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
            value = WindQcontrolModesKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "WindQcontrolModesKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
