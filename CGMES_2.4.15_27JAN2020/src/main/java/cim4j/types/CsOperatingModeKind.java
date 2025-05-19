/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Operating mode for HVDC line operating as Current Source Converter.
 */
public enum CsOperatingModeKind {
    /**
     * Operating as inverter
     */
    _inverter("inverter"),
    /**
     * Operating as rectifier.
     */
    _rectifier("rectifier"),
    ;

    private final String value;

    private CsOperatingModeKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static CsOperatingModeKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, CsOperatingModeKind> ENUM_MAP;
    static {
        var map = new HashMap<String, CsOperatingModeKind>();
        for (CsOperatingModeKind instance : CsOperatingModeKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
