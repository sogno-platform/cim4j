/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Type of connection for the OEL input used for static excitation systems type 7B.
 */
public enum ExcST7BOELselectorKind {
    /**
     * No OEL input is used.
     */
    _noOELinput("noOELinput"),
    /**
     * The signal is added to Vref.
     */
    _addVref("addVref"),
    /**
     * The signal is connected in the input of the LV gate.
     */
    _inputLVgate("inputLVgate"),
    /**
     * The signal is connected in the output of the LV gate.
     */
    _outputLVgate("outputLVgate"),
    ;

    private final String value;

    private ExcST7BOELselectorKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static ExcST7BOELselectorKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, ExcST7BOELselectorKind> ENUM_MAP;
    static {
        var map = new HashMap<String, ExcST7BOELselectorKind>();
        for (ExcST7BOELselectorKind instance : ExcST7BOELselectorKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
