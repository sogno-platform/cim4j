/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Function of the lookup table.
 */
public enum WindLookupTableFunctionKind {
    /**
     * Power versus speed change (negative slip) lookup table (p<sub>rr</sub>(deltaomega)). It is used for the rotor resistance control model, IEC 61400-27-1:2015, 5.6.5.3.
     */
    _prr("prr"),
    /**
     * Power vs. speed lookup table (omega(p)). It is used for the P control model type 3, IEC 61400-27-1:2015, 5.6.5.4.
     */
    _omegap("omegap"),
    /**
     * Lookup table for voltage dependency of active current limits (i<sub>pmax</sub>(u<sub>WT</sub>)). It is used for the current limitation model, IEC 61400-27-1:2015, 5.6.5.8.
     */
    _ipmax("ipmax"),
    /**
     * Lookup table for voltage dependency of reactive current limits (i<sub>qmax</sub>(u<sub>WT</sub>)). It is used for the current limitation model, IEC 61400-27-1:2015, 5.6.5.8.
     */
    _iqmax("iqmax"),
    /**
     * Power vs. frequency lookup table (p<sub>WPbias</sub>(f)). It is used for the wind power plant frequency and active power control model, IEC 61400-27-1:2015, Annex D.
     */
    _pwp("pwp"),
    /**
     * Crowbar duration versus voltage variation look-up table (T<sub>CW</sub>(du)). It is a case-dependent parameter. It is used for the type 3B generator set model, IEC 61400-27-1:2015, 5.6.3.3.
     */
    _tcwdu("tcwdu"),
    /**
     * Lookup table to determine the duration of the power reduction after a voltage dip, depending on the size of the voltage dip (T<sub>d</sub>(u<sub>WT</sub>)). It is a type-dependent parameter. It is used for the pitch control power model, IEC 61400-27-1:2015, 5.6.5.1.
     */
    _tduwt("tduwt"),
    /**
     * Lookup table for active power dependency of reactive power maximum limit (q<sub>maxp</sub>(p)). It is used for the QP and QU limitation model, IEC 61400-27-1:2015, 5.6.5.10.
     */
    _qmaxp("qmaxp"),
    /**
     * Lookup table for active power dependency of reactive power minimum limit (q<sub>minp</sub>(p)). It is used for the QP and QU limitation model, IEC 61400-27-1:2015, 5.6.5.10.
     */
    _qminp("qminp"),
    /**
     * Lookup table for voltage dependency of reactive power maximum limit (q<sub>maxu</sub>(p)). It is used for the QP and QU limitation model, IEC 61400-27-1:2015, 5.6.5.10.
     */
    _qmaxu("qmaxu"),
    /**
     * Lookup table for voltage dependency of reactive power minimum limit (q<sub>minu</sub>(p)). It is used for the QP and QU limitation model, IEC 61400-27-1:2015, 5.6.5.10.
     */
    _qminu("qminu"),
    /**
     * Disconnection time versus over-voltage lookup table (T<sub>uover</sub>(u<sub>WT</sub>)). It is used for the grid protection model, IEC 61400-27-1:2015, 5.6.6.
     */
    _tuover("tuover"),
    /**
     * Disconnection time versus under-voltage lookup table (T<sub>uunder</sub>(u<sub>WT</sub>)). It is used for the grid protection model, IEC 61400-27-1:2015, 5.6.6.
     */
    _tuunder("tuunder"),
    /**
     * Disconnection time versus over-frequency lookup table (T<sub>fover</sub>(f<sub>WT</sub>)). It is used for the grid protection model, IEC 61400-27-1:2015, 5.6.6.
     */
    _tfover("tfover"),
    /**
     * Disconnection time versus under-frequency lookup table (T<sub>funder</sub>(f<sub>WT</sub>)). It is used for the grid protection model, IEC 61400-27-1:2015, 5.6.6.
     */
    _tfunder("tfunder"),
    /**
     * Look up table for the UQ static mode (q<sub>WP</sub>(u<sub>err</sub>)). It is used for the voltage and reactive power control model, IEC 61400-27-1:2015, Annex D.
     */
    _qwp("qwp"),
    ;

    private final String value;

    private WindLookupTableFunctionKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static WindLookupTableFunctionKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, WindLookupTableFunctionKind> ENUM_MAP;
    static {
        var map = new HashMap<String, WindLookupTableFunctionKind>();
        for (WindLookupTableFunctionKind instance : WindLookupTableFunctionKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
