/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The type of control area.
 */
public enum ControlAreaTypeKind {
    /**
     * Used for automatic generation control.
     */
    _AGC("AGC"),
    /**
     * Used for load forecast.
     */
    _Forecast("Forecast"),
    /**
     * Used for interchange specification or control.
     */
    _Interchange("Interchange"),
    ;

    private final String value;

    private ControlAreaTypeKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static ControlAreaTypeKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, ControlAreaTypeKind> ENUM_MAP;
    static {
        var map = new HashMap<String, ControlAreaTypeKind>();
        for (ControlAreaTypeKind instance : ControlAreaTypeKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
