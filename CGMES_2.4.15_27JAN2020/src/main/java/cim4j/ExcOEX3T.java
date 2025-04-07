/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Modified IEEE Type ST1 Excitation System with semi-continuous and acting terminal voltage limiter.
 */
public class ExcOEX3T extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcOEX3T.class);

    private BaseClass[] ExcOEX3T_class_attributes;
    private BaseClass[] ExcOEX3T_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ExcOEX3T().getAttributeNamesMap();
    }

    private enum ExcOEX3T_primitive_builder implements PrimitiveBuilder {
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
        ka() {
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
        kf() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        see1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        see2() {
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
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum ExcOEX3T_class_attributes_enum {
        e1,
        e2,
        ka,
        kc,
        kd,
        ke,
        kf,
        see1,
        see2,
        t1,
        t2,
        t3,
        t4,
        t5,
        t6,
        te,
        tf,
        vrmax,
        vrmin,
        LAST_ENUM
    }

    public ExcOEX3T() {
        ExcOEX3T_primitive_attributes = new BaseClass[ExcOEX3T_primitive_builder.values().length];
        ExcOEX3T_class_attributes = new BaseClass[ExcOEX3T_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ExcOEX3T();
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

    private void updateAttributeInArray(ExcOEX3T_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ExcOEX3T_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ExcOEX3T_primitive_builder attrEnum, BaseClass value) {
        try {
            ExcOEX3T_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ExcOEX3T_class_attributes_enum attrEnum = ExcOEX3T_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ExcOEX3T, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ExcOEX3T_primitive_builder attrEnum = ExcOEX3T_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ExcOEX3T, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ExcOEX3T_primitive_builder attrEnum = ExcOEX3T_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcOEX3T_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ExcOEX3T_class_attributes_enum attrEnum = ExcOEX3T_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcOEX3T_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ExcOEX3T_primitive_builder.values()) {
            if (enumValue != ExcOEX3T_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcOEX3T." + enumValue.name());
            }
        }
        for (var enumValue : ExcOEX3T_class_attributes_enum.values()) {
            if (enumValue != ExcOEX3T_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcOEX3T." + enumValue.name());
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
            for (ExcOEX3T_primitive_builder attrEnum : ExcOEX3T_primitive_builder.values()) {
                BaseClass bc = ExcOEX3T_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcOEX3T." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ExcOEX3T_class_attributes_enum attrEnum : ExcOEX3T_class_attributes_enum.values()) {
                BaseClass bc = ExcOEX3T_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcOEX3T." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ExcOEX3T) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ExcOEX3T";

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
        ATTR_NAMESPACE_MAP = new ExcOEX3T().allAttrNamespaceMap();
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
            Map.entry("ka", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kd", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ke", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("see1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("see2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t5", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t6", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("te", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
