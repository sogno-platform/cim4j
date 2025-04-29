/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * The state of the battery unit.
 */
public class BatteryStateKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(BatteryStateKind.class);

    private enum BatteryStateKind_ENUM {
        /**
         * Stored energy is decreasing.
         */
        discharging,
        /**
         * Unable to charge, and not discharging.
         */
        full,
        /**
         * Neither charging nor discharging, but able to do so.
         */
        waiting,
        /**
         * Stored energy is increasing.
         */
        charging,
        /**
         * Unable to discharge, and not charging.
         */
        empty,
        MAX_BatteryStateKind_ENUM
    }

    private BatteryStateKind_ENUM value;

    private boolean initialized = false;

    public BatteryStateKind() {
    }

    public BatteryStateKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new BatteryStateKind();
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
            value = BatteryStateKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "BatteryStateKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
