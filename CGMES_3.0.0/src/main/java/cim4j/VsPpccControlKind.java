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
         * Control is real power at point of common coupling. The target value is provided by ACDCConverter.targetPpcc.
         */
        pPcc,
        /**
         * Control is DC voltage  with target value provided by ACDCConverter.targetUdc.
         */
        udc,
        /**
         * Control is active power at point of common coupling and local DC voltage, with the droop. Target values are provided by ACDCConverter.targetPpcc, ACDCConverter.targetUdc and VsConverter.droop.
         */
        pPccAndUdcDroop,
        /**
         * Control is active power at point of common coupling and compensated DC voltage, with the droop. Compensation factor is the resistance, as an approximation of the DC voltage of a common (real or virtual) node in the DC network. Targets are provided by ACDCConverter.targetPpcc, ACDCConverter.targetUdc, VsConverter.droop and VsConverter.droopCompensation.
         */
        pPccAndUdcDroopWithCompensation,
        /**
         * Control is active power at point of common coupling and the pilot DC voltage, with the droop. The mode is used for Multi Terminal High Voltage DC (MTDC) systems where multiple HVDC Substations are connected to the HVDC transmission lines. The pilot voltage is then used to coordinate the control the DC voltage across the HVDC substations. Targets are provided by ACDCConverter.targetPpcc, ACDCConverter.targetUdc and  VsConverter.droop.
         */
        pPccAndUdcDroopPilot,
        /**
         * Control is phase at point of common coupling. Target is provided by VsConverter.targetPhasePcc.
         */
        phasePcc,
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
