/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Types applicable to the control of real power and/or DC voltage by voltage source converter.
 */
public class VsPpccControlKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(VsPpccControlKind.class);

    private enum VsPpccControlKind_ENUM {
        /**
         * Control variable (target) is real power at PCC bus.
         */
        pPcc,
        /**
         * Control variable (target) is DC voltage and real power at PCC bus is derived.
         */
        udc,
        /**
         * Control variables (targets) are both active power at point of common coupling and local DC voltage, with the droop.
         */
        pPccAndUdcDroop,
        /**
         * Control variables (targets) are both active power at point of common coupling and compensated DC voltage, with the droop; compensation factor is the resistance, as an approximation of the DC voltage of a common (real or virtual) node in the DC network.
         */
        pPccAndUdcDroopWithCompensation,
        /**
         * Control variables (targets) are both active power at point of common coupling and the pilot DC voltage, with the droop.
         */
        pPccAndUdcDroopPilot,
        MAX_VsPpccControlKind_ENUM
    }

    private VsPpccControlKind_ENUM value;

    private boolean initialized = false;

    public VsPpccControlKind() {
    }

    public VsPpccControlKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new VsPpccControlKind();
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
            value = VsPpccControlKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "VsPpccControlKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
