/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Field voltage over excitation limiter.
 */
public class OverexcLimX1 extends OverexcitationLimiterDynamics {

    private static final Logging LOG = Logging.getLogger(OverexcLimX1.class);

    private BaseClass[] OverexcLimX1_class_attributes;
    private BaseClass[] OverexcLimX1_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new OverexcLimX1().getAttributeNamesMap();
    }

    private enum OverexcLimX1_primitive_builder implements PrimitiveBuilder {
        efd1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        efd2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        efd3() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        efddes() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        efdrated() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kmx() {
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
        vlow() {
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

    private enum OverexcLimX1_class_attributes_enum {
        efd1,
        efd2,
        efd3,
        efddes,
        efdrated,
        kmx,
        t1,
        t2,
        t3,
        vlow,
        LAST_ENUM
    }

    public OverexcLimX1() {
        OverexcLimX1_primitive_attributes = new BaseClass[OverexcLimX1_primitive_builder.values().length];
        OverexcLimX1_class_attributes = new BaseClass[OverexcLimX1_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new OverexcLimX1();
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

    private void updateAttributeInArray(OverexcLimX1_class_attributes_enum attrEnum, BaseClass value) {
        try {
            OverexcLimX1_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(OverexcLimX1_primitive_builder attrEnum, BaseClass value) {
        try {
            OverexcLimX1_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            OverexcLimX1_class_attributes_enum attrEnum = OverexcLimX1_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated OverexcLimX1, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            OverexcLimX1_primitive_builder attrEnum = OverexcLimX1_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated OverexcLimX1, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            OverexcLimX1_primitive_builder attrEnum = OverexcLimX1_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = OverexcLimX1_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            OverexcLimX1_class_attributes_enum attrEnum = OverexcLimX1_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = OverexcLimX1_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : OverexcLimX1_primitive_builder.values()) {
            if (enumValue != OverexcLimX1_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "OverexcLimX1." + enumValue.name());
            }
        }
        for (var enumValue : OverexcLimX1_class_attributes_enum.values()) {
            if (enumValue != OverexcLimX1_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "OverexcLimX1." + enumValue.name());
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
            for (OverexcLimX1_primitive_builder attrEnum : OverexcLimX1_primitive_builder.values()) {
                BaseClass bc = OverexcLimX1_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    OverexcLimX1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (OverexcLimX1_class_attributes_enum attrEnum : OverexcLimX1_class_attributes_enum.values()) {
                BaseClass bc = OverexcLimX1_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    OverexcLimX1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(OverexcLimX1) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "OverexcLimX1";

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
        ATTR_NAMESPACE_MAP = new OverexcLimX1().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("efd1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("efd2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("efd3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("efddes", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("efdrated", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kmx", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vlow", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
