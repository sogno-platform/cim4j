/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Type of synchronous machine model used in Dynamic simulation applications.
 */
public class SynchronousMachineModelKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(SynchronousMachineModelKind.class);

    private enum SynchronousMachineModelKind_ENUM {
        /**
         * Subtransient synchronous machine model.
         */
        subtransient,
        /**
         * WECC Type F variant of subtransient synchronous machine model.
         */
        subtransientTypeF,
        /**
         * WECC Type J variant of subtransient synchronous machine model.
         */
        subtransientTypeJ,
        /**
         * Simplified version of subtransient synchronous machine model where magnetic coupling between the direct and quadrature axes is ignored.
         */
        subtransientSimplified,
        /**
         * Simplified version of a subtransient synchronous machine model with no damper circuit on d-axis.
         */
        subtransientSimplifiedDirectAxis,
        MAX_SynchronousMachineModelKind_ENUM
    }

    private SynchronousMachineModelKind_ENUM value;

    private boolean initialized = false;

    public SynchronousMachineModelKind() {
    }

    public SynchronousMachineModelKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new SynchronousMachineModelKind();
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
            value = SynchronousMachineModelKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "SynchronousMachineModelKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
