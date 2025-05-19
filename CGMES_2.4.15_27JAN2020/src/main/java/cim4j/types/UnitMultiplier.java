/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The unit multipliers defined for the CIM.
 */
public enum UnitMultiplier {
    /**
     * Pico 10**-12.
     */
    _p("p"),
    /**
     * Nano 10**-9.
     */
    _n("n"),
    /**
     * Micro 10**-6.
     */
    _micro("micro"),
    /**
     * Milli 10**-3.
     */
    _m("m"),
    /**
     * Centi 10**-2.
     */
    _c("c"),
    /**
     * Deci 10**-1.
     */
    _d("d"),
    /**
     * Kilo 10**3.
     */
    _k("k"),
    /**
     * Mega 10**6.
     */
    _M("M"),
    /**
     * Giga 10**9.
     */
    _G("G"),
    /**
     * Tera 10**12.
     */
    _T("T"),
    /**
     * No multiplier or equivalently multiply by 1.
     */
    _none("none"),
    ;

    private final String value;

    private UnitMultiplier(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static UnitMultiplier fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, UnitMultiplier> ENUM_MAP;
    static {
        var map = new HashMap<String, UnitMultiplier>();
        for (UnitMultiplier instance : UnitMultiplier.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
