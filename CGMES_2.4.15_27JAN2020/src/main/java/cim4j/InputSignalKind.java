/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Input signal type.  In Dynamics modelling, commonly represented by j parameter.
 */
public class InputSignalKind extends BaseClass {

    private static final Logging LOG = Logging.getLogger(InputSignalKind.class);

    private enum InputSignalKind_ENUM {
        /**
         * Input signal is rotor or shaft speed (angular frequency).
         */
        rotorSpeed,
        /**
         * Input signal is rotor or shaft angular frequency deviation.
         */
        rotorAngularFrequencyDeviation,
        /**
         * Input signal is bus voltage fr
         */
        busFrequency,
        /**
         * Input signal is deviation of bus voltage frequ
         */
        busFrequencyDeviation,
        /**
         * Input signal is generator electrical power on rated S.
         */
        generatorElectricalPower,
        /**
         * Input signal is generating accelerating power.
         */
        generatorAcceleratingPower,
        /**
         * Input signal
         */
        busVoltage,
        /**
         * Input signal is derivative of bus voltag
         */
        busVoltageDerivative,
        /**
         * Input signal is amplitude of remote branch current.
         */
        branchCurrent,
        /**
         * Input signal is generator field current.
         */
        fieldCurrent,
        MAX_InputSignalKind_ENUM
    }

    private InputSignalKind_ENUM value;

    private boolean initialized = false;

    public InputSignalKind() {
    }

    public InputSignalKind(java.lang.String s) {
        setValue(s);
    }

    @Override
    public BaseClass construct() {
        return new InputSignalKind();
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
            value = InputSignalKind_ENUM.valueOf(s.trim());
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

    private final java.lang.String debugName = "InputSignalKind";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }
}
