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
     * No UEL input is used.  Corresponds to &lt;i&gt;UELin&lt;/i&gt; not = 1 and not = 2 and not = 3 on the ExcST7B diagram. Original ExcST7B model would have called this &lt;i&gt;UELin&lt;/i&gt; = 0.
     */
    _noUELinput("noUELinput"),
    /**
     * The signal is added to &lt;i&gt;Vref&lt;/i&gt;. Corresponds to &lt;i&gt;UELin&lt;/i&gt; = 1 on the ExcST7B diagram.
     */
    _addVref("addVref"),
    /**
     * The signal is connected into the input &lt;i&gt;HVGate&lt;/i&gt;.  Corresponds to &lt;i&gt;UELin&lt;/i&gt; = 2 on the ExcST7B diagram.
     */
    _inputHVgate("inputHVgate"),
    /**
     * The signal is connected into the output &lt;i&gt;HVGate&lt;/i&gt;.  Corresponds to &lt;i&gt;UELin&lt;/i&gt; = 3 on the ExcST7B diagram.
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
