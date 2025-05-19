/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The mode of operation for a Petersen coil.
 */
public enum PetersenCoilModeKind {
    /**
     * Fixed position.
     */
    _fixed("fixed"),
    /**
     * Manual positioning.
     */
    _manual("manual"),
    /**
     * Automatic positioning.
     */
    _automaticPositioning("automaticPositioning"),
    ;

    private final String value;

    private PetersenCoilModeKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static PetersenCoilModeKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, PetersenCoilModeKind> ENUM_MAP;
    static {
        var map = new HashMap<String, PetersenCoilModeKind>();
        for (PetersenCoilModeKind instance : PetersenCoilModeKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
