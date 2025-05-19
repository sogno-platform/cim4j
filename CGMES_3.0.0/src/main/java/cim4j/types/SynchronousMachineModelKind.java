/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Type of synchronous machine model used in dynamic simulation applications.
 */
public enum SynchronousMachineModelKind {
    /**
     * Subtransient synchronous machine model.
     */
    _subtransient("subtransient"),
    /**
     * WECC type F variant of subtransient synchronous machine model.
     */
    _subtransientTypeF("subtransientTypeF"),
    /**
     * WECC type J variant of subtransient synchronous machine model.
     */
    _subtransientTypeJ("subtransientTypeJ"),
    /**
     * Simplified version of subtransient synchronous machine model where magnetic coupling between the direct- and quadrature- axes is ignored.
     */
    _subtransientSimplified("subtransientSimplified"),
    /**
     * Simplified version of a subtransient synchronous machine model with no damper circuit on the direct-axis.
     */
    _subtransientSimplifiedDirectAxis("subtransientSimplifiedDirectAxis"),
    ;

    private final String value;

    private SynchronousMachineModelKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static SynchronousMachineModelKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, SynchronousMachineModelKind> ENUM_MAP;
    static {
        var map = new HashMap<String, SynchronousMachineModelKind>();
        for (SynchronousMachineModelKind instance : SynchronousMachineModelKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
