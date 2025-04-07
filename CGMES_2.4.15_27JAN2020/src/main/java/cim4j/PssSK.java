/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * PSS Slovakian type - three inputs.
 */
public class PssSK extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssSK.class);

    private BaseClass[] PssSK_class_attributes;
    private BaseClass[] PssSK_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new PssSK().getAttributeNamesMap();
    }

    private enum PssSK_primitive_builder implements PrimitiveBuilder {
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
        k3() {
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
        vsmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vsmin() {
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

    private enum PssSK_class_attributes_enum {
        k1,
        k2,
        k3,
        t1,
        t2,
        t3,
        t4,
        t5,
        t6,
        vsmax,
        vsmin,
        LAST_ENUM
    }

    public PssSK() {
        PssSK_primitive_attributes = new BaseClass[PssSK_primitive_builder.values().length];
        PssSK_class_attributes = new BaseClass[PssSK_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new PssSK();
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

    private void updateAttributeInArray(PssSK_class_attributes_enum attrEnum, BaseClass value) {
        try {
            PssSK_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(PssSK_primitive_builder attrEnum, BaseClass value) {
        try {
            PssSK_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            PssSK_class_attributes_enum attrEnum = PssSK_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated PssSK, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            PssSK_primitive_builder attrEnum = PssSK_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated PssSK, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            PssSK_primitive_builder attrEnum = PssSK_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PssSK_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            PssSK_class_attributes_enum attrEnum = PssSK_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PssSK_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : PssSK_primitive_builder.values()) {
            if (enumValue != PssSK_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PssSK." + enumValue.name());
            }
        }
        for (var enumValue : PssSK_class_attributes_enum.values()) {
            if (enumValue != PssSK_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PssSK." + enumValue.name());
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
            for (PssSK_primitive_builder attrEnum : PssSK_primitive_builder.values()) {
                BaseClass bc = PssSK_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PssSK." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (PssSK_class_attributes_enum attrEnum : PssSK_class_attributes_enum.values()) {
                BaseClass bc = PssSK_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PssSK." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(PssSK) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "PssSK";

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
        ATTR_NAMESPACE_MAP = new PssSK().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("k1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("k2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("k3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t5", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t6", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vsmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vsmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
