/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Type of fuel.
 */
public enum FuelType {
    /**
     * Generic coal, not including lignite type.
     */
    _coal("coal"),
    /**
     * Oil.
     */
    _oil("oil"),
    /**
     * Natural gas.
     */
    _gas("gas"),
    /**
     * The fuel is lignite coal.  Note that this is a special type of coal, so the other enum of coal is reserved for hard coal types or if the exact type of coal is not known.
     */
    _lignite("lignite"),
    /**
     * Hard coal
     */
    _hardCoal("hardCoal"),
    /**
     * Oil Shale
     */
    _oilShale("oilShale"),
    ;

    private final String value;

    private FuelType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static FuelType fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, FuelType> ENUM_MAP;
    static {
        var map = new HashMap<String, FuelType>();
        for (FuelType instance : FuelType.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
