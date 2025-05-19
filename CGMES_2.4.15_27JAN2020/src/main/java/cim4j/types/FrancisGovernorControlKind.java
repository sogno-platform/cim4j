/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Governor control flag for Francis hydro model.
 */
public enum FrancisGovernorControlKind {
    /**
     * Mechanic-hydraulic regulator with tacho-accelerometer (Cflag = 1).
     */
    _mechanicHydrolicTachoAccelerator("mechanicHydrolicTachoAccelerator"),
    /**
     * Mechanic-hydraulic regulator with transient feedback (Cflag=2).
     */
    _mechanicHydraulicTransientFeedback("mechanicHydraulicTransientFeedback"),
    /**
     * Electromechanical and electrohydraulic regulator (Cflag=3).
     */
    _electromechanicalElectrohydraulic("electromechanicalElectrohydraulic"),
    ;

    private final String value;

    private FrancisGovernorControlKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static FrancisGovernorControlKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, FrancisGovernorControlKind> ENUM_MAP;
    static {
        var map = new HashMap<String, FrancisGovernorControlKind>();
        for (FrancisGovernorControlKind instance : FrancisGovernorControlKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
