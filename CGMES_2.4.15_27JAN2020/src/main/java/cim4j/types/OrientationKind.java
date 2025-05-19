/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The orientation of the coordinate system with respect to top, left, and the coordinate number system.
 */
public enum OrientationKind {
    /**
     * For 2D diagrams, a negative orientation gives the left-hand orientation (favoured by computer graphics displays) with X values increasing from left to right and Y values increasing from top to bottom.   This is also known as a left hand orientation.
     */
    _negative("negative"),
    ;

    private final String value;

    private OrientationKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static OrientationKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, OrientationKind> ENUM_MAP;
    static {
        var map = new HashMap<String, OrientationKind>();
        for (OrientationKind instance : OrientationKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
