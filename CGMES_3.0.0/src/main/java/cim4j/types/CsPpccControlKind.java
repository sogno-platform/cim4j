/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Active power control modes for HVDC line operating as Current Source Converter.
 */
public enum CsPpccControlKind {
    /**
     * Control is active power control at AC side, at point of common coupling. Target is provided by ACDCConverter.targetPpcc.
     */
    _activePower("activePower"),
    /**
     * Control is DC voltage  with target value provided by ACDCConverter.targetUdc.
     */
    _dcVoltage("dcVoltage"),
    /**
     * Control is DC current  with target value provided by CsConverter.targetIdc.
     */
    _dcCurrent("dcCurrent"),
    ;

    private final String value;

    private CsPpccControlKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static CsPpccControlKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, CsPpccControlKind> ENUM_MAP;
    static {
        var map = new HashMap<String, CsPpccControlKind>();
        for (CsPpccControlKind instance : CsPpccControlKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
