/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Kind of reactive power control at point of common coupling for a voltage source converter.
 */
public class VsQpccControlKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(VsQpccControlKind.class);

    private enum VsQpccControlKind_ENUM {
        /**
         * Control is reactive power at point of common coupling. Target is provided by VsConverter.targetQpcc.
         */
        reactivePcc,
        /**
         * Control is voltage at point of common coupling. Target is provided by VsConverter.targetUpcc.
         */
        voltagePcc,
        /**
         * Control is power factor at point of common coupling. Target is provided by VsConverter.targetPowerFactorPcc.
         */
        powerFactorPcc,
        /**
         * No explicit control. Pulse-modulation factor is directly set in magnitude (VsConverter.targetPWMfactor) and phase (VsConverter.targetPhasePcc).
         */
        pulseWidthModulation,
        MAX_VsQpccControlKind_ENUM
    }

    private VsQpccControlKind_ENUM value;

    private boolean initialized = false;

    public VsQpccControlKind() {
    }

    public VsQpccControlKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new VsQpccControlKind();
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
            value = VsQpccControlKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "VsQpccControlKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
