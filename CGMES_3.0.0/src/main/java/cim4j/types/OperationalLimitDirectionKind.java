/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The direction attribute describes the side of  a limit that is a violation.
 */
public enum OperationalLimitDirectionKind {
    /**
     * High means that a monitored value above the limit value is a violation.   If applied to a terminal flow, the positive direction is into the terminal.
     */
    _high("high"),
    /**
     * Low means a monitored value below the limit is a violation.  If applied to a terminal flow, the positive direction is into the terminal.
     */
    _low("low"),
    /**
     * An absoluteValue limit means that a monitored absolute value above the limit value is a violation.
     */
    _absoluteValue("absoluteValue"),
    ;

    private final String value;

    private OperationalLimitDirectionKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static OperationalLimitDirectionKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, OperationalLimitDirectionKind> ENUM_MAP;
    static {
        var map = new HashMap<String, OperationalLimitDirectionKind>();
        for (OperationalLimitDirectionKind instance : OperationalLimitDirectionKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
