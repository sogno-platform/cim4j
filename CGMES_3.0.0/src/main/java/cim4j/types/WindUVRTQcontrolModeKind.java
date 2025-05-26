/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * UVRT Q control modes <i>M</i><i><sub>qUVRT</sub></i><i>.</i>
 */
public enum WindUVRTQcontrolModeKind {
    /**
     * Voltage-dependent reactive current injection (<i>M</i><i><sub>qUVRT</sub></i> <sub> </sub>equals 0).
     */
    _mode0("mode0"),
    /**
     * Reactive current injection controlled as the pre-fault value plus an additional voltage dependent reactive current injection (<i>M</i><i><sub>qUVRT</sub></i> equals 1).
     */
    _mode1("mode1"),
    /**
     * Reactive current injection controlled as the pre-fault value plus an additional voltage-dependent reactive current injection during fault, and as the pre-fault value plus an additional constant reactive current injection post fault (<i>M</i><i><sub>qUVRT</sub></i><sub>  </sub>equals 2).
     */
    _mode2("mode2"),
    ;

    private final String value;

    private WindUVRTQcontrolModeKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static WindUVRTQcontrolModeKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, WindUVRTQcontrolModeKind> ENUM_MAP;
    static {
        var map = new HashMap<String, WindUVRTQcontrolModeKind>();
        for (WindUVRTQcontrolModeKind instance : WindUVRTQcontrolModeKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
