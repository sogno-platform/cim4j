/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Validity for MeasurementValue.
 */
public enum Validity {
    /**
     * The value is marked good if no abnormal condition of the acquisition function or the information source is detected.
     */
    _GOOD("GOOD"),
    /**
     * The value is marked questionable if a supervision function detects an abnormal behaviour, however the value could still be valid. The client is responsible for determining whether or not values marked &quot;questionable&quot; should be used.
     */
    _QUESTIONABLE("QUESTIONABLE"),
    /**
     * The value is marked invalid when a supervision function recognises abnormal conditions of the acquisition function or the information source (missing or non-operating updating devices). The value is not defined under this condition. The mark invalid is used to indicate to the client that the value may be incorrect and shall not be used.
     */
    _INVALID("INVALID"),
    ;

    private final String value;

    private Validity(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static Validity fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, Validity> ENUM_MAP;
    static {
        var map = new HashMap<String, Validity>();
        for (Validity instance : Validity.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
