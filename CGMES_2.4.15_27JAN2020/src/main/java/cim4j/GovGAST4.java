/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generic turbogas.
 */
public class GovGAST4 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovGAST4.class);

    private BaseClass[] GovGAST4_class_attributes;
    private BaseClass[] GovGAST4_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new GovGAST4().getAttributeNamesMap();
    }

    private enum GovGAST4_primitive_builder implements PrimitiveBuilder {
        bp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ktm() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        mnef() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        mxef() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        rymn() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        rymx() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ta() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tc() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tcm() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tm() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tv() {
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

    private enum GovGAST4_class_attributes_enum {
        bp,
        ktm,
        mnef,
        mxef,
        rymn,
        rymx,
        ta,
        tc,
        tcm,
        tm,
        tv,
        LAST_ENUM
    }

    public GovGAST4() {
        GovGAST4_primitive_attributes = new BaseClass[GovGAST4_primitive_builder.values().length];
        GovGAST4_class_attributes = new BaseClass[GovGAST4_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new GovGAST4();
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

    private void updateAttributeInArray(GovGAST4_class_attributes_enum attrEnum, BaseClass value) {
        try {
            GovGAST4_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(GovGAST4_primitive_builder attrEnum, BaseClass value) {
        try {
            GovGAST4_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            GovGAST4_class_attributes_enum attrEnum = GovGAST4_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated GovGAST4, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            GovGAST4_primitive_builder attrEnum = GovGAST4_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated GovGAST4, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            GovGAST4_primitive_builder attrEnum = GovGAST4_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovGAST4_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            GovGAST4_class_attributes_enum attrEnum = GovGAST4_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovGAST4_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : GovGAST4_primitive_builder.values()) {
            if (enumValue != GovGAST4_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovGAST4." + enumValue.name());
            }
        }
        for (var enumValue : GovGAST4_class_attributes_enum.values()) {
            if (enumValue != GovGAST4_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovGAST4." + enumValue.name());
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
            for (GovGAST4_primitive_builder attrEnum : GovGAST4_primitive_builder.values()) {
                BaseClass bc = GovGAST4_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovGAST4." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (GovGAST4_class_attributes_enum attrEnum : GovGAST4_class_attributes_enum.values()) {
                BaseClass bc = GovGAST4_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovGAST4." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(GovGAST4) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "GovGAST4";

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
        ATTR_NAMESPACE_MAP = new GovGAST4().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("bp", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ktm", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("mnef", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("mxef", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("rymn", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("rymx", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ta", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tc", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tcm", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tm", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("tv", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
