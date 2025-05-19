/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Synchronous machine type.
 */
public enum SynchronousMachineKind {
    /**
     * Indicates the synchronous machine can operate as a generator.
     */
    _generator("generator"),
    /**
     * Indicates the synchronous machine can operate as a condenser.
     */
    _condenser("condenser"),
    /**
     * Indicates the synchronous machine can operate as a generator or as a condenser.
     */
    _generatorOrCondenser("generatorOrCondenser"),
    /**
     * Indicates the synchronous machine can operate as a motor.
     */
    _motor("motor"),
    /**
     * Indicates the synchronous machine can operate as a generator or as a motor.
     */
    _generatorOrMotor("generatorOrMotor"),
    /**
     * Indicates the synchronous machine can operate as a motor or as a condenser.
     */
    _motorOrCondenser("motorOrCondenser"),
    /**
     * Indicates the synchronous machine can operate as a generator or as a condenser or as a motor.
     */
    _generatorOrCondenserOrMotor("generatorOrCondenserOrMotor"),
    ;

    private final String value;

    private SynchronousMachineKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static SynchronousMachineKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, SynchronousMachineKind> ENUM_MAP;
    static {
        var map = new HashMap<String, SynchronousMachineKind>();
        for (SynchronousMachineKind instance : SynchronousMachineKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
