/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Type of rotor, used by short circuit applications.
 */
public enum ShortCircuitRotorKind {
    /**
     * Salient pole 1 in the IEC 60909
     */
    _salientPole1("salientPole1"),
    /**
     * Salient pole 2 in IEC 60909
     */
    _salientPole2("salientPole2"),
    /**
     * Turbo Series 1 in the IEC 60909
     */
    _turboSeries1("turboSeries1"),
    /**
     * Turbo series 2 in IEC 60909
     */
    _turboSeries2("turboSeries2"),
    ;

    private final String value;

    private ShortCircuitRotorKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static ShortCircuitRotorKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, ShortCircuitRotorKind> ENUM_MAP;
    static {
        var map = new HashMap<String, ShortCircuitRotorKind>();
        for (ShortCircuitRotorKind instance : ShortCircuitRotorKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
