/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Power system stabilizer typically associated with ExcELIN2 (though PssIEEE2B or Pss2B can also be used).
 */
public class PssELIN2 extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssELIN2.class);

    private BaseClass[] PssELIN2_class_attributes;
    private BaseClass[] PssELIN2_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new PssELIN2().getAttributeNamesMap();
    }

    private enum PssELIN2_primitive_builder implements PrimitiveBuilder {
        apss() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ks1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ks2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ppss() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        psslim() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ts1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ts2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ts3() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ts4() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ts5() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ts6() {
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

    private enum PssELIN2_class_attributes_enum {
        apss,
        ks1,
        ks2,
        ppss,
        psslim,
        ts1,
        ts2,
        ts3,
        ts4,
        ts5,
        ts6,
        LAST_ENUM
    }

    public PssELIN2() {
        PssELIN2_primitive_attributes = new BaseClass[PssELIN2_primitive_builder.values().length];
        PssELIN2_class_attributes = new BaseClass[PssELIN2_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new PssELIN2();
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

    private void updateAttributeInArray(PssELIN2_class_attributes_enum attrEnum, BaseClass value) {
        try {
            PssELIN2_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(PssELIN2_primitive_builder attrEnum, BaseClass value) {
        try {
            PssELIN2_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            PssELIN2_class_attributes_enum attrEnum = PssELIN2_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated PssELIN2, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            PssELIN2_primitive_builder attrEnum = PssELIN2_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated PssELIN2, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            PssELIN2_primitive_builder attrEnum = PssELIN2_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PssELIN2_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            PssELIN2_class_attributes_enum attrEnum = PssELIN2_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PssELIN2_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : PssELIN2_primitive_builder.values()) {
            if (enumValue != PssELIN2_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PssELIN2." + enumValue.name());
            }
        }
        for (var enumValue : PssELIN2_class_attributes_enum.values()) {
            if (enumValue != PssELIN2_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PssELIN2." + enumValue.name());
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
            for (PssELIN2_primitive_builder attrEnum : PssELIN2_primitive_builder.values()) {
                BaseClass bc = PssELIN2_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PssELIN2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (PssELIN2_class_attributes_enum attrEnum : PssELIN2_class_attributes_enum.values()) {
                BaseClass bc = PssELIN2_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PssELIN2." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(PssELIN2) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "PssELIN2";

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
        ATTR_NAMESPACE_MAP = new PssELIN2().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("apss", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ks1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ks2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ppss", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("psslim", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ts1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ts2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ts3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ts4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ts5", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ts6", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
