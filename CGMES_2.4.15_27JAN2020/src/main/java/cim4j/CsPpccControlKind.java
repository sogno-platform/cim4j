/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Active power control modes for HVDC line operating as Current Source Converter.
 */
public class CsPpccControlKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(CsPpccControlKind.class);

    private enum CsPpccControlKind_ENUM {
        /**
         * Active power control at AC side.
         */
        activePower,
        /**
         * DC voltage control.
         */
        dcVoltage,
        /**
         * DC current control
         */
        dcCurrent,
        MAX_CsPpccControlKind_ENUM
    }

    private CsPpccControlKind_ENUM value;

    private boolean initialized = false;

    public CsPpccControlKind() {
    }

    public CsPpccControlKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new CsPpccControlKind();
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
            value = CsPpccControlKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "CsPpccControlKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
