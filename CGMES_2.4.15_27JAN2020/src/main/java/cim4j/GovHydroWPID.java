/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Woodward PID Hydro Governor.
 */
public class GovHydroWPID extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydroWPID.class);

    private BaseClass[] GovHydroWPID_class_attributes;
    private BaseClass[] GovHydroWPID_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new GovHydroWPID().getAttributeNamesMap();
    }

    private enum GovHydroWPID_primitive_builder implements PrimitiveBuilder {
        d() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        gatmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        gatmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        gv1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        gv2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        gv3() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kd() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ki() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        mwbase() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        pgv1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pgv2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pgv3() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        reg() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ta() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tb() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        treg() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tw() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        velmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        velmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum GovHydroWPID_class_attributes_enum {
        d,
        gatmax,
        gatmin,
        gv1,
        gv2,
        gv3,
        kd,
        ki,
        kp,
        mwbase,
        pgv1,
        pgv2,
        pgv3,
        pmax,
        pmin,
        reg,
        ta,
        tb,
        treg,
        tw,
        velmax,
        velmin,
        LAST_ENUM
    }

    public GovHydroWPID() {
        GovHydroWPID_primitive_attributes = new BaseClass[GovHydroWPID_primitive_builder.values().length];
        GovHydroWPID_class_attributes = new BaseClass[GovHydroWPID_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new GovHydroWPID();
    }

    @Override
    public void setValue(java.lang.String s) {
        LOG.error(debugString() + " is not sure what to do with " + s);
    }

    @Override
    public void setRdfid(java.lang.String id) {
        rdfid = id;
    }

    @Override
    public java.lang.String getRdfid() {
        return rdfid;
    }

    private void updateAttributeInArray(GovHydroWPID_class_attributes_enum attrEnum, BaseClass value) {
        try {
            GovHydroWPID_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(GovHydroWPID_primitive_builder attrEnum, BaseClass value) {
        try {
            GovHydroWPID_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            GovHydroWPID_class_attributes_enum attrEnum = GovHydroWPID_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated GovHydroWPID, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            GovHydroWPID_primitive_builder attrEnum = GovHydroWPID_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated GovHydroWPID, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            GovHydroWPID_primitive_builder attrEnum = GovHydroWPID_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovHydroWPID_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            GovHydroWPID_class_attributes_enum attrEnum = GovHydroWPID_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovHydroWPID_class_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        if (!defined) {
            return super.getAttribute(attrName);
        }
        return null;
    }

    @Override
    protected Map<java.lang.String, java.lang.String> getAttributeNamesMap() {
        Map<java.lang.String, java.lang.String> namesMap = new LinkedHashMap<>();
        for (var enumValue : GovHydroWPID_primitive_builder.values()) {
            if (enumValue != GovHydroWPID_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovHydroWPID." + enumValue.name());
            }
        }
        for (var enumValue : GovHydroWPID_class_attributes_enum.values()) {
            if (enumValue != GovHydroWPID_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovHydroWPID." + enumValue.name());
            }
        }
        namesMap.putAll(super.getAttributeNamesMap());
        return namesMap;
    }

    @Override
    public Set<java.lang.String> getAttributeNames() {
        return ATTRIBUTE_NAMES_MAP.keySet();
    }

    @Override
    public java.lang.String getAttributeFullName(java.lang.String attrName) {
        return ATTRIBUTE_NAMES_MAP.get(attrName);
    }

    @Override
    public java.lang.String toString(boolean topClass) {
        java.lang.String result = "";
        if (topClass) {
            for (GovHydroWPID_primitive_builder attrEnum : GovHydroWPID_primitive_builder.values()) {
                BaseClass bc = GovHydroWPID_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovHydroWPID." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (GovHydroWPID_class_attributes_enum attrEnum : GovHydroWPID_class_attributes_enum.values()) {
                BaseClass bc = GovHydroWPID_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovHydroWPID." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(GovHydroWPID) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "GovHydroWPID";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }

    /**
     * Get the namespace URL of an object of this class.
     *
     * @return The namespace URL
     */
    @Override
    public java.lang.String getClassNamespaceUrl() {
        return "http://iec.ch/TC57/2013/CIM-schema-cim16#";
    }

    /**
     * Get the namespace URL of an attribute (also for inherited attributes).
     *
     * @return The namespace URL
     */
    @Override
    public java.lang.String getAttributeNamespaceUrl(java.lang.String attrName) {
        return ATTR_NAMESPACE_MAP.get(attrName);
    }

    private static final Map<java.lang.String, java.lang.String> ATTR_NAMESPACE_MAP;
    static {
        ATTR_NAMESPACE_MAP = new GovHydroWPID().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("d", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gatmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gatmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ki", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("mwbase", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pgv1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pgv2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pgv3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("reg", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ta", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tb", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("treg", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tw", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("velmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("velmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
