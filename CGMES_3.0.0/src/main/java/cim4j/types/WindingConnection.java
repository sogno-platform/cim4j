/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Winding connection type.
 */
public enum WindingConnection {
    /**
     * Delta.
     */
    _D("D"),
    /**
     * Wye.
     */
    _Y("Y"),
    /**
     * ZigZag.
     */
    _Z("Z"),
    /**
     * Wye, with neutral brought out for grounding.
     */
    _Yn("Yn"),
    /**
     * ZigZag, with neutral brought out for grounding.
     */
    _Zn("Zn"),
    /**
     * Autotransformer common winding.
     */
    _A("A"),
    /**
     * Independent winding, for single-phase connections.
     */
    _I("I"),
    ;

    private final String value;

    private WindingConnection(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static WindingConnection fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, WindingConnection> ENUM_MAP;
    static {
        var map = new HashMap<String, WindingConnection>();
        for (WindingConnection instance : WindingConnection.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
