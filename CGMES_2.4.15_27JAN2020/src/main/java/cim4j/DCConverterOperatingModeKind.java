/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * The operating mode of an HVDC bipole.
 */
public class DCConverterOperatingModeKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(DCConverterOperatingModeKind.class);

    private enum DCConverterOperatingModeKind_ENUM {
        /**
         * Bipolar operation.
         */
        bipolar,
        /**
         * Monopolar operation with metallic return
         */
        monopolarMetallicReturn,
        /**
         * Monopolar operation with ground return
         */
        monopolarGroundReturn,
        MAX_DCConverterOperatingModeKind_ENUM
    }

    private DCConverterOperatingModeKind_ENUM value;

    private boolean initialized = false;

    public DCConverterOperatingModeKind() {
    }

    public DCConverterOperatingModeKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new DCConverterOperatingModeKind();
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
            value = DCConverterOperatingModeKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "DCConverterOperatingModeKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
