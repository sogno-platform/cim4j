/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Kind of reactive power control at point of common coupling for a voltage source converter.
 */
public enum VsQpccControlKind {
    /**
     * Control is reactive power at point of common coupling. Target is provided by VsConverter.targetQpcc.
     */
    _reactivePcc("reactivePcc"),
    /**
     * Control is voltage at point of common coupling. Target is provided by VsConverter.targetUpcc.
     */
    _voltagePcc("voltagePcc"),
    /**
     * Control is power factor at point of common coupling. Target is provided by VsConverter.targetPowerFactorPcc.
     */
    _powerFactorPcc("powerFactorPcc"),
    /**
     * No explicit control. Pulse-modulation factor is directly set in magnitude (VsConverter.targetPWMfactor) and phase (VsConverter.targetPhasePcc).
     */
    _pulseWidthModulation("pulseWidthModulation"),
    ;

    private final String value;

    private VsQpccControlKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static VsQpccControlKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, VsQpccControlKind> ENUM_MAP;
    static {
        var map = new HashMap<String, VsQpccControlKind>();
        for (VsQpccControlKind instance : VsQpccControlKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
