/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum VsQpccControlKind {
    _reactivePcc("reactivePcc"),
    _voltagePcc("voltagePcc"),
    _powerFactorPcc("powerFactorPcc"),
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
