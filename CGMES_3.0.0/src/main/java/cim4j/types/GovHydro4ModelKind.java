/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Possible types of GovHydro4 models.
 */
public enum GovHydro4ModelKind {
    /**
     * Simple model.
     */
    _simple("simple"),
    /**
     * Francis or Pelton model.
     */
    _francisPelton("francisPelton"),
    /**
     * Kaplan model.
     */
    _kaplan("kaplan"),
    ;

    private final String value;

    private GovHydro4ModelKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static GovHydro4ModelKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, GovHydro4ModelKind> ENUM_MAP;
    static {
        var map = new HashMap<String, GovHydro4ModelKind>();
        for (GovHydro4ModelKind instance : GovHydro4ModelKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
