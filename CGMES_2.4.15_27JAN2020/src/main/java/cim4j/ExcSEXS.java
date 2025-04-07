/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Simplified Excitation System Model.
 */
public class ExcSEXS extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcSEXS.class);

    private BaseClass[] ExcSEXS_class_attributes;
    private BaseClass[] ExcSEXS_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ExcSEXS().getAttributeNamesMap();
    }

    private enum ExcSEXS_primitive_builder implements PrimitiveBuilder {
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
        kc() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        tatb() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        tb() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
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
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum ExcSEXS_class_attributes_enum {
        efdmax,
        efdmin,
        emax,
        emin,
        k,
        kc,
        tatb,
        tb,
        tc,
        te,
        LAST_ENUM
    }

    public ExcSEXS() {
        ExcSEXS_primitive_attributes = new BaseClass[ExcSEXS_primitive_builder.values().length];
        ExcSEXS_class_attributes = new BaseClass[ExcSEXS_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ExcSEXS();
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

    private void updateAttributeInArray(ExcSEXS_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ExcSEXS_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ExcSEXS_primitive_builder attrEnum, BaseClass value) {
        try {
            ExcSEXS_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ExcSEXS_class_attributes_enum attrEnum = ExcSEXS_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ExcSEXS, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ExcSEXS_primitive_builder attrEnum = ExcSEXS_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ExcSEXS, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ExcSEXS_primitive_builder attrEnum = ExcSEXS_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcSEXS_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ExcSEXS_class_attributes_enum attrEnum = ExcSEXS_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcSEXS_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ExcSEXS_primitive_builder.values()) {
            if (enumValue != ExcSEXS_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcSEXS." + enumValue.name());
            }
        }
        for (var enumValue : ExcSEXS_class_attributes_enum.values()) {
            if (enumValue != ExcSEXS_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcSEXS." + enumValue.name());
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
            for (ExcSEXS_primitive_builder attrEnum : ExcSEXS_primitive_builder.values()) {
                BaseClass bc = ExcSEXS_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcSEXS." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ExcSEXS_class_attributes_enum attrEnum : ExcSEXS_class_attributes_enum.values()) {
                BaseClass bc = ExcSEXS_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcSEXS." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ExcSEXS) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ExcSEXS";

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
        ATTR_NAMESPACE_MAP = new ExcSEXS().allAttrNamespaceMap();
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
            Map.entry("kc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tatb", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tb", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("te", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
