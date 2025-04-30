/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Types of connections for the OEL input used for static excitation systems type 6B.
 */
public enum ExcST6BOELselectorKind {
    /**
     * No OEL input is used. Corresponds to &lt;i&gt;OELin&lt;/i&gt; not = 1 and not = 2 on the ExcST6B diagram. Original ExcST6B model would have called this &lt;i&gt;OELin&lt;/i&gt; = 0.
     */
    _noOELinput("noOELinput"),
    /**
     * The connection is before UEL. Corresponds to &lt;i&gt;OELin&lt;/i&gt; = 1 on the ExcST6B diagram.
     */
    _beforeUEL("beforeUEL"),
    /**
     * The connection is after UEL. Corresponds to &lt;i&gt;OELin&lt;/i&gt; = 2 on the ExcST6B diagram.
     */
    _afterUEL("afterUEL"),
    ;

    private final String value;

    private ExcST6BOELselectorKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static ExcST6BOELselectorKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, ExcST6BOELselectorKind> ENUM_MAP;
    static {
        var map = new HashMap<String, ExcST6BOELselectorKind>();
        for (ExcST6BOELselectorKind instance : ExcST6BOELselectorKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
