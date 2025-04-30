/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Enumeration of phase identifiers. Allows designation of phases for both transmission and distribution equipment, circuits and loads. Residential and small commercial loads are often served from single-phase, or split-phase, secondary circuits. For example of s12N, phases 1 and 2 refer to hot wires that are 180 degrees out of phase, while N refers to the neutral wire. Through single-phase transformer connections, these secondary circuits may be served from one or two of the primary phases A, B, and C. For three-phase loads, use the A, B, C phase codes instead of s12N.
 */
public enum PhaseCode {
    /**
     * Phases A, B, C, and N.
     */
    _ABCN("ABCN"),
    /**
     * Phases A, B, and C.
     */
    _ABC("ABC"),
    /**
     * Phases A, B, and neutral.
     */
    _ABN("ABN"),
    /**
     * Phases A, C and neutral.
     */
    _ACN("ACN"),
    /**
     * Phases B, C, and neutral.
     */
    _BCN("BCN"),
    /**
     * Phases A and B.
     */
    _AB("AB"),
    /**
     * Phases A and C.
     */
    _AC("AC"),
    /**
     * Phases B and C.
     */
    _BC("BC"),
    /**
     * Phases A and neutral.
     */
    _AN("AN"),
    /**
     * Phases B and neutral.
     */
    _BN("BN"),
    /**
     * Phases C and neutral.
     */
    _CN("CN"),
    /**
     * Phase A.
     */
    _A("A"),
    /**
     * Phase B.
     */
    _B("B"),
    /**
     * Phase C.
     */
    _C("C"),
    /**
     * Neutral phase.
     */
    _N("N"),
    /**
     * Secondary phase 1 and neutral.
     */
    _s1N("s1N"),
    /**
     * Secondary phase 2 and neutral.
     */
    _s2N("s2N"),
    /**
     * Secondary phases 1, 2, and neutral.
     */
    _s12N("s12N"),
    /**
     * Secondary phase 1.
     */
    _s1("s1"),
    /**
     * Secondary phase 2.
     */
    _s2("s2"),
    /**
     * Secondary phase 1 and 2.
     */
    _s12("s12"),
    ;

    private final String value;

    private PhaseCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static PhaseCode fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, PhaseCode> ENUM_MAP;
    static {
        var map = new HashMap<String, PhaseCode>();
        for (PhaseCode instance : PhaseCode.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
