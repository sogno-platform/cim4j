/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The operating mode of an HVDC bipole.
 */
public enum DCConverterOperatingModeKind {
    /**
     * Bipolar operation.
     */
    _bipolar("bipolar"),
    /**
     * Monopolar operation with metallic return
     */
    _monopolarMetallicReturn("monopolarMetallicReturn"),
    /**
     * Monopolar operation with ground return
     */
    _monopolarGroundReturn("monopolarGroundReturn"),
    ;

    private final String value;

    private DCConverterOperatingModeKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static DCConverterOperatingModeKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, DCConverterOperatingModeKind> ENUM_MAP;
    static {
        var map = new HashMap<String, DCConverterOperatingModeKind>();
        for (DCConverterOperatingModeKind instance : DCConverterOperatingModeKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
