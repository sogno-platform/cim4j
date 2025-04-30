/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Specifies the capability of the hydro generating unit to convert energy as a generator or pump.
 */
public enum HydroEnergyConversionKind {
    /**
     * Able to generate power, but not able to pump water for energy storage.
     */
    _generator("generator"),
    /**
     * Able to both generate power and pump water for energy storage.
     */
    _pumpAndGenerator("pumpAndGenerator"),
    ;

    private final String value;

    private HydroEnergyConversionKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static HydroEnergyConversionKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, HydroEnergyConversionKind> ENUM_MAP;
    static {
        var map = new HashMap<String, HydroEnergyConversionKind>();
        for (HydroEnergyConversionKind instance : HydroEnergyConversionKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
