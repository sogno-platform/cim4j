/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The source of controls for a generating unit.
 */
public enum GeneratorControlSource {
    /**
     * Not available.
     */
    _unavailable("unavailable"),
    /**
     * Off of automatic generation control (AGC).
     */
    _offAGC("offAGC"),
    /**
     * On automatic generation control (AGC).
     */
    _onAGC("onAGC"),
    /**
     * Plant is controlling.
     */
    _plantControl("plantControl"),
    ;

    private final String value;

    private GeneratorControlSource(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static GeneratorControlSource fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, GeneratorControlSource> ENUM_MAP;
    static {
        var map = new HashMap<String, GeneratorControlSource>();
        for (GeneratorControlSource instance : GeneratorControlSource.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
