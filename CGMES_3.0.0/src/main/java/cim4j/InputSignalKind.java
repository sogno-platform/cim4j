/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * Types of input signals.  In dynamics modelling, commonly represented by the <i>j</i> parameter.
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
         * Input signal is bus voltage fr&lt;font color=&quot;#0f0f0f&quot;&gt;equency.  This could be a terminal frequency or remote frequency.&lt;/font&gt;
         */
        busFrequency,
        /**
         * Input signal is deviation of bus voltage frequ&lt;font color=&quot;#0f0f0f&quot;&gt;ency.  This could be a terminal frequency deviation or remote frequency deviation.&lt;/font&gt;
         */
        busFrequencyDeviation,
        /**
         * Input signal is generator electrical power on rated &lt;i&gt;S&lt;/i&gt;.
         */
        generatorElectricalPower,
        /**
         * Input signal is generator accelerating power.
         */
        generatorAcceleratingPower,
        /**
         * Input signal &lt;font color=&quot;#0f0f0f&quot;&gt;is bus voltage.  This could be a terminal voltage or remote voltage.&lt;/font&gt;
         */
        busVoltage,
        /**
         * Input signal is derivative of bus voltag&lt;font color=&quot;#0f0f0f&quot;&gt;e.  This could be a terminal voltage derivative or remote voltage derivative.&lt;/font&gt;
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
        /**
         * Input signal is generator mechanical power.
         */
        generatorMechanicalPower,
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
