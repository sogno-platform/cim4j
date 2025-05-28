/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * General wind turbine Q control modes <i>M</i><i><sub>qG</sub></i><i>.</i>
 */
public enum WindQcontrolModeKind {
    /**
     * Voltage control (<i>M</i><i><sub>qG</sub></i> equals 0).
     */
    _voltage("voltage"),
    /**
     * Reactive power control (<i>M</i><i><sub>qG</sub></i> equals 1).
     */
    _reactivePower("reactivePower"),
    /**
     * Open loop reactive power control (only used with closed loop at plant level) (<i>M</i><i><sub>qG</sub></i><sub> </sub>equals 2).
     */
    _openLoopReactivePower("openLoopReactivePower"),
    /**
     * Power factor control (<i>M</i><i><sub>qG</sub></i><sub> </sub>equals 3).
     */
    _powerFactor("powerFactor"),
    /**
     * Open loop power factor control (<i>M</i><i><sub>qG</sub></i><sub> </sub>equals 4).
     */
    _openLooppowerFactor("openLooppowerFactor"),
    ;

    private final String value;

    private WindQcontrolModeKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static WindQcontrolModeKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, WindQcontrolModeKind> ENUM_MAP;
    static {
        var map = new HashMap<String, WindQcontrolModeKind>();
        for (WindQcontrolModeKind instance : WindQcontrolModeKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
