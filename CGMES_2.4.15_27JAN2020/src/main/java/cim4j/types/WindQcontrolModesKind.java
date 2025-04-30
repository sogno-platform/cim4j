/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * General wind turbine Q control modes .
 */
public enum WindQcontrolModesKind {
    /**
     * Voltage control ().
     */
    _voltage("voltage"),
    /**
     * Reactive power control ().
     */
    _reactivePower("reactivePower"),
    /**
     * Open loop reactive power control (only used with closed loop at plant level) ().
     */
    _openLoopReactivePower("openLoopReactivePower"),
    /**
     * Power factor control ().
     */
    _powerFactor("powerFactor"),
    ;

    private final String value;

    private WindQcontrolModesKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static WindQcontrolModesKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, WindQcontrolModesKind> ENUM_MAP;
    static {
        var map = new HashMap<String, WindQcontrolModesKind>();
        for (WindQcontrolModesKind instance : WindQcontrolModesKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
