/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Type of turbine.
 */
public enum HydroTurbineKind {
    /**
     * Francis.
     */
    _francis("francis"),
    /**
     * Pelton.
     */
    _pelton("pelton"),
    /**
     * Kaplan.
     */
    _kaplan("kaplan"),
    ;

    private final String value;

    private HydroTurbineKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static HydroTurbineKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, HydroTurbineKind> ENUM_MAP;
    static {
        var map = new HashMap<String, HydroTurbineKind>();
        for (HydroTurbineKind instance : HydroTurbineKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
