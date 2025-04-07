/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Italian excitation system. It represents static field voltage or excitation current feedback excitation system.
 */
public class ExcANS extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcANS.class);

    private BaseClass[] ExcANS_class_attributes;
    private BaseClass[] ExcANS_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ExcANS().getAttributeNamesMap();
    }

    private enum ExcANS_primitive_builder implements PrimitiveBuilder {
        blint() {
            public BaseClass construct(java.lang.String value) {
                return new Integer(value);
            }
        },
        ifmn() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ifmx() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        k2() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        k3() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kce() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        krvecc() {
            public BaseClass construct(java.lang.String value) {
                return new Integer(value);
            }
        },
        kvfif() {
            public BaseClass construct(java.lang.String value) {
                return new Integer(value);
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
        tb() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        vrmn() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vrmx() {
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

    private enum ExcANS_class_attributes_enum {
        blint,
        ifmn,
        ifmx,
        k2,
        k3,
        kce,
        krvecc,
        kvfif,
        t1,
        t2,
        t3,
        tb,
        vrmn,
        vrmx,
        LAST_ENUM
    }

    public ExcANS() {
        ExcANS_primitive_attributes = new BaseClass[ExcANS_primitive_builder.values().length];
        ExcANS_class_attributes = new BaseClass[ExcANS_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ExcANS();
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

    private void updateAttributeInArray(ExcANS_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ExcANS_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ExcANS_primitive_builder attrEnum, BaseClass value) {
        try {
            ExcANS_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ExcANS_class_attributes_enum attrEnum = ExcANS_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ExcANS, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ExcANS_primitive_builder attrEnum = ExcANS_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ExcANS, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ExcANS_primitive_builder attrEnum = ExcANS_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcANS_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ExcANS_class_attributes_enum attrEnum = ExcANS_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcANS_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ExcANS_primitive_builder.values()) {
            if (enumValue != ExcANS_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcANS." + enumValue.name());
            }
        }
        for (var enumValue : ExcANS_class_attributes_enum.values()) {
            if (enumValue != ExcANS_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcANS." + enumValue.name());
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
            for (ExcANS_primitive_builder attrEnum : ExcANS_primitive_builder.values()) {
                BaseClass bc = ExcANS_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcANS." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ExcANS_class_attributes_enum attrEnum : ExcANS_class_attributes_enum.values()) {
                BaseClass bc = ExcANS_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcANS." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ExcANS) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ExcANS";

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
        ATTR_NAMESPACE_MAP = new ExcANS().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("blint", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ifmn", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ifmx", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("k2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("k3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kce", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("krvecc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kvfif", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tb", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmn", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmx", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
