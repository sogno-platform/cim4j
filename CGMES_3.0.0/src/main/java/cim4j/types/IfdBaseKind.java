/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Excitation base system mode.
 */
public enum IfdBaseKind {
    /**
     * Air gap line mode.
     */
    _ifag("ifag"),
    /**
     * No load system with saturation mode.
     */
    _ifnl("ifnl"),
    /**
     * Full load system mode.
     */
    _iffl("iffl"),
    ;

    private final String value;

    private IfdBaseKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static IfdBaseKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, IfdBaseKind> ENUM_MAP;
    static {
        var map = new HashMap<String, IfdBaseKind>();
        for (IfdBaseKind instance : IfdBaseKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
