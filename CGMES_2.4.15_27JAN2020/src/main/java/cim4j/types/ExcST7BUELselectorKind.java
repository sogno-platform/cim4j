/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Type of connection for the UEL input used for static excitation systems type 7B.
 */
public enum ExcST7BUELselectorKind {
    /**
     * No UEL input is used.
     */
    _noUELinput("noUELinput"),
    /**
     * The signal is added to Vref.
     */
    _addVref("addVref"),
    /**
     * The signal is connected in the input of the HV gate.
     */
    _inputHVgate("inputHVgate"),
    /**
     * The signal is connected in the output of the HV gate.
     */
    _outputHVgate("outputHVgate"),
    ;

    private final String value;

    private ExcST7BUELselectorKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static ExcST7BUELselectorKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, ExcST7BUELselectorKind> ENUM_MAP;
    static {
        var map = new HashMap<String, ExcST7BUELselectorKind>();
        for (ExcST7BUELselectorKind instance : ExcST7BUELselectorKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
