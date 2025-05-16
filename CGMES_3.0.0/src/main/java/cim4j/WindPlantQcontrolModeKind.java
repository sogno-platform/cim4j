/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Reactive power/voltage controller mode.
 */
public class WindPlantQcontrolModeKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(WindPlantQcontrolModeKind.class);

    private enum WindPlantQcontrolModeKind_ENUM {
        /**
         * Reactive power reference.
         */
        reactivePower,
        /**
         * Power factor reference.
         */
        powerFactor,
        /**
         * UQ static.
         */
        uqStatic,
        /**
         * Voltage control.
         */
        voltageControl,
        MAX_WindPlantQcontrolModeKind_ENUM
    }

    private WindPlantQcontrolModeKind_ENUM value;

    private boolean initialized = false;

    public WindPlantQcontrolModeKind() {
    }

    public WindPlantQcontrolModeKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new WindPlantQcontrolModeKind();
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
            value = WindPlantQcontrolModeKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "WindPlantQcontrolModeKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
