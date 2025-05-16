/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * The mode of operation for a Petersen coil.
 */
public class PetersenCoilModeKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(PetersenCoilModeKind.class);

    private enum PetersenCoilModeKind_ENUM {
        /**
         * Fixed position.
         */
        fixed,
        /**
         * Manual positioning.
         */
        manual,
        /**
         * Automatic positioning.
         */
        automaticPositioning,
        MAX_PetersenCoilModeKind_ENUM
    }

    private PetersenCoilModeKind_ENUM value;

    private boolean initialized = false;

    public PetersenCoilModeKind() {
    }

    public PetersenCoilModeKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new PetersenCoilModeKind();
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
            value = PetersenCoilModeKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "PetersenCoilModeKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
