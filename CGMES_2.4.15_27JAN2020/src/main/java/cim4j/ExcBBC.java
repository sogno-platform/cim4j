/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Transformer fed static excitation system (static with ABB regulator). This model represents a static excitation system in which a gated thyristor bridge fed by a transformer at the main generator terminals feeds the main generator directly.
 */
public class ExcBBC extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcBBC.class);

    private BaseClass[] ExcBBC_class_attributes;
    private BaseClass[] ExcBBC_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new ExcBBC().getAttributeNamesMap();
    }

    private enum ExcBBC_primitive_builder implements PrimitiveBuilder {
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
        k() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        _switch() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
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
        xe() {
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

    private enum ExcBBC_class_attributes_enum {
        efdmax,
        efdmin,
        k,
        _switch,
        t1,
        t2,
        t3,
        t4,
        vrmax,
        vrmin,
        xe,
        LAST_ENUM
    }

    public ExcBBC() {
        ExcBBC_primitive_attributes = new BaseClass[ExcBBC_primitive_builder.values().length];
        ExcBBC_class_attributes = new BaseClass[ExcBBC_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new ExcBBC();
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

    private void updateAttributeInArray(ExcBBC_class_attributes_enum attrEnum, BaseClass value) {
        try {
            ExcBBC_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(ExcBBC_primitive_builder attrEnum, BaseClass value) {
        try {
            ExcBBC_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            ExcBBC_class_attributes_enum attrEnum = ExcBBC_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated ExcBBC, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            ExcBBC_primitive_builder attrEnum = ExcBBC_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated ExcBBC, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            ExcBBC_primitive_builder attrEnum = ExcBBC_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcBBC_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            ExcBBC_class_attributes_enum attrEnum = ExcBBC_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = ExcBBC_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : ExcBBC_primitive_builder.values()) {
            if (enumValue != ExcBBC_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcBBC." + enumValue.name());
            }
        }
        for (var enumValue : ExcBBC_class_attributes_enum.values()) {
            if (enumValue != ExcBBC_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "ExcBBC." + enumValue.name());
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
            for (ExcBBC_primitive_builder attrEnum : ExcBBC_primitive_builder.values()) {
                BaseClass bc = ExcBBC_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcBBC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (ExcBBC_class_attributes_enum attrEnum : ExcBBC_class_attributes_enum.values()) {
                BaseClass bc = ExcBBC_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    ExcBBC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(ExcBBC) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "ExcBBC";

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
        ATTR_NAMESPACE_MAP = new ExcBBC().allAttrNamespaceMap();
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
            Map.entry("k", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("_switch", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("t4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmax", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("vrmin", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("xe", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
