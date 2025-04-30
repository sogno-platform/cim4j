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
    public static final String CIM_VERSION = "cgmes_v3_0_0";

    /**
     * Default namespaces used by CGMES. Map of namespace key to URL.
     */
    public static final Map<String, String> NAMESPACES_MAP;
    static {
        var map = new HashMap<String, String>();

        map.put("cim", "http://iec.ch/TC57/CIM100#");
        map.put("eu", "http://iec.ch/TC57/CIM100-European#");
        map.put("md", "http://iec.ch/TC57/61970-552/ModelDescription/1#");
        map.put("rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");

        NAMESPACES_MAP = Collections.unmodifiableMap(map);
    }
}
