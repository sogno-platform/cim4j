/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Hydro turbine and governor. Represents plants with straight-forward penstock configurations and hydraulic governors of traditional 'dashpot' type.  This model can be used to represent simple, Francis, Pelton or Kaplan turbines.
 */
public class GovHydro4 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydro4.class);

    private BaseClass[] GovHydro4_class_attributes;
    private BaseClass[] GovHydro4_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new GovHydro4().getAttributeNamesMap();
    }

    private enum GovHydro4_primitive_builder implements PrimitiveBuilder {
        at() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        bgv0() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        bgv1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        bgv2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        bgv3() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        bgv4() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        bgv5() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        bmax() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
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
        gv0() {
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
        pgv0() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
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
        qn1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        rperm() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        rtemp() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tblade() {
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
        uc() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        uo() {
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

    private enum GovHydro4_class_attributes_enum {
        at,
        bgv0,
        bgv1,
        bgv2,
        bgv3,
        bgv4,
        bgv5,
        bmax,
        db1,
        db2,
        dturb,
        eps,
        gmax,
        gmin,
        gv0,
        gv1,
        gv2,
        gv3,
        gv4,
        gv5,
        hdam,
        mwbase,
        pgv0,
        pgv1,
        pgv2,
        pgv3,
        pgv4,
        pgv5,
        qn1,
        rperm,
        rtemp,
        tblade,
        tg,
        tp,
        tr,
        tw,
        uc,
        uo,
        LAST_ENUM
    }

    public GovHydro4() {
        GovHydro4_primitive_attributes = new BaseClass[GovHydro4_primitive_builder.values().length];
        GovHydro4_class_attributes = new BaseClass[GovHydro4_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new GovHydro4();
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

    private void updateAttributeInArray(GovHydro4_class_attributes_enum attrEnum, BaseClass value) {
        try {
            GovHydro4_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(GovHydro4_primitive_builder attrEnum, BaseClass value) {
        try {
            GovHydro4_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            GovHydro4_class_attributes_enum attrEnum = GovHydro4_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated GovHydro4, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            GovHydro4_primitive_builder attrEnum = GovHydro4_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated GovHydro4, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            GovHydro4_primitive_builder attrEnum = GovHydro4_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovHydro4_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            GovHydro4_class_attributes_enum attrEnum = GovHydro4_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovHydro4_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : GovHydro4_primitive_builder.values()) {
            if (enumValue != GovHydro4_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovHydro4." + enumValue.name());
            }
        }
        for (var enumValue : GovHydro4_class_attributes_enum.values()) {
            if (enumValue != GovHydro4_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovHydro4." + enumValue.name());
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
            for (GovHydro4_primitive_builder attrEnum : GovHydro4_primitive_builder.values()) {
                BaseClass bc = GovHydro4_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovHydro4." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (GovHydro4_class_attributes_enum attrEnum : GovHydro4_class_attributes_enum.values()) {
                BaseClass bc = GovHydro4_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovHydro4." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(GovHydro4) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "GovHydro4";

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
        ATTR_NAMESPACE_MAP = new GovHydro4().allAttrNamespaceMap();
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
            Map.entry("bgv0", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("bgv1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("bgv2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("bgv3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("bgv4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("bgv5", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("bmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("db1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("db2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("dturb", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("eps", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv0", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("gv5", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("hdam", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("mwbase", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pgv0", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pgv1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pgv2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pgv3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pgv4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("pgv5", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("qn1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("rperm", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("rtemp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tblade", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tg", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tr", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tw", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("uc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("uo", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
