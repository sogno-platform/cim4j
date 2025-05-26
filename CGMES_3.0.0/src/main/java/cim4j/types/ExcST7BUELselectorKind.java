/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Types of connections for the UEL input used for static excitation systems type 7B.
 */
public enum ExcST7BUELselectorKind {
    /**
     * No UEL input is used.  Corresponds to <i>UELin</i> not = 1 and not = 2 and not = 3 on the ExcST7B diagram. Original ExcST7B model would have called this <i>UELin</i> = 0.
     */
    _noUELinput("noUELinput"),
    /**
     * The signal is added to <i>Vref</i>. Corresponds to <i>UELin</i> = 1 on the ExcST7B diagram.
     */
    _addVref("addVref"),
    /**
     * The signal is connected into the input <i>HVGate</i>.  Corresponds to <i>UELin</i> = 2 on the ExcST7B diagram.
     */
    _inputHVgate("inputHVgate"),
    /**
     * The signal is connected into the output <i>HVGate</i>.  Corresponds to <i>UELin</i> = 3 on the ExcST7B diagram.
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
