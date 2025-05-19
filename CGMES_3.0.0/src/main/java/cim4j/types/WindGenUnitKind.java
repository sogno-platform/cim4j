/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Kind of wind generating unit.
 */
public enum WindGenUnitKind {
    /**
     * The wind generating unit is located offshore.
     */
    _offshore("offshore"),
    /**
     * The wind generating unit is located onshore.
     */
    _onshore("onshore"),
    ;

    private final String value;

    private WindGenUnitKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static WindGenUnitKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, WindGenUnitKind> ENUM_MAP;
    static {
        var map = new HashMap<String, WindGenUnitKind>();
        for (WindGenUnitKind instance : WindGenUnitKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
