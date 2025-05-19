/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Source gives information related to the origin of a value.
 */
public enum Source {
    /**
     * The value is provided by input from the process I/O or being calculated from some function.
     */
    _PROCESS("PROCESS"),
    /**
     * The value contains a default value.
     */
    _DEFAULTED("DEFAULTED"),
    /**
     * The value is provided by input of an operator or by an automatic source.
     */
    _SUBSTITUTED("SUBSTITUTED"),
    ;

    private final String value;

    private Source(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static Source fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, Source> ENUM_MAP;
    static {
        var map = new HashMap<String, Source>();
        for (Source instance : Source.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
