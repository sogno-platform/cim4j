/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Control modes for a transformer.
 */
public class TransformerControlMode extends BaseClass {

    private static final Logging LOG = Logging.getLogger(TransformerControlMode.class);

    private enum TransformerControlMode_ENUM {
        /**
         * Voltage control
         */
        volt,
        /**
         * Reactive power flow control
         */
        reactive,
        MAX_TransformerControlMode_ENUM
    }

    private TransformerControlMode_ENUM value;

    private boolean initialized = false;

    public TransformerControlMode() {
    }

    public TransformerControlMode(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new TransformerControlMode();
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
            value = TransformerControlMode_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "TransformerControlMode";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
