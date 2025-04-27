/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Basic Hydro turbine governor model.
 */
public class GovHydro1 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydro1.class);

    private BaseClass[] GovHydro1_class_attributes;
    private BaseClass[] GovHydro1_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new GovHydro1().getAttributeNamesMap();
    }

    private enum GovHydro1_primitive_builder implements PrimitiveBuilder {
        at() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        dturb() {
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
        hdam() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        mwbase() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        qnl() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        rperm() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        rtemp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        tf() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tg() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tr() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tw() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        velm() {
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

    private enum GovHydro1_class_attributes_enum {
        at,
        dturb,
        gmax,
        gmin,
        hdam,
        mwbase,
        qnl,
        rperm,
        rtemp,
        tf,
        tg,
        tr,
        tw,
        velm,
        LAST_ENUM
    }

    public GovHydro1() {
        GovHydro1_primitive_attributes = new BaseClass[GovHydro1_primitive_builder.values().length];
        GovHydro1_class_attributes = new BaseClass[GovHydro1_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new GovHydro1();
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

    private void updateAttributeInArray(GovHydro1_class_attributes_enum attrEnum, BaseClass value) {
        try {
            GovHydro1_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(GovHydro1_primitive_builder attrEnum, BaseClass value) {
        try {
            GovHydro1_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            GovHydro1_class_attributes_enum attrEnum = GovHydro1_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated GovHydro1, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            GovHydro1_primitive_builder attrEnum = GovHydro1_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated GovHydro1, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            GovHydro1_primitive_builder attrEnum = GovHydro1_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovHydro1_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            GovHydro1_class_attributes_enum attrEnum = GovHydro1_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovHydro1_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : GovHydro1_primitive_builder.values()) {
            if (enumValue != GovHydro1_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovHydro1." + enumValue.name());
            }
        }
        for (var enumValue : GovHydro1_class_attributes_enum.values()) {
            if (enumValue != GovHydro1_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovHydro1." + enumValue.name());
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
            for (GovHydro1_primitive_builder attrEnum : GovHydro1_primitive_builder.values()) {
                BaseClass bc = GovHydro1_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovHydro1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (GovHydro1_class_attributes_enum attrEnum : GovHydro1_class_attributes_enum.values()) {
                BaseClass bc = GovHydro1_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovHydro1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(GovHydro1) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "GovHydro1";

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
        ATTR_NAMESPACE_MAP = new GovHydro1().allAttrNamespaceMap();
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
            Map.entry("dturb", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("hdam", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("mwbase", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("qnl", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("rperm", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("rtemp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tg", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tr", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tw", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("velm", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
