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
    EQ("Equipment"),
    DL("DiagramLayout"),
    DY("Dynamics"),
    EQ_BD("EquipmentBoundary"),
    GL("GeographicalLocation"),
    SSH("SteadyStateHypothesis"),
    SV("StateVariables"),
    TP("Topology"),
    TP_BD("TopologyBoundary"),
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
        uris.add("http://entsoe.eu/CIM/EquipmentCore/3/1");
        uris.add("http://entsoe.eu/CIM/EquipmentOperation/3/1");
        uris.add("http://entsoe.eu/CIM/EquipmentShortCircuit/3/1");
        map.put("EQ", uris);

        uris = new ArrayList<>();
        uris.add("http://entsoe.eu/CIM/DiagramLayout/3/1");
        map.put("DL", uris);

        uris = new ArrayList<>();
        uris.add("http://entsoe.eu/CIM/Dynamics/3/1");
        map.put("DY", uris);

        uris = new ArrayList<>();
        uris.add("http://entsoe.eu/CIM/EquipmentBoundary/3/1");
        uris.add("http://entsoe.eu/CIM/EquipmentBoundaryOperation/3/1");
        map.put("EQ_BD", uris);

        uris = new ArrayList<>();
        uris.add("http://entsoe.eu/CIM/GeographicalLocation/2/1");
        map.put("GL", uris);

        uris = new ArrayList<>();
        uris.add("http://entsoe.eu/CIM/SteadyStateHypothesis/1/1");
        map.put("SSH", uris);

        uris = new ArrayList<>();
        uris.add("http://entsoe.eu/CIM/StateVariables/4/1");
        map.put("SV", uris);

        uris = new ArrayList<>();
        uris.add("http://entsoe.eu/CIM/Topology/4/1");
        map.put("TP", uris);

        uris = new ArrayList<>();
        uris.add("http://entsoe.eu/CIM/TopologyBoundary/3/1");
        map.put("TP_BD", uris);

        URI_MAP = Collections.unmodifiableMap(map);
    }
}
