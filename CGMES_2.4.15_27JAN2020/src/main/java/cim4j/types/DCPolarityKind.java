/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Polarity for DC circuits.
 */
public enum DCPolarityKind {
    /**
     * Positive pole.
     */
    _positive("positive"),
    /**
     * Middle pole, potentially grounded.
     */
    _middle("middle"),
    /**
     * Negative pole.
     */
    _negative("negative"),
    ;

    private final String value;

    private DCPolarityKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static DCPolarityKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, DCPolarityKind> ENUM_MAP;
    static {
        var map = new HashMap<String, DCPolarityKind>();
        for (DCPolarityKind instance : DCPolarityKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
