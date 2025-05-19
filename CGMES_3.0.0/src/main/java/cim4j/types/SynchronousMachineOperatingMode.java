/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Synchronous machine operating mode.
 */
public enum SynchronousMachineOperatingMode {
    /**
     * Operating as generator.
     */
    _generator("generator"),
    /**
     * Operating as condenser.
     */
    _condenser("condenser"),
    /**
     * Operating as motor.
     */
    _motor("motor"),
    ;

    private final String value;

    private SynchronousMachineOperatingMode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static SynchronousMachineOperatingMode fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, SynchronousMachineOperatingMode> ENUM_MAP;
    static {
        var map = new HashMap<String, SynchronousMachineOperatingMode>();
        for (SynchronousMachineOperatingMode instance : SynchronousMachineOperatingMode.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
