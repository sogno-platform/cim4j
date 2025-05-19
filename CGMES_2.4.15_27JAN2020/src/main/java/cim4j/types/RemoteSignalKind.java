/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Type of input signal coming from remote bus.
 */
public enum RemoteSignalKind {
    /**
     * Input is voltage frequency from remote terminal bus.
     */
    _remoteBusVoltageFrequency("remoteBusVoltageFrequency"),
    /**
     * Input is voltage frequency deviation from remote terminal bus.
     */
    _remoteBusVoltageFrequencyDeviation("remoteBusVoltageFrequencyDeviation"),
    /**
     * Input is frequency from remote terminal bus.
     */
    _remoteBusFrequency("remoteBusFrequency"),
    /**
     * Input is frequency deviation from remote terminal bus.
     */
    _remoteBusFrequencyDeviation("remoteBusFrequencyDeviation"),
    /**
     * Input is voltage amplitude from remote terminal bus.
     */
    _remoteBusVoltageAmplitude("remoteBusVoltageAmplitude"),
    /**
     * Input is voltage from remote terminal bus.
     */
    _remoteBusVoltage("remoteBusVoltage"),
    /**
     * Input is branch current amplitude from remote terminal bus.
     */
    _remoteBranchCurrentAmplitude("remoteBranchCurrentAmplitude"),
    /**
     * Input is branch current amplitude derivative from remote terminal bus.
     */
    _remoteBusVoltageAmplitudeDerivative("remoteBusVoltageAmplitudeDerivative"),
    /**
     * Input is PU voltage derivative from remote terminal bus.
     */
    _remotePuBusVoltageDerivative("remotePuBusVoltageDerivative"),
    ;

    private final String value;

    private RemoteSignalKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static RemoteSignalKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, RemoteSignalKind> ENUM_MAP;
    static {
        var map = new HashMap<String, RemoteSignalKind>();
        for (RemoteSignalKind instance : RemoteSignalKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
