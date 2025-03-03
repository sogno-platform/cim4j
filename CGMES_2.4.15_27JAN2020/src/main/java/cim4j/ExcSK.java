/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Slovakian Excitation System Model.  UEL and secondary voltage control are included in this model. When this model is used, there cannot be a separate underexcitation limiter or VAr controller model.
 */
public class ExcSK extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcSK.class);

    private BaseClass[] ExcSK_class_attributes;
    private BaseClass[] ExcSK_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ExcSK().getAttributeNamesMap();
    }

    private enum ExcSK_primitive_builder implements PrimitiveBuilder {
        efdmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        efdmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        emax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        emin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        k() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        k1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        k2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kc() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kce() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kd() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kgob() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kqi() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kqob() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kqp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        nq() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        qconoff() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        qz() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        remote() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        sbase() {
            public BaseClass construct(java.lang.String value) {
                return new ApparentPower(value);
            }
        },
        tc() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        te() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti() {
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
        uimax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        uimin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        urmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        urmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vtmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vtmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        yp() {
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

    private enum ExcSK_class_attributes_enum {
        efdmax,
        efdmin,
        emax,
        emin,
        k,
        k1,
        k2,
        kc,
        kce,
        kd,
        kgob,
        kp,
        kqi,
        kqob,
        kqp,
        nq,
        qconoff,
        qz,
        remote,
        sbase,
        tc,
        te,
        ti,
        tp,
        tr,
        uimax,
        uimin,
        urmax,
        urmin,
        vtmax,
        vtmin,
        yp,
        LAST_ENUM
    }

    public ExcSK() {
        ExcSK_primitive_attributes = new BaseClass[ExcSK_primitive_builder.values().length];
        ExcSK_class_attributes = new BaseClass[ExcSK_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ExcSK();
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

    private void updateAttributeInArray(ExcSK_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ExcSK_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ExcSK_primitive_builder attrEnum, BaseClass value) {
        try {
            ExcSK_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ExcSK_class_attributes_enum attrEnum = ExcSK_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ExcSK, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ExcSK_primitive_builder attrEnum = ExcSK_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ExcSK, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ExcSK_primitive_builder attrEnum = ExcSK_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcSK_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ExcSK_class_attributes_enum attrEnum = ExcSK_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcSK_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ExcSK_primitive_builder.values()) {
            if (enumValue != ExcSK_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcSK." + enumValue.name());
            }
        }
        for (var enumValue : ExcSK_class_attributes_enum.values()) {
            if (enumValue != ExcSK_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcSK." + enumValue.name());
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
            for (ExcSK_primitive_builder attrEnum : ExcSK_primitive_builder.values()) {
                BaseClass bc = ExcSK_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcSK." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ExcSK_class_attributes_enum attrEnum : ExcSK_class_attributes_enum.values()) {
                BaseClass bc = ExcSK_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcSK." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ExcSK) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ExcSK";

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
        ATTR_NAMESPACE_MAP = new ExcSK().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("efdmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("efdmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("emax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("emin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("k", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("k1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("k2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kce", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kgob", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kqi", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kqob", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kqp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("nq", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("qconoff", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("qz", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("remote", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("sbase", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("te", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ti", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tr", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("uimax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("uimin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("urmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("urmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vtmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vtmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("yp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
