/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * General Purpose Rotating Excitation System Model.  This model can be used to represent a wide range of excitation systems whose DC power source is an AC or DC generator. It encompasses IEEE type AC1, AC2, DC1, and DC2 excitation system models.
 */
public class ExcREXS extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcREXS.class);

    private BaseClass[] ExcREXS_class_attributes;
    private BaseClass[] ExcREXS_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ExcREXS().getAttributeNamesMap();
    }

    private enum ExcREXS_primitive_builder implements PrimitiveBuilder {
        e1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        e2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        fbf() {
            public BaseClass construct(java.lang.String value) {
                return new ExcREXSFeedbackSignalKind(value);
            }
        },
        flimf() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kc() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kd() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ke() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kefd() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kf() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        kh() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kii() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kip() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ks() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kvi() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kvp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kvphz() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        nvphz() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        se1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        se2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ta() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tb1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tb2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tc1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tc2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        te() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tf() {
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
        tp() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        vcmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vfmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vfmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vimax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vrmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vrmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        xc() {
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

    private enum ExcREXS_class_attributes_enum {
        e1,
        e2,
        fbf,
        flimf,
        kc,
        kd,
        ke,
        kefd,
        kf,
        kh,
        kii,
        kip,
        ks,
        kvi,
        kvp,
        kvphz,
        nvphz,
        se1,
        se2,
        ta,
        tb1,
        tb2,
        tc1,
        tc2,
        te,
        tf,
        tf1,
        tf2,
        tp,
        vcmax,
        vfmax,
        vfmin,
        vimax,
        vrmax,
        vrmin,
        xc,
        LAST_ENUM
    }

    public ExcREXS() {
        ExcREXS_primitive_attributes = new BaseClass[ExcREXS_primitive_builder.values().length];
        ExcREXS_class_attributes = new BaseClass[ExcREXS_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ExcREXS();
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

    private void updateAttributeInArray(ExcREXS_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ExcREXS_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ExcREXS_primitive_builder attrEnum, BaseClass value) {
        try {
            ExcREXS_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ExcREXS_class_attributes_enum attrEnum = ExcREXS_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ExcREXS, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ExcREXS_primitive_builder attrEnum = ExcREXS_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ExcREXS, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ExcREXS_primitive_builder attrEnum = ExcREXS_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcREXS_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ExcREXS_class_attributes_enum attrEnum = ExcREXS_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcREXS_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ExcREXS_primitive_builder.values()) {
            if (enumValue != ExcREXS_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcREXS." + enumValue.name());
            }
        }
        for (var enumValue : ExcREXS_class_attributes_enum.values()) {
            if (enumValue != ExcREXS_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcREXS." + enumValue.name());
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
            for (ExcREXS_primitive_builder attrEnum : ExcREXS_primitive_builder.values()) {
                BaseClass bc = ExcREXS_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcREXS." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ExcREXS_class_attributes_enum attrEnum : ExcREXS_class_attributes_enum.values()) {
                BaseClass bc = ExcREXS_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcREXS." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ExcREXS) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ExcREXS";

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
        ATTR_NAMESPACE_MAP = new ExcREXS().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("e1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("e2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("fbf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("flimf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ke", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kefd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kh", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kii", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kip", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ks", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kvi", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kvp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kvphz", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("nvphz", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("se1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("se2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ta", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tb1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tb2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tc1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tc2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("te", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tf1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tf2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vcmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vfmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vfmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vimax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("xc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
