/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Synchronous machine type.
 */
public class SynchronousMachineKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(SynchronousMachineKind.class);

    private enum SynchronousMachineKind_ENUM {
        /**
         * Indicates the synchronous machine can operate as a generator.
         */
        generator,
        /**
         * Indicates the synchronous machine can operate as a condenser.
         */
        condenser,
        /**
         * Indicates the synchronous machine can operate as a generator or as a condenser.
         */
        generatorOrCondenser,
        /**
         * Indicates the synchronous machine can operate as a motor.
         */
        motor,
        /**
         * Indicates the synchronous machine can operate as a generator or as a motor.
         */
        generatorOrMotor,
        /**
         * Indicates the synchronous machine can operate as a motor or as a condenser.
         */
        motorOrCondenser,
        /**
         * Indicates the synchronous machine can operate as a generator or as a condenser or as a motor.
         */
        generatorOrCondenserOrMotor,
        MAX_SynchronousMachineKind_ENUM
    }

    private SynchronousMachineKind_ENUM value;

    private boolean initialized = false;

    public SynchronousMachineKind() {
    }

    public SynchronousMachineKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new SynchronousMachineKind();
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
            value = SynchronousMachineKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "SynchronousMachineKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
