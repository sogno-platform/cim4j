/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Type of rotor, used by short circuit applications.
 */
public class ShortCircuitRotorKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(ShortCircuitRotorKind.class);

    private enum ShortCircuitRotorKind_ENUM {
        /**
         * Salient pole 1 in IEC 60909.
         */
        salientPole1,
        /**
         * Salient pole 2 in IEC 60909.
         */
        salientPole2,
        /**
         * Turbo Series 1 in IEC 60909.
         */
        turboSeries1,
        /**
         * Turbo series 2 in IEC 60909.
         */
        turboSeries2,
        MAX_ShortCircuitRotorKind_ENUM
    }

    private ShortCircuitRotorKind_ENUM value;

    private boolean initialized = false;

    public ShortCircuitRotorKind() {
    }

    public ShortCircuitRotorKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new ShortCircuitRotorKind();
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
            value = ShortCircuitRotorKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "ShortCircuitRotorKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
