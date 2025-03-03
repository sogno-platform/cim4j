/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Type of generic non-linear load model.
 */
public class GenericNonLinearLoadModelKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(GenericNonLinearLoadModelKind.class);

    private enum GenericNonLinearLoadModelKind_ENUM {
        /**
         * Exponential recovery model.
         */
        exponentialRecovery,
        /**
         * Load adaptive model.
         */
        loadAdaptive,
        MAX_GenericNonLinearLoadModelKind_ENUM
    }

    private GenericNonLinearLoadModelKind_ENUM value;

    private boolean initialized = false;

    public GenericNonLinearLoadModelKind() {
    }

    public GenericNonLinearLoadModelKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new GenericNonLinearLoadModelKind();
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
            value = GenericNonLinearLoadModelKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "GenericNonLinearLoadModelKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
