/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Type of rate feedback signals.
 */
public enum ExcREXSFeedbackSignalKind {
    /**
     * The voltage regulator output voltage is used. It is the same as exciter field voltage.
     */
    _fieldVoltage("fieldVoltage"),
    /**
     * The exciter field current is used.
     */
    _fieldCurrent("fieldCurrent"),
    /**
     * The output voltage of the exciter is used.
     */
    _outputVoltage("outputVoltage"),
    ;

    private final String value;

    private ExcREXSFeedbackSignalKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static ExcREXSFeedbackSignalKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, ExcREXSFeedbackSignalKind> ENUM_MAP;
    static {
        var map = new HashMap<String, ExcREXSFeedbackSignalKind>();
        for (ExcREXSFeedbackSignalKind instance : ExcREXSFeedbackSignalKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
