/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * LVRT Q control modes .
 */
public enum WindLVRTQcontrolModesKind {
    /**
     * Voltage dependent reactive current injection ().
     */
    _mode1("mode1"),
    /**
     * Reactive current injection controlled as the pre-fault value plus an additional voltage dependent reactive current injection ().
     */
    _mode2("mode2"),
    /**
     * Reactive current injection controlled as the pre-fault value plus an additional voltage dependent reactive current injection during fault, and as the pre-fault value plus an additional constant reactive current injection post fault ().
     */
    _mode3("mode3"),
    ;

    private final String value;

    private WindLVRTQcontrolModesKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static WindLVRTQcontrolModesKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, WindLVRTQcontrolModesKind> ENUM_MAP;
    static {
        var map = new HashMap<String, WindLVRTQcontrolModesKind>();
        for (WindLVRTQcontrolModesKind instance : WindLVRTQcontrolModesKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
