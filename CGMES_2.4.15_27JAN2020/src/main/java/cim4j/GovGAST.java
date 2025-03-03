/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Single shaft gas turbine.
 */
public class GovGAST extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovGAST.class);

    private BaseClass[] GovGAST_class_attributes;
    private BaseClass[] GovGAST_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new GovGAST().getAttributeNamesMap();
    }

    private enum GovGAST_primitive_builder implements PrimitiveBuilder {
        at() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        dturb() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kt() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        mwbase() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        r() {
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
        vmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vmin() {
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

    private enum GovGAST_class_attributes_enum {
        at,
        dturb,
        kt,
        mwbase,
        r,
        t1,
        t2,
        t3,
        vmax,
        vmin,
        LAST_ENUM
    }

    public GovGAST() {
        GovGAST_primitive_attributes = new BaseClass[GovGAST_primitive_builder.values().length];
        GovGAST_class_attributes = new BaseClass[GovGAST_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new GovGAST();
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

    private void updateAttributeInArray(GovGAST_class_attributes_enum attrEnum, BaseClass value) {
        try {
            GovGAST_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(GovGAST_primitive_builder attrEnum, BaseClass value) {
        try {
            GovGAST_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            GovGAST_class_attributes_enum attrEnum = GovGAST_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated GovGAST, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            GovGAST_primitive_builder attrEnum = GovGAST_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated GovGAST, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            GovGAST_primitive_builder attrEnum = GovGAST_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovGAST_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            GovGAST_class_attributes_enum attrEnum = GovGAST_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovGAST_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : GovGAST_primitive_builder.values()) {
            if (enumValue != GovGAST_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovGAST." + enumValue.name());
            }
        }
        for (var enumValue : GovGAST_class_attributes_enum.values()) {
            if (enumValue != GovGAST_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovGAST." + enumValue.name());
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
            for (GovGAST_primitive_builder attrEnum : GovGAST_primitive_builder.values()) {
                BaseClass bc = GovGAST_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovGAST." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (GovGAST_class_attributes_enum attrEnum : GovGAST_class_attributes_enum.values()) {
                BaseClass bc = GovGAST_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovGAST." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(GovGAST) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "GovGAST";

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
        ATTR_NAMESPACE_MAP = new GovGAST().allAttrNamespaceMap();
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
            Map.entry("dturb", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kt", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("mwbase", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("r", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
