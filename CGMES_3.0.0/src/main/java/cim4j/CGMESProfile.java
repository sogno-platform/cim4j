/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Enum containing all CGMES profiles.
 */
public enum CGMESProfile {
    EQ("CoreEquipment"),
    DL("DiagramLayout"),
    DY("Dynamics"),
    EQBD("EquipmentBoundary"),
    GL("GeographicalLocation"),
    OP("Operation"),
    SC("ShortCircuit"),
    SSH("SteadyStateHypothesis"),
    SV("StateVariables"),
    TP("Topology"),
    ;

    private final java.lang.String longName;

    private CGMESProfile(java.lang.String longName) {
        this.longName = longName;
    }

    /**
     * Search the profile for a long name.
     *
     * @return profile
     */
    public static CGMESProfile fromLongName(java.lang.String longName) {
        return ENUM_MAP.get(longName);
    }

    private static final Map<java.lang.String, CGMESProfile> ENUM_MAP;
    static {
        Map<java.lang.String, CGMESProfile> map = new LinkedHashMap<>();
        for (CGMESProfile profile : CGMESProfile.values()) {
            map.put(profile.longName, profile);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    /**
     * Return the long name of the profile.
     *
     * @return long name
     */
    public java.lang.String getLongName() {
        return longName;
    }

    /**
     * Return the list of uris of the profile.
     *
     * @return list of uris
     */
    public List<java.lang.String> getUris() {
        return URI_MAP.get(name());
    }

    private static final Map<java.lang.String, List<java.lang.String>> URI_MAP;
    static {
        Map<java.lang.String, List<java.lang.String>> map = new LinkedHashMap<>();
        List<java.lang.String> uris;

        uris = new ArrayList<>();
        uris.add("http://iec.ch/TC57/ns/CIM/CoreEquipment-EU/3.0");
        map.put("EQ", uris);

        uris = new ArrayList<>();
        uris.add("http://iec.ch/TC57/ns/CIM/DiagramLayout-EU/3.0");
        map.put("DL", uris);

        uris = new ArrayList<>();
        uris.add("http://iec.ch/TC57/ns/CIM/Dynamics-EU/1.0");
        map.put("DY", uris);

        uris = new ArrayList<>();
        uris.add("http://iec.ch/TC57/ns/CIM/EquipmentBoundary-EU/3.0");
        map.put("EQBD", uris);

        uris = new ArrayList<>();
        uris.add("http://iec.ch/TC57/ns/CIM/GeographicalLocation-EU/3.0");
        map.put("GL", uris);

        uris = new ArrayList<>();
        uris.add("http://iec.ch/TC57/ns/CIM/Operation-EU/3.0");
        map.put("OP", uris);

        uris = new ArrayList<>();
        uris.add("http://iec.ch/TC57/ns/CIM/ShortCircuit-EU/3.0");
        map.put("SC", uris);

        uris = new ArrayList<>();
        uris.add("http://iec.ch/TC57/ns/CIM/SteadyStateHypothesis-EU/3.0");
        map.put("SSH", uris);

        uris = new ArrayList<>();
        uris.add("http://iec.ch/TC57/ns/CIM/StateVariables-EU/3.0");
        map.put("SV", uris);

        uris = new ArrayList<>();
        uris.add("http://iec.ch/TC57/ns/CIM/Topology-EU/3.0");
        map.put("TP", uris);

        URI_MAP = Collections.unmodifiableMap(map);
    }
}
