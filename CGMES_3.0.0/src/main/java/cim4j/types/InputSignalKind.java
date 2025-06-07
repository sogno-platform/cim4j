/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Types of input signals.  In dynamics modelling, commonly represented by the <i>j</i> parameter.
 */
public enum InputSignalKind {
    /**
     * Input signal is rotor or shaft speed (angular frequency).
     */
    _rotorSpeed("rotorSpeed"),
    /**
     * Input signal is rotor or shaft angular frequency deviation.
     */
    _rotorAngularFrequencyDeviation("rotorAngularFrequencyDeviation"),
    /**
     * Input signal is bus voltage fr<font color="#0f0f0f">equency.  This could be a terminal frequency or remote frequency.</font>
     */
    _busFrequency("busFrequency"),
    /**
     * Input signal is deviation of bus voltage frequ<font color="#0f0f0f">ency.  This could be a terminal frequency deviation or remote frequency deviation.</font>
     */
    _busFrequencyDeviation("busFrequencyDeviation"),
    /**
     * Input signal is generator electrical power on rated <i>S</i>.
     */
    _generatorElectricalPower("generatorElectricalPower"),
    /**
     * Input signal is generator accelerating power.
     */
    _generatorAcceleratingPower("generatorAcceleratingPower"),
    /**
     * Input signal <font color="#0f0f0f">is bus voltage.  This could be a terminal voltage or remote voltage.</font>
     */
    _busVoltage("busVoltage"),
    /**
     * Input signal is derivative of bus voltag<font color="#0f0f0f">e.  This could be a terminal voltage derivative or remote voltage derivative.</font>
     */
    _busVoltageDerivative("busVoltageDerivative"),
    /**
     * Input signal is amplitude of remote branch current.
     */
    _branchCurrent("branchCurrent"),
    /**
     * Input signal is generator field current.
     */
    _fieldCurrent("fieldCurrent"),
    /**
     * Input signal is generator mechanical power.
     */
    _generatorMechanicalPower("generatorMechanicalPower"),
    ;

    private final String value;

    private InputSignalKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static InputSignalKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, InputSignalKind> ENUM_MAP;
    static {
        var map = new HashMap<String, InputSignalKind>();
        for (InputSignalKind instance : InputSignalKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
