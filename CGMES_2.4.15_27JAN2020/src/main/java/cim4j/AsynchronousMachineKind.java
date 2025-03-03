/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Kind of Asynchronous Machine.
 */
public class AsynchronousMachineKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(AsynchronousMachineKind.class);

    private enum AsynchronousMachineKind_ENUM {
        /**
         * The Asynchronous Machine is a generator.
         */
        generator,
        /**
         * The Asynchronous Machine is a motor.
         */
        motor,
        MAX_AsynchronousMachineKind_ENUM
    }

    private AsynchronousMachineKind_ENUM value;

    private boolean initialized = false;

    public AsynchronousMachineKind() {
    }

    public AsynchronousMachineKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new AsynchronousMachineKind();
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
            value = AsynchronousMachineKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "AsynchronousMachineKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
