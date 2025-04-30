/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Type of static load model.
 */
public enum StaticLoadModelKind {
    /**
     * Exponential P and Q equations are used and the following attributes are required: kp1, kp2, kp3, kpf, ep1, ep2, ep3 kq1, kq2, kq3, kqf, eq1, eq2, eq3.
     */
    _exponential("exponential"),
    /**
     * ZIP1 P and Q equations are used and the following attributes are required: kp1, kp2, kp3, kpf kq1, kq2, kq3, kqf.
     */
    _zIP1("zIP1"),
    /**
     * This model separates the frequency-dependent load (primarily motors) from other load.  ZIP2 P and Q equations are used and the following attributes are required: kp1, kp2, kp3, kq4, kpf kq1, kq2, kq3, kq4, kqf.
     */
    _zIP2("zIP2"),
    /**
     * The load is represented as a constant impedance.  ConstantZ P and Q equations are used and no attributes are required.
     */
    _constantZ("constantZ"),
    ;

    private final String value;

    private StaticLoadModelKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static StaticLoadModelKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, StaticLoadModelKind> ENUM_MAP;
    static {
        var map = new HashMap<String, StaticLoadModelKind>();
        for (StaticLoadModelKind instance : StaticLoadModelKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
