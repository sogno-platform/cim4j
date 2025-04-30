/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The state of the battery unit.
 */
public enum BatteryStateKind {
    /**
     * Stored energy is decreasing.
     */
    _discharging("discharging"),
    /**
     * Unable to charge, and not discharging.
     */
    _full("full"),
    /**
     * Neither charging nor discharging, but able to do so.
     */
    _waiting("waiting"),
    /**
     * Stored energy is increasing.
     */
    _charging("charging"),
    /**
     * Unable to discharge, and not charging.
     */
    _empty("empty"),
    ;

    private final String value;

    private BatteryStateKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static BatteryStateKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, BatteryStateKind> ENUM_MAP;
    static {
        var map = new HashMap<String, BatteryStateKind>();
        for (BatteryStateKind instance : BatteryStateKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
