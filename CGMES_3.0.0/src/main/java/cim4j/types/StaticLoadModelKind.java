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
     * This model is an exponential representation of the load. Exponential equations for active and reactive power are used and the following attributes are required: kp1, kp2, kp3, kpf, ep1, ep2, ep3 kq1, kq2, kq3, kqf, eq1, eq2, eq3.
     */
    _exponential("exponential"),
    /**
     * This model integrates the frequency-dependent load (primarily motors).  ZIP1 equations for active and reactive power are used and the following attributes are required: kp1, kp2, kp3, kpf kq1, kq2, kq3, kqf.
     */
    _zIP1("zIP1"),
    /**
     * This model separates the frequency-dependent load (primarily motors) from other load.  ZIP2 equations for active and reactive power are used and the following attributes are required: kp1, kp2, kp3, kq4, kpf kq1, kq2, kq3, kq4, kqf.
     */
    _zIP2("zIP2"),
    /**
     * The load is represented as a constant impedance.  ConstantZ equations are used  for active and reactive power and no attributes are required.
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
