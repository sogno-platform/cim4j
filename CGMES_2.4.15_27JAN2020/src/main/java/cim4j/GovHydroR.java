/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Fourth order lead-lag governor and hydro turbine.
 */
public class GovHydroR extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydroR.class);

    private BaseClass[] GovHydroR_class_attributes;
    private BaseClass[] GovHydroR_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new GovHydroR().getAttributeNamesMap();
    }

    private enum GovHydroR_primitive_builder implements PrimitiveBuilder {
        at() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        db1() {
            public BaseClass construct(java.lang.String value) {
                return new Frequency(value);
            }
        },
        db2() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        dturb() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        eps() {
            public BaseClass construct(java.lang.String value) {
                return new Frequency(value);
            }
        },
        gmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        gmin() {
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
        gv4() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        gv5() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        gv6() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        h0() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        inputSignal() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        kg() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ki() {
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
        pgv4() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pgv5() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pgv6() {
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
        qnl() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        r() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        t1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t3() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t4() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t5() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t6() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t7() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t8() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        td() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tp() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tt() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tw() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        velcl() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        velop() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum GovHydroR_class_attributes_enum {
        at,
        db1,
        db2,
        dturb,
        eps,
        gmax,
        gmin,
        gv1,
        gv2,
        gv3,
        gv4,
        gv5,
        gv6,
        h0,
        inputSignal,
        kg,
        ki,
        mwbase,
        pgv1,
        pgv2,
        pgv3,
        pgv4,
        pgv5,
        pgv6,
        pmax,
        pmin,
        qnl,
        r,
        t1,
        t2,
        t3,
        t4,
        t5,
        t6,
        t7,
        t8,
        td,
        tp,
        tt,
        tw,
        velcl,
        velop,
        LAST_ENUM
    }

    public GovHydroR() {
        GovHydroR_primitive_attributes = new BaseClass[GovHydroR_primitive_builder.values().length];
        GovHydroR_class_attributes = new BaseClass[GovHydroR_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new GovHydroR();
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

    private void updateAttributeInArray(GovHydroR_class_attributes_enum attrEnum, BaseClass value) {
        try {
            GovHydroR_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(GovHydroR_primitive_builder attrEnum, BaseClass value) {
        try {
            GovHydroR_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            GovHydroR_class_attributes_enum attrEnum = GovHydroR_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated GovHydroR, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            GovHydroR_primitive_builder attrEnum = GovHydroR_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated GovHydroR, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            GovHydroR_primitive_builder attrEnum = GovHydroR_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovHydroR_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            GovHydroR_class_attributes_enum attrEnum = GovHydroR_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovHydroR_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : GovHydroR_primitive_builder.values()) {
            if (enumValue != GovHydroR_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovHydroR." + enumValue.name());
            }
        }
        for (var enumValue : GovHydroR_class_attributes_enum.values()) {
            if (enumValue != GovHydroR_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovHydroR." + enumValue.name());
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
            for (GovHydroR_primitive_builder attrEnum : GovHydroR_primitive_builder.values()) {
                BaseClass bc = GovHydroR_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovHydroR." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (GovHydroR_class_attributes_enum attrEnum : GovHydroR_class_attributes_enum.values()) {
                BaseClass bc = GovHydroR_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovHydroR." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(GovHydroR) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "GovHydroR";

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
        ATTR_NAMESPACE_MAP = new GovHydroR().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("at", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("db1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("db2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("dturb", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("eps", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv5", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv6", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("h0", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("inputSignal", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kg", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ki", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("mwbase", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pgv1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pgv2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pgv3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pgv4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pgv5", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pgv6", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("qnl", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("r", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t5", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t6", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t7", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t8", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("td", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tw", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("velcl", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("velop", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
