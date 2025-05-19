/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Types of connections for the OEL input used for static excitation systems type 7B.
 */
public enum ExcST7BOELselectorKind {
    /**
     * No OEL input is used. Corresponds to &lt;i&gt;OELin&lt;/i&gt; not = 1 and not = 2 and not = 3 on the ExcST7B diagram. Original ExcST7B model would have called this &lt;i&gt;OELin&lt;/i&gt; = 0.
     */
    _noOELinput("noOELinput"),
    /**
     * The signal is added to &lt;i&gt;Vref&lt;/i&gt;.  Corresponds to &lt;i&gt;OELin&lt;/i&gt; = 1 on the ExcST7B diagram.
     */
    _addVref("addVref"),
    /**
     * The signal is connected into the input &lt;i&gt;LVGate&lt;/i&gt;. Corresponds to &lt;i&gt;OELin&lt;/i&gt; = 2 on the ExcST7B diagram.
     */
    _inputLVgate("inputLVgate"),
    /**
     * The signal is connected into the output &lt;i&gt;LVGate&lt;/i&gt;.  Corresponds to &lt;i&gt;OELin&lt;/i&gt; = 3 on the ExcST7B diagram.
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
