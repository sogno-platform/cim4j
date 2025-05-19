/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Control modes for a transformer.
 */
public enum TransformerControlMode {
    /**
     * Voltage control
     */
    _volt("volt"),
    /**
     * Reactive power flow control
     */
    _reactive("reactive"),
    ;

    private final String value;

    private TransformerControlMode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static TransformerControlMode fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, TransformerControlMode> ENUM_MAP;
    static {
        var map = new HashMap<String, TransformerControlMode>();
        for (TransformerControlMode instance : TransformerControlMode.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
