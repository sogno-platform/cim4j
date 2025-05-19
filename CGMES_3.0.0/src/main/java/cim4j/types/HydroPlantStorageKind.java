/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The type of hydro power plant.
 */
public enum HydroPlantStorageKind {
    /**
     * Run of river.
     */
    _runOfRiver("runOfRiver"),
    /**
     * Pumped storage.
     */
    _pumpedStorage("pumpedStorage"),
    /**
     * Storage.
     */
    _storage("storage"),
    ;

    private final String value;

    private HydroPlantStorageKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static HydroPlantStorageKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, HydroPlantStorageKind> ENUM_MAP;
    static {
        var map = new HashMap<String, HydroPlantStorageKind>();
        for (HydroPlantStorageKind instance : HydroPlantStorageKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
