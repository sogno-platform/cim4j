/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The unit multipliers defined for the CIM.  When applied to unit symbols, the unit symbol is treated as a derived unit. Regardless of the contents of the unit symbol text, the unit symbol shall be treated as if it were a single-character unit symbol. Unit symbols should not contain multipliers, and it should be left to the multiplier to define the multiple for an entire data type.   For example, if a unit symbol is "m2Pers" and the multiplier is "k", then the value is k(m**2/s), and the multiplier applies to the entire final value, not to any individual part of the value. This can be conceptualized by substituting a derived unit symbol for the unit type. If one imagines that the symbol "Þ" represents the derived unit "m2Pers", then applying the multiplier "k" can be conceptualized simply as "kÞ".  For example, the SI unit for mass is "kg" and not "g".  If the unit symbol is defined as "kg", then the multiplier is applied to "kg" as a whole and does not replace the "k" in front of the "g". In this case, the multiplier of "m" would be used with the unit symbol of "kg" to represent one gram.  As a text string, this violates the instructions in IEC 80000-1. However, because the unit symbol in CIM is treated as a derived unit instead of as an SI unit, it makes more sense to conceptualize the "kg" as if it were replaced by one of the proposed replacements for the SI mass symbol. If one imagines that the "kg" were replaced by a symbol "Þ", then it is easier to conceptualize the multiplier "m" as creating the proper unit "mÞ", and not the forbidden unit "mkg".
 */
public enum UnitMultiplier {
    /**
     * Yocto 10**-24.
     */
    _y("y"),
    /**
     * Zepto 10**-21.
     */
    _z("z"),
    /**
     * Atto 10**-18.
     */
    _a("a"),
    /**
     * Femto 10**-15.
     */
    _f("f"),
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
     * No multiplier or equivalently multiply by 1.
     */
    _none("none"),
    /**
     * Deca 10**1.
     */
    _da("da"),
    /**
     * Hecto 10**2.
     */
    _h("h"),
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
     * Peta 10**15.
     */
    _P("P"),
    /**
     * Exa 10**18.
     */
    _E("E"),
    /**
     * Zetta 10**21.
     */
    _Z("Z"),
    /**
     * Yotta 10**24.
     */
    _Y("Y"),
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
