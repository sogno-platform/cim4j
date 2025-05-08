/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Polarity for DC circuits.
 */
public class DCPolarityKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(DCPolarityKind.class);

    private enum DCPolarityKind_ENUM {
        /**
         * Positive pole. The converter terminal is intended to operate at a positive voltage relative the midpoint or negative terminal.
         */
        positive,
        /**
         * Middle pole. The converter terminal is the midpoint in a bipolar or symmetric monopole configuration. The midpoint can be grounded and/or have a metallic return.
         */
        middle,
        /**
         * Negative pole. The converter terminal is intended to operate at a negative voltage relative the midpoint or positive terminal.
         */
        negative,
        MAX_DCPolarityKind_ENUM
    }

    private DCPolarityKind_ENUM value;

    private boolean initialized = false;

    public DCPolarityKind() {
    }

    public DCPolarityKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new DCPolarityKind();
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
            value = DCPolarityKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "DCPolarityKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
