/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The units defined for usage in the CIM.
 */
public enum UnitSymbol {
    /**
     * Apparent power in volt ampere.
     */
    _VA("VA"),
    /**
     * Active power in watt.
     */
    _W("W"),
    /**
     * Reactive power in volt ampere reactive.
     */
    _VAr("VAr"),
    /**
     * Apparent energy in volt ampere hours.
     */
    _VAh("VAh"),
    /**
     * Real energy in what hours.
     */
    _Wh("Wh"),
    /**
     * Reactive energy in volt ampere reactive hours.
     */
    _VArh("VArh"),
    /**
     * Voltage in volt.
     */
    _V("V"),
    /**
     * Resistance in ohm.
     */
    _ohm("ohm"),
    /**
     * Current in ampere.
     */
    _A("A"),
    /**
     * Capacitance in farad.
     */
    _F("F"),
    /**
     * Inductance in henry.
     */
    _H("H"),
    /**
     * Relative temperature in degrees Celsius. In the SI unit system the symbol is [SYMBOL REMOVED]C. Electric charge is measured in coulomb that has the unit symbol C. To distinguish degree Celsius form coulomb the symbol used in the UML is degC. Reason for not using [SYMBOL REMOVED]C is the special character [SYMBOL REMOVED] is difficult to manage in software.
     */
    _degC("degC"),
    /**
     * Time in seconds.
     */
    _s("s"),
    /**
     * Time in minutes.
     */
    _min("min"),
    /**
     * Time in hours.
     */
    _h("h"),
    /**
     * Plane angle in degrees.
     */
    _deg("deg"),
    /**
     * Plane angle in radians.
     */
    _rad("rad"),
    /**
     * Energy in joule.
     */
    _J("J"),
    /**
     * Force in newton.
     */
    _N("N"),
    /**
     * Conductance in siemens.
     */
    _S("S"),
    /**
     * Dimension less quantity, e.g. count, per unit, etc.
     */
    _none("none"),
    /**
     * Frequency in hertz.
     */
    _Hz("Hz"),
    /**
     * Mass in gram.
     */
    _g("g"),
    /**
     * Pressure in pascal (n/m2).
     */
    _Pa("Pa"),
    /**
     * Length in meter.
     */
    _m("m"),
    /**
     * Area in square meters.
     */
    _m2("m2"),
    /**
     * Volume in cubic meters.
     */
    _m3("m3"),
    ;

    private final String value;

    private UnitSymbol(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static UnitSymbol fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, UnitSymbol> ENUM_MAP;
    static {
        var map = new HashMap<String, UnitSymbol>();
        for (UnitSymbol instance : UnitSymbol.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
