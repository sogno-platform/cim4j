/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class CimConstants {

    /**
     * CIM version string.
     */
    public static final String CIM_VERSION = "cgmes_v2_4_15";

    /**
     * Default namespaces used by CGMES. Map of namespace key to URL.
     */
    public static final Map<String, String> NAMESPACES_MAP;
    static {
        var map = new HashMap<String, String>();

        map.put("cim", "http://iec.ch/TC57/2013/CIM-schema-cim16#");
        map.put("entsoe", "http://entsoe.eu/CIM/SchemaExtension/3/1#");
        map.put("md", "http://iec.ch/TC57/61970-552/ModelDescription/1#");
        map.put("rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");

        NAMESPACES_MAP = Collections.unmodifiableMap(map);
    }
}
