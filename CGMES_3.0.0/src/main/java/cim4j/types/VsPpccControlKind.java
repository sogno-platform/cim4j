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
     * Control is real power at point of common coupling. The target value is provided by ACDCConverter.targetPpcc.
     */
    _pPcc("pPcc"),
    /**
     * Control is DC voltage  with target value provided by ACDCConverter.targetUdc.
     */
    _udc("udc"),
    /**
     * Control is active power at point of common coupling and local DC voltage, with the droop. Target values are provided by ACDCConverter.targetPpcc, ACDCConverter.targetUdc and VsConverter.droop.
     */
    _pPccAndUdcDroop("pPccAndUdcDroop"),
    /**
     * Control is active power at point of common coupling and compensated DC voltage, with the droop. Compensation factor is the resistance, as an approximation of the DC voltage of a common (real or virtual) node in the DC network. Targets are provided by ACDCConverter.targetPpcc, ACDCConverter.targetUdc, VsConverter.droop and VsConverter.droopCompensation.
     */
    _pPccAndUdcDroopWithCompensation("pPccAndUdcDroopWithCompensation"),
    /**
     * Control is active power at point of common coupling and the pilot DC voltage, with the droop. The mode is used for Multi Terminal High Voltage DC (MTDC) systems where multiple HVDC Substations are connected to the HVDC transmission lines. The pilot voltage is then used to coordinate the control the DC voltage across the HVDC substations. Targets are provided by ACDCConverter.targetPpcc, ACDCConverter.targetUdc and  VsConverter.droop.
     */
    _pPccAndUdcDroopPilot("pPccAndUdcDroopPilot"),
    /**
     * Control is phase at point of common coupling. Target is provided by VsConverter.targetPhasePcc.
     */
    _phasePcc("phasePcc"),
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
