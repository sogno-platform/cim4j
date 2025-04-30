/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Style or shape of curve.
 */
public enum CurveStyle {
    /**
     * The Y-axis values are assumed constant until the next curve point and prior to the first curve point.
     */
    _constantYValue("constantYValue"),
    /**
     * The Y-axis values are assumed to be a straight line between values.  Also known as linear interpolation.
     */
    _straightLineYValues("straightLineYValues"),
    ;

    private final String value;

    private CurveStyle(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static CurveStyle fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, CurveStyle> ENUM_MAP;
    static {
        var map = new HashMap<String, CurveStyle>();
        for (CurveStyle instance : CurveStyle.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
