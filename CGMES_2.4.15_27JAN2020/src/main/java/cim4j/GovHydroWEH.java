/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Woodward Electric Hydro Governor Model.
 */
public class GovHydroWEH extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydroWEH.class);

    private BaseClass[] GovHydroWEH_class_attributes;
    private BaseClass[] GovHydroWEH_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new GovHydroWEH().getAttributeNamesMap();
    }

    private enum GovHydroWEH_primitive_builder implements PrimitiveBuilder {
        db() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        dicn() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        dpv() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        dturb() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        feedbackSignal() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        fl1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        fl2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        fl3() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        fl4() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        fl5() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        fp1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        fp10() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        fp2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        fp3() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        fp4() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        fp5() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        fp6() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        fp7() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        fp8() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        fp9() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
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
        gtmxcl() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        gtmxop() {
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
        pmss1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pmss10() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pmss2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pmss3() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pmss4() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pmss5() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pmss6() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pmss7() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pmss8() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pmss9() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        rpg() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        rpp() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        td() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tdv() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tg() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tp() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tpe() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tw() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum GovHydroWEH_class_attributes_enum {
        db,
        dicn,
        dpv,
        dturb,
        feedbackSignal,
        fl1,
        fl2,
        fl3,
        fl4,
        fl5,
        fp1,
        fp10,
        fp2,
        fp3,
        fp4,
        fp5,
        fp6,
        fp7,
        fp8,
        fp9,
        gmax,
        gmin,
        gtmxcl,
        gtmxop,
        gv1,
        gv2,
        gv3,
        gv4,
        gv5,
        kd,
        ki,
        kp,
        mwbase,
        pmss1,
        pmss10,
        pmss2,
        pmss3,
        pmss4,
        pmss5,
        pmss6,
        pmss7,
        pmss8,
        pmss9,
        rpg,
        rpp,
        td,
        tdv,
        tg,
        tp,
        tpe,
        tw,
        LAST_ENUM
    }

    public GovHydroWEH() {
        GovHydroWEH_primitive_attributes = new BaseClass[GovHydroWEH_primitive_builder.values().length];
        GovHydroWEH_class_attributes = new BaseClass[GovHydroWEH_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new GovHydroWEH();
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

    private void updateAttributeInArray(GovHydroWEH_class_attributes_enum attrEnum, BaseClass value) {
        try {
            GovHydroWEH_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(GovHydroWEH_primitive_builder attrEnum, BaseClass value) {
        try {
            GovHydroWEH_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            GovHydroWEH_class_attributes_enum attrEnum = GovHydroWEH_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated GovHydroWEH, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            GovHydroWEH_primitive_builder attrEnum = GovHydroWEH_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated GovHydroWEH, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            GovHydroWEH_primitive_builder attrEnum = GovHydroWEH_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovHydroWEH_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            GovHydroWEH_class_attributes_enum attrEnum = GovHydroWEH_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovHydroWEH_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : GovHydroWEH_primitive_builder.values()) {
            if (enumValue != GovHydroWEH_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovHydroWEH." + enumValue.name());
            }
        }
        for (var enumValue : GovHydroWEH_class_attributes_enum.values()) {
            if (enumValue != GovHydroWEH_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovHydroWEH." + enumValue.name());
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
            for (GovHydroWEH_primitive_builder attrEnum : GovHydroWEH_primitive_builder.values()) {
                BaseClass bc = GovHydroWEH_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovHydroWEH." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (GovHydroWEH_class_attributes_enum attrEnum : GovHydroWEH_class_attributes_enum.values()) {
                BaseClass bc = GovHydroWEH_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovHydroWEH." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(GovHydroWEH) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "GovHydroWEH";

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
        ATTR_NAMESPACE_MAP = new GovHydroWEH().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("db", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("dicn", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("dpv", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("dturb", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("feedbackSignal", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("fl1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("fl2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("fl3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("fl4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("fl5", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("fp1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("fp10", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("fp2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("fp3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("fp4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("fp5", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("fp6", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("fp7", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("fp8", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("fp9", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gtmxcl", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gtmxop", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv5", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ki", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("mwbase", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pmss1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pmss10", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pmss2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pmss3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pmss4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pmss5", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pmss6", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pmss7", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pmss8", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pmss9", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("rpg", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("rpp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("td", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tdv", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tg", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tpe", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tw", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
