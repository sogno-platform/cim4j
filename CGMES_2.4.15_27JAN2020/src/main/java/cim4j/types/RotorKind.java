/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Type of rotor on physical machine.
 */
public enum RotorKind {
    /**
     * Round rotor type of synchronous machine.
     */
    _roundRotor("roundRotor"),
    /**
     * Salient pole type of synchronous machine.
     */
    _salientPole("salientPole"),
    ;

    private final String value;

    private RotorKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static RotorKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, RotorKind> ENUM_MAP;
    static {
        var map = new HashMap<String, RotorKind>();
        for (RotorKind instance : RotorKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
