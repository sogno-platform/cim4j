/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The kind of regulation model.   For example regulating voltage, reactive power, active power, etc.
 */
public enum RegulatingControlModeKind {
    /**
     * Voltage is specified.
     */
    _voltage("voltage"),
    /**
     * Active power is specified.
     */
    _activePower("activePower"),
    /**
     * Reactive power is specified.
     */
    _reactivePower("reactivePower"),
    /**
     * Current flow is specified.
     */
    _currentFlow("currentFlow"),
    /**
     * Admittance is specified.
     */
    _admittance("admittance"),
    /**
     * Control switches on/off by time of day. The times may change on the weekend, or in different seasons.
     */
    _timeScheduled("timeScheduled"),
    /**
     * Control switches on/off based on the local temperature (i.e., a thermostat).
     */
    _temperature("temperature"),
    /**
     * Power factor is specified.
     */
    _powerFactor("powerFactor"),
    ;

    private final String value;

    private RegulatingControlModeKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static RegulatingControlModeKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, RegulatingControlModeKind> ENUM_MAP;
    static {
        var map = new HashMap<String, RegulatingControlModeKind>();
        for (RegulatingControlModeKind instance : RegulatingControlModeKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
