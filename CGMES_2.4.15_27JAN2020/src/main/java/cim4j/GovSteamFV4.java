/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Detailed electro-hydraulic governor for steam unit.
 */
public class GovSteamFV4 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovSteamFV4.class);

    private BaseClass[] GovSteamFV4_class_attributes;
    private BaseClass[] GovSteamFV4_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new GovSteamFV4().getAttributeNamesMap();
    }

    private enum GovSteamFV4_primitive_builder implements PrimitiveBuilder {
        cpsmn() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        cpsmx() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        crmn() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        crmx() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kdc() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kf1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kf3() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        khp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kic() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kip() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kit() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kmp1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kmp2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kpc() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kpp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kpt() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        krc() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ksh() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        lpi() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        lps() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        mnef() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        mxef() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pr1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pr2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        psmn() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        rsmimn() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        rsmimx() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        rvgmn() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        rvgmx() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        srmn() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        srmx() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        srsmp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        svmn() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        svmx() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        ta() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tam() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tc() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tcm() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tdc() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tf1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tf2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        thp() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tmp() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        trh() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tv() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ty() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        y() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        yhpmn() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        yhpmx() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ympmn() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ympmx() {
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

    private enum GovSteamFV4_class_attributes_enum {
        cpsmn,
        cpsmx,
        crmn,
        crmx,
        kdc,
        kf1,
        kf3,
        khp,
        kic,
        kip,
        kit,
        kmp1,
        kmp2,
        kpc,
        kpp,
        kpt,
        krc,
        ksh,
        lpi,
        lps,
        mnef,
        mxef,
        pr1,
        pr2,
        psmn,
        rsmimn,
        rsmimx,
        rvgmn,
        rvgmx,
        srmn,
        srmx,
        srsmp,
        svmn,
        svmx,
        ta,
        tam,
        tc,
        tcm,
        tdc,
        tf1,
        tf2,
        thp,
        tmp,
        trh,
        tv,
        ty,
        y,
        yhpmn,
        yhpmx,
        ympmn,
        ympmx,
        LAST_ENUM
    }

    public GovSteamFV4() {
        GovSteamFV4_primitive_attributes = new BaseClass[GovSteamFV4_primitive_builder.values().length];
        GovSteamFV4_class_attributes = new BaseClass[GovSteamFV4_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new GovSteamFV4();
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

    private void updateAttributeInArray(GovSteamFV4_class_attributes_enum attrEnum, BaseClass value) {
        try {
            GovSteamFV4_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(GovSteamFV4_primitive_builder attrEnum, BaseClass value) {
        try {
            GovSteamFV4_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            GovSteamFV4_class_attributes_enum attrEnum = GovSteamFV4_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated GovSteamFV4, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            GovSteamFV4_primitive_builder attrEnum = GovSteamFV4_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated GovSteamFV4, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            GovSteamFV4_primitive_builder attrEnum = GovSteamFV4_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovSteamFV4_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            GovSteamFV4_class_attributes_enum attrEnum = GovSteamFV4_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovSteamFV4_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : GovSteamFV4_primitive_builder.values()) {
            if (enumValue != GovSteamFV4_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovSteamFV4." + enumValue.name());
            }
        }
        for (var enumValue : GovSteamFV4_class_attributes_enum.values()) {
            if (enumValue != GovSteamFV4_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovSteamFV4." + enumValue.name());
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
            for (GovSteamFV4_primitive_builder attrEnum : GovSteamFV4_primitive_builder.values()) {
                BaseClass bc = GovSteamFV4_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovSteamFV4." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (GovSteamFV4_class_attributes_enum attrEnum : GovSteamFV4_class_attributes_enum.values()) {
                BaseClass bc = GovSteamFV4_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovSteamFV4." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(GovSteamFV4) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "GovSteamFV4";

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
        ATTR_NAMESPACE_MAP = new GovSteamFV4().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("cpsmn", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("cpsmx", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("crmn", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("crmx", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kdc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kf1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kf3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("khp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kic", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kip", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kit", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kmp1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kmp2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kpc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kpp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kpt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("krc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ksh", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("lpi", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("lps", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("mnef", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("mxef", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pr1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pr2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("psmn", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("rsmimn", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("rsmimx", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("rvgmn", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("rvgmx", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("srmn", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("srmx", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("srsmp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("svmn", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("svmx", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ta", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tam", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tcm", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tdc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tf1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tf2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("thp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tmp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("trh", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tv", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ty", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("y", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("yhpmn", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("yhpmx", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ympmn", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ympmx", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
