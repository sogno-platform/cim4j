/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Kind of Asynchronous Machine.
 */
public enum AsynchronousMachineKind {
    /**
     * The Asynchronous Machine is a generator.
     */
    _generator("generator"),
    /**
     * The Asynchronous Machine is a motor.
     */
    _motor("motor"),
    ;

    private final String value;

    private AsynchronousMachineKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static AsynchronousMachineKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, AsynchronousMachineKind> ENUM_MAP;
    static {
        var map = new HashMap<String, AsynchronousMachineKind>();
        for (AsynchronousMachineKind instance : AsynchronousMachineKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
