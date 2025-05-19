/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Types applicable to the control of real power and/or DC voltage by voltage source converter.
 */
public enum VsPpccControlKind {
    /**
     * Control variable (target) is real power at PCC bus.
     */
    _pPcc("pPcc"),
    /**
     * Control variable (target) is DC voltage and real power at PCC bus is derived.
     */
    _udc("udc"),
    /**
     * Control variables (targets) are both active power at point of common coupling and local DC voltage, with the droop.
     */
    _pPccAndUdcDroop("pPccAndUdcDroop"),
    /**
     * Control variables (targets) are both active power at point of common coupling and compensated DC voltage, with the droop; compensation factor is the resistance, as an approximation of the DC voltage of a common (real or virtual) node in the DC network.
     */
    _pPccAndUdcDroopWithCompensation("pPccAndUdcDroopWithCompensation"),
    /**
     * Control variables (targets) are both active power at point of common coupling and the pilot DC voltage, with the droop.
     */
    _pPccAndUdcDroopPilot("pPccAndUdcDroopPilot"),
    ;

    private final String value;

    private VsPpccControlKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static VsPpccControlKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, VsPpccControlKind> ENUM_MAP;
    static {
        var map = new HashMap<String, VsPpccControlKind>();
        for (VsPpccControlKind instance : VsPpccControlKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
