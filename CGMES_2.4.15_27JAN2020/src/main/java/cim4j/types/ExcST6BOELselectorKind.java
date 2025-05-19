/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Type of connection for the OEL input used for static excitation systems type 6B.
 */
public enum ExcST6BOELselectorKind {
    /**
     * No OEL input is used.
     */
    _noOELinput("noOELinput"),
    /**
     * The connection is before UEL.
     */
    _beforeUEL("beforeUEL"),
    /**
     * The connection is after UEL.
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
