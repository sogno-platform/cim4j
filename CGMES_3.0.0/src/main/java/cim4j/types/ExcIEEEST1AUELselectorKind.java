/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Types of connections for the UEL input used in ExcIEEEST1A.
 */
public enum ExcIEEEST1AUELselectorKind {
    /**
     * Ignore UEL signal.
     */
    _ignoreUELsignal("ignoreUELsignal"),
    /**
     * UEL input HV gate with voltage regulator output.
     */
    _inputHVgateVoltageOutput("inputHVgateVoltageOutput"),
    /**
     * UEL input HV gate with error signal.
     */
    _inputHVgateErrorSignal("inputHVgateErrorSignal"),
    /**
     * UEL input added to error signal.
     */
    _inputAddedToErrorSignal("inputAddedToErrorSignal"),
    ;

    private final String value;

    private ExcIEEEST1AUELselectorKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static ExcIEEEST1AUELselectorKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, ExcIEEEST1AUELselectorKind> ENUM_MAP;
    static {
        var map = new HashMap<String, ExcIEEEST1AUELselectorKind>();
        for (ExcIEEEST1AUELselectorKind instance : ExcIEEEST1AUELselectorKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
