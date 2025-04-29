/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Synchronous machine operating mode.
 */
public class SynchronousMachineOperatingMode extends BaseClass {

    private static final Logging LOG = Logging.getLogger(SynchronousMachineOperatingMode.class);

    private enum SynchronousMachineOperatingMode_ENUM {
        /**
         * Operating as generator.
         */
        generator,
        /**
         * Operating as condenser.
         */
        condenser,
        /**
         * Operating as motor.
         */
        motor,
        MAX_SynchronousMachineOperatingMode_ENUM
    }

    private SynchronousMachineOperatingMode_ENUM value;

    private boolean initialized = false;

    public SynchronousMachineOperatingMode() {
    }

    public SynchronousMachineOperatingMode(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new SynchronousMachineOperatingMode();
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
            value = SynchronousMachineOperatingMode_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "SynchronousMachineOperatingMode";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
