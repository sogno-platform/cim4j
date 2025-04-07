/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * General static load model representing the sensitivity of the real and reactive power consumed by the load to the amplitude and frequency of the bus voltage.
 */
public class LoadStatic extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(LoadStatic.class);

    private BaseClass[] LoadStatic_class_attributes;
    private BaseClass[] LoadStatic_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new LoadStatic().getAttributeNamesMap();
    }

    private enum LoadStatic_primitive_builder implements PrimitiveBuilder {
        ep1() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        ep2() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        ep3() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        eq1() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        eq2() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        eq3() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kp1() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kp2() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kp3() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kp4() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kpf() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kq1() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kq2() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kq3() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kq4() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        kqf() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        staticLoadModelType() {
            public BaseClass construct(java.lang.String value) {
                return new StaticLoadModelKind(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum LoadStatic_class_attributes_enum {
        LoadAggregate,
        ep1,
        ep2,
        ep3,
        eq1,
        eq2,
        eq3,
        kp1,
        kp2,
        kp3,
        kp4,
        kpf,
        kq1,
        kq2,
        kq3,
        kq4,
        kqf,
        staticLoadModelType,
        LAST_ENUM
    }

    public LoadStatic() {
        LoadStatic_primitive_attributes = new BaseClass[LoadStatic_primitive_builder.values().length];
        LoadStatic_class_attributes = new BaseClass[LoadStatic_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new LoadStatic();
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

    private void updateAttributeInArray(LoadStatic_class_attributes_enum attrEnum, BaseClass value) {
        try {
            LoadStatic_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(LoadStatic_primitive_builder attrEnum, BaseClass value) {
        try {
            LoadStatic_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            LoadStatic_class_attributes_enum attrEnum = LoadStatic_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated LoadStatic, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            LoadStatic_primitive_builder attrEnum = LoadStatic_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated LoadStatic, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            LoadStatic_primitive_builder attrEnum = LoadStatic_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = LoadStatic_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            LoadStatic_class_attributes_enum attrEnum = LoadStatic_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = LoadStatic_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : LoadStatic_primitive_builder.values()) {
            if (enumValue != LoadStatic_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "LoadStatic." + enumValue.name());
            }
        }
        for (var enumValue : LoadStatic_class_attributes_enum.values()) {
            if (enumValue != LoadStatic_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "LoadStatic." + enumValue.name());
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
            for (LoadStatic_primitive_builder attrEnum : LoadStatic_primitive_builder.values()) {
                BaseClass bc = LoadStatic_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    LoadStatic." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (LoadStatic_class_attributes_enum attrEnum : LoadStatic_class_attributes_enum.values()) {
                BaseClass bc = LoadStatic_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    LoadStatic." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(LoadStatic) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "LoadStatic";

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
        ATTR_NAMESPACE_MAP = new LoadStatic().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("LoadAggregate", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ep1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ep2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("ep3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("eq1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("eq2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("eq3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kp1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kp2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kp3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kp4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kpf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kq1", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kq2", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kq3", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kq4", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("kqf", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("staticLoadModelType", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
