/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Static VAr Compensator control mode.
 */
public enum SVCControlMode {
    /**
     * Reactive power control.
     */
    _reactivePower("reactivePower"),
    /**
     * Voltage control.
     */
    _voltage("voltage"),
    ;

    private final String value;

    private SVCControlMode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static SVCControlMode fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, SVCControlMode> ENUM_MAP;
    static {
        var map = new HashMap<String, SVCControlMode>();
        for (SVCControlMode instance : SVCControlMode.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
