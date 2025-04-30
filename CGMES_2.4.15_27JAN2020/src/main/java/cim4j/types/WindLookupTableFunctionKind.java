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
     * Power versus slip lookup table (f()). It is used for rotor resistance control model, IEC 61400-27-1, section 6.6.5.2.
     */
    _fpslip("fpslip"),
    /**
     * Power vs. speed lookup table (f()). It is used for P control model type 3, IEC 61400-27-1, section 6.6.5.3.
     */
    _fpomega("fpomega"),
    /**
     * Lookup table for voltage dependency of active current limits (i()). It is used for current limitation model, IEC 61400-27-1, section 6.6.5.7.
     */
    _ipvdl("ipvdl"),
    /**
     * Lookup table for voltage dependency of reactive current limits (i()). It is used for current limitation model, IEC 61400-27-1, section 6.6.5.7.
     */
    _iqvdl("iqvdl"),
    /**
     * Power vs. frequency lookup table (()). It is used for wind power plant frequency and active power control model, IEC 61400-27-1, Annex E.
     */
    _fdpf("fdpf"),
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
