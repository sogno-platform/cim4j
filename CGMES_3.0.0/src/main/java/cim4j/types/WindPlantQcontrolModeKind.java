/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Reactive power/voltage controller mode.
 */
public enum WindPlantQcontrolModeKind {
    /**
     * Reactive power reference.
     */
    _reactivePower("reactivePower"),
    /**
     * Power factor reference.
     */
    _powerFactor("powerFactor"),
    /**
     * UQ static.
     */
    _uqStatic("uqStatic"),
    /**
     * Voltage control.
     */
    _voltageControl("voltageControl"),
    ;

    private final String value;

    private WindPlantQcontrolModeKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static WindPlantQcontrolModeKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, WindPlantQcontrolModeKind> ENUM_MAP;
    static {
        var map = new HashMap<String, WindPlantQcontrolModeKind>();
        for (WindPlantQcontrolModeKind instance : WindPlantQcontrolModeKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
