/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Type of generic non-linear load model.
 */
public enum GenericNonLinearLoadModelKind {
    /**
     * Exponential recovery model.
     */
    _exponentialRecovery("exponentialRecovery"),
    /**
     * Load adaptive model.
     */
    _loadAdaptive("loadAdaptive"),
    ;

    private final String value;

    private GenericNonLinearLoadModelKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static GenericNonLinearLoadModelKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, GenericNonLinearLoadModelKind> ENUM_MAP;
    static {
        var map = new HashMap<String, GenericNonLinearLoadModelKind>();
        for (GenericNonLinearLoadModelKind instance : GenericNonLinearLoadModelKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
