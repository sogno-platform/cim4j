/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Governor droop signal feedback source.
 */
public enum DroopSignalFeedbackKind {
    /**
     * Electrical power feedback (connection indicated as 1 in the block diagrams of models, e.g. GovCT1, GovCT2).
     */
    _electricalPower("electricalPower"),
    /**
     * No droop signal feedback, is isochronous governor.
     */
    _none("none"),
    /**
     * Fuel valve stroke feedback (true stroke) (connection indicated as 2 in the block diagrams of model, e.g. GovCT1, GovCT2).
     */
    _fuelValveStroke("fuelValveStroke"),
    /**
     * Governor output feedback (requested stroke) (connection indicated as 3 in the block diagrams of models, e.g. GovCT1, GovCT2).
     */
    _governorOutput("governorOutput"),
    ;

    private final String value;

    private DroopSignalFeedbackKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static DroopSignalFeedbackKind fromString(String value) {
        return ENUM_MAP.get(value);
    }

    private static final Map<String, DroopSignalFeedbackKind> ENUM_MAP;
    static {
        var map = new HashMap<String, DroopSignalFeedbackKind>();
        for (DroopSignalFeedbackKind instance : DroopSignalFeedbackKind.values()) {
            map.put(instance.value, instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }
}
