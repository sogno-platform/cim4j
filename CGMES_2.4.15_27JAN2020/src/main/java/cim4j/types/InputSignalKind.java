/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Input signal type.  In Dynamics modelling, commonly represented by j parameter.
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
     * Input signal is bus voltage fr
     */
    _busFrequency("busFrequency"),
    /**
     * Input signal is deviation of bus voltage frequ
     */
    _busFrequencyDeviation("busFrequencyDeviation"),
    /**
     * Input signal is generator electrical power on rated S.
     */
    _generatorElectricalPower("generatorElectricalPower"),
    /**
     * Input signal is generating accelerating power.
     */
    _generatorAcceleratingPower("generatorAcceleratingPower"),
    /**
     * Input signal
     */
    _busVoltage("busVoltage"),
    /**
     * Input signal is derivative of bus voltag
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
